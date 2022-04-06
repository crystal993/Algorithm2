package study.CodingTestBasic.String;

public class ChangeStringValue {
    public static void main(String[] args) {
        String name = "twotome";
        String newname = name.substring(0,4)+'s'+name.substring(5);
        System.out.println("newname = " + newname);
    }
}
