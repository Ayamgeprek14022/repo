import java.util.Scanner; 

public class Switch
{
public static void main(String args[])
    {
Scanner input= new Scanner(System.in);
int a;
System.out.print("Masukkan angka =");
a=input.nextInt();
String NamaBulan;

switch(a){
case 1: NamaBulan = ("Bulan Januari ");
break;
case 2: NamaBulan = ("Bulan Februari");
break;
case 3: NamaBulan =("Bulan Maret");
break;
case 4: NamaBulan=("April");
break;
case 5: NamaBulan=("Mei");
break;
case 6: NamaBulan=("Juni");
break;
case 7: NamaBulan=("Juli");
break;
case 8: NamaBulan=("Agustus");
break;
case 9: NamaBulan=("September");
break;
case 10: NamaBulan=("Oktober");
break;
case 11: NamaBulan=("November");
break;
case 12: NamaBulan=("Desember");
break;
default:
NamaBulan =("BULAN DAN MUSIM YANG ANDA MASUKKAN TIDAK TERDAFTAR");}

if (a == 1 | a == 2| a == 12) = "Musim Dingin";
    }
}