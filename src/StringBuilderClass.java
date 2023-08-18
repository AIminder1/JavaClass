public class StringBuilderClass {
    public static void main(String[] args) {

        String name = "James";
        String name2 = new String ("James");

        //
        StringBuilder name3 = new StringBuilder("James");
        System.out.println(name3);

        StringBuilder fruit = new StringBuilder("Apple");

        StringBuilder text =  new StringBuilder("Java is Fun");

        StringBuilder str = new StringBuilder("Hello");

        //append

        str.append("World!");
        str.append(4+4);

        //name.deleteCharAt()

        str.deleteCharAt(0);
        System.out.println(str.deleteCharAt(1));


        //reverse
        StringBuilder name5 = new StringBuilder("Amirkhon");
        name5.reverse();
        System.out.println(name5);

        //insert
        fruit = new StringBuilder("Apple");

        StringBuilder name6 = new StringBuilder("Amirkhon ");
        name6.insert(9, " Ishankulov");
        System.out.println(name6);

        String x = "Apple";
        StringBuilder y = new StringBuilder(x);


        System.out.println(y);

        StringBuilder sb = new StringBuilder("Iphone");
        String iphone = sb.toString();
        System.out.println(iphone);


    }
}
