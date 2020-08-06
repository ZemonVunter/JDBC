package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Delstr {
    public static List<Character> func(String str1, String str2){
        List<Character> list=new ArrayList<>();
        for (int i = 0; i <str1.length()-1 ; i++) {
            char ch=str1.charAt(i);
            if(!str2.contains(ch+"")){
                list.add(ch);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        String str1="welcome to bit";
        String str2="come";
        List<Character> ret=func(str1,str2);
        for (char ch:ret) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
