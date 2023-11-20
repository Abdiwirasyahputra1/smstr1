import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class kodeNegara{
	public static void main(String[]args){
		Scanner input = new Scanner (in);
		
		String ES = "Spain";
		String TN = "Tunisia";
		String ID = "Indonesia";
		String MM = "Myanmar";
		String IN = "India";
		
		out.println("Masukkan Kode Negara (ES,TN,ID,MM,IN )");
		String kode = input.nextLine();
		
		
		if(kode.equals("ES")){
			out.println("ES = "+ES);
		}else if(kode.equals("TN")){
			out.println("TN = "+TN);
		}else if(kode.equals("ID")){
			out.println("ID = "+ID);
		}else if(kode.equals("MM")){
			out.println("MM = "+MM);
		}else if(kode.equals("IN")){
			out.println("IN = "+IN);
		}else{
			out.println( "Maaf, kode negara TIDAK DIKETAHUI");
		}
		
		
	}
}