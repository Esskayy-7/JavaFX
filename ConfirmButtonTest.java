import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ConfirmButtonTest extends Application /* implements EventHandler<ActionEvent> */ {

    Button button;
    StackPane layout;
    Scene scene;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // basic setup
        primaryStage.setTitle("This is the title bar");
        button = new Button();
        button.setText("Click Me!");

        button.setOnAction(e -> {
            Boolean answer = ConfirmButton.display("Confirm box");
            System.out.println("Chosen answer was: " + answer);
        });
        layout = new StackPane();
        layout.getChildren().add(button);
        scene = new Scene(layout, 300, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}