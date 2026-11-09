package com.mycompany.grademanagementproject;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.Group;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.control.TextField;




/** 
* This file should in theory take all of the information on the student and assignment, and format the information so it is all in a horizontal line
* The file should be able to filter those rows based on the student name, assignment name, or class
* The file should be able to switch scenes depending on which button the user presses
*
*/

/**
 * JavaFX App
 * Author Gavin Feiner
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        Font headerFont = new Font(15);
        Text page1Header = new Text(175, 40, "Welcome to Gradebook!");
        page1Header.setFont(headerFont);
        Text page1Subheader = new Text(185, 85, "What would you like to do?");
        Group page1Text = new Group(page1Header, page1Subheader);
        
        
        Button addAssignmentButton = new Button("Add an Assignment");
        addAssignmentButton.setOnAction(this::processAddAssignmentButton);
        Button viewGradesButton = new Button("View Grades");
        viewGradesButton.setOnAction(this::processViewGradesButton);
        
        addAssignmentButton.setLayoutX(80);
        addAssignmentButton.setLayoutY(175);
        viewGradesButton.setLayoutX(320);
        viewGradesButton.setLayoutY(175);
        
        Group page1Layout = new Group(page1Text, addAssignmentButton, viewGradesButton);
        Scene page1Scene = new Scene(page1Layout, 500, 350);
        stage.setScene(page1Scene);
        stage.show();
        
        
        //addAssignmentButton.setOnAction(e -> stage.setScene(page2Scene));
    }

    public static void main(String[] args) {
        launch();
    }
    
    public void processAddAssignmentButton(ActionEvent event){
        Label studentNameLabel = new Label("Student Name");
        Label assignmentNameLabel = new Label("Assignment Name");
        Label classLabel = new Label("Class");
        Label pointsEarnedLabel = new Label("Points Earned");
        Label totalPointsLabel = new Label("Total Points");
        TextField studentNameField = new TextField();
        TextField assignmentNameField = new TextField();
        TextField classField = new TextField();
        TextField pointsEarnedField = new TextField();
        TextField totalPointsField = new TextField();
        
        GridPane page2Pane = new GridPane();
        page2Pane.add(studentNameLabel, 0, 0);
        page2Pane.add(assignmentNameLabel, 1, 0);
        page2Pane.add(classLabel, 2, 0);
        page2Pane.add(pointsEarnedLabel, 3, 0);
        page2Pane.add(totalPointsLabel, 4, 0);
        page2Pane.add(studentNameField, 0, 1);
        page2Pane.add(assignmentNameField, 1, 1);
        page2Pane.add(classField, 2, 1);
        page2Pane.add(pointsEarnedField, 3, 1);
        page2Pane.add(totalPointsField, 4, 1);
        page2Pane.setAlignment(Pos.CENTER);
        
        
        Group page2Layout = new Group(page2Pane);
        Scene page2Scene = new Scene(page2Layout, 500, 350);
        Stage page2Stage = new Stage();
        page2Stage.setScene(page2Scene);
        page2Stage.show();
    }
    
    public void processViewGradesButton(ActionEvent event){
        
    }

}