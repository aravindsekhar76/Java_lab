import java.util.Scanner;

public class armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num= sc.nextInt();
        int inum=num;
        int s=findNumberLength(num);
        int temp,rev=0;
        while(num!=0){
            temp=num%10;
            rev= rev+temp*s;
            num=num/10;

        }
        if(inum==rev){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong");
        }

    }
    public static int findNumberLength(int num) {
        // Convert the number to a string and find its length
        String numStr = String.valueOf(num);
        return numStr.length();
    }

}




// import java.util.Scanner;

// public class ArmstrongNumber {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();

//         if (isArmstrong(number)) {
//             System.out.println(number + " is an Armstrong number.");
//         } else {
//             System.out.println(number + " is not an Armstrong number.");
//         }

//         scanner.close();
//     }

//     public static boolean isArmstrong(int num) {
//         int originalNumber = num;
//         int numDigits = countDigits(num);
//         int sum = 0;

//         while (num > 0) {
//             int digit = num % 10;
//             sum += Math.pow(digit, numDigits);
//             num /= 10;
//         }

//         return sum == originalNumber;
//     }

//     public static int countDigits(int num) {
//         int count = 0;
//         while (num > 0) {
//             num /= 10;
//             count++;
//         }
//         return count;
//     }
// }
