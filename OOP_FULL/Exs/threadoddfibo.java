import java.util.Scanner;


class oddoreven implements Runnable{
    int number;
    public oddoreven(int number){
        this.number= number;
    }
    public void run(){
        for (int i=0;i<number;i++){
            if (i%2==0){
                System.out.println("even"+i);
            }
        }
        for (int i=0;i<number;i++){
            if (i%2!=0){
                System.out.println("odd"+i);
            }
        }

    }

}

class fibonacci implements Runnable{
    int num;
    public fibonacci(int num){
        this.num=num;
    }
    public void run(){
        int a=0;
        int b=1;
        int c;
        while(a <= num){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}

public class threadoddfibo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number,num;
        System.out.print("Enter the limit to print odd and even: ");
        number= sc.nextInt();
        System.out.print("Enter the limit to print fibonacci: ");
        num= sc.nextInt();

        Thread oe1 = new Thread(new oddoreven(number));
        Thread fib1 = new Thread (new fibonacci(num));


        oe1.start();
        fib1.start();


    }
}