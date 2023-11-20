import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class konversi{
	public static void main(String[]args){
		Scanner abdi = new Scanner (in);
		
		double a = 4.0;
		double b = 3.0;
		double c = 2.0;
		double d = 1.0;
		
		out.println("Masukkan Huruf = ");
		char huruf = abdi.next().charAt(0);
		
		 if (huruf == 'A' || huruf == 'a') {
            out.println("Hasil Konversi dari A adalah = "+a);
        } else if (huruf == 'B' || huruf == 'b') {
            out.println("Hasil Konversi dari B adalah = "+b);
        } else if (huruf == 'C' || huruf == 'c') {
            out.println("Hasil Konversi dari C adalah = "+c);
        } else if (huruf == 'D' || huruf == 'd') {
            out.println("Hasil Konversi dari D adalah = "+d);
        } else {
            out.println( "Maaf, konversi nilai tidak diketahui.");
            return;
        }
	}
}