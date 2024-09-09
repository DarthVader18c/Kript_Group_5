
public class Main {
    public static void main(String[] args) {
        //2 Задание
        String inputText = "GroupFive";
        byte inputMas[] = inputText.getBytes();
        char outputMas[] = new char[inputMas.length];
        int key = 2;
        for (int j = 0; j < inputMas.length; j++) {
            char c = (char) inputMas[j];
            char first = 0;
            if (c >= 'a' && c <= 'z')
                first = 'a';
            else if (c >= 'A' && c <= 'Z')
                first = 'A';
            if (first != 0)
                c = (char) (first + (c - first + key + 26) % 26);
            outputMas[j] = c;
        }
        String outputText = new String(outputMas);
        System.out.println(outputText);
        //3 задание
    }

}