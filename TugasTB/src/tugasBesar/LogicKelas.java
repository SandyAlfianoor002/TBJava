package tugasBesar;
import java.util.*;
public class LogicKelas {

	InstanceClass kelas = new InstanceClass();
	
		Scanner input = new Scanner(System.in);
		
		public void identitasruangkelas(){
			System.out.println("-----IDENTITY OF THE CLASS------");
			System.out.println("Silahkan Masukkan Nama Ruang : ");
			kelas.NamaRuang[0] = input.nextLine();
			
			System.out.println("Silahkan Masukkan Lokasi Ruang : ");
			kelas.LokasiRuang[0] = input.nextLine();
			
			System.out.println("1. Fakultas Agama Islam");
			System.out.println("2. Fakultas Peternakan dan Pertanian");
			System.out.println("3. Fakultas Teknik");
			System.out.println("4. Fakultas Ekonomi dan Bisnis");
			System.out.println("Pilih Fakultas anda dengan memasukkan nomor Fakultas : ");
			kelas.ProgramSF = input.nextInt();
			
			System.out.println("Nama Ruang : "+kelas.getNamaRuang());
			System.out.println("Lokasi : "+kelas.getLokasiRuang());
			
			if (kelas.ProgramSF == 1){
				System.out.println("Selamat Datang, Anda dari Fakultas Agama Islam");
			}
			else if(kelas.ProgramSF == 2){
				System.out.println("Selamat Datang, Anda dari Fakultas Peternakan dan Pertanian");
			}
			else if(kelas.ProgramSF == 3){
				System.out.println("Selamat Datang, Anda dari Fakultas Teknik");
			}
			else if(kelas.ProgramSF == 4 ){
				System.out.println("Selamat Datang, Anda dari Fakultas Ekonomi dan Bisnis");
			}
			else{
				System.out.println("Fakultas Anda Tidak Dikenali Sistem");
			}
		}
		
		public void kondisi_ruang_kelas(){
			kelas.inputKondisiRuangKelas();
			if (kelas.getPanjangRuangKelas()!= kelas.luas()){
			System.out.println("Bentuk dari Kelas merupakan Persegi Panjang, Kelas ini Sesuai");
			}
			else{
				System.out.println("Selain persegi panjang, tidak sesuai");
			}
			if (kelas.rasioLuas()>=0.5){
				System.out.println("Rasio Sesuai");
			}
			else{
				System.out.println("Rasio Tidak Sesuai");
			}
			
			if(kelas.getJumlahPintu()>=2){
				System.out.println("Jumlah Pintu Sesuai");
			}
			else{
				System.out.println("Jumlah Pintu tidak Sesuai");
			}
			if(kelas.getJumlahJendela()>=1){
				System.out.println("Jumlah Jendela Sesuai");
			}
			else{
				System.out.println("Jumlah Jendela Tidak Sesuai");
			}
			
		}
		void inputJumlahKondisiPosisiSarana(){
			kelas.jumlahKondisiPosisiSarana();
			
			//STOP KONTAK
			System.out.println("/nAnalisis Stop Kontak");
			if(kelas.getJumlahStopKontak()>=4){
				System.out.println("Jumlah Stop Kontak Sesuai");
			}
			else{
				System.out.println("Jumlah Stop Kontak Tidak Sesuai");
			}
			if(kelas.getKondisiStopKontak().equals("Baik") && kelas.getJumlahStopKontak()==4){
				System.out.println("Kondisi Stop Kontak Sesuai");
			}
			else{
				System.out.println("Kondisi Stop Kontak tidak sesuai");
			}
			if(kelas.getPosisiStopKontak().equals("Dekat Dosen") || kelas.getPosisiStopKontak().equals("Dipojok Ruang")){
				System.out.println("SESUAI");
			}
			else{
				System.out.println("TIDAK SESUAI");
			}
			
			//LCD
			System.out.println("/nAnalisis untuk Kabel LCD");
			if(kelas.getJumlahKabelLCD()>=1){
				System.out.println("SESUAI");
			}
			else{
				System.out.println("TIDAK SESUAI");
			}
			if(kelas.getKondisiKabelLCD().equals("Berfungsi")){
				System.out.println("SESUAI");
			}
			else{
				System.out.println("TIDAK SESUAI");
			}
			if(kelas.getPosisiKabelLCD().equals("Dekat Dosen")){
				System.out.println("SESUAI");
			}
			else{
				System.out.println("TIDAK SESUAI");
			}
			
			
				
			}
		}

