package Questions;

import java.sql.Array;
import java.util.Arrays;

public class CheckBoxQuestion extends Question {
    public CheckBoxQuestion(String question, String answer) {
        super(question, answer);
    }

    // Method
    public boolean checkAnswer(String answer) {
         return answer.contains(this.getTheAnswer());

    }
}
