import java.util.Scanner;


class person{
    String name;
    char gender;
    String address;
    int age;
    person( String name,char gender,String address,int age){
        this.name = name;
        this.gender= gender;
        this.address= address;
        this.age= age;
    }
}

class employe extends person{
    int empid;
    String company_name;
    String qualification;
    double salary;
    employe( String name,char gender,String address,int age,int empid,String company_name,String qualification , double salary){
        super(name,gender,address,age);
        this.empid=empid;
        this.company_name= company_name;
        this.qualification= qualification;
        this.salary = salary;
    }
}

class teacher extends employe{
    int tid;
    String subject;
    String dept;
    teacher( String name,char gender,String address,int age,int empid,String company_name,String qualification , double salary,int tid,String subject,String dept){
        super(name,gender,address,age,empid,company_name,qualification,salary);
        this.tid=tid;
        this.subject=subject;
        this.dept=dept;
    }

    public void display(){
        System.out.print("The details of teacher are: \n");
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Address: "+address);
        System.out.println("Age: "+age);
        System.out.println("employe id: "+empid);
        System.out.println("Company Name: "+company_name);
        System.out.println("Qualification: "+qualification);
        System.out.println("Salary: "+salary);
        System.out.println("Teacher id: "+tid);
        System.out.println("Subject: "+subject);
        System.out.println("Department: "+dept);

    
    }

}
public class Empmultilevelarray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total the no of teachers: ");
        int n= sc.nextInt();
        teacher t1[]= new teacher[n];
        System.out.print("Enter the details of "+n+" teachers:\n");
        int no=0;
        for (int i=0;i<n;i++){
            no=no+1;
            System.out.print("Enter the details of teacher "+no+":\n");
            System.out.print("Name: ");
            String a =sc.next();
            System.out.print("Gender: ");
            char b =sc.next().charAt(0);
            System.out.print("Address: ");
            String c =sc.next();
            System.out.print("Age:");
            int d =sc.nextInt();
            System.out.print("Empid:");
            int e =sc.nextInt();
            System.out.print("Company: ");
            String f =sc.next();
            System.out.print("Qualification:");
            String g =sc.next();
            System.out.print("Salary");
            double h =sc.nextDouble();
            System.out.print("Teacher id: ");
            int  j=sc.nextInt();
            System.out.print("Subject:");
            String  k=sc.next();
            System.out.print("Dept:");
            String l =sc.next();
            t1[i]=new teacher(a,b,c,d,e,f,g,h,j,k,l);

        }
        int choice =0,cur=0;
        System.out.println("Do you want to view the details of all teachers: ");
        System.out.print("If yes press 1, If no press 0 to exit: ");
        choice = sc.nextInt();
        if(choice ==1){
            for (int i=0;i<n;i++){
                cur=cur+1;
                System.out.print(cur);
                t1[i].display();
            }
        }
        else{
            System.out.println("Thankyou! ");
            System.exit(0);
        }

    }

}