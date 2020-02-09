package out;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller();
        View view = new View();
        Model model = new Model();
        controller.processMessage(model, view);

    }
}

