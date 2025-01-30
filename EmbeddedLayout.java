import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EmbeddedLayout extends Application /* implements EventHandler<ActionEvent> */ {

    Scene scene;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // basic setup
        primaryStage.setTitle("This is the title bar");
        HBox top = new HBox();
        Button buttonA = new Button("File");
        Button buttonB = new Button("Edit");
        Button buttonC = new Button("View");

        top.getChildren().addAll(buttonA, buttonB, buttonC);

        VBox left = new VBox(10);
        left.setAlignment(Pos.CENTER);
        Button buttonD = new Button("Selection");
        Button buttonE = new Button("Run");
        Button buttonF = new Button("Terminal");
        left.getChildren().addAll(buttonD, buttonE, buttonF);

        BorderPane layout = new BorderPane();
        layout.setLeft(left);
        layout.setTop(top);


        scene = new Scene(layout, 300, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}