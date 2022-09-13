public class App {
    public static void main(String[] args) throws Exception {

    // ARRAYS (50 points)
    System.out.println("======================================================");
    // 1. Create an array of characters of your SURNAME.
        char[] surname = {'V', 'I', 'C', 'T', 'O', 'R', 'I', 'A'};

    // 2. Display each character of your SURNAME on each line.
        for (int i = 0; i < surname.length; i++) {
            System.out.println(surname[i]);
        }    

    // 3. Display the first character of your SURNAME.
        System.out.println(surname[0]);

    // 4. Display the last character of your SURNAME.
        System.out.println(surname[7]);

    // 5. Display the character of your SURNAME in reverse order.
        for (int i = surname.length - 1; i >= 0; i--) {
            System.out.println(surname[i]);
        }
    }
}


