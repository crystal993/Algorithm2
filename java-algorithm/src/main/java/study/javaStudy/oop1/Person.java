package study.javaStudy.oop1;

public class Person {
    public String name;
    public int age;
    public int height;
    public int weight;
    public String type;

    public Person (String name, int age, int height, int weight, String type) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.type = type;
    }

    public void showPersonInfo() {
        System.out.println("키가 "+height+" 이고 몸무게가 "+weight+" 킬로인 "+type+"이 있습니다. 이름은 "+name+" 이고 나이는 "+age+"세입니다.");
    }
}
