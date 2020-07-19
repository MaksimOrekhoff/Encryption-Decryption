package encryptdecrypt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = "we found a treasure!";
        String[] array = message.split(" ");
        String out = "";
        for (int i = 0; i < array.length; i++) {
            char[] s = array[i].toCharArray();
            for (int j = 0; j < s.length; j++) {
                int count = 25;
                if (s[j] < 110) {
                    for (int k = 97; k < 110; k++) {
                        if (s[j] == k) {
                            s[j] = (char) ('a' + count);
                            break;
                        }
                        count--;
                    }
                } else if (s[j] >= 110) {
                    for (int k = 122; k >= 110; k--) {
                        if (s[j] == k) {
                            s[j] = (char) ('z' - count);
                            break;
                        }
                        count--;
                    }
                } else {
                    continue;
                }
                out += s[j];
            }
            out += " ";

        }
        System.out.println(out.trim());
    }
}

