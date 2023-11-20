import java.util.Scanner;
import static java.lang.System.out;

public class uts2{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		out.print("Data Ke-0 : ");
		int data1 = input.nextInt();
		
		out.print("Data Ke-1 : ");
		int data2 = input.nextInt();
		
		out.print("Data Ke-2 : ");
		int data3 = input.nextInt();
		
		out.print("Data Ke-3 : ");
		int data4 = input.nextInt();
		
		out.print("Data Ke-4 : ");
		int data5 = input.nextInt();
		
		out.print("Data Ke-5 : ");
		int data6 = input.nextInt();
		
		out.println("Menampilkan Data ");
		
		
		if (data1 % 2  == 1){
			out.println(data1+"-> Ganjil");
		}else{
			out.println(data1+"-> Genap");
		}
		
		if (data2 % 2  == 1){
			out.println(data2+"-> Ganjil");
		}else{
			out.println(data2+"-> Genap");
		}
		
		if (data3 % 2  == 1){
			out.println(data3+"-> Ganjil");
		}else{
			out.println(data3+"-> Genap");
		}
		
		if (data4 % 2  == 1){
			out.println(data4+"-> Ganjil");
		}else{
			out.println(data4+"-> Genap");
		}
		
		if (data5 % 2  == 1){
			out.println(data5+"-> Ganjil");
		}else{
			out.println(data5+"-> Genap");
		}
		
		if (data6 % 2  == 1){
			out.println(data6+"-> Ganjil");
		}else{
			out.println(data6+"-> Genap");
		}
	}
}