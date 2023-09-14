public abstract class Question {
private String theQuestion;
private String theAnswer;

public Question(String question, String answer) {
    this.theQuestion = question;
    this.theAnswer = answer;
}

    public String getTheQuestion() {
        return theQuestion;
    }

    public String getTheAnswer() {
        return theAnswer;
    }

    public abstract boolean checkAnswer(String answer);

}
abstract class MultipleChoiceQuestion extends Question {
    String choiceA;
    String choiceB;
    String choiceC;
    String choiceD;
    public MultipleChoiceQuestion(String question, String answer) {
        super(question, answer);
    }

}

abstract class CheckBoxQuestion extends Question {

    public CheckBoxQuestion(String question, String answer) {
        super(question, answer);
    }
}

abstract class TrueOrFalseQuestion extends Question {
    public TrueOrFalseQuestion(String question, String answer) {
        super(question, answer);
    }
}


