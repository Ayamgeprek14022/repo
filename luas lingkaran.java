import java.util.Scanner;
public class Lingkaran
{
	public static void main(String args[]){
	Scanner masuk = new Scanner(System.in);
	int r,a,pilihan;
	double phi;
	double keliling;
	double luas;
	phi=3.14;

System.out.println("L U A S");
			System.out.print("MASUKKAN JARI JARI LINGKARAN = ");
                r = masuk.nextInt();
				luas = phi*r*r;
			System.out.print("HASIL = " + luas);
			}
			}