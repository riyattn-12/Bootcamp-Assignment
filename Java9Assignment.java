//package com.java.demo;
interface StringManipulation
{
    private static String reverseString(String str)
    {
        return new StringBuilder(str).reverse().toString();

    }
    static String toUpperReverse(String str)
    {
        String upperStr= str.toUpperCase();
        return reverseString(upperStr);

    }
    static String toLowerReverse(String str)
    {
        String lowerStr = str.toLowerCase();
        return reverseString(lowerStr);
    }
}
public class Java9Assignment
{
    public static void main(String[] args)
    {
        System.out.println(StringManipulation.toLowerReverse("Hello World"));
        System.out.println(StringManipulation.toUpperReverse("Hello World"));
    }
}