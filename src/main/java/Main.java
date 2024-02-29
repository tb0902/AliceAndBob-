/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer on Jan 2024.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args ){
        Main name = new Main();

        name.compute();


        // create a new object of class Main

        // call the compute() method on that new object
    }

    public void compute() {
        Scanner in = new Scanner(System.in);
        String name;
        System.out.print("Enter your name ");
        name = in.nextLine();

        if (name .equals("Alice")){
            System.out.print("Hi Alice");}
        else if (name .equals("Bob")){
            System.out.print("Hi Bob");}
        else {
            System.out.print("You are not Alice or Bob");
        }


        // Get input string of name from user
        
        // Create conditional to check name against Alice and Bob

        // Print greeting to screen if Alice or Bob are true
        
        // Print "You are neither Alice nor Bob." otherwise

    }
}
