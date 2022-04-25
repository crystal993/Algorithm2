package study.javaStudy.oop1.ch18;

public class Company {

    // 유일한 객체가 되었다.
    // 인스턴스 생성은 private으로 외부에서 사용할 수 없게 막아놓았다.
    // 오로지 getInstance() 메서드로만 접근이 가능.
    private static Company instance = new Company();

    private Company(){

    }

    // 유일한 객체에 접근하기 위한 인스턴스
    // static으로 선언하면 외부에서 클래스 이름으로 메서드 사용이 가능하다.
    public static Company getInstance() {
        if(instance == null){
            instance = new Company();
        }
            return instance;
    }


}
