import java.util.Scanner;
public class stringsort{
    public static void main(String[] args) {
        String str[]= new String[20];
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("enter the total no of string : ");
        n = sc.nextInt();
        System.out.println("enter the "+n+" string: ");
        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }
        System.out.println("String before sorting:");      
        for(int i=0;i<n;i++){
            System.out.print("\t"+str[i]);
        }

        for (int i=0;i<n;i++){
            for(int j =i+1;j<n;j++){
                if(str[i].compareTo(str[j])>0){
                    String temp=str[j];
                    str[j]=str[i];
                    str[i]=temp;
                }
            }
        }
        System.out.println("\nString after sorting: ");
        for(int i=0; i<n; i++){
            System.out.print("\t"+str[i]);
        }
    }
}