import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Oleg","Manager", "oleg@mail.com", 01765363376, 4000,33);
        Employee employee2 = new Employee("Alex","Manager", "asdflex@mail.com", 01762365374, 4000,43);
        Employee employee3 = new Employee("Ivan","Manager", "alexsdf@mail.com", 01762345374, 4000,37);
        Employee employee4 = new Employee("David","Manager", "alsdfex@mail.com", 017623265374, 4000,57);
        Employee employee5 = new Employee("Pavel","Manager", "alesdfx@mail.com", 01724625374, 4000,41);

        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = employee1;
        employeesArray[1] = employee2;
        employeesArray[2] = employee3;
        employeesArray[3] = employee4;
        employeesArray[4] = employee5;

        for (Employee employee : employeesArray) {
            if (employee.getAge() > 40) {
                System.out.println("This employee is over 40:  " + employee);
            }
        }
    }
}
