import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class arraylisttest {
    public static void main(String[] args) {
        ArrayList <Integer> Ar1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements to add");
        for (int i=0;i<5;i++){
            int data =sc.nextInt();
            Ar1.add(data);
        }
        Ar1.sort(null);
        System.out.println(Ar1);
    }
}
