import java.util.Scanner;

public class gussingGame {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 5; i++) {
            Scanner myObj = new Scanner(System.in); // Create a Scanner object
            System.out.println("Enter Any Number 1 to 5");
            int number = myObj.nextInt();
            int randomNum = (int) (Math.random() * 5) + 1;
            if (number == randomNum) {
                System.out.println("You Won!!");
                break;
            } else {
                System.out.println("SORRY! You LOss!!");
                System.out.println("Random Number Was " + randomNum);
            }
        }
    }
}
