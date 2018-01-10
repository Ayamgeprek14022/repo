import java.util.Scanner;
public class Ulangwhile3
{
	public static void main(String args[]){
	Scanner masuk = new Scanner(System.in);
int bil,bilz;
double databrp;
double jumlah=0;
System.out.print("Banyaknya Data :");
	bilz = masuk.nextInt();
bil=1;
databrp=0;
while (bil<=bilz){
	
	databrp++;
	System.out.print("Data ke-"+bil+ ":");
	databrp = masuk.nextInt();
	jumlah += databrp;
	bil++;
	}
	System.out.println("Hasil jumlah data :" + jumlah);
	double rata= jumlah/bilz;
	System.out.println("Nilai rerata : "+rata);
	}
}