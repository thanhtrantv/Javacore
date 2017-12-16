import java.util.Scanner;

public class BaiTap4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// nhap so n
		System.out.print("Nhap n:");
		int n = scan.nextInt();
		int temp = n, sum=0;
		while(temp>0){
			sum=sum + temp%10;
			temp=temp/10;
		}
		System.out.println("Tong cac chu so cua "+n+" la: "+sum);
	}
}
