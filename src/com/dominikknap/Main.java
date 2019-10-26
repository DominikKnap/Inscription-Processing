package com.dominikknap;

public class Main {

    public static String changer(String n) {

        if (n == null) {
            return "";
        }

        final String[] words = {
                "-ZERO-",
                "-ONE-",
                "-TWO-",
                "-THREE-",
                "-FOUR-",
                "-FIVE-",
                "-SIX-",
                "-SEVEN-",
                "-EIGHT-",
                "-NINE-"
        };

        StringBuilder sb = new StringBuilder();

        for(char x : n.toCharArray()) {
            if (Character.isDigit(x)) {
                sb.append(words[Character.getNumericValue(x)]);
            } else {
                sb.append(x);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String n = "CZW4RT3K";
        String nn = changer(n);
        System.out.println(nn);
    }
}
