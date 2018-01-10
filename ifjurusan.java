import java.util.Scanner;
public class ifjurusan
{
	public static void main(String args[]){
	Scanner masuk = new Scanner(System.in);
	int pil;
	System.out.print("Masukkan pilihan  : ");
	pil = masuk.nextInt();
	if (pil==1)
		System.out.println("Jurusan SISKOM ");
	else if (pil==2)
	System.out.println("Jurusan SISFO ");
	else if (pil==3)
	System.out.println("Jurusan KIMIA ");
	else if (pil==4)
	System.out.println("Jurusan Fisika");
	else if (pil==5)
	System.out.println("Jurusan Biologi");
	else
	System.out.println("PILIHAN SALAH");
	}
}