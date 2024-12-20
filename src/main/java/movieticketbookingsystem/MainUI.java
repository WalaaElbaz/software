package movieticketbookingsystem;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class MainUI extends Application {
    @Override
    public void start(Stage primaryStage) {
        // ≈⁄œ«œ Ê«ÃÂ… «·„” Œœ„
        Label movieLabel = new Label("Choose Movie Genre:");
        ComboBox<String> movieComboBox = new ComboBox<>();
        movieComboBox.getItems().addAll("Action", "Comedy", "Drama");

        Label theaterLabel = new Label("Choose Theater Type:");
        ComboBox<String> theaterComboBox = new ComboBox<>();
        theaterComboBox.getItems().addAll("Cinema", "IMAX");

        Label ticketLabel = new Label("Enter Number of Tickets:");
        TextField ticketTextField = new TextField();

        Button bookButton = new Button("Book Ticket");
        Button cancelButton = new Button("Cancel");

        // „‰ÿﬁ… ·≈ŸÂ«— «·‰ «∆Ã
        TextArea resultArea = new TextArea();
        resultArea.setEditable(false);
        resultArea.setWrapText(true);
        resultArea.setPrefHeight(100);

        // ⁄‰œ «·÷€ÿ ⁄·Ï “— «·ÕÃ“
        bookButton.setOnAction(e -> {
            try {
                String movieGenre = movieComboBox.getValue();
                String theaterType = theaterComboBox.getValue();
                int numTickets = Integer.parseInt(ticketTextField.getText());

                if (movieGenre == null || theaterType == null) {
                    resultArea.setText("Error: Please select a movie genre and theater type.");
                    return;
                }

                resultArea.setText("Booking Confirmed:\n"
                        + "Movie Genre: " + movieGenre + "\n"
                        + "Theater Type: " + theaterType + "\n"
                        + "Number of Tickets: " + numTickets);
            } catch (NumberFormatException ex) {
                resultArea.setText("Error: Please enter a valid number of tickets.");
            }
        });

        // ⁄‰œ «·÷€ÿ ⁄·Ï “— «·≈·€«¡
        cancelButton.setOnAction(e -> {
            movieComboBox.setValue(null);
            theaterComboBox.setValue(null);
            ticketTextField.clear();
            resultArea.setText("Booking cancelled.");
        });

        //  — Ì» «·⁄‰«’— »«” Œœ«„ GridPane
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(15));
        grid.setHgap(10);
        grid.setVgap(10);

        grid.add(movieLabel, 0, 0);
        grid.add(movieComboBox, 1, 0);
        grid.add(theaterLabel, 0, 1);
        grid.add(theaterComboBox, 1, 1);
        grid.add(ticketLabel, 0, 2);
        grid.add(ticketTextField, 1, 2);

        // ≈÷«›… «·√“—«—
        HBox buttonBox = new HBox(10, bookButton, cancelButton);
        grid.add(buttonBox, 1, 3);

        // ≈÷«›… „‰ÿﬁ… «·‰ «∆Ã
        VBox layout = new VBox(10, grid, resultArea);
        layout.setPadding(new Insets(15));

        // ≈⁄œ«œ «·„‘Âœ Ê⁄—÷ «· ÿ»Ìﬁ
        Scene scene = new Scene(layout, 400, 350);
        primaryStage.setTitle("Movie Ticket Booking");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
