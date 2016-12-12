/**
 * Created by e165711 on 2016/12/11.
 */

import java.io.IOException;

public class Main {
    public static void main(String[] args){
        try {
            String str = "3．14";
            int str_len = str.length();
            double value = Double.parseDouble(str);
            System.out.println(str_len);
            System.out.println(value);

        }catch(NullPointerException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println("NullPointerExceptionが発生しました．");

        }
    }

}
