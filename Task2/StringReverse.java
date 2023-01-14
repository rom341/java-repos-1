package Task2;

public class StringReverse implements StringInterface{
    @Override
    public String DoMagic(String input) {
        String result = "";
        for (int i = input.length() - 1; i >= 0; i--)
        {
            result += input.charAt(i);
        }
        return result;
    }
}
