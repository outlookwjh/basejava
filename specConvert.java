package com.wjh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class specConvert {

    public static void main(String[] args) {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try {
            String s = br.readLine();
            System.out.println(s);
            String s1 = br.readLine();
            System.out.println(s1);
        } catch (IOException e) {
            e.printStackTrace ();
        }



    }




}
