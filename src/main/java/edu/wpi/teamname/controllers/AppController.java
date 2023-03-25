package edu.wpi.teamname.controllers;

import io.github.palexdev.materialfx.controls.MFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class AppController {
  @FXML private MFXButton button;

  @FXML
  private void initialize() {

    this.button.setOnAction(
        event -> {
          System.out.println("hello");
        });
  }

  public void press(ActionEvent actionEvent) {}
}
