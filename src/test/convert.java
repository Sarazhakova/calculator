package test;

import java.util.TreeMap;

public class convert {

        private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

        static {

            map.put(1000, "M");
            map.put(900, "CM");
            map.put(500, "D");
            map.put(400, "CD");
            map.put(100, "C");
            map.put(90, "XC");
            map.put(50, "L");
            map.put(40, "XL");
            map.put(10, "X");
            map.put(9, "IX");
            map.put(8, "VIII");
            map.put(7, "VII");
            map.put(6, "VI");
            map.put(5, "V");
            map.put(4, "IV");
            map.put(3, "III");
            map.put(2, "II");
            map.put(1, "I");

        }

        public static String toRoman(int number) {
            int l =  map.floorKey(number);
            if ( number == l ) {
                return map.get(number);
            }
            return map.get(l) + toRoman(number-l);
        }

    public static int letterToNumber(String letter) {
        switch (letter) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
            case "L":
                return 50;
            case "C":
                return 100;
            case "D":
                return 500;
            case "M":
                return 1000;
            default:
                throw new NumberFormatException("Illegal character \"" + letter + "\" in Roman numeral");
        }
    }

    public String[] setArray(String[] letter) {
            return letter;
    }
}
