class shape{
    int area(int side){
        return side*side;
    }
    int area(int l,int b){
        return l*b;
    }
    double area(double rad){
        return 3.13*rad*rad;
    }
}
public class Areashapeoverload{
    public static void main(String[] args) {
    shape ob1= new shape();
    System.out.println("Area of the square is :"+ ob1.area(5));
    System.out.println("Area of the rectangle is :"+ ob1.area(4,3));
    System.out.println("Area of the circle is :"+ ob1.area(2.0));
    }
}
