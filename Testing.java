import java.util.Scanner; 

public class Testing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("Enter id : ");
        employee.setId(sc.nextInt());

        System.out.println("Enter name : ");
        employee.setName(sc.nextLine()); 

        System.out.println("Enter Salary: ");
        employee.setSalary(sc.nextInt());

        System.out.println("Details ----- \n  Id = " + employee.getId() + " , Name =" + employee.getName() + ", Salary=" + employee.getSalary());

        sc.close(); 
    }
}

class Employee {
    private int employee_id;
    private String employee_name;
    private int employee_salary;

    public int getId() {
        return employee_id;
    }

    public String getName() {
        return employee_name;
    }

    public int getSalary() {
        return employee_salary;
    }

    public void setId(int employee_id) {
        this.employee_id = employee_id;
    }

    public void setName(String employee_name) {
        this.employee_name = employee_name;
    }

    public void setSalary(int employee_salary) {
        this.employee_salary = employee_salary;
    }
}
