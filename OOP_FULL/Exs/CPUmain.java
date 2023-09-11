import java.util.Scanner;

class CPU{
    double Price;
    public CPU(){
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter CPU Price : ");
        Price = SC.nextDouble();
    }
    void display(){
        System.out.println("The price of CPU is : "+Price);
    }

    class processor{
        int noc;
        String Manufacturer;
        public processor(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the processor  cores : ");
        noc = sc.nextInt();
        System.out.print("Enter the processor  manufacturer : ");
        Manufacturer = sc.next();
        }
        void display(){
            System.out.println("The no of cores is: "+noc +" and the name of processor manufacturer is : "+ Manufacturer);
        }
    }

    static class RAM{
        int memory;
        String Manufacturer ;
        public RAM(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  memory size of RAM: ");
        memory= sc.nextInt();
        System.out.print("Enter the manufacturer name of the ram:  ");
        Manufacturer= sc.next();
        }
        void display(){
            System.out.println("The memory size of ram is : "+memory+"GB"+" and the manufacurer name  is :"+Manufacturer);
        }

    }
}


public class CPUmain{
    public static void main(String[] args) {
        CPU cob = new CPU();
        CPU.processor pob =cob.new processor();
        CPU.RAM rob = new CPU.RAM();
        System.out.println();
        System.out.println();
        System.out.println("The complete CPU Details : ");
        cob.display();
        pob.display();
        rob.display();
    }
}