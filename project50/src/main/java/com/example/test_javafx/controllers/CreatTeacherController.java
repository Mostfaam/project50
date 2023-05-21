package com.example.test_javafx.controllers;

import com.example.test_javafx.Navigation;
import com.example.test_javafx.models.DataModel;
import com.example.test_javafx.models.Teatcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class CreatTeacherController {
    @FXML
    public AnchorPane anchorPane;
    @FXML
    TextField name;
    @FXML
    TextField userName;
    @FXML
   TextField password;
    @FXML
    TextField phone;
    @FXML
    TextField course;
DataModel dataModel=new DataModel();
    Navigation navigation = new Navigation();

    public void back(ActionEvent actionEvent) {
        navigation.navigateTo(anchorPane,navigation.MANGER_FXML);
    }

    public void creatT(ActionEvent actionEvent) {
        Teatcher teatcher = new Teatcher(name.getText(),userName.getText(),password.getText(),phone.getText(),course.getText());
        dataModel.addTeatcher(teatcher);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("The teatcher has been added successfully");
        alert.setTitle("Done");
        alert.setContentText("UserName: " + userName.getText() + ", password: " + password.getText());
        alert.showAndWait();

        dataModel.saveTeatchers();
    }
}
