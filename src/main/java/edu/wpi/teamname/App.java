package edu.wpi.teamname;

import java.io.IOException;
import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App extends Application {

  @Setter @Getter private static BorderPane rootPane;

  @Override
  public void init() {
    log.info("Starting Up");
  }

  @Override
  public void start(Stage primaryStage) throws IOException {
    final URL resource = App.class.getResource("views/App.fxml");
    final FXMLLoader loader = new FXMLLoader(resource);

    final BorderPane root = loader.load();
    final Scene scene = new Scene(root);

    primaryStage.setScene(scene);

    primaryStage.show();
  }

  @Override
  public void stop() {
    log.info("Shutting Down");
  }
}
