import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class switchkonversi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        out.print("Masukkan nilai huruf: ");
        char nilaiHuruf = scanner.next().charAt(0);
        double nilaiIndeks;

       switch (nilaiHuruf) {
            case 'A':
                nilaiIndeks = 4.0;
                break;
            case 'B':
                nilaiIndeks = 3.0;
                break;
            case 'C':
                nilaiIndeks = 2.0;
                break;
            case 'D':
                nilaiIndeks = 1.0;
                break;
            case 'E':
                nilaiIndeks = 0;
                break;
            default:
                out.println("Maaf, konversi nilai tidak diketahui");
                return;
        }

        out.println("Nilai indeks: " + nilaiIndeks);
	}
}