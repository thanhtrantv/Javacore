import java.util.Scanner;

public class BaiTap5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// nhap so a
		System.out.print("Nhap a:");
		double a = scan.nextInt();
		
		// nhap so b
		System.out.print("Nhap b:");
		double b = scan.nextInt();
				
		// nhap so c
		System.out.print("Nhap c:");
		double c = scan.nextInt();
		System.out.println(a+":"+b+":"+c);
		double delta = b*b - 4 * a * c;
		if(delta>0){
			double x1= (-b-Math.sqrt(delta))/2*a;
			double x2= (-b+Math.sqrt(delta))/2*a;
			System.out.println("phuong trinh co 2 nghiem phan biet: x1="+x1 +" x2="+x2);
		}else if(delta==0){
			double x = (-b / 2*a);
			System.out.println("phuong trinh co 1 nghiem x="+x);
		}else{
			System.out.println("phuong trinh vo nghiem!!!");
		}
	}
}
