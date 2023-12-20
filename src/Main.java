
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String name = scanner.nextLine();
            String str = "Hello " + name;
            System.out.println(str);
//        }
//public class main {
//    public main() {
//    }
//
//    public static void main(String[] args) {
//        System.out.println("hellow World!");
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

        System.out.println();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("сложно пока что:)" + (a / b));
        System.out.println();
    }
}