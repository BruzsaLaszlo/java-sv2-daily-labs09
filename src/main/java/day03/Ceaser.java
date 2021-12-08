package day03;

public class Ceaser extends Encryption {

    private int offset;

    public Ceaser(int offset) {
        this.offset = offset;
    }

    @Override
    public String enrypts(String text) {
        char[] result = new char[text.length()];
        char[] textChar = text.toCharArray();

        for (int i = 0; i < textChar.length; i++)
            if (Character.isLetter(textChar[i])) {
                textChar[i] = Character.toLowerCase(textChar[i]);
                result[i] = (char) (((textChar[i] - 'a' + offset) % 26) + 'a');
            } else {
                result[i] = textChar[i];
            }

        return String.valueOf(result);
    }

}
