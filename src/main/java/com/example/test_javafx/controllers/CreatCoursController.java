package com.example.test_javafx.controllers;

import com.example.test_javafx.Navigation;
import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;

public class CreatCoursController {
    public AnchorPane anchorPane;

    Navigation navigation = new Navigation();

    public void back(ActionEvent actionEvent) {
        navigation.navigateTo(anchorPane,navigation.MANGER_FXML);
    }

    public void creatC(ActionEvent actionEvent) {

    }
}
