package stringtasks;

public class firstAndsecondWord {
    public static void main(String[] args) {
        String text = "application hello transaction template";
        int firstSpace = text.indexOf(' ');
        int lastSpace = text.lastIndexOf(' ');
        int mid = lastSpace - firstSpace;
        System.out.println(text.substring(0, firstSpace) + text.substring(firstSpace, mid));

        String words = " ";
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                count++;
                if (count == 2) {
                    words = text.substring(0, i);
                    break;
                }
            }
        }
        System.out.println(words);

    }
}
