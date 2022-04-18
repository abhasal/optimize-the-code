package main.java.examples;
//Reverse the string
public class Example1 {
    public String ReverseString (String inputString)
    {
        String outputString = "";
       for(int i=1; i<= inputString.length();i++)
        {
            char c = inputString.toCharArray()[inputString.length()-i];
            outputString = outputString + c;
        }
        return outputString;
    }
}
