package com.example.demo;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jiarj on 2018-06-21.
 */
public class Test_demo {


    public static void main(String[] args){
//        Test_demo td = new Test_demo();
//        td.oldRunable();
//        td.runable();
//
//        List features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API");
//
//        features.forEach( n -> System.out.println(n) );


        double result=0.051111122111111;
        DecimalFormat df = new DecimalFormat("0.00%");
        String r = df.format(result);
        System.out.println(r);


//        float i = 1;
//        System.out.println(i);


    }

    public void oldRunable(){
        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("The old runable now is using!");
                    }
                }
        ).start();
    }


    public void runable(){
        new Thread(
                () -> System.out.println("It's a lambda function!")
        ).start();

    }


}
