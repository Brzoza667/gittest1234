package pl.sdacademy.java.basic.exercises.task1;

public class taks1 {

    public static void main(String[] args) {
//        displayWordUsingDecimalFormat();
//        displayWordUsingHexFormat();
        displayWordUsingBinaryFormat();
    }

        private static void displayWordUsingDecimalFormat () {

        char s = 83;
        char d = 68;
        char a = 65;
            System.out.print(s);
            System.out.print(d);
            System.out.print(a);
        }

        private static void displayWordUsingHexFormat() {

            char s = 0x53 ;
            char d = 0x44;
            char a = 0x41;
            System.out.print(s);
            System.out.print(d);
            System.out.print(a);
        }

        private static void displayWordUsingBinaryFormat() {

            char s = 0b1010011;
            char d = 0b1000100;
            char a = 0b1000001;
            System.out.print(s);
            System.out.print(d);
            System.out.print(a);

        }
    }


