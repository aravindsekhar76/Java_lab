import java.util.Scanner;
import java.util.HashSet;

public class hashsettest{
    public static void main(String[] args) {
        HashSet <Integer> hs1 = new HashSet<>();
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("HASH SET");
        System.out.println("1.Add\n2.Delete\n3.display\\n4.exit");
        do{
        System.out.print("enter your choice :");
        choice = sc.nextInt();
        
            switch (choice){
                case 1: 
                int data;
                System.out.print("enter the data to add: ");
                data=sc.nextInt();
                hs1.add(data);
                // choice=false;
                break;
                case 2:
                int rdata;
                System.out.print("enter the data to remove: ");
                rdata=sc.nextInt();
                hs1.remove(rdata);
                System.out.println(rdata+" is removed ");
                break;
                case 3:
                System.out.println(hs1);
                break;
                case 4:
                System.out.println("bye bye! ");
                System.exit(0);
                break;
                default :
                System.out.println("invalid choice!");
                break;

            }
        }
        while(choice!=5);

}
}