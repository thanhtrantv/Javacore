import java.util.Scanner;

public class BaiTap1 {
	public static void main(String [] arg){
		Scanner scan= new Scanner(System.in);	
		System.out.print("Vui long nhap ten cua ban:");
		//For string
		String text= scan.nextLine();	
		System.out.println("Welcome "+text);
	}
}
