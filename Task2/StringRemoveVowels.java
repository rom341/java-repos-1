package Task2;

public class StringRemoveVowels implements StringInterface{
    @Override
    public String DoMagic(String input) {
        return  input.replaceAll("[eyuioaEYUIOA]", "");
    }
}
