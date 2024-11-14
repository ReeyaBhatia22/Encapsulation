import java.util.Scanner;
class Employee 
{
    int id; 
    String Name;
    float Salary; 
    public void setid(int i){ 
        this.id=i;
    }

    public int getid() { 
        return this.id;
    }

    public void setname(String m){ 
        this.Name=m;
    }

    public String getname() { 
        return this.Name;
    }
    public void setsalary(float g){ 
        this.Salary=g;
    }

    public float getsalary() { 
        return this.Salary;

}

}
class Main
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        Employee e1= new Employee();
        System.out.println("Enter your Name"); 
        String name= sc.nextLine();
        e1.setname(name);
        System.out.println("Enter your employee id"); 
        int id= sc.nextInt();
        e1.setid(id);
        System.out.println("Enter your Salary"); 
        float Salary= sc.nextFloat();
        e1.setsalary(Salary);
        System.out.println("Employee id:"+e1.getid());
        System.out.println("Employee Name:"+e1.getname());
        System.out.println("Employee Salary:"+e1.getsalary());
        sc.close();

    }
    
}