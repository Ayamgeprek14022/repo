import java.util.Scanner;
public class UlangDo3
{
	public static void main(String args[]){
	Scanner masuk = new Scanner(System.in);
int bil,data;
double databrp;
double jumlah=0;
System.out.print("Banyaknya Data :");
	data = masuk.nextInt();
bil=1;
databrp=0;
	do{
	
	databrp++;
	System.out.print("Data ke-"+bil+ ":");
	databrp = masuk.nextInt();
	jumlah += databrp;
	bil++;

	}while (bil<=data);
	System.out.println("Hasil jumlah data :" + jumlah);
	double rata= jumlah/data;
	System.out.println("Nilai rerata : "+rata);
	}
}