package Task2;

public class StringRemoveConsonant implements StringInterface{
    @Override
    public String DoMagic(String input) {
        return input.replaceAll("[qwrtpsdfghjklzxcvbnmQWRTPSDFGHJKLZXCVBNM]", "");
    }
}
