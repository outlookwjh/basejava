package com.wjh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 客户端输入两个字符串，检查第一次输入的字符串中有没有第二个字符串中出现的
 * ，如果有，则删除；
 */
public class specConvert {

    public static void main(String[] args) {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=null;
        String s1=null;
        try {
             s = br.readLine();
            System.out.println(s);
             s1 = br.readLine();
            System.out.println(s1);
        } catch (IOException e){
            e.printStackTrace();
        }

        char[] chars = s.toCharArray();
        char[] chars1 = s1.toCharArray();
        ArrayList<Character> ss = new ArrayList<>();
        ArrayList<Character> sss = new ArrayList<>();
        for (char aChar : chars) {
           ss.add(aChar);
        }
        for (char aChar : chars1) {
            sss.add(aChar);
        }
        System.out.println(ss);
        System.out.println(sss);

        for (Character character : sss) {
            if (ss.contains(character)){
                ss.remove(character);
            }
        }
        System.out.println(ss);
        System.out.println(sss);

    }




}
