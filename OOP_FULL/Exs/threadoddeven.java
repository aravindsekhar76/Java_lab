import java.util.Scanner;

class even implements Runnable {
    int n;
    public even(int n){
        this.n=n;
    }
    public void run(){
        for(int i=0;i<n;i++){
            if(i%2==0){
                System.out.println("even: "+i);
            }
        }
    }

    
}
class odd implements Runnable {
    int n;
    public odd(int n){
        this.n=n;
    }
    public void run(){
        for(int i=0;i<n;i++){
            if(i%2!=0){
                System.out.println("odd: "+i);
            }
        }
    }

    
}

public class threadoddeven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the limit: ");
        int no= sc.nextInt();
        Thread e1 = new Thread (new even(no));
        Thread o1 = new Thread (new odd(no));

        e1.start();
        o1.start();

        
    }
}