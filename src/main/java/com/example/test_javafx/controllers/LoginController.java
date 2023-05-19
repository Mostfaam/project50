package com.example.test_javafx.controllers;

import com.example.test_javafx.Navigation;
import com.example.test_javafx.models.DataModel;
import com.example.test_javafx.models.DataModelTeatcher;
import com.example.test_javafx.models.Teatcher;
import com.example.test_javafx.models.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.ArrayList;

public class LoginController {
    @FXML
    public AnchorPane rootPane;
    public TextField userName;
    public TextField pass;
    DataModelTeatcher dataModelTeatcher = new DataModelTeatcher();
    Navigation navigation = new Navigation();
    User u = new User();
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    int index=0;
    public void dirictor(ActionEvent actionEvent) {
    }


    public boolean isManeger() {
        boolean torf = false;
        if ((userName.getText().equals(u.getUsername())) && (pass.getText().equals(u.getPassword()))) {
            torf = true;

        } else torf = false;
        return torf;
    }
public boolean varUserName(){
boolean torf=false;
    for(int i=0;i<dataModelTeatcher.getTeatchers().size();i++){
        if(userName.getText().equals(dataModelTeatcher.getTeatchers().get(i).getUsername())){
                index=i;
                torf =true;
            }
            }
return torf;    }
    public boolean varPassword(){

           return pass.getText().equals(dataModelTeatcher.getTeatchers().get(index).getPassword());
    }
    public void loginTeatcher(ActionEvent actionEvent) throws IOException {

        if (dataModelTeatcher.getTeatchers() == null) {
            if (isManeger()) {
                navigation.navigateTo(rootPane, navigation.MANGER_FXML);
            }} else  if (!varUserName()&&!isManeger()){
                {

                    alert.setHeaderText("you are not admin or teatcher");
                    alert.setTitle("eroor");
                    alert.setContentText("please contact admin to add you to teatchers");
                    alert.showAndWait();
                }
            } else {
                if (isManeger()) {
                    navigation.navigateTo(rootPane, navigation.MANGER_FXML);
                } else {
                  if(varUserName()&&!varPassword()) {


                      alert.setHeaderText("the password thet enterd is incoreect");
                      alert.setTitle("eroor");
                      alert.setContentText("please try again");
                      alert.showAndWait();
                  }
            }
                if(varUserName()&&varPassword()){
                    navigation.navigateTo(rootPane, navigation.TEACHER_FXML);
                }
            }



        }

    }







