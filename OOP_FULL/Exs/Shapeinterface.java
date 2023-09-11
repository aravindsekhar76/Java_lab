import java.util.Scanner;
interface shapes{
    Scanner sc = new Scanner(System.in);
    double area();
    double perimeter();
}

class square implements shapes{
    public double area(){
        System.out.println("enter the side of square: ");
        double side= sc.nextDouble();
        System.out.println("Area of the square is : "+side*side);
        return side*side;
    }
    public double perimeter(){
        System.out.println("Enter the side of the square: ");
        double side =sc.nextDouble();
        System.out.println("Perimeter of the square is : "+4*side);
        return 4*side; 
    }
}

class rectangle implements shapes{
    public double area(){
        System.out.println("enter the length of rectangle: ");
        double l= sc.nextDouble();
        System.out.println("enter the breadth of rectangle: ");
        double b= sc.nextDouble();
        System.out.println("Area of the rectangle is : "+2*l+b);
        return 2*l+b;

    }
    public double perimeter(){
        System.out.println("enter the length of rectangle: ");
        double l= sc.nextDouble();
        System.out.println("enter the breadth of rectangle: ");
        double b= sc.nextDouble();
        System.out.println("perimeter of the rectangle is : "+l*b);
        return l*b;

    }

}
public class Shapeinterface{
    public static void main(String[] args) {
        square s1= new square();
        rectangle r1= new rectangle();
        s1.area();
        s1.perimeter();
        r1.area();
        r1.perimeter();
    }
}