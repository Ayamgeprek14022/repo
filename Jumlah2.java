import java.util.Scanner;
public class Jumlah2
{
	public static void main(String args[]){
	Scanner masuk = new Scanner(System.in);
	int bil1,bil2,jumlah,kurang,bagi,sisa,kali;
	System.out.print("Bilangan 1: ");
	bil1 = masuk.nextInt();
	System.out.print("Bilangan 2: ");
	bil2 = masuk.nextInt();
	jumlah = bil1 + bil2;
	kurang = bil1 - bil2;
	kali = bil1 * bil2;
	bagi = bil1 / bil2;
	sisa = bil1 % bil2;
	System.out.println("Jumlah = " + jumlah);
	System.out.println("Jumlah = " + kurang);
	System.out.println("Jumlah = " + kali);
	System.out.println("Jumlah = " + bagi);
	System.out.println("Jumlah = " + sisa);
	}
}