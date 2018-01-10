import java.util.Scanner;
public class akar
{
	public static void main(String args[]){
	Scanner masuk = new Scanner(System.in);
	int A,B,C,D;
	System.out.print("Bilangan a: ");
	A = masuk.nextInt();
	System.out.print("Bilangan b: ");
	B = masuk.nextInt();
	System.out.print("Bilangan c: ");
	C = masuk.nextInt();
	D= B*B-(4*A*C);
	if (D==0)
		System.out.println("AKAR KEMBAR");
	else if (D>0)
	System.out.println("AKAR BEDA ");
	else if (D<0)
	System.out.println("AKAR IMAJINER ");
	}
}