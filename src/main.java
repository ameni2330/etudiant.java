import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        Etudiant e1 = new Etudiant(1, 30, "Ahmed");
        Etudiant e2 = new Etudiant(2, 22, "Mohammed");
        Etudiant e3 = new Etudiant(3, 40, "Hamdène");
        Etudiant e4 = new Etudiant(4, 16, "Imed");
        Etudiant e5 = new Etudiant(5, 12, "Islem");
        List<Etudiant> e = new ArrayList<Etudiant>();

        e.add(e1);
        e.add(e2);
        e.add(e3);
        e.add(e4);
        e.add(e5);
    }
}
