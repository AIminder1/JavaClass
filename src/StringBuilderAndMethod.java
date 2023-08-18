public class StringBuilderAndMethod {
    public static void main(String[] args) {
        String text = "Hello World!";
        int length = text.length();
        System.out.println("Length: " + length);

        String text1 = "Hello";
        char ch = text1.charAt(1);
        System.out.println(ch);

        String sub = "Java is fun ".substring(5, 8);
        System.out.println(sub);
        StringBuilder sb = new StringBuilder();
        sb.append("Java ");
        sb.append(" is ");
        sb.append("Fun");
        String result = sb.toString();
        System.out.println(result);


    }

}
