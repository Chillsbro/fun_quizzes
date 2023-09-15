import Questions.Question;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
   ArrayList<Question> quizQuestions = new ArrayList<>();
   int numCorrect = 0;
   int incorrect = 0;
   Scanner input = new Scanner(System.in);

   public Quiz () {

   }

   public ArrayList<Question> getTestQuestions() {
      return quizQuestions;
   }

   public void addQuestion(Question newQuestion) {
      this.quizQuestions.add(newQuestion);
   }

   public void runQuiz() {
      for (Question questions : quizQuestions) {
         System.out.println(questions.getTheQuestion());
         String usrAnswers = input.nextLine();
         boolean correct = questions.checkAnswer(usrAnswers);
         if (correct) {
            numCorrect++;
            System.out.println("IM GETTING INCREMENTED");
         } else {
            incorrect++;
         }
      }
      double grade = (double) numCorrect / quizQuestions.size() * 100;
      System.out.println("Thank you for playing, your score is " + Math.floor(grade) + "%" + "\n" +
              "You got " + numCorrect + " correct " + "and " + incorrect + " incorrect.");
   }

}
