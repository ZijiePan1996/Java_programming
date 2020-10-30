package ClassDemo.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InpuutMismatchException {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean continueInput = true;

        do{
            try{
                System.out.println("Type in an integer: ");
                int a = in.nextInt();
                System.out.println(a);
                continueInput = false;
            } catch(InputMismatchException e){
                System.out.println("Wrong type, try again.");
                in.nextLine();
            }
        } while(continueInput == true);
    }
}
