import java.util.Scanner;

public class Student {
    int varsta;
    String nume;
    Scanner scanner = new Scanner(System.in);
    public void adaugare() {

        System.out.println("Introduceti numele: ");
        String nume = scanner.next();

        System.out.println("Introduceti varsta: ");
        int varsta = scanner.nextInt();

        this.nume=nume;
        this.varsta=varsta;
    }
    public void afisare() {
        System.out.println("Introduceti numele: ");
    }
    public static void main(String[] args) {
        Student student= new Student();
        student.adaugare();
    }
}
