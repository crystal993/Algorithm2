package study.CodingTestBasic.ArrayList;

import java.util.ArrayList;

public class DeepCopy {
    public static void main(String[] args) {
        //ArrayList를 깊은 복사하고 싶다면, 복사되는배열.addAll(복사할배열) 메서드를 사용하면 된다. 
        //ArrayList w를 ArrayList copy_w에 깊은 복사
        ArrayList<Integer> w = new ArrayList<Integer>();
        ArrayList<Integer> copy_w = new ArrayList<Integer>();
        System.out.println(copy_w.addAll(w));
    }
}
