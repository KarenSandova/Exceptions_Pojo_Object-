package com.example.pojo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication  {

    public static void main(String[] args) {
        String user,pass, repass;
        user="Jgusina";
        pass= "Jona1818";
        repass="Jona1818";


        MiHelper h = new MiHelper();

        try{
            h.validarPassdword(pass,repass);
        }catch (CustomException e){
            e.printStackTrace();
        }

    }
}