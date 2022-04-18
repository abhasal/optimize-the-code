package main.java.examples;

public class Example1Opt1 {
    public String ReverseString (String inputString)
    {
        StringBuilder outputString = new StringBuilder();
        int length = inputString.length();
        for(int i=1; i<= length;i++)
        {
            char c = inputString.toCharArray()[inputString.length()-i];
            outputString.append(c);
        }
        return outputString.toString();
    }
}
