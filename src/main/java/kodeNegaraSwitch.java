import java.util.Objects;
import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class kodeNegaraSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        String input,konversi = "";

        out.print("Masukkan kode negara = ");
        input = scanner.nextLine();


        switch (input){
            case "ES" :
                konversi = "SPAIN";
                break;
            case "TN" :
                konversi = "TUNISIA";
                break;
            case "ID" :
                konversi = "INDONESIA";
                break;
            case "MM" :
                konversi = "MYANMAR";
                break;
            case "IN" :
                konversi = "INDIA";
                break;
        }

        if (!Objects.equals(konversi, "")){
            out.println("Kode   = "+input);
            out.println("Negara   = "+konversi);
        }else{
            out.println("Maaf, Kode negara TIDAK DIKETAHUI");
		}
	}

}