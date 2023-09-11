import java.util.Stack;
import java.util.Scanner;
public class stacktest {
    public static void main(String[] args) {
        Stack <Integer>  S1 = new Stack<>();
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println(" ____STACK____ \t");
        System.out.println("1.push\n2.pop\n3.display\n4.peek\n5.size\n6.exit");
        do{
        System.out.print("enter your choice :");
        choice = sc.nextInt();
        
            switch (choice){
                case 1: 
                int data;
                System.out.print("enter the data to push: ");
                data=sc.nextInt();
                S1.push(data);
                // choice=false;
                break;
                case 2: 
                int popitem= S1.pop();
                System.out.println(popitem+" is popped ");
                break;
                case 3:
                System.out.println(S1);
                break;
                case 4:
                System.out.println("top elemrnt is: "+S1.peek());
                break;
                case 5:
                System.out.println("size of the stack is:"+S1.size());
                break;
                case 6:
                System.out.println("bye bye! ");
                System.exit(0);
                break;
                default :
                System.out.println("invalid choice!");
                break;

            }
        }
        while(choice!=7);


    }
}
