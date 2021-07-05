/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment3;

/**
 *
 * @author Jaismeen Kaur
 */
public class QuizDemo {
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        JavaQuiz quiz= new JavaQuiz();
        quiz.setQuestions();
        quiz.attemptTest();
       System.out.println(quiz.toString());
    }
}
