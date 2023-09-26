package stringtasks;

public class StringTask1 {
    public static void main(String[] args) {
        String text = "application template transaction";
        String word = "template";
        if (text.indexOf(word) != -1) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        if (text.contains(word)) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
    }
}
