import java.util.Scanner;
public class ifduapilihan
{
	public static void main(String args[]){
	Scanner masuk = new Scanner(System.in);
	int bil;
	System.out.print("Masukkan bilangan : ");
	bil=masuk.nextInt();
	if (bil==0)
	System.out.println("Bilangan Nol");
	else
	System.out.println("Bilangan Bukan Nol");
}
}