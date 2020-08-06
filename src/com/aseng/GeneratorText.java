package com.aseng;

public class GeneratorText {
    public static void main(String[] args) {
        String text = "bunda himawari adalah bidadari untuk bapak bapak";
        System.out.println(modeUppercase(textConvert(text)));
        System.out.println(modeNumber(textConvert(text)));
        System.out.println(modeSpecial(textConvert(text)));
    }

    public static String textConvert(String text) {
        String tmpText = text.toLowerCase();
        String[] word = {"bunda", "bapak", "suami"};
        String[] wordReplace = {"boendaa", "bapacckk", "misuua"};

        for (int i = 0; i < word.length; i++) {
            tmpText = tmpText.replace(word[i], wordReplace[i]);
        }

        return tmpText;
    }

    private static String modeUppercase(String text) {
        char[] arrText = text.toLowerCase().toCharArray();

        boolean makeUppercase = true;
        for (int i = 0; i < arrText.length; i++) {
            if (makeUppercase && Character.isLetter(arrText[i])) {
                arrText[i] = Character.toUpperCase(arrText[i]);
                makeUppercase = false;
            } else if (!makeUppercase && Character.isLetter(arrText[i])) {
                makeUppercase = true;
            }
        }

        return String.valueOf(arrText);
    }

    private static String modeNumber(String text) {
        char[] arrText = text.toLowerCase().toCharArray();
        char[] word = {'a','g','i','o','s'};
        char[] wordReplace = {'4','6','1','0','5'};

        for (int i = 0; i < arrText.length; i++) {
            for (int j = 0; j < word.length; j++) {
                if (arrText[i] == word[j]) {
                    arrText[i] = wordReplace[j];
                }
            }
        }

        return String.valueOf(arrText);
    }

    private static String modeSpecial(String text) {
        char[] arrText = text.toLowerCase().toCharArray();
        char[] word = {'a','i','s'};
        char[] wordReplace = {'@','!','$'};

        for (int i = 0; i < arrText.length; i++) {
            for (int j = 0; j < word.length; j++) {
                if (arrText[i] == word[j]) {
                    arrText[i] = wordReplace[j];
                }
            }
        }

        return String.valueOf(arrText);
    }
}
