package com.qnyh.recordinginstrument;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource( "main/main.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 300);
        stage.setTitle("记录器");
        stage.setScene(scene);

        // 从资源文件夹中加载图标
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream("img/32.png")));
        // 设置窗口图标
        stage.getIcons().add(image);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}