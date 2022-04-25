package study.javaStudy.oop1.ch12;

public class Person {
    String name;
    int age;

    public Person()
    {
        // 1. 다른 생성자를 호출하는 this
        // 생성자에서 다른 생성자를 호출하느 this
        this("no name", 1);
    }

    public Person(String name, int age){
        // 2. heap메모리의 주소값을 가리키는 this
        this.name = name;
        this.age = age;
    }

    public void showPerson(){
        System.out.println(name + " , " + age);
    }

    // 3. 자신의 주소를 반환하는 this
    public Person getPerson(){
        return this;
        // jvm이 할당해준 주소값이 나옴.
    }


    public static void main(String[] args) {

        Person kim = new Person();
        kim.showPerson();
        System.out.println(kim);

        Person lee = kim.getPerson();
        System.out.println(lee); //동일한 주소값이 출력
    }
}
