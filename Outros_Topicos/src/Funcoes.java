import java.util.Scanner;

public class Funcoes {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Type a three numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int hight = max(x, y, z);

        showResult(hight);

        sc.close();
    }

    public static int max(int a, int b, int c) {
        int aux;

        if (a > b && a > c) {
            aux = a;
        }
        else if (b > a && b > c) {
            aux = b;
        }
        else {
            aux = c;
        }
        return aux;
    }

    public static void showResult(int qualquerNome) {
        System.out.println("higher = " + qualquerNome);
    }
}