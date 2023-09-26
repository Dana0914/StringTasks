package stringtasks;

public class StringOccurence {
    public static void main(String[] args) {
        String text = "application hello translate hello";
        String word = "hello";
        int count = 0;
        for (int i = text.indexOf(word); i != -1; i = text.indexOf(word, i + word.length())) {
            count++;
        }
        System.out.println(count);

        int counter = 0;
        int i = text.indexOf(word);
        while (i != -1) {
            i = text.indexOf(word, i + word.length());
            counter++;
        }
        System.out.println(counter);
    }
}
