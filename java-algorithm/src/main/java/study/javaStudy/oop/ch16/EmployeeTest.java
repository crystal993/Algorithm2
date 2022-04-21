package study.javaStudy.oop.ch16;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmployeeName("이순신");

        System.out.println(employee.serialNum); //100

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");
        employeeKim.serialNum++; //static변수 1증가

        System.out.println("employee = " + employee.serialNum); //1001
        System.out.println("employeeKim = " + employeeKim.serialNum); //1001
        // 두 값이 1001로 같으므로 static변수로 공유하고 있음을 알 수 있다.
    }
}
