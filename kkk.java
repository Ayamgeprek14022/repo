import java.util.Scanner;
public class kkk {
public static void main (String [] args){
Scanner input = new Scanner(System.in);

int hasil;
int pilihan;
float volume, aliran;
int waktu, waktu1;
float hasildebit, volumealiran;
pilihan = input.nextInt();
switch (pilihan){
case 1 : System.out.println("DEBIT ALIRAN");
                    System.out.println("Masukkan nilai Volume aliran");
					volume = input.nextInt();
					System.out.println("Masukkan nilai Waktu Aliran(detik)");
					waktu = input.nextInt();
					hasildebit = volume/waktu;
					System.out.println("Hasil ="+ hasildebit);
break;
case 2 : System.out.println("VOLUME ALIRAN");
                    System.out.println("Masukkan nilai Debit (m3/detik)");
					aliran = input.nextInt();
					System.out.println("Masukkan nilai Waktu Aliran(detik)");
					waktu1 = input.nextInt();
					volumealiran = aliran/waktu1;
					System.out.println("Hasil ="+ volumealiran);
					break;
					
}
}
}