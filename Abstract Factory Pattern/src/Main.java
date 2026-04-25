import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        String  osType;

        System.out.println( "Enter your OS type: " );
        osType = scanner.nextLine();

        Ifactory fact = GUIAbstractFactory.createFactory(osType);

        IButton button = fact.createButton();
        button.press();

        ITextBox textBox = fact.createTextBox();
        textBox.showText();
    }
}
