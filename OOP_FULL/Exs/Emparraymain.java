import java.util.Scanner;
class employee{
    int eno;
    String ename;
    double esalary;
    // employee(int eno, String ename, double esalary){
    //     this.eno=eno;
    //     this.ename=ename;
    //     this.esalary=esalary;
    // }
    void insert(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter emp no: ");
        eno= sc.nextInt(); 
        System.out.print("\nenter emp name: ");
        ename= sc.next();
        System.out.print("\nenter emp salary: ");
        esalary= sc.nextDouble();

    }
    void display(){
        System.out.println("employee number is : "+eno+"., enmployee name is: "+ename+"., employee salary is: "+esalary);

    }
}

public class Emparraymain{
    public static void main(String[] args) {
        System.out.print("Enter the nmber of employees: ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("\nEnter the Details of "+n+" employees ");
        employee ob1[]=new employee[n];
        for (int i=0; i<n;i++){
            ob1[i]=new employee();
            ob1[i].insert();
        }
        
        System.out.println("\nDetails of all employees: \n");
        for(int i=0;i<n;i++){
            ob1[i].display();
        }


        System.out.print("enter employee name to check :");
        int number= sc.nextInt();
        int flag=0;
        for(int i=0;i<n;i++){
            if(ob1[i].eno==number){
                System.out.println("\nEMPLOYEE EXISTS! ");
                ob1[i].display();
                flag=1;
            }
        }
        if(flag!=1){
            System.out.println("\nEMPLOYEE DOESNT EXIST!");
        }
    

    }
}