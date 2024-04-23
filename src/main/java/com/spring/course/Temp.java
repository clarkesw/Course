package com.spring.course;

import java.util.*;

/**
 find the length of the longest sequence of zeros in binary representation of an integer. 
 */
public class Temp {
    
    public static void main(String[] args) {           
        int x = 3;
        int y = 2;
        
     //   System.out.println("multiply: " + multiply(x,y)); 
        System.out.println("addRange: " + addRange(x));
    }

    public static int addRange(int x){
        if(x > 0){
            return x + addRange(x - 1);
        }   
        return x;
    }
    
    public static int multiply(int x, int y){   
        if(y == 0)
            return 0;
        if(y > 0)
            return (x + multiply(x, y-1));
        if(y < 0)
            return -multiply(x, -y);

        return x;
    }
}

