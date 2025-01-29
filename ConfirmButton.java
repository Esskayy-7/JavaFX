import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ConfirmButton {

    private static boolean answer;
    public static boolean display(String title) {
        Stage primaryStage = new Stage();
        primaryStage.initModality(Modality.APPLICATION_MODAL);
        primaryStage.setTitle(title);

        Button yesButton = new Button("Yes");
        yesButton.setOnAction(e -> {
            answer = true;
            primaryStage.close();
        });
        Button noButton = new Button("No");
        noButton.setOnAction(e -> {
            answer = false;
            primaryStage.close();
        });

        

        VBox layout = new VBox(10);
        layout.getChildren().addAll(yesButton, noButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout, 300, 150);
        primaryStage.setScene(scene);
        primaryStage.showAndWait();

        return answer;
    }
}
