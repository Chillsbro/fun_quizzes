package Questions;



public class MultipleChoiceQuestion extends Question {

    public MultipleChoiceQuestion(String question, String answer) {
        super(question, answer);
    }


    @Override
    public boolean checkAnswer(String answer) {
        return answer.equalsIgnoreCase(this.getTheAnswer());
    }

}
