import java.util.Scanner;


class dataMhs{
    int nim;
    int score= 0;
   int jawaban;
  
    String nama, jurusan, fakultas;    
    Scanner input = new Scanner (System.in);
    // method input identitas
    void input(){
        System.out.println("IDENTITAS");
        System.out.println("=============");
        System.out.println("NIM       : ");
        nim = input.nextInt();	
        System.out.println("______________");
        System.out.println("Nama      : ");
        nama = input.next();
        System.out.println("______________");	
        System.out.println("Jurusan   : ");
        jurusan = input.next();	
        System.out.println("______________");
        System.out.println("Fakultas  : ");
		fakultas = input.next();
        System.out.println("______________");
    }
    // method soal dan jawab
     void tampilan (){
	byte tab;
     
		
		System.out.println("================== UJIAN AKHIR SEMESTER ==================");
        System.out.println("1.) SEJARAH.\n2.) PEMROGRAMAN.");
        System.out.println("==========================================================");
		System.out.println("Pilih MATA PELAJARAN ");
		tab = input.nextByte();
		switch (tab) {
		case 1:
			System.out.println("MATA KULIAH SEJARAH");
            System.out.println("Catatan: Jika pilihan anda benar maka poin bertambah 2, jika salah maka poin anda berkurang 1");
			System.out.println("========================================================================="); 
            System.out.println("A.) Peperangan era Napoleon yang terjadi di tahun 1800-an dipicu oleh?");
         	System.out.println("=========================================================================");   
            System.out.println("1. perang saudara diamerika");
            System.out.println("2. revolusi perancis");
            System.out.println("3. turunnya Tsar Nicholas II");
            System.out.println("4. Inggris menginvasi kerajaan Prussia");
            jawaban = input.nextInt();
            if (jawaban == 1){
            score=-10; 
            }
             else if(jawaban == 2){
            score=+20; 
            }
             else if(jawaban == 3){
            score=-10; 
            }
             else if(jawaban == 4){
            score=-10; 
            }
              else
            fokus();
			tampilan();
            
 			System.out.println("B.) Siapakah yang menembak Archduke Franz Ferdinand pada tahun 1914 yang memicu perang dunia 1?");
         	System.out.println("=========================================================================");   
            System.out.println("1. Black Beard");
            System.out.println("2. Shaka Zulu");
            System.out.println("3. Gavrilo Princip");
            System.out.println("4. Van Rommel");
            jawaban = input.nextInt();
            if (jawaban == 1){
            score-=10; 
            }
             else if(jawaban == 2){
            score-=10; 
            }
             else if(jawaban == 3){
            score+=20; 
            }
             else if(jawaban == 4){
            score-=10; 
            }
              else
            fokus();
			tampilan();

            System.out.println("C.) Perang Dunia pertama terjadi pada tahun?");
         	System.out.println("=========================================================================");   
            System.out.println("1. 1799-1814");
            System.out.println("2. 1914-1918");
            System.out.println("3. 1939-1940");
            System.out.println("4. 1956-1960");
            jawaban = input.nextInt();
            if (jawaban == 1){
            score-=10; 
            }
             else if(jawaban == 2){
            score+=20; 
            }
             else if(jawaban == 3){
            score-=10; 
            }
             else if(jawaban == 4){
            score-=10; 
            }
              else
            fokus();
			tampilan();
		
          System.out.println("D.) Dampak Perjanjian Versailles adalah ");
         	System.out.println("=========================================================================");   
            System.out.println("1. Terjadinya Perang dunia 2");
            System.out.println("2. Indonesia Merdeka");
            System.out.println("3. Amerika Serikat Mendominasi dunia");
            System.out.println("4. Jerman dihilangkan dari peta");
            jawaban = input.nextInt();
            if (jawaban == 1){
            score+=20; 
            }
             else if(jawaban == 2){
            score-=10; 
            }
             else if(jawaban == 3){
            score-=10; 
            }
             else if(jawaban == 4){
            score-=10; 
            }
              else
            fokus();
			tampilan();

            System.out.println("E.) Jerman Kalah pada perang dunia 2 karena ?");
         	System.out.println("=========================================================================");   
            System.out.println("1. Polandia melawan");
            System.out.println("2. Inggris menurunkan bom atom ke berlin");
            System.out.println("3. Jepang berkhianat");
            System.out.println("4. Hitler tidak belajar dari sejarah yang terjadi seabad yang lalu yaitu saat napoleon menginvasi rusia dan kalah");
            jawaban = input.nextInt();
            if (jawaban == 1){
            score-=10; 
            }
             else if(jawaban == 2){
            score-=10; 
            }
             else if(jawaban == 3){
            score-=10; 
            }
             else if(jawaban == 4){
            score+=20; 
            }
              else
            fokus();
			tampilan();
		
		break;
		case 2:
            System.out.println("MATA KULIAH PEMROGRAMAN");
            System.out.println("Catatan: Jika pilihan anda benar maka poin bertambah 2, jika salah maka poin anda berkurang 1");
			System.out.println("========================================================================="); 
            System.out.println("A.) Syntax untuk menambahkan database di mysql adalah?");
         	System.out.println("=========================================================================");   
            System.out.println("1. INSERT INTO");
            System.out.println("2. DESC");
            System.out.println("3. SELECT * FROM");
            System.out.println("4. JOIN");
            jawaban = input.nextInt();
            if (jawaban == 1){
            score=+20; 
            }
             else if(jawaban == 2){
            score=-10; 
            }
             else if(jawaban == 3){
            score=-10; 
            }
             else if(jawaban == 4){
            score=-10; 
            }
              else
            fokus();
			tampilan();

            System.out.println("B.) BASIS DATA adalah ");
         	System.out.println("========================================================================?");   
            System.out.println("1. Barisan data yang disimpan");
            System.out.println("2. Data yang tersimpan dibasis basis tertentu");
            System.out.println("3. kumpulan informasi yang disimpan di dalam komputer secara sistematik ");
            System.out.println("4. file file komputer");
            jawaban = input.nextInt();
            if (jawaban == 1){
            score-=10; 
            }
             else if(jawaban == 2){
            score-=10; 
            }
             else if(jawaban == 3){
            score+=20; 
            }
             else if(jawaban == 4){
            score-=10; 
            }
              else
            fokus();
			tampilan();

      System.out.println("C.) Kepanjangan HTML adalah");
         	System.out.println("=========================================================================");   
            System.out.println("1. Himpunanteks Man Language");
            System.out.println("2. Hasilteks Masif Language");
            System.out.println("3. Hasilteks language");
            System.out.println("4. Hypertext Markup Language");
            jawaban = input.nextInt();
            if (jawaban == 1){
            score-=10; 
            }
             else if(jawaban == 2){
            score-=10; 
            }
             else if(jawaban == 3){
            score-=10; 
            }
             else if(jawaban == 4){
            score+=20; 
            }
              else
            fokus();
			tampilan();
            
      System.out.println("D.) Yang bukan merupakan bahasa programming adalah");
         	System.out.println("=========================================================================");   
            System.out.println("1. C++");
            System.out.println("2. Borland Delphi");
            System.out.println("3. CSS");
            System.out.println("4. Batak");
            jawaban = input.nextInt();
            if (jawaban == 1){
            score-=10; 
            }
             else if(jawaban == 2){
            score-=10; 
            }
             else if(jawaban == 3){
            score-=10; 
            }
             else if(jawaban == 4){
            score+=20; 
            }
              else
            fokus();
			tampilan();
            System.out.println("E.) Integer adalah");
         	System.out.println("=========================================================================");   
            System.out.println("1. TIpe data numerik");
            System.out.println("2. Bukan Tipe data");
            System.out.println("3. Method");
            System.out.println("4. Class");
            jawaban = input.nextInt();
            if (jawaban == 1){
            score+=20; 
            }
             else if(jawaban == 2){
            score-=10; 
            }
             else if(jawaban == 3){
            score-=10; 
            }
             else if(jawaban == 4){
            score-=10; 
            }
           else
            fokus();
			tampilan(); 
	

			break;
		default:
		{
			fokus();
			tampilan();
		}
	}
	}
    void fokus ()
	{
		System.out.println("\n======= !!! INPUTNYA SALAH FOKUS DONG! FOKUS! mohon ulangi lagi !!! ======= \n");
	}
    // Method output
    void output(){
System.out.println("=========================================================================");   
        System.out.println("NIM       : "+nim);
        System.out.println("Nama      : "+nama);
        System.out.println("Jurusan   : "+jurusan);
        System.out.println("Fakultas  : "+fakultas);
        System.out.println("Nilai  : "+score);
    }
}
public class daspro {
    public static void main(String[] args) {
            
        //membuat objek baru
        dataMhs benda1 = new dataMhs();
        
        // mengakses dan menjalankan method input
        benda1.input();
          benda1.tampilan();
        
        // mengakses dan menjalankan method output
        benda1.output();
           
            }
             }
    