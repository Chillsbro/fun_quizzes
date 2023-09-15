package Questions;

import Questions.Question;

import java.util.Objects;

public class TrueOrFalseQuestion extends Question {
    public TrueOrFalseQuestion(String question, String answer) {
        super(question, answer);
    }

    @Override
    public boolean checkAnswer(String answer) {
        //returns true or false based on answer;
        return answer.equalsIgnoreCase(this.getTheAnswer());
    }

}
