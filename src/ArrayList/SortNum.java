package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortNum {
    private int num;

    public SortNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "SortNum{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(9);
        list.add(4);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);


    }
}
