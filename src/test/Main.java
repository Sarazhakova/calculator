package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] letter = {"M", "CM","D","CD", "C","XC","L","XL","X","IX","VI","V","IV","II","I"};
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] expr = text.split(" ");
        int n1=0, n2=0;
        String op = " ";
        op = expr[1];

        boolean flag = false;
        for (String s : letter) {
            if ((expr[0].equals(s) || expr[2].equals(s))) {
                flag = true;
                break;
            }
        }

        try {
                if (flag) {
                    n1 = convert.letterToNumber(expr[0]);
                    n2 = convert.letterToNumber(expr[2]);
                    System.out.println(convert.toRoman(tcalc.calculate(n1, n2, op)));
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
                if (!flag) {
                    n1 = Integer.parseInt(expr[0]);
                    n2 = Integer.parseInt(expr[2]);
                    System.out.println(tcalc.calculate(n1, n2, op));
                }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if ((n1 > 10 || n1 < 1) || (n2 > 10 || n2 < 1)) throw new IllegalArgumentException();
    }
}
