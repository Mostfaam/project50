package com.example.test_javafx.controllers;

import com.example.test_javafx.Navigation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class EditTeacherController {

    @FXML
    public AnchorPane anchorPane;

    public TextField name;
    public TextField teEditUserName;
    public TextField teEditPass;
    public TextField teEditPhone;


    Navigation navigation = new Navigation();
    public void teName(ActionEvent actionEvent) {



    }

    public void editTecher(ActionEvent actionEvent) {

    }
    public void back(ActionEvent actionEvent) {
        navigation.navigateTo(anchorPane,navigation.MANGER_FXML);
    }
}
