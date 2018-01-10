import java.util.Scanner;
public class CaseJurusan
{
	public static void main(String args[]){
	Scanner masuk = new Scanner(System.in);
	int pil;
	System.out.print("Masukkan Pilihan = ");
	pil = masuk.nextInt();
	switch (pil) {
		case 1 :System.out.println("Jurusan Siskom");
			break;
		case 2 :System.out.println("Jurusan Sisfo");
			break;
		case 3 :System.out.println("Jurusan Kimia");
			break;
		case 4 :System.out.println("Jurusan Fisika");
			break;
		case 5 :System.out.println("Jurusan Biologi");
			break;
		default:System.out.println("Pilihan Salah");
			break;
	}
			
	}
}