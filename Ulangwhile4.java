import java.util.Scanner;
public class Ulangwhile4
{
	public static void main(String args[]){
	Scanner masuk = new Scanner(System.in);
int data;
int kecik = 0;
int besak = 0;
int bukanx = 1;
int p =0;
int bukandata;
System.out.print("Banyaknya Data :");
	data = masuk.nextInt();
while (bukanx<=data){
	p++;
	bukanx++;
	System.out.print("Data ke-"+p+ ":");
	bukandata = masuk.nextInt();
	if (p==1) {
		kecik =bukandata;
		besak =bukandata;
	} else if (kecik>bukandata) {
		kecik = bukandata;
	} else if (besak<bukandata) {
		besak = bukandata;
	}
}
	System.out.println("terkecil : " + kecik);
	System.out.println("terbesar : " + besak);
	
	}
}