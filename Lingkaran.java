import java.util.Scanner;
public class Lingkaran
{
	public static void main(String args[]){
	Scanner masuk = new Scanner(System.in);
	int r;
	double phi;
	double keliling;
	double luas;
	phi=3.14;

System.out.println("MASUKKAN JARI JARI LINGKARAN = ");
	  r = masuk.nextInt();
	
            
            System.out.println("K E L I L I N G");
              
				keliling = 2*phi*r;
			System.out.println("HASIL = " + keliling);
			
				
				System.out.println("L U A S");
			
                
				luas = phi*r*r;
			System.out.print("HASIL = " + luas);
			
	
	}
}