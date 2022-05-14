package 装箱问题;

import java.util.ArrayList;
import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        ArrayList lists = new ArrayList();
        for (int i=0;i<num;i++){
            Scanner ber = new Scanner(System.in);
            int x = in.nextInt();
            lists.add(x);
        }

        ArrayList lists2 = new ArrayList();
        for (int i=0,j=1;i<num;i++,j++){
            int y = 0;
            y = 100-(int)(lists.get(i));
            lists2.add(y);
        }

        System.out.println(lists2);

        int max=1;
        int j=1;
        for (int i=0;i<num;i++,j++){
            int flag=0;
            if ((Integer)lists.get(i) <= 50) {
            for (int m=0;m<lists2.size();m++){
                if ((Integer)lists2.get(m)-(Integer)lists.get(i) >= 0 && (m!=i))
                {
                    int n=m+1;
                    flag=0;
                    System.out.println(lists.get(i) +" "+n);
                    lists2.set(m,(Integer)lists2.get(m)-(Integer)lists.get(i));
                    j--;
                    break;
                }
                flag++;
            }
            if (flag > 0){
                System.out.println(lists.get(i) +" "+j);
            }
        }else {
                System.out.println(lists.get(i) +" "+j);
            }
            if (j >= max)
            {
                max=j;
            }
        }
        if (j >= max)
        {
            max=j;
        }
        System.out.println(max);
    }
}
