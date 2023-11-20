import java.util.Scanner;

public class uts1{
	public static void main (String[]args){
			Scanner input = new Scanner(System.in);
			
			System.out.println("Masukkan Jumlah Modal : ");
			double modal = input.nextDouble();
			
			System.out.println("Masukkan Persentase Keuntungan (%)");
			double persen = input.nextDouble();
			
			double jual = modal +(modal*persen/100);
			System.out.println("Harga Jual : "+jual);	
			
			double profit = jual - modal;
			System.out.println("Profit : "+profit);
	}
}