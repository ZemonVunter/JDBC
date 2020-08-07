package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class YangHuiSanJiao {
    public static List<List<Integer>> generate(int numRows){
        List<List<Integer>> ret=new ArrayList<>();
        if(numRows==0){
            return ret;
        }
        List<Integer> oneRow=new ArrayList<>();
        ret.add(oneRow);
        ret.get(0).add(1);
        //直接从第二行开始
        for (int i = 0; i <numRows ; i++) {
            List<Integer> curRow=new ArrayList<>();
            curRow.add(1);
            List<Integer> prevRow=ret.get(i-1);
            for (int j = 1; j <numRows-1 ; j++) {
                //[i,j]=[i-1,j]+[i-1,j-1]
                int x=prevRow.get(j);
                int y=prevRow.get(j-1);
                curRow.add(x+y);

            }
            curRow.add(1);
            ret.add(curRow);
        }
        return ret;
    }
    public static void main(String[] args) {
            generate(10);
    }

}
