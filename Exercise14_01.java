package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.stage.*;


public class Exercise14_01 extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane gridPane = new GridPane();
        ImageView imgV01 = new ImageView(new Image("application.Pics/ca.gif"));
        imgV01.setFitHeight(200);
        imgV01.setFitWidth(300);
        imgV01.setSmooth(true);
        imgV01.setCache(true);

        ImageView imgV02 = new ImageView(new Image("application.Pics/china.gif"));
        imgV02.setFitHeight(200);
        imgV02.setFitWidth(300);
        imgV02.setSmooth(true);
        imgV02.setCache(true);

        ImageView imgV03 = new ImageView(new Image("application.Pics/uk.gif"));
        imgV03.setFitHeight(200);
        imgV03.setFitWidth(300);
        imgV03.setSmooth(true);
        imgV03.setCache(true);
        ImageView imgV04 = new ImageView(new Image("application.Pics/us.gif"));
        imgV04.setFitHeight(200);
        imgV04.setFitWidth(300);
        imgV04.setSmooth(true);
        imgV04.setCache(true);
        GridPane.setConstraints(imgV01, 0, 1);
        GridPane.setConstraints(imgV02, 2, 4);
        GridPane.setConstraints(imgV03, 0, 4);
        GridPane.setConstraints(imgV04, 2, 1);

        gridPane.getChildren().addAll(imgV01, imgV02, imgV03, imgV04);
        Scene scene = new Scene(gridPane);
        primaryStage.setTitle(getClass().getName());
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
