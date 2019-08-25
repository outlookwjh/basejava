package com.wjh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalArrayMaxValue {

    public static void main(String[] args) throws IOException {

        int []arg=new int[]{1,2,3,4,5,6,7,8,9,0};


        System.out.println(arg.toString());
        int max=arg[0];
        for (int i : arg) {
            if (arg[i]>max){
                max=arg[i];
            }
        }
        System.out.println(max);





    }
}
