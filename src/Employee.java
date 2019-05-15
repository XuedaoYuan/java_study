public class Employee {
    //    类变量（静态变量）， 无论实例化多少份， 类变量都只有一份
    public static final String company = "老袁炒年糕";
    //    实例变量对子类可见
    public String name;
    //    私有变量， 只在该类可见
    private double salary;

    public Employee(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void printEmp() {
        System.out.println("name: " + this.name);
        System.out.println("salary: " + this.salary);
        System.out.println("companny: " + Employee.company);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("xdyuan");
        emp.setSalary(100);
        emp.printEmp();
    }
}
