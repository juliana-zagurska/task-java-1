

package out;

import java.util.Scanner;

public class Controller  {

    public void processMessage(Model model, View view) {
        StringBuilder input = new StringBuilder();
        String firstWord = "";
        String secondWord = "";
        Scanner scanner = new Scanner(System.in);

        while (model.validateInput(firstWord)) {

            view.printHelloMessage("First");
            firstWord = scanner.nextLine();

            if (model.validateInput(firstWord)) {
                view.printErrorMessage();
            }
        }

        input.append(firstWord).append(" ");

        while (model.validateInput(secondWord)) {
            view.printHelloMessage("Second");
            secondWord = scanner.nextLine();
            if (model.validateInput(secondWord)) {
                view.printErrorMessage();
            }
        }
        input.append(" ").append(secondWord);
        view.printCorrectString(input);
    }
}
