package com.aseng;

public class GeneratorText {
    public static void main(String[] args) {
        String text = "Aldi Wahyu Saragih";
        modeUppercase(text);
    }

    private static void modeUppercase(String text) {
        text = text.toLowerCase();
        String[] splitText = text.split(" ");
        String[] splitWord;

        for (int i = 0; i < splitText.length; i++) {
            splitWord = splitText[i].split("(?!^)");

            for (int j = 0; j < splitWord.length ; j++) {
                int check = oddEven(splitText[i].charAt(j));

                if (check == 2) {
                    splitText[i] = splitText[i].toUpperCase();
                }
            }

            System.out.println(splitText[i]);
        }
    }

    private static void modeNumber(String text) {
        text = text.toLowerCase();
        String[] word = {"a","g","i","o","s"};
        String[] wordReplace = {"4", "6", "1", "0", "5"};

        String[] splitText = text.split(" ");

        for (int i = 0; i < splitText.length ; i++) {

            for (int j = 0; j < word.length ; j++) {
                splitText[i] = splitText[i].replace(word[j], wordReplace[j]);
            }

            System.out.print(splitText[i] + " ");
        }
    }

    private static void modeSpecial(String text) {
        text = text.toLowerCase();
        String[] word = {"a", "i", "s"};
        String[] wordReplace = {"@", "!", "$"};

        String[] splitText = text.split(" ");

        for (int i = 0; i < splitText.length ; i++) {

            for (int j = 0; j < word.length ; j++) {
                splitText[i] = splitText[i].replace(word[j], wordReplace[j]);
            }

            System.out.print(splitText[i] + " ");
        }
    }

    private static int oddEven(int num) {
        if(num % 2 == 0)
            return 2;
        else
           return 1;
    }
}
