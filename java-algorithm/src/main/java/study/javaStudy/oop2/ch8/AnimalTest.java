package study.javaStudy.oop2.ch8;

import java.util.ArrayList;

class Animal{
    public void move() {
        System.out.println("동물이 움직입니다.");
    }

    public void eating() {

    }
}

class Human extends Animal {
    @Override
    public void move() {
        System.out.println("사람이 두 발로 걷습니다.");
    }

    public void readBook() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {
    @Override
    public void move() {
        System.out.println("호랑이가 네 발로 걷습니다.");
    }

    public void hunting(){
        System.out.println("호랑이가 사냥을 합니다.");
    }
}

class Eagle extends Animal {

    public void move() {
        System.out.println("독수리가 하늘을 날아 다닙니다.");
    }

    public void flying() {
        System.out.println("독수리가 양날개를 쫙 펴고 날아다닙니다.");
    }
}

public class AnimalTest {
    public static void main(String[] args) {

        // 하위클래스가 상위클래스 타입으로 형변환
        Animal hanimal = new Human();
        Animal tanimal = new Tiger();
        Animal eanimal = new Eagle();

        AnimalTest T = new AnimalTest();

        // 각각 인스턴스의 메서드가
        // 가상메서드 방식으로 인해 호출이 되는 것을 볼 수 있다.
//        T.moveAnimal(hanimal);
//        T.moveAnimal(tanimal);
//        T.moveAnimal(eanimal);

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(hanimal);
        animalList.add(tanimal);
        animalList.add(eanimal);
        
        // 다형성 : 하나의 메서드가 인스턴스의 타입에 따라서 
        // 다양한 방식으로 작동함
//        for (Animal animal : animalList) {
//            animal.move();
//        }

            T.testDownCasting(animalList);

    }

    // 다운 캐스팅
    public void testDownCasting(ArrayList<Animal> list) {

        for (int i = 0; i < list.size(); i++) {
            Animal animal = list.get(i);

            if(animal instanceof Human) {
                // 다운캐스팅을 통해 이제는 하위 클래스의 메소드도 출력이 됨
                Human human = (Human)animal;
                human.readBook();
            } else if (animal instanceof Tiger) {
                Tiger tiger = (Tiger)animal;
                tiger.hunting();
            } else if (animal instanceof Eagle) {
                Eagle eagle = (Eagle)animal;
                eagle.flying();
            } else {
                System.out.println("unsupported type");
            }
        }
    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }
}
