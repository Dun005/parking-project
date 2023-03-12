import javafx.application.Application;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
        System.out.println("Hello world!");
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root=FXMLLoader.load(getClass().getResource("./views/dashboard.fxml"));
        Scene scene=new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
}