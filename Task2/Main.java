package Task2;

public class Main {
    public static void main(String[] args)
    {
        String text = "Hello, world!";
        StringInterface[] interfaces = {new StringToBig(), new StringToLow(), new StringReverse(), new StringRemoveVowels(), new StringRemoveConsonant()};
        for(StringInterface stringInterface:interfaces)
        {
            System.out.println(stringInterface.DoMagic(text));
        }
    }
}