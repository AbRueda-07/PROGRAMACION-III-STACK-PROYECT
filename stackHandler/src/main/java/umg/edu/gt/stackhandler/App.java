package umg.edu.gt.stackhandler;

import umg.edu.gt.data_structure.stack.Stack;

public class App {

    public static void main(String[] args) {

    ExpressionValidator validator = new ExpressionValidator();

    if (args.length > 0) {
        String expression = args[0];
        boolean result = validator.isBalanced(expression);
        System.out.println(expression + " ? " + result);
    } else {

        // estas son pruebas por defecto si no se pasan argumentos
        String expr1 = "(a+b) * [c-d]";
        String expr2 = "([)]";

        System.out.println(expr1 + " ? " + validator.isBalanced(expr1));
        System.out.println(expr2 + " ? " + validator.isBalanced(expr2));
    }
}
}