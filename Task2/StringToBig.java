package Task2;

public class StringToBig implements StringInterface {

    @Override
    public String DoMagic(String input) {
        return input.toUpperCase();
    }
}
