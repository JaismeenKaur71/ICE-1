/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

import java.util.Scanner;

/**
 *
 * @author Jaismeen kaur
 * @version 1.0
 */
public class JavaQuiz {
    
Scanner quizobj= new Scanner (System.in);
    /**
     * @param questions the questions to set
     */
    int score=0;
    private String[][] questions=new String [3][6];
    
    public void setQuestions() {
        questions[0][0]="What is java?";
        questions[0][1]="A. Java is procedural lang";
        questions[0][2]="B. Java is OOP language";
        questions[0][3]="C. Java is not a language";
        questions[0][4]="D. Java is not a language";
        questions[0][5]="B";
        questions[1][0]="Stack is a?";
        questions[1][1]="A. User defined class";
        questions[1][2]="B. Collection class";
        questions[1][3]="C. Both A and B";
        questions[1][4]="D. None of these";
        questions[1][5]="B";
        questions[2][0]="Latest version of JavaFX is?";
        questions[2][1]="A. 6";
        questions[2][2]="B. 2";
        questions[2][3]="C. 11";
        questions[2][4]="D. 14";
        questions[2][5]="C";
    }
    
    public void attemptTest(){
    for(int row=0; row<questions.length;row++){
        for (int col=0; col<questions[row].length-1;col++){
            System.out.println(questions[row][col]);       
    }
        System.out.println("Enter Answer");
        String response = quizobj.nextLine();
        System.out.println(response);
        checkResult(response,row);
    }
    }
    /**
     * 
     * @param response- takes the response of user as argument
     * @param row - the rows of array
     */
    public void checkResult(String response, int row){
        if(response.equals(questions[row][5])){
            System.out.println("Correct");
            score++;
        }
        else{
            System.out.println("Incorrect");
        }
    }
    @Override
    public String toString(){
        if(this.score==3){
            return "The score is "+this.score;
        }
        else{
            
            return "Score "+this.score +"\nBook your test again";
        }
    }
}
