package oop_study;

public class ArrayParameter {
    static void replaceSpace(char[] a) {
        for(int i = 0; i<a.length; i++){
            if(a[i] == ' ') a[i] = ',';
        }
    }

    static void printCharArray(char a[]) {
        for (int i = 0; i<a.length; i++){
            System.out.print(a[i]);

        }
        System.out.println();
    }
}
