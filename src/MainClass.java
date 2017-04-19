import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by d.bukanov on 4/13/2017.
 */
public class MainClass {
    public static void main(String[] args) {
        System.out.println("Dat awesum IDE lel");
        Pattern pat = Pattern.compile(" ");
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                String input = in.nextLine();
                String[] exp = pat.split(input);
                switch (exp[1]) {
                    case "+":
                        Calculator.Addition(Double.parseDouble(exp[0]), Double.parseDouble(exp[2]));
                        break;
                    case "-":
                        Calculator.Substarction(Double.parseDouble(exp[0]), Double.parseDouble(exp[2]));
                        break;
                    case "*":
                        Calculator.Multiply(Double.parseDouble(exp[0]), Double.parseDouble(exp[2]));
                        break;
                    case "/":
                        Calculator.Division(Double.parseDouble(exp[0]), Double.parseDouble(exp[2]));
                        break;
                    default:
                        System.out.println("not working lel");
                        break;
                }
            } catch (Exception e) {
                System.out.println("only digits");
            }
        }
        // System.out.println(lel);
    }
}

//Brother ql570