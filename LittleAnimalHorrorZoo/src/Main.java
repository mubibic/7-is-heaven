 // a program that deals with points.
// (fourth version, to accompany encapsulated Point class)

 import java.util.Scanner;

 public class Main {

    public static void main(String[] args) {

        // we made a scanner for user input
        // system.in is the user input
        Scanner scan = new Scanner(System.in);
        UserInput userControl = new UserInput();
        System.out.println("Put in integer: ");

        //create a new variable for the user input
        System.out.println("Set x");
        int userInputX = scan.nextInt();
        System.out.println("Set y");
        int userInputY = scan.nextInt();
      //  int userInput = userInputX(), userInputY();
        System.out.println(userInputX + ", " + userInputY);

        userControl.userControl(userInputX, userInputY);



        // create two Point objects
        Point p1 = new Point(1,1);
        Point p2 = new Point(10,10);


    }


}
