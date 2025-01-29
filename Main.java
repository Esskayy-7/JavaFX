import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application /*implements EventHandler<ActionEvent>*/ {

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
        // button.setOnAction(this);
        /* 
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hey There");
            }
        } );
        */

        button.setOnAction(e -> System.out.println("Lambda expression in use."));
        layout = new StackPane();
        layout.getChildren().add(button);
        scene = new Scene(layout, 300, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    // handling events

    /*
     * @Override
     * public void handle(ActionEvent event) {
     * if(event.getSource() == button) {
     * System.out.println("The button has been clicked on");
     * }
     * 
     * }
     */
    
}