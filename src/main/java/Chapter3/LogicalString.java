package Chapter3;

public class LogicalString {
    static void equalString(String s1, String s2) {
        String result = "";
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        System.out.println(s1 != s2);
    }

    public static void main(String[] args) {
        String s1 = "qqq";
        String s2 = "ppp";
        equalString(s1, s2);

    }
}
