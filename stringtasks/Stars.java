package stringtasks;

public class Stars {
    public static void main(String[] args) {
        String text = "application hello transaction hello translate";
        String word = "hello";
        System.out.println(text.replace(word, "*".repeat(word.length())));
    }
}
