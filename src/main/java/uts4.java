import java.util.Scanner;
import static java.lang.System.out;

public class uts4{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		int item1 = 2500;
		int item2 = 3000;
		int item3 = 4000;
		int item4 = 5000;
		int item5 = 6000;
				
		out.print("item-0 : ");
		int jumlah1 = input.nextInt();
		
		out.print("item-1 : ");
		int jumlah2 = input.nextInt();
		
		out.print("item-2 : ");
		int jumlah3 = input.nextInt();
		
		out.print("item-3 : ");
		int jumlah4 = input.nextInt();
		
		out.print("item-4 : ");
		int jumlah5 = input.nextInt();
		
		int total1 = item1*jumlah1;
		out.println("Harga Barang ke-0 : Rp "+item1+", jumlah : "+jumlah1+", Total : Rp "+total1);
		
		int total2 = item2*jumlah2;
		out.println("Harga Barang ke-1 : Rp "+item2+", jumlah : "+jumlah2+", Total : Rp "+total2);
		
		int total3 = item3*jumlah3;
		out.println("Harga Barang ke-2 : Rp "+item3+", jumlah : "+jumlah3+", Total : Rp "+total3);
		
		int total4 = item4*jumlah4;
		out.println("Harga Barang ke-3 : Rp "+item4+", jumlah : "+jumlah4+", Total : Rp "+total4);
		
		int total5 = item5*jumlah5;
		out.println("Harga Barang ke-4 : Rp "+item5+", jumlah : "+jumlah5+", Total : Rp "+total5);
		
		int totalitem = jumlah1+jumlah2+jumlah3+jumlah4+jumlah5;
		out.println("TOTAL ITEM BELANJA : "+totalitem);
		
		int totalharga = total1+total2+total3+total4+total5;
		out.println("TOTAL HARGA : Rp "+totalharga);
	}
}