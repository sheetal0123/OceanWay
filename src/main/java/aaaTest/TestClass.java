package aaaTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;


interface aon{
    public int multby2(int a, int b);
}

//
//class Man implements aon{
//
//    @Override
//    public int multby2(int a) {
//        return a*2;
//    }
//}


public class TestClass {


    public static void main(String [] args){
//            Man obj = new Man();
//            System.out.println(obj.multby2(10));
        aon obj1 = (int a, int b) -> {
            int c = a+b;
            System.out.print("more: "+c);
            return c;
        };


        System.out.println(obj1.multby2(10, 20));

        aon obj2 = (int a, int b) -> a*4;
        System.out.println(obj2.multby2(10, 20));



    }

}
