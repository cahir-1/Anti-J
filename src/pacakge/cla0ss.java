package pacakge;
import java.util.Scanner;

public class cla0ss{

    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert letter needing removal");
        String v = scanner.nextLine();
        System.out.println("insert other letter needing removal");
        String b = scanner.nextLine();
        System.out.println("insert string to be cleansed");
        String s = scanner.nextLine();
        System.out.println("here she is...");
        System.out.println(s.replaceAll(v,"").replaceAll(b,""));
    }
}