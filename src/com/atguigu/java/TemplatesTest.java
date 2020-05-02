package com.atguigu.java;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Li
 * @create 2020-05-02 14:46
 */
public class TemplatesTest {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("hello");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("args = " + args);
        int num = 10;
        int num2 =10;
        System.out.println("num2 = " + num2);
        String[] arr = new String[]{"tom","herry","hanmeimei","lilei"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

        for (String s : arr) {
            
        }

        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            
        }
        System.out.println("num = " + num);

        ArrayList lsit = new ArrayList();
        ArrayList list = new ArrayList();
        for (Object o : list) {
            
        }
        for (int i = 0; i < list.size(); i++) {
            
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
    }
}
