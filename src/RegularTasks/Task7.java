package RegularTasks;

import java.util.Scanner;

public class Task7
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter two integer numbers, please: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        boolean isDivisable = false;

        if (num1 == 0 || num2 == 0)
        {
            System.out.println("Division of zero is impossible");

            if (num1 >= num2)
            {
                if (num1 % num2 == 0)
                {
                    System.out.println(!isDivisable);
                    System.out.println("The result of divisible " + (num1 / num2));
                }
                else
                    {
                    System.out.println(isDivisable);
                    System.out.println("The result of divisible " + (num1 / num2) + "," + (num1 % num2));
                }
            }
            else if (num2 % num1 == 0)
            {
                System.out.println(!isDivisable);
                System.out.println("The result of divisible " + (num2 / num1));
            }
            else
                {
                System.out.println(isDivisable);
                System.out.println("The result of divisible " + (num2 / num1) + "," + (num2 % num1));
            }
        }
    }
}