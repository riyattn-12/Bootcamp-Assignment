import javax.swing.plaf.synth.SynthLookAndFeel;

public class ques10
{
    //Demonstrate the use of repeat, strip, isBlank,
    // indent, transform, stripIndent, translateEscapes, formatted String methods.

    public static void main(String[] args)
    {
        String str = " \n\t   Welcome to TO THE NEW     \u2005";
        System.out.println(str.trim().equals("Welcome to TO THE NEW"));
        System.out.println(str.strip().equals("Welcome to TO THE NEW"));

        //isblank
        String str1= "   \n\t";
        System.out.println(str1.isBlank());

        //indent
        String str2 = "Hello everyone, hope  you are doing good!!";
        str2 = str2.indent(20);
        System.out.println(str2);
        str2 = str2.indent(-12);
        System.out.println(str2);

        //transform
        String ans = "riya";
        String returnString= ans.transform(string->new StringBuilder(string))
                .reverse().toString();
        System.out.println(returnString);

        //stripIndent
        String html = "\t<html>\n  " +
                "\t\t<body>\n" +
                "\t\t<p>Hello,world</p>" +
                "<\t\t<body>\n";
        System.out.println(html);
        System.out.println(html.stripIndent());

        //translateEscape
        String text = "\"Hello\\nWorld\" ";
        System.out.println(text);
        System.out.println(text.translateEscapes());

        //formatted String
        String str3 = "\"Hello\\nTTN Family\" ";
        System.out.println(str3);
        System.out.println(str.translateEscapes());


    }
}
