package com.anu.view;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HomePage extends Application{
    public static Stage myStage;
    private Scene homePageScene;


    @Override
    public void start(Stage myStage) throws Exception {
    
        Text text1 = new Text("Welcome to Javafx gitproject");
        text1.setStyle("-fx-fill: white; -fx-font-size: 48px; -fx-font-weight: bold");

  
        VBox vBox = new VBox(200,text1);
        vBox.setStyle("-fx-background-color: #6c42a2b9; -fx-padding:20px; -fx-alignment:center;");

        Group gr = new Group(vBox);
       

   
         Scene sc = new Scene(gr,1000,750);


        homePageScene = sc;
        myStage.setScene(homePageScene);
        myStage.setTitle("Home Page");
        myStage.setResizable(false);
        myStage.setWidth(1000);
        myStage.setHeight(750);
        myStage.show();
    }
}
    