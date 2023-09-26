package stringtasks;

public class StringTask2 {
    public static void main(String[] args) {
        //Вывести первое и последнее слово из строки text
        //Слова в строке text должны быть разделены одним пробелом
        // Реализация через for и charAt
        String text = "application hello transaction template";
        int firstSpace = text.indexOf(' ');
        int lastSpace = text.lastIndexOf(' ');
        System.out.println(text.substring(0, firstSpace) + text.substring(lastSpace));

        String firstWord = null;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                firstWord = text.substring(0, i);
                break;
            }
        }
        String lastWord = null;
        for (int i = text.length()-1; i > 0; i--) {
            if (text.charAt(i) == ' ') {
                lastWord = text.substring(i + 1);
                break;
            }
        }
        System.out.println(firstWord + " " + lastWord);

    }
}
