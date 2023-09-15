import Questions.CheckBoxQuestion;
import Questions.MultipleChoiceQuestion;
import Questions.Question;
import Questions.TrueOrFalseQuestion;

public class QuizRunner {

    public static void main(String[] args) {
        Quiz newQuiz = new Quiz();
        newQuiz.addQuestion(new TrueOrFalseQuestion("""
                ------------------------------------------------
                True or False
                A pound of Steel weighs more than a pound of Feathers.
                ENTER TRUE OR FALSE.
                ------------------------------------------------
                """, "false"));

         newQuiz.addQuestion(new TrueOrFalseQuestion("""
                 -----------------------------------------------
                 True or False
                 Rats kill more humans then sharks do each year.
                 ENTER TRUE OR FALSE:
                 -----------------------------------------------""",
                 "false" ));
         newQuiz.addQuestion(new MultipleChoiceQuestion("""
                 -----------------------------------------------
                 Multiple Choice
                 Which one of these is a real nordic Phrase?
                 A: Ragnarok or Die!
                 B: For Valhall!
                 C: Odins Might, HEAR ME!
                 D: Fangs of Fenrir, Blood of Claw, hear my cry,protect them all
                 Enter one letter:
                 -----------------------------------------------""", "b"));
         newQuiz.addQuestion(new CheckBoxQuestion("""
                 -----------------------------------------------
                 CheckBox Lite
                 How many of these methods are apart of the Collections Object?
                 1: sort
                 2: shuffle
                 3: reverse
                 4: floor
                 5: nullify
                 6:copy
                 Enter as many as you think are right: 
                 -----------------------------------------------
                 \s""", "1236"));
newQuiz.runQuiz();

    }
}
