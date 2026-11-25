package com.mycompany.grademanagementproject;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.Group;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.control.*;
import javafx.geometry.HPos;





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
public class App extends Application 
{
    
    final Filters filter = new Filters();
    final Font headerFont = new Font(15);
    final Stage mainStage = new Stage();

    @Override
    public void start(Stage stage) 
    {
        setPage1();
    }

    public static void main(String[] args) 
    {
        launch();
    }
    
    public void processAddAssignmentButton(ActionEvent event)
    {
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
        studentNameField.setPrefWidth(100);
        assignmentNameField.setPrefWidth(100);
        classField.setPrefWidth(100);
        pointsEarnedField.setPrefWidth(100);
        totalPointsField.setPrefWidth(100);
        
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
        GridPane.setHalignment(studentNameLabel, HPos.CENTER);
        GridPane.setHalignment(assignmentNameLabel, HPos.CENTER);
        GridPane.setHalignment(classLabel, HPos.CENTER);
        GridPane.setHalignment(pointsEarnedLabel, HPos.CENTER);
        GridPane.setHalignment(totalPointsLabel, HPos.CENTER);
        page2Pane.setLayoutY(130);
        page2Pane.setVgap(0);
        
        Text page2Header = new Text(175, 40, "Enter Assignment Details");
        page2Header.setFont(headerFont);
        
        Button page2FinishButton = new Button("Finish");
        page2FinishButton.setLayoutX(400);
        page2FinishButton.setLayoutY(300);
        
        page2FinishButton.setOnAction(e -> {
            String studentName = studentNameField.getText();
            String assignmentName = assignmentNameField.getText();
            String className = classField.getText();
            float correctPoints = Float.parseFloat(pointsEarnedField.getText());
            float totalPoints = Float.parseFloat(totalPointsField.getText());
            filter.createAssignment(studentName, assignmentName, className, correctPoints, totalPoints);
            setPage1();
        });
        
        
        Group page2Layout = new Group(page2Header, page2Pane, page2FinishButton);
        Scene page2Scene = new Scene(page2Layout, 500, 350);
        mainStage.setScene(page2Scene);
        mainStage.show();
    }
    
    public void processViewGradesButton(ActionEvent event)
    {
        Text page3Header = new Text(100, 40, "What would you like to view grades based on?");
        page3Header.setFont(headerFont);
        
        Label studentLabel = new Label("Student");
        Label classLabel = new Label("Calss");
        Label assignmentLabel = new Label("Assignment");
        Label allGradesLabel = new Label("All Grades");
        TextField studentField = new TextField("Enter a Student");
        TextField classField = new TextField("Enter a Class");
        TextField assignmentField = new TextField("Enter an Assignment");
        Button allGradesButton = new Button("View All Grades");
        studentField.setPrefWidth(125);
        classField.setPrefWidth(125);
        assignmentField.setPrefWidth(125);
        allGradesButton.setPrefWidth(125);
        
        GridPane page3Pane = new GridPane();
        page3Pane.add(studentLabel, 0, 0);
        page3Pane.add(classLabel, 2, 0);
        page3Pane.add(assignmentLabel, 1, 0);
        page3Pane.add(allGradesLabel, 3, 0);
        page3Pane.add(studentField, 0, 1);
        page3Pane.add(classField, 2, 1);
        page3Pane.add(assignmentField, 1, 1);
        page3Pane.add(allGradesButton, 3, 1);
        GridPane.setHalignment(studentLabel, HPos.CENTER);
        GridPane.setHalignment(classLabel, HPos.CENTER);
        GridPane.setHalignment(assignmentLabel, HPos.CENTER);
        GridPane.setHalignment(allGradesLabel, HPos.CENTER);
        page3Pane.setLayoutY(130);
        page3Pane.setVgap(7);
        
        Button backButton = new Button("<-----");
        backButton.setLayoutX(400);
        backButton.setLayoutY(300);
        backButton.setOnAction(this::processBackButton);
        
        Text page4Header = new Text(220, 40, "Grades");
        page4Header.setFont(headerFont);
        
        studentField.setOnAction(e -> {
            String studentName = studentField.getText();
            Group page4Layout = new Group(page4Header, backButton, filter.Filter(1, studentName));
            Scene page4Scene = new Scene(page4Layout, 500, 350);
            mainStage.setScene(page4Scene);
            mainStage.show();
        });
        
        classField.setOnAction(e -> {
            String className = classField.getText();
            Group page4Layout = new Group(page4Header, backButton, filter.Filter(2, className));
            Scene page4Scene = new Scene(page4Layout, 500, 350);
            mainStage.setScene(page4Scene);
            mainStage.show();
            
        });
        
        assignmentField.setOnAction(e -> {
            String assignmentName = assignmentField.getText();
            Group page4Layout = new Group(page4Header, backButton, filter.Filter(3, assignmentName));
            Scene page4Scene = new Scene(page4Layout, 500, 350);
            mainStage.setScene(page4Scene);
            mainStage.show();
        });
        
        allGradesButton.setOnAction(e -> {
            Group page4Layout = new Group(page4Header, backButton, filter.Filter(4, "filler"));
            Scene page4Scene = new Scene(page4Layout, 500, 350);
            mainStage.setScene(page4Scene);
            mainStage.show();
        });
        
        Group page3Layout = new Group(page3Header, page3Pane, backButton);
        Scene page3Scene = new Scene(page3Layout, 500, 350);
        mainStage.setScene(page3Scene);
        mainStage.show();
    }
    
    public void setPage1()
    {
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
        mainStage.setScene(page1Scene);
        mainStage.show();
    }
    
    public void processBackButton(ActionEvent event)
    {
        setPage1();
    }
    
    
}