package ua.zp.brainacad.brain.lab8.lab8_1;

/**
 * Created by Brain25 on 20.11.2018.
 */
public class Main {
    public static void main(String[] args) {
        String myStr = "abracadabra";
        int index = myStr.indexOf("ra");
        System.out.println(index);
        int lastIndex = myStr.lastIndexOf("ra");
        System.out.println(lastIndex);
        String myStr2 = myStr.substring(3, 7);
        System.out.println(myStr2);
        System.out.println(reverseString(myStr2));

    }

    public static StringBuilder reverseString(String s) {
        StringBuilder builder = new StringBuilder(s);
        builder.reverse();
        //System.out.println(builder);
        return builder;
    }

}
