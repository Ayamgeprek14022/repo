import java.util.Scanner; 
public class Miniproject{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        int resolusi;
        int MiniHD = 2000000;
        int FullHD = 3000000;
        int duak = 5000000;
        int empatk = 7000000;
        int delapank = 9000000;
        int MKV = 2000000;
        int DVD = 3000000;
        int Bluraydisc = 5000000;
        int MOV = 9000000;
        int MP4 = 5000000;
        int dok = 3000000;
        int clip = 6000000;
        int prew = 8000000;
        int wed = 3000000;
        int prod = 7000000;
        int fash= 5000000;
        String nama = "" ;
        String lanjut = "" ;
        String jawab = "";
        int encode;
        int file=0;
        int pixel=0;
        boolean running = true;
        int jumlah;
        int jenis;
        int jens=0;
        int kupon=0;
        int poto;
        int potox=0;
        
        System.out.println("WAK DAENG STUDIO");
        System.out.println("======================================");
        System.out.print("NAMA  : ");
        nama = input.next();
     System.out.println("======================================");
        
        while (running){
            while (running){
          
        System.out.println("1. Video\n2. Photo");
    
       
        
        System.out.println("======================================");
        System.out.print("Masukkan Pilihan Angka = ");
        pilihan = input.nextInt();
        
        
        switch (pilihan){
            
            case 1: System.out.println("ANDA AKAN MEMESAN VIDEO");
                    System.out.println("======================================");
                    System.out.print("1. MiniHD     2 Juta\n2. FullHD      3 Juta\n3. 2k       5 Juta\n");
                    System.out.println("4. 4k       7 Juta\n5. 8k       9 Juta");
                    System.out.println("======================================");
                    System.out.print("MASUKKAN RESOLUSI YANG DIINGINKAN = ");

//resolusi video
                resolusi = input.nextInt();
                if (resolusi == 1){
                    pixel=2000000;
                 System.out.println("Resolusi yang Dipilih = Mini HD seharga"+" " + MiniHD);}
                else if (resolusi == 2){
                    pixel=3000000;
                 System.out.println("Resolusi yang Dipilih = Full HD seharga"+" " + FullHD);}
                else if (resolusi == 3){
                    pixel=5000000;
                 System.out.println("Resolusi yang Dipilih = 2k seharga"+" " + duak);}
                 else if (resolusi == 4){
                     pixel=7000000;
                 System.out.println("Resolusi yang Dipilih = 4k seharga"+" " + empatk);}
                  else if (resolusi == 5){
                      pixel=9000000;
                 System.out.println("Resolusi yang Dipilih = 8k seharga"+" " + delapank);}
                 else{
                 System.out.println("Resolusi yang dipilih tidak ada");}
        System.out.println("======================================");
//tipe file encode 
         System.out.println("Tipe file encode yang diinginkan?");
                    System.out.println("======================================");
                    System.out.print("1. MKV    2 Juta\n2. MP4      3 Juta\n3. DVD       5 Juta\n");
                    System.out.println("4. DVD Bluray       7 Juta\n5. MOV       9 Juta");
                    System.out.println("======================================");
                    System.out.print("MASUKKAN TIPE FILE ENCODE YANG DIINGINKAN = ");
                encode = input.nextInt();

                if (encode == 1){
                    file = 2000000;
                 System.out.println("tipe file encode yang Dipilih = MKV seharga"+" " + MKV);}
                else if (encode == 2){
                    file = 3000000;
                 System.out.println("tipe file encode = MP4 seharga"+" " + MP4);}
                else if (encode == 3){
                    file = 5000000;
                 System.out.println("tipe file encode = DVD seharga"+" " + DVD);}
                 else if (encode == 4){
                     file = 7000000;
                 System.out.println("tipe file encode = Bluray disc seharga"+" " + Bluraydisc);}
                  else if (encode == 5){
                      file = 9000000;
                 System.out.println("tipe file encode = MOV seharga"+" " + MOV);}
                 else{
                 System.out.println("tipe file encode tidak ada");}

//jenis video

 System.out.println("Jenis Video yang diinginkan?");
                    System.out.println("======================================");
                    System.out.print("1. Dokumentasi    3 Juta\n2. Clip      6 Juta\n");
                    System.out.println("======================================");
                    System.out.print("MASUKKAN JENIS VIDEO YANG DIINGINKAN = ");
                jenis = input.nextInt();

                if (jenis == 1){
                    jens = 3000000;
                 System.out.println("jenis video yang Dipilih = Dokumentasi seharga"+" " + dok);}
                else if (jenis == 2){
                    jens = 6000000;
                 System.out.println("jenis video yang Dipilih = Clip seharga"+" " + clip);}
                 else{
                 System.out.println("jenis video tidak ada");}
System.out.println("======================================");
// KALAU DIE ADE KUPON DISKON
System.out.println("Jika anda memiliki kupon silahkan isi");
System.out.println("Jika tidak ada kupon silahkan ketik 0");
System.out.println("======================================");
System.out.println("KODE KUPON");
 kupon = input.nextInt();
 if (kupon ==7767){
     pixel=pixel*10/100;
     encode=encode*15/100;  
 }

 else if(kupon ==232){
     pixel=pixel*10/100; 
 }
 else {
    System.out.println("ciee ndak ade kupon"); 
 }
System.out.println("======================================");
// hitung jumlah semuanya
                jumlah = pixel + file + jens;

                 System.out.println("JUMLAHNYA = "+ jumlah);
System.out.println("======================================");
                    System.out.println("INGIN MEMESAN LAGI? Y/N");
            jawab = input.next();
            if( jawab.equals("Y") ){
                running = true;
                break;
            }
            if( jawab.equals("N") ){
                running = false;
                break;
                }
                

     
     break;

            case 2: System.out.println("ANDA AKAN MEMESAN PHOTO");
                    System.out.println("======================================");
                    System.out.print("1. PREWEDDING     8 Juta\n2. WEDDING      6 Juta\n3. FASHION       5 Juta\n");
                    System.out.println("4. PRODUK       7 Juta");
                    System.out.println("======================================");
                    System.out.print("MASUKKAN JENIS PHOTO YANG DIINGINKAN = ");

//jenis poto
                poto = input.nextInt();
                if (poto == 1){
                    potox=8000000;
                 System.out.println("Jenis photo yang Dipilih = PREWEDDING seharga"+" " + prew);}
                else if (poto == 2){
                    potox=3000000;
                 System.out.println("Jenis photo yang Dipilih = WEDDING seharga"+" " + wed);}
                else if (poto == 3){
                    potox=5000000;
                 System.out.println("Jenis photo yang Dipilih = FASHION seharga"+" " + fash);}
                 else if (poto == 4){
                     potox=7000000;
                 System.out.println("Jenis photo yang Dipilih = PRODUK seharga"+" " + prod);}
                 else{
                 System.out.println("Jenis photo yang Dipilih tidak ada");}
        System.out.println("======================================");

System.out.println("Jika anda memiliki kupon silahkan isi");
System.out.println("Jika tidak ada kupon silahkan ketik 0");
System.out.println("======================================");
System.out.println("KODE KUPON");
 kupon = input.nextInt();
 if (kupon ==882){
     potox=potox*10/100;
     
 }

 else if(kupon ==232){
     potox=potox*5/100; 
 }
 else {
    System.out.println("ciee ndak ade kupon"); 
 }
 System.out.println("======================================");
System.out.println("TOTAL BIAYA PHOTO ADALAH "+ potox);
System.out.println("======================================");
        

        
            System.out.println("INGIN MEMESAN LAGI? Y/N");
            jawab = input.next();
            if( jawab.equals("Y") ){
                running = true;
                break;
            }
            if( jawab.equals("N") ){
                running = false;
                break;
                }
                
               

            break;
            }
        }
        
        }
        
    }
}
    