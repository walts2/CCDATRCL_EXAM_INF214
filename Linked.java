import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) throws Exception {
        // LINKED LIST (25 points)
    System.out.println("======================================================");
    // 1. Create a Linked list of the last six numbers of your STUDENT NUMBER.
    LinkedList<String> studNum = new LinkedList<>();
        
    studNum.add("1");
    studNum.add("0");
    studNum.add("6");
    studNum.add("7");
    studNum.add("5");
    studNum.add("2");

    // 2. Add an asterisk (*) to the head/front of the Linked list.
        studNum.addFirst("*");

    // 3. Add an asterisk (*) to the tail/end of the Linked list.
        studNum.addLast("*");
  
    // 4. Display the Linked list.
        System.out.println(studNum);

    // 5. Display the last character of the Linked list.
        System.out.println(studNum.get(7));
  
    // 6. Replace the last character of the Linked list with the exclamation symbol (!).
        studNum.set(7, "!");

    // 7. Remove the first character of the Linked list.
        studNum.remove(0);

    // 8. Display the LinkedList.
    System.out.println(studNum);
    }
}    
