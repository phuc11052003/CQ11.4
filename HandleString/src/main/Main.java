/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import data.StringProcess;

/**
 *
 * @author tran Hoang Phuc
 */
public class Main {
    public static void main(String[] args) {
        String a = "ama hahH oaoa";
        StringProcess str = new StringProcess(a, a.length());
        System.out.println(str.letterCount());
        System.out.println(str.digitCount());
        System.out.println(str.isDigit());
        System.out.println(str.isLetter());
        str.concat("121");
        str.compareString("ama hahH oaoa");
        str.compareString("ama hahH oaoa dfsfsd");
        
        System.out.println(str.search('a'));
        System.out.println(str.wordCount());
        
       str.replace('a', 'l');
       
       str.format();
    }
    
    
}
    
    

