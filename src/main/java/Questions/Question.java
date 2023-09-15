package Questions;

import java.util.Objects;

public abstract class Question {
    private String theQuestion;
    private String theAnswer;


    public Question(String question, String answer) {
        this.theQuestion = question;
        this.theAnswer = answer;
    }


    public String getTheQuestion() { return this.theQuestion; }
    public String getTheAnswer() { return this.theAnswer;}


    public abstract boolean checkAnswer(String answer);

}




