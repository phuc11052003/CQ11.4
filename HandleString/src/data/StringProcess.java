/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package data;

/**
 *
 * @author tran Hoang Phuc
 */
public class StringProcess {
    private String str;
    private int length;

    public StringProcess() {
    }

    public StringProcess(String str, int length) {
        this.str = str;
        this.length = length;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    public int letterCount() {
        int count = 0;
        String[] words = str.split(" ");
        for (String word : words) {
            for (char c : word.toCharArray()) {
                if (Character.isLetter(c))
                    count++;
            }
        }
        return count;
    }
    
    public int digitCount() {
        int count = 0;
        String[] words = str.split(" ");
        for (String word : words) {
            for (char c : word.toCharArray()) {
                if(Character.isDigit(c)) 
                    count++;
            }
        }
        return count;
    }
    
    public boolean isDigit() {
        int count = 0;
        String[] words = str.split(" ");
        for (String word : words) {
            for (char c : word.toCharArray()) {
                if (Character.isDigit(c)) {
                    count++;
                }
            }
        }
        return count == (str.length() - (words.length - 1));
    }
    
    public boolean isLetter() {
        int count = 0;
        String[] words = str.split(" ");
        for (String word : words) {
            for (char c : word.toCharArray()) {
                if (Character.isLetter(c)) {
                    count++;
                }
            }
        }
        return count == (str.length() - (words.length - 1));
    }
    
    public void concat(String s) {
        System.out.println("" + str + s);
    }
    
    public void compareString(String s) {
        int len1 = str.length();
        int len2 = s.length();
        int lim = Math.min(len1, len2);
        char[] v1 = str.toCharArray();
        char[] v2 = s.toCharArray();
        
        int k = 0;
        while (k < lim) {
            char c1 = v1[k];
            char c2 = v2[k];
            if (c1 != c2) {
                System.out.println(c1 - c2);
                return;
            }
            k++;
        }
        System.out.println(len1 - len2);
    }
    
    public int search(char x) {
        int pos = -1;
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if(c[i] == x) {
                pos = i;
            }
        }
        return pos;
    }
    
    public int wordCount() {
        int count = 0;
        String[] words = str.split(" ");
        for (String word : words) {
            count++;
        }
        return count;
    }
    
    public void replace(char x, char y) {
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] == x)
                c[i] = y;
            System.out.print(c[i]);
        }   
        System.out.println("");
    }
    
    public void format() {
        String a = "";
        String[] words = str.split(" ");
        for (String word : words) {
            word = word.toUpperCase().charAt(0) + word.substring(1, word.length()).toLowerCase();
            a = a + word + " ";
        }
            a = a.substring(0, a.length() - 1);
        System.out.println(a);
    }
}
