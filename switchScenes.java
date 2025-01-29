import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
// import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class switchScenes extends Application {
    
    Scene scene_1, scene_2;
    Button button_1, button_2;
    Label label_1, label_2;
    VBox layout_1, layout_2;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        button_1 = new Button();
        button_2 = new Button();
        label_1 = new Label();
        label_2 = new Label();
        layout_1 = new VBox(20);
        layout_2 = new VBox(20);

        button_1.setText("Click to go to scene 2");
        button_2.setText("Click to go to scene 1");
        label_1.setText("This is Scene 1");
        label_2.setText("This is Scene 2");

        layout_1.getChildren().addAll(label_1, button_1);
        scene_1 = new Scene(layout_1, 300, 400);

        layout_2.getChildren().addAll(label_2, button_2);
        scene_2 = new Scene(layout_2, 400, 300);
        
        primaryStage.setScene(scene_1);
        button_1.setOnAction(e -> primaryStage.setScene(scene_2));
        button_2.setOnAction(e -> primaryStage.setScene(scene_1));
        primaryStage.show();
    }
}
