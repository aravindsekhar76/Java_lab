import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
public class queuetest {
    public static void main(String[] args) {
        Queue <Integer>  Q1 = new LinkedList<>() ;
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Enqueue\n2.Dequeue\n3.display\n4.peek\n5.size\n6.exit");
        do{
        System.out.print("enter your choice :");
        choice = sc.nextInt();
        
            switch (choice){
                case 1: 
                int data;
                System.out.print("enter the data to add: ");
                data=sc.nextInt();
                Q1.add(data);
                // choice=false;
                break;
                case 2: 
                int popitem= Q1.poll();
                System.out.println(popitem+" is popped ");
                break;
                case 3:
                System.out.println(Q1);
                break;
                case 4:
                System.out.println("top elemrnt is: "+Q1.peek());
                break;
                case 5:
                System.out.println("size of the queue is:"+Q1.size());
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
