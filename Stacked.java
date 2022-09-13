import java.util.Stack;

public class Stacked {
    public static void main(String[] args) throws Exception {
        // STACK (25 points)
    System.out.println("======================================================");
    // 1. Create a Stack of characters of your SURNAME.
    Stack<String> SURNAME = new Stack<>();
        SURNAME.push("V");
        SURNAME.push("I");
        SURNAME.push("C");
        SURNAME.push("T");
        SURNAME.push("O");
        SURNAME.push("R");
        SURNAME.push("I");
        SURNAME.push("A");

    // 2. Print the Stack.
    System.out.println(SURNAME);


    // 3. Add a "INF214" to the stack.
    SURNAME.push(" ");
    SURNAME.push("I");
    SURNAME.push("N");
    SURNAME.push("F");
    SURNAME.push("2");
    SURNAME.push("1");
    SURNAME.push("4");

    // 4. Print the Stack.
    System.out.println(SURNAME);

    // 5. Remove "INF214".
    SURNAME.pop();
    SURNAME.pop();
    SURNAME.pop();
    SURNAME.pop();
    SURNAME.pop();
    SURNAME.pop();

    // 6. Add "CCDATRCL-INF214".
    SURNAME.push("C");
    SURNAME.push("C");
    SURNAME.push("D");
    SURNAME.push("A");
    SURNAME.push("T");
    SURNAME.push("R");
    SURNAME.push("C");
    SURNAME.push("L");
    SURNAME.push("-");
    SURNAME.push("I");
    SURNAME.push("N");
    SURNAME.push("F");
    SURNAME.push("2");
    SURNAME.push("1");
    SURNAME.push("4");

    // 7. Print the Stack.
    System.out.println(SURNAME);
    }
}
