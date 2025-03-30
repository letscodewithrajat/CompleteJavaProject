package com.rajat.primitives;

public class MyChar {

    private char ch;

    public MyChar(char ch) {

        this.ch = ch;
    }

    public boolean isVowel() {

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            return true;
        }

        return false;
    }

    public boolean isConsonent() {
        return (isAlphabet() && !isVowel());
    }

    public boolean isDigit() {
        return ch >= 48 && ch <= 57;
    }

    public boolean isAlphabet() {
        return (ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90);
    }

    public static void printLowercaseAlphabets() {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + " ");
        }
    }

    public static void printUppercaseAlphabets() {
        System.out.println();
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            ;
            System.out.print(ch + " ");
        }
    }

}
