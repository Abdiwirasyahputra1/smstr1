import java.util.Scanner;
import static java.lang.System.out;

public class uts3{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		
		int data [] = new int[6];
		
		for(int i = 0;  i < data.length; i++) {
			out.print("data ke " + i + " : " );
			 data[i] = input.nextInt();
		}
		
		out.println("Menampilkan Data ");
		
		
		
		
		
	}
}