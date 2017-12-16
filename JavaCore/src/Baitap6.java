import java.util.Scanner;

public class Baitap6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean rs=false;
		do{
			// nhap so a
			System.out.print("Nhap a:");
			double nhapa = scan.nextInt();
	
			// nhap so b
			System.out.print("Nhap b:");
			double nhapb = scan.nextInt();
	
			// nhap so c
			System.out.print("Nhap c:");
			double nhapc = scan.nextInt();
			System.out.println(nhapa + ":" + nhapb + ":" + nhapc);
	
			TamGiac tamgiac = new TamGiac();
			tamgiac.a = nhapa;
			tamgiac.b = nhapb;
			tamgiac.c = nhapc;
			rs=tamgiac.kiemtraTamgiac();
			if(tamgiac.kiemtraTamgiac()){
				System.out.println("Chu vi tam giac la:"+tamgiac.chuviTamgiac());
			}
		}while(rs==false);
	}
}

class TamGiac {
	double a;
	double b;
	double c;

	public boolean kiemtraTamgiac() {
		boolean ketqua = true;
		if (a + b <= c 
		 || a + c <= b 
		 || c + b <= a)
			ketqua = false;
		return ketqua;
	}
	public double chuviTamgiac(){
		return a+b+c;
	}
}
