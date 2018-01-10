import java .util.Scanner;
public class Ulangfor5
{
public static void main(String args[])
{
Scanner masuk=new Scanner(System.in);
int bil,a,b;
System.out.print("Masukan Batas awal :");
a=masuk.nextInt();
System.out.print("Masukan Batas akhir :");
b=masuk.nextInt();
for(bil=a;bil<=b;bil++){
if(bil%2!=0)
System.out.println(bil);
}
}
}