public class App {
    public static void main(String[] args) throws Exception {
        
        String original = "abc ABC HAGAU dec TYZ";

        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();

        System.out.println("Original: " + original);
        System.out.println("S01: " + s01);
        System.out.println("S02" + s02);

    }
}
