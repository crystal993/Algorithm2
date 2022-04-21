package study.javaStudy.oop.ch16;

public class EmployeeTest {
    public static void main(String[] args) {

        // 인스턴스가 생성되기 전에 static변수가 사용가능함을 볼 수 있다.
//        System.out.println(Employee.serialNum); //1000

        // Employee 인스턴스 employeeLee 생성
        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이순신");

//        System.out.println(employeeLee.serialNum); //1001

        // Employee 인스턴스 employeeKim 생성
        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");
//        employeeKim.serialNum++; //static변수 1증가

//        System.out.println("employeeLee.serialNum : " + employeeLee.serialNum); //1003
//        System.out.println("employeeKim.serialNum : " + employeeKim.serialNum); //1003
        // 두 값이 1003로 같으므로 static변수로 공유하고 있음을 알 수 있다.

        // 사번이 인스턴스가 생성될 때 자동으로 생긴 것을 확인 할 수 있다.
        System.out.println(employeeLee.getEmployeeName()+"님의 사번은 " + employeeLee.getEmployeeId()); //1001
        System.out.println(employeeKim.getEmployeeName()+"님의 사번은 " + employeeKim.getEmployeeId()); //1002

        System.out.println(Employee.getSerialNum());

    }
}
