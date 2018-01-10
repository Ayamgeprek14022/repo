import java.util.Scanner;
public class Ulangfor3
{
	public static void main(String args[]){
	Scanner masuk = new Scanner(System.in);
	int i;
	float n, jum, x;
	System.out.println("Banyaknya data: ");
	n = masuk.nextFloat();
	jum=0;
	for (i=1;i <= n;i++) {
		System.out.print("Data ke-"+i+ ":");
		x = masuk.nextFloat();
		jum += x;
	}
	System.out.println("Jumlah :" + jum);
	double rata= jum/n;
	System.out.println("Nilai rerata : "+rata);
	}
}