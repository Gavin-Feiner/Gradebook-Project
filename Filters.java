/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.grademanagementproject;
import java.util.ArrayList;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;

/**
 *
 * @author Gavin Feiner
 */
public class Filters {
    //This class should have methods that create lists of all the fields with the desired information
    //i.e. if the user wants to filter by class, then it will create a list of all grades from that class
    
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<Assignment> assignments = new ArrayList<Assignment>();
    Filters()
    {
    /**python eq ish
     * for i in range(len(studentNames))
     *      if studentNames[i] = input
     *          HBox layout = new HBox(20, studentNames[i], assignmentNames[i], studentClasses[i], 
     */
    //public void filterStudents(student){
    }
    //}
    public void Filter(int choice, String name)
    {
        int row = 1;
        int index = 0;
        GridPane pane = new GridPane();
        switch(choice)
        {
            case 1:
                for (Student student: students)
                {   
                   if (name.equals(student.getStudentName()))
                   {
                       Label studnetNameLabel = new Label(student.getStudentName());
                       Label assignmentNameLabel = new Label(assignments.get(index).getAssignmentName());
                       Label classNameLabel = new Label(student.getStudentClass());
                       Label pointsEarnedLabel = new Label(assignments.get(index).getCorrectPoints());
                       Label totalPointsLabal = new Label(assignments.get(index).getTotalPoints());
                       Label percentCorrectLabel = new Label(assignments.get(index).calculateGrade());
                       
                       pane.add(studnetNameLabel, 0, row);
                       pane.add(assignmentNameLabel, 1, row);
                       pane.add(classNameLabel, 2, row);
                       pane.add(pointsEarnedLabel, 3, row);
                       pane.add(totalPointsLabal, 4, row);
                       pane.add(percentCorrectLabel, 5, row);
                       
                       row++;
                       
                   }
                   index++;
                }
            case 2: 
                for (Student student: students)
                {  
                   if (name.equals(student.getClass()))
                   {
                       
                   }
                   index++;
                }
            case 3:
                for (Assignment assignment: assignments)
                {
                   if (name.equals(assignment.getAssignmentName()))
                   {
                       
                   }
                   index++;
                }
            case 4:
                for (Student student: students)
                {
                    index++;
                }
                
        }
            
    }
    
    public void createAssignment(String studentName, String assignmentName, String className, int correctPoints, int totalPoints)
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
    
    public void createGridPane(int index, int rows)
    {
        
    }
}
