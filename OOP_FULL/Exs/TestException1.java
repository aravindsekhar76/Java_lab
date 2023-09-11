import java.util.Scanner;
class notlogin extends Exception{
    public notlogin(String msg){
        super(msg);
    }
}

public class TestException1{
    public static void main(String[] args) {
        String uname = "user";
        String pass= "admin";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your user name: ");
        String cuname =sc.next();
        System.out.println("Enter your password: ");
        String cpass =sc.next();
        try{
            if(cuname.equals(uname) && cpass.equals(pass)){
                System.out.println("Acces granted");
            }
            else{
                throw new notlogin("incorrect username or password!");
            }
        }
        catch(notlogin e){
            System.out.println(e.getMessage());
        }

    }
}