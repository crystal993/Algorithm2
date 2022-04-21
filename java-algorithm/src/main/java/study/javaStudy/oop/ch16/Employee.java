package study.javaStudy.oop.ch16;

public class Employee {

    private static int serialNum = 1000;

    private int employeeId;
    private String employeeName;
    private String department;

    // 생성자 
    // 인스턴스가 생성이 될때마다 아이디 값이 1씩 증가
    public Employee() {
        serialNum++;
        employeeId = serialNum;
    }

    // serialNum은 get메서드만
    public static int getSerialNum() {
        int i = 0;
//        employeeName = "Lee"; //static메서드 안에서는 일반멤버변수를 사용할 수 없다.
        return serialNum; //static변수를 사용할 수 있다.
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
