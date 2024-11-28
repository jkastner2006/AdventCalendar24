package at.htl.adventcalendar;


import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


import java.io.IOException;

public class Application extends javafx.application.Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("hello-view.fxml"));



        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);

        for (int i = 1; i <= 24; i++) {
            Button button = new Button(String.valueOf(i));
            button.setPrefSize(100, 100);
            button.setOnAction(event -> {
                button.setText("🎁");
                button.setDisable(true); });
            grid.add(button, (i - 1) % 6, (i - 1) / 6);
        }




        Scene scene = new Scene(grid, 600, 600);
        stage.setTitle("Adventkalender");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}