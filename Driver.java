import java.util.Scanner;

public class Driver
{
    public static void main(String[] args)
    {
        //declare variables and initialize scanner
        Scanner key = new Scanner(System.in);
        int size, choice, value, end;

        end = 0;

        //declare and initialize the stack
        LinkedQueue queue1 = new LinkedQueue();

        //loop to continue operations
        while(end == 0)
        {
            //print out menu for commands
            System.out.println("\t1) Push \n\t2) Pop \n\t3) Peek \n\t4) Size \n\t5) isEmpty \n\t6) End");
            System.out.print("Please choose an option: ");
            choice = key.nextInt();

            //switch the choice and execute commands
            switch (choice)
            {
                case 1: System.out.println("Please enter a value: ");
                    value = key.nextInt();
                    queue1.push(value);
                    System.out.println(queue1.toString());
                    break;
                case 2: queue1.pop();
                    System.out.println(queue1.toString());
                    break;
                case 3: queue1.peek();
                    System.out.println(queue1.peek());
                    System.out.println(queue1.toString());
                    break;
                case 4: System.out.println("Size: " + queue1.getSize());
                    System.out.println(queue1.toString());
                    break;
                case 5: if(queue1.isEmpty())
                {
                    System.out.println("Stack is empty.");
                }
                else
                    System.out.println("Stack is NOT empty.");
                    System.out.println(queue1.toString());
                    break;
                case 6: end = 1;
                    System.out.println("Goodbye!");
                    break;
            }
        }
    }
}
