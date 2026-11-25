/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grademanagementproject;
import java.util.ArrayList;
import javafx.geometry.HPos;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.geometry.Pos;


/**
 *
 * @author Gavin Feiner
 */
public class Filters
{   
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<Assignment> assignments = new ArrayList<Assignment>();
    
    
    public GridPane Filter(int choice, String name)
    {
        int row = 1;
        int index = 0;
        GridPane pane = new GridPane();
        
        Label studentNameHeader = new Label("Student");
        Label assignmentNameHeader = new Label("Assignment");
        Label classNameHeader = new Label("Class");
        Label pointsEarnedHeader = new Label("Points Earned");
        Label totalPointsHeader = new Label("Total Points");
        Label percentCorrectHeader = new Label("Percent Correct");
        studentNameHeader.setPrefWidth(82);
        assignmentNameHeader.setPrefWidth(82);
        classNameHeader.setPrefWidth(82);
        pointsEarnedHeader.setPrefWidth(82);
        totalPointsHeader.setPrefWidth(82);
        percentCorrectHeader.setPrefWidth(88);
        
        pane.add(studentNameHeader, 0, 0);
        pane.add(assignmentNameHeader, 1, 0);
        pane.add(classNameHeader, 2, 0);
        pane.add(pointsEarnedHeader, 3, 0);
        pane.add(totalPointsHeader, 4, 0);
        pane.add(percentCorrectHeader, 5, 0);
        studentNameHeader.setAlignment(Pos.CENTER);
        assignmentNameHeader.setAlignment(Pos.CENTER);
        classNameHeader.setAlignment(Pos.CENTER);
        pointsEarnedHeader.setAlignment(Pos.CENTER);
        totalPointsHeader.setAlignment(Pos.CENTER);
        percentCorrectHeader.setAlignment(Pos.CENTER);
        
        pane.setLayoutY(60);
        studentNameHeader.setStyle("-fx-border-color: black;" + "-fx-border-width: 1;" + "-fx-border-style: solid;");
        assignmentNameHeader.setStyle("-fx-border-color: black;" + "-fx-border-width: 1;" + "-fx-border-style: solid;");
        classNameHeader.setStyle("-fx-border-color: black;" + "-fx-border-width: 1;" + "-fx-border-style: solid;");
        pointsEarnedHeader.setStyle("-fx-border-color: black;" + "-fx-border-width: 1;" + "-fx-border-style: solid;");
        totalPointsHeader.setStyle("-fx-border-color: black;" + "-fx-border-width: 1;" + "-fx-border-style: solid;");
        percentCorrectHeader.setStyle("-fx-border-color: black;" + "-fx-border-width: 1;" + "-fx-border-style: solid;");


        switch(choice)
        {
            //if the user wants to filter by a student
            case 1:
                for (Student student: students)
                {   
                   if (name.equals(student.getStudentName()))
                   {
                       Label studnetNameLabel = new Label(student.getStudentName());
                       Label assignmentNameLabel = new Label(assignments.get(index).getAssignmentName());
                       Label classNameLabel = new Label(student.getStudentClass());
                       Label pointsEarnedLabel = new Label(assignments.get(index).getCorrectPoints());
                       Label totalPointsLabel = new Label(assignments.get(index).getTotalPoints());
                       Label percentCorrectLabel = new Label(assignments.get(index).calculateGrade());
                       
                       pane.add(studnetNameLabel, 0, row);
                       pane.add(assignmentNameLabel, 1, row);
                       pane.add(classNameLabel, 2, row);
                       pane.add(pointsEarnedLabel, 3, row);
                       pane.add(totalPointsLabel, 4, row);
                       pane.add(percentCorrectLabel, 5, row);
                    
                       studnetNameLabel.setPrefWidth(82);
                       assignmentNameLabel.setPrefWidth(82);
                       classNameLabel.setPrefWidth(82);
                       pointsEarnedLabel.setPrefWidth(82);
                       totalPointsLabel.setPrefWidth(82);
                       percentCorrectLabel.setPrefWidth(88);
                       
                       studnetNameLabel.setStyle("-fx-border-color: black;" + "-fx-border-width: 1;" + "-fx-border-style: solid;");
                       assignmentNameLabel.setStyle("-fx-border-color: black;" + "-fx-border-width: 1;" + "-fx-border-style: solid;");
                       classNameLabel.setStyle("-fx-border-color: black;" + "-fx-border-width: 1;" + "-fx-border-style: solid;");
                       pointsEarnedLabel.setStyle("-fx-border-color: black;" + "-fx-border-width: 1;" + "-fx-border-style: solid;");
                       totalPointsLabel.setStyle("-fx-border-color: black;" + "-fx-border-width: 1;" + "-fx-border-style: solid;");
                       percentCorrectLabel.setStyle("-fx-border-color: black;" + "-fx-border-width: 1;" + "-fx-border-style: solid;");
                       
                       studnetNameLabel.setAlignment(Pos.CENTER);
                       assignmentNameLabel.setAlignment(Pos.CENTER);
                       classNameLabel.setAlignment(Pos.CENTER);
                       pointsEarnedLabel.setAlignment(Pos.CENTER);
                       totalPointsLabel.setAlignment(Pos.CENTER);
                       percentCorrectLabel.setAlignment(Pos.CENTER);
                       
                       row++;
                       
                   }
                   index++;
                }
                return pane;
            //if the user wants to filter by class
            case 2: 
                for (Student student: students)
                {  
                   if (name.equals(student.getStudentClass()))
                   {
                       Label studnetNameLabel = new Label(student.getStudentName());
                       Label assignmentNameLabel = new Label(assignments.get(index).getAssignmentName());
                       Label classNameLabel = new Label(student.getStudentClass());
                       Label pointsEarnedLabel = new Label(assignments.get(index).getCorrectPoints());
                       Label totalPointsLabel = new Label(assignments.get(index).getTotalPoints());
                       Label percentCorrectLabel = new Label(assignments.get(index).calculateGrade());
                       
                       pane.add(studnetNameLabel, 0, row);
                       pane.add(assignmentNameLabel, 1, row);
                       pane.add(classNameLabel, 2, row);
                       pane.add(pointsEarnedLabel, 3, row);
                       pane.add(totalPointsLabel, 4, row);
                       pane.add(percentCorrectLabel, 5, row);
                       
                       studnetNameLabel.setPrefWidth(82);
                       assignmentNameLabel.setPrefWidth(82);
                       classNameLabel.setPrefWidth(82);
                       pointsEarnedLabel.setPrefWidth(82);
                       totalPointsLabel.setPrefWidth(82);
                       percentCorrectLabel.setPrefWidth(88);
                       
                       studnetNameLabel.setStyle("-fx-border-color: black;" + "-fx-border-width: 1;" + "-fx-border-style: solid;");
                       assignmentNameLabel.setStyle("-fx-border-color: black;" + "-fx-border-width: 1;" + "-fx-border-style: solid;");
                       classNameLabel.setStyle("-fx-border-color: black;" + "-fx-border-width: 1;" + "-fx-border-style: solid;");
                       pointsEarnedLabel.setStyle("-fx-border-color: black;" + "-fx-border-width: 1;" + "-fx-border-style: solid;");
                       totalPointsLabel.setStyle("-fx-border-color: black;" + "-fx-border-width: 1;" + "-fx-border-style: solid;");
                       percentCorrectLabel.setStyle("-fx-border-color: black;" + "-fx-border-width: 1;" + "-fx-border-style: solid;");
                       
                       studnetNameLabel.setAlignment(Pos.CENTER);
                       assignmentNameLabel.setAlignment(Pos.CENTER);
                       classNameLabel.setAlignment(Pos.CENTER);
                       pointsEarnedLabel.setAlignment(Pos.CENTER);
                       totalPointsLabel.setAlignment(Pos.CENTER);
                       percentCorrectLabel.setAlignment(Pos.CENTER);
                       
                       row++;
                   }
                   index++;
                }
                return pane;
            //if the user wants to filter by assignment
            case 3:
                for (Assignment assignment: assignments)
                {
                   if (name.equals(assignment.getAssignmentName()))
                   {
                       Label studnetNameLabel = new Label(students.get(index).getStudentName());
                       Label assignmentNameLabel = new Label(assignment.getAssignmentName());
                       Label classNameLabel = new Label(students.get(index).getStudentClass());
                       Label pointsEarnedLabel = new Label(assignment.getCorrectPoints());
                       Label totalPointsLabel = new Label(assignment.getTotalPoints());
                       Label percentCorrectLabel = new Label(assignment.calculateGrade());
                       
                       pane.add(studnetNameLabel, 0, row);
                       pane.add(assignmentNameLabel, 1, row);
                       pane.add(classNameLabel, 2, row);
                       pane.add(pointsEarnedLabel, 3, row);
                       pane.add(totalPointsLabel, 4, row);
                       pane.add(percentCorrectLabel, 5, row);
                       
                       studnetNameLabel.setPrefWidth(82);
                       assignmentNameLabel.setPrefWidth(82);
                       classNameLabel.setPrefWidth(82);
                       pointsEarnedLabel.setPrefWidth(82);
                       totalPointsLabel.setPrefWidth(82);
                       percentCorrectLabel.setPrefWidth(88);
                       
                       studnetNameLabel.setStyle("-fx-border-color: black;" + "-fx-border-width: 1;" + "-fx-border-style: solid;");
                       assignmentNameLabel.setStyle("-fx-border-color: black;" + "-fx-border-width: 1;" + "-fx-border-style: solid;");
                       classNameLabel.setStyle("-fx-border-color: black;" + "-fx-border-width: 1;" + "-fx-border-style: solid;");
                       pointsEarnedLabel.setStyle("-fx-border-color: black;" + "-fx-border-width: 1;" + "-fx-border-style: solid;");
                       totalPointsLabel.setStyle("-fx-border-color: black;" + "-fx-border-width: 1;" + "-fx-border-style: solid;");
                       percentCorrectLabel.setStyle("-fx-border-color: black;" + "-fx-border-width: 1;" + "-fx-border-style: solid;");
                       
                       studnetNameLabel.setAlignment(Pos.CENTER);
                       assignmentNameLabel.setAlignment(Pos.CENTER);
                       classNameLabel.setAlignment(Pos.CENTER);
                       pointsEarnedLabel.setAlignment(Pos.CENTER);
                       totalPointsLabel.setAlignment(Pos.CENTER);
                       percentCorrectLabel.setAlignment(Pos.CENTER);
                       
                       row++;
                   }
                   index++;
                }
                return pane;
            //if the user wants to see a list of all grades
            case 4:
                for (Student student: students)
                {
                    Label studnetNameLabel = new Label(student.getStudentName());
                    Label assignmentNameLabel = new Label(assignments.get(index).getAssignmentName());
                    Label classNameLabel = new Label(student.getStudentClass());
                    Label pointsEarnedLabel = new Label(assignments.get(index).getCorrectPoints());
                    Label totalPointsLabel = new Label(assignments.get(index).getTotalPoints());
                    Label percentCorrectLabel = new Label(assignments.get(index).calculateGrade());
                       
                    pane.add(studnetNameLabel, 0, row);
                    pane.add(assignmentNameLabel, 1, row);
                    pane.add(classNameLabel, 2, row);
                    pane.add(pointsEarnedLabel, 3, row);
                    pane.add(totalPointsLabel, 4, row);
                    pane.add(percentCorrectLabel, 5, row);
                       
                    studnetNameLabel.setPrefWidth(82);
                    assignmentNameLabel.setPrefWidth(82);
                    classNameLabel.setPrefWidth(82);
                    pointsEarnedLabel.setPrefWidth(82);
                    totalPointsLabel.setPrefWidth(82);
                    percentCorrectLabel.setPrefWidth(88);
                       
                    studnetNameLabel.setStyle("-fx-border-color: black;" + "-fx-border-width: 1;" + "-fx-border-style: solid;");
                    assignmentNameLabel.setStyle("-fx-border-color: black;" + "-fx-border-width: 1;" + "-fx-border-style: solid;");
                    classNameLabel.setStyle("-fx-border-color: black;" + "-fx-border-width: 1;" + "-fx-border-style: solid;");
                    pointsEarnedLabel.setStyle("-fx-border-color: black;" + "-fx-border-width: 1;" + "-fx-border-style: solid;");
                    totalPointsLabel.setStyle("-fx-border-color: black;" + "-fx-border-width: 1;" + "-fx-border-style: solid;");
                    percentCorrectLabel.setStyle("-fx-border-color: black;" + "-fx-border-width: 1;" + "-fx-border-style: solid;");
                       
                    studnetNameLabel.setAlignment(Pos.CENTER);
                    assignmentNameLabel.setAlignment(Pos.CENTER);
                    classNameLabel.setAlignment(Pos.CENTER);
                    pointsEarnedLabel.setAlignment(Pos.CENTER);
                    totalPointsLabel.setAlignment(Pos.CENTER);
                    percentCorrectLabel.setAlignment(Pos.CENTER);
                       
                       row++;
                       index++;
                }
                return pane;
                
        }
            System.out.println("failed to create gridpane"); //remove this later
            return pane;
    }
    
    public void createAssignment(String studentName, String assignmentName, String className, float correctPoints, float totalPoints)
    {
        Student student = new Student();
        Assignment assignment = new Assignment();
        student.setStudentName(studentName);
        student.setStudentClass(className);
        assignment.setAssignmentName(assignmentName);
        assignment.setCorrectPoints(correctPoints);
        assignment.setTotalPoints(totalPoints);
        
        students.add(student);
        assignments.add(assignment);
        
    }
}
