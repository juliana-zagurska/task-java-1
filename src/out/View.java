package out;

public class View {

    private final static String INCORRECT_INPUT = "Input isn't correct, try one more time";
    private final static String INPUT_FIRST_WORD_MESSAGE = "Please, input first word";
    private final static String INPUT_SECOND_WORD_MESSAGE = "Please, input second word";

    public void printErrorMessage () {
        System.out.println(INCORRECT_INPUT);
    }

    public void printCorrectString(StringBuilder stringBuilder) {
        System.out.println(stringBuilder.toString());
    }

    public void printHelloMessage (String isFirstOrSecond) {
        if (isFirstOrSecond.equals("First")) {
            System.out.println(INPUT_FIRST_WORD_MESSAGE);
        }else {
            System.out.println(INPUT_SECOND_WORD_MESSAGE);
        }
    }
}
