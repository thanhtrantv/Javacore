import java.util.Scanner;

public class BaiTap3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// nhap so n
		System.out.print("Nhap n:");
		int n = scan.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println("Tong tu 1 den "+n+" la:"+sum);

	}
}
