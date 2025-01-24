package level01;

//create class Employee
class Employee {
    String name;
    protected int id;
    protected int salary;

    //create constructor
    Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    //create methode to display
    void display() {
        System.out.println("name " + name + " id " + id + " salart " + salary);
    }
}

//create class manager extend employee
class Manager extends Employee {

    Manager(String name, int id, int salary) {
        super(name, id, salary);
    }
@Override
    //create display methode
    void display() {
        System.out.println("name " + name + " id " + id + " salart " + salary);
    }
}

//class Developer extends Employee
class Developer extends Employee {
    Developer(String name, int id, int salary) {
        super(name, id, salary);
    }
@Override
    void display() {
        System.out.println("name " + name + " id " + id + " salart " + salary);
    }
}

//class Intern extends Employee
class Intern extends Employee {
    Intern(String name, int id, int salary) {
        super(name, id, salary);
    }
}


public class EmployeeManagementSystem {
    public static void main(String[] args) {
        //create objects array
        Employee employee = new Employee("nimish", 47894, 999999);
        Manager manager = new Manager("nishu", 456456, 465);
        Developer developer = new Developer("mohan", 4564, 789);
        Intern intern = new Intern("kapil", 45566, 4564);
        //methode calling using object
        employee.display();
        manager.display();
        developer.display();
        intern.display();

    }
}
