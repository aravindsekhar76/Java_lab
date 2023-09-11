import java.util.Scanner;
class notable extends Exception{
    public notable(String msg){
        super(msg);
    }
}
public class TestExceptionvoting{

    public static void main(String[] args) {
        int age = 18;
        String country = "india";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your age: ");
        int inpage=sc.nextInt();
        System.out.println("enter your country: ");
        String inpcountry=sc.next();


    try{
        if(inpage >= age && inpcountry.equals(country)){
            System.out.println("you are eligible to vote ");
        }
        else if (inpage <age || !inpcountry.equals(country) ){
            throw new notable(" you are not eligible to vote!, you are under 18 years of age!, or You are not an Indian citizen! ");
        }
    }
    catch(notable e){
        System.out.println(e.getMessage());
    }
}
    
}