package stringtasks;

public class StringReplace {
    public static void main(String[] args) {
        String text = "template liquid transaction liquid map tax liquid";
        String word = "liquid";
        StringBuilder replacement = new StringBuilder(" ");
        StringBuilder str = new StringBuilder(text);

        for (int i = 0; i < word.length(); i++) {
            replacement.append('*');
        }
        int pos = text.indexOf(word);
        while (pos != -1) {
            str = new StringBuilder(str.substring(0, pos) + replacement + str.substring(pos + word.length()));
            pos = str.indexOf(word, pos + word.length());
        }
        System.out.println(str);

//        int pos = text.indexOf(word);
//        str = new StringBuilder(text.substring(0, pos) + replacement + " " + text.substring(pos + word.length()));
//        int pos2 = str.indexOf(word);
//        str = new StringBuilder(str.substring(0, pos2) + replacement + " " + str.substring(pos2 + word.length()));
//        int pos3 = str.indexOf(word);
//        str = new StringBuilder(str.substring(0, pos3) + replacement + " " + str.substring(pos3 + word.length()));
//        System.out.println(str);

        }
    }
