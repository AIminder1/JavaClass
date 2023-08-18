import java.util.Scanner;

public class LessonString {
    public static void main(String[] args) {
        String text = "Java is fun!";
        Scanner sc = new Scanner(System.in);


        /*
        //length
        int total = text.length();

        System.out.println(total);

        System.out.print("Enter your answer:  ");
        text = sc.nextLine();
        total = text.length();
        System.out.println(total);

        //charAt()
        text = "Java is Fun to Learn";
        char ch = text.charAt(0);
        System.out.println(ch);
        System.out.println(text.charAt(text.length() - 6));

        //Equals()
        String str1 = "JAVA";
        String str2 = "java";
        boolean strResults = str1.equals(str2);
        System.out.println(strResults);

        System.out.println(str1.isEmpty());
        str1 = "";
        System.out.println(str1.isEmpty());
        System.out.println(text.contains("0"));

        System.out.println("Enter to convert text to lower case");
        String str3;
        str3 = sc.next();

        System.out.println(str3.toLowerCase());

        System.out.println("Enter text: ");
        String str4;
        str4 = sc.next();

        System.out.println(str4.charAt(0));

        System.out.println("Enter text: ");
        String str5;
        str5 = sc.next();
        System.out.println(str5.charAt(0));
        System.out.println(str5.charAt(str5.length() - 1));

        System.out.println("Enter a text: ");
        String str6 = sc.nextLine();
        System.out.println(str3.charAt(0) + ":" + str3.charAt(str3.length() - 1));


        //toUpperCase()
        text = "java is fun";
        System.out.println(text);
        System.out.println(text.toUpperCase());

        //indexOf()

        int index = text.indexOf("a");
        System.out.println();

        text = "Apple";
        System.out.println(text.indexOf("p")); //1
        System.out.println(text.lastIndexOf("pp"));//2

        //replace()
        text = "Apple";
        System.out.println(text.replace("A", "I")); // Ipple
        System.out.println(text.replace("Apple", "2282"));

        text = "Java is fun to learn";
        System.out.println(text.replace("fun", "really fun"));

        System.out.println("Enter text: ");
        text = sc.nextLine();
        char first = text.charAt(0);
        char last = text.charAt(text.length() - 1);

        String sum = text.replace(first, 'A').replace(last, 'Z');

        System.out.println(sum);

        System.out.println("Enter text: ");
        text = sc.nextLine();
        char first1 = text.charAt(0);
        char last1 = text.charAt(text.length() - 1);

        */
        //Substring
        String s2 = "Javaaaa";
        System.out.println(s2.substring(2, 5));

    }
}
