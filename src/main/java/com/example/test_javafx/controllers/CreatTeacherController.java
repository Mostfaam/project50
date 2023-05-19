package com.example.test_javafx.controllers;

import com.example.test_javafx.Navigation;
import com.example.test_javafx.models.DataModel;
import com.example.test_javafx.models.DataModelTeatcher;
import com.example.test_javafx.models.Teatcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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
DataModelTeatcher dataModelTeatcher=new DataModelTeatcher();
    Navigation navigation = new Navigation();

    public void back(ActionEvent actionEvent) {
        navigation.navigateTo(anchorPane,navigation.MANGER_FXML);
    }

    public void creatT(ActionEvent actionEvent) {
        Teatcher teatcher = new Teatcher(name.getText(),userName.getText(),password.getText(),phone.getText(),course.getText());
        dataModelTeatcher.addTeatcher(teatcher);
        dataModelTeatcher.saveTeatchers();
    }
}
