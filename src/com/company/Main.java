package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Ведите 5 строк числа :");
        ArrayList<String> A = new ArrayList<String>();
        ArrayList<String> B = new ArrayList<String>();
        ArrayList<String> C = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            A.add(scanner.nextLine());
        }
        System.out.println(A);

        for (int i = 0; i < 5 ; i++) {
            B.add(scanner.nextLine());
        }
        System.out.println(B);
        Collections.reverse(B);
        System.out.println(B);

        Integer x = 0;
        while (C.size()< A.size() + B.size()){
            C.add(A.get(x));
            C.add(B.get(x));
            x++;
        }
        C.add(A.get(0));
        C.add(B.get(1));
        System.out.println(C);
        Collections.sort(C, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(C);

    }
}
