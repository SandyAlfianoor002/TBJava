package tugasBesar;
import java.util.*;
public class InstanceClass {

	Scanner input = new Scanner(System.in);
	
	//IdentitasRuangKelas
		String[] NamaRuang = new String[1];
		String[] LokasiRuang = new String[1];
		 int ProgramSF;
		
	//KondisiRuangKelas
		private int PanjangRuangKelas;
		private int LebarRuang;
		private int JumlahKursi;
		private int JumlahPintu;
		private int JumlahJendela;
		
	/////////////////////////////////////////////////////////////////////////////////
		
		public void inputKondisiRuangKelas(){
			System.out.println("Masukkan Panjang Kelas : ");
			PanjangRuangKelas = input.nextInt();
			System.out.println("Masukkan Lebar Kelas : ");
			LebarRuang = input.nextInt();
			System.out.println("Masukkan Jumlah Kursi : ");
			JumlahKursi = input.nextInt();
			System.out.println("Masukkan Jumlah Pintu : ");
			JumlahPintu = input.nextInt();
			System.out.println("Masukkan Jumlah Jendela : ");
			JumlahJendela = input.nextInt();
			System.out.println("luas kelas : "+luas());
			System.out.println("rasio luas kelas : "+rasioLuas());	
		}
		
	//############################################################################
		
	//JumlahKondisidanPosisiSarana 
		private int JumlahStopKontak;
		private String KondisiStopKontak;
		private String PosisiStopKontak;
		private int JumlahKabelLCD;
		private String KondisiKabelLCD;
		private String PosisiKabelLCD;
		private int JumlahLampu;
		private String KondisiLampu;
		private String PosisiLampu;
		private int JumlahKipasAngin;
		private String KondisiKipasAngin;
		private String PosisiKipasAngin;
		private int JumlahAC;
		private String KondisiAC;
		private String PosisiAC;
		
		private String SSID;
		private String Bandwith;
		
		private int JumlahCCTV;
		private String KondisiCCTV;
		private String PosisiCCTV;
		
	///////////////////////////////////////////////////////////////////////////
		
	public void jumlahKondisiPosisiSarana(){
	//Stop kontak
	System.out.println("Masukkan Jumlah Stop Kontak : ");
	JumlahStopKontak = input.nextInt();
	System.out.println("Kondisi Stop Kontak : ");
	KondisiStopKontak = input.next();
	System.out.println("posisi Stop kontak : ");
	PosisiStopKontak = input.next();

	//Kabel LCD
	System.out.println("masukkan Jumlah Kabel LCD : ");
	JumlahKabelLCD = input.nextInt();
	System.out.println("kondisi Kabel LCD : ");
	KondisiKabelLCD = input.next();
	System.out.println("posisi Kabel LCD : ");
	PosisiKabelLCD = input.next();

	//Lampu
	System.out.println("masukkan Jumlah Lampu : ");
	JumlahLampu = input.nextInt();
	System.out.println("kondisi Lampu : ");
	KondisiLampu = input.next();
	System.out.println("posisi Lampu : ");
	PosisiLampu = input.next();

	//Kipas Angin 
	System.out.println("masukkan Jumlah Kipas Angin : ");
	JumlahKipasAngin = input.nextInt();
	System.out.println("kondisi Kipas Angin : ");
	KondisiKipasAngin = input.next();
	System.out.println("posisi Kipas Angin : ");
	PosisiKipasAngin = input.next();

	//AC
	System.out.println("masukkan Jumlah AC : ");
	JumlahAC = input.nextInt();
	System.out.println("kondisi AC : ");
	KondisiAC = input.next();
	System.out.println("posisi AC : ");
	PosisiAC = input.next();

	//CCTV
	System.out.println("masukkan Jumlah CCTV: ");
	JumlahCCTV = input.nextInt();
	System.out.println("kondisi CCTV : ");
	KondisiCCTV = input.next();
	System.out.println("posisis CCTV : ");
	PosisiCCTV = input.next();

	}

	//###########################################################################
		
	//LingkunganRuangKelas
		private String KondisiLantai;
		private String KondisiDinding;
		private String KondisiAtap;
		private String KondisiPintu;
		private String KondisiJendela;
		
	///////////////////////////////////////////////////////////////////////////
		
		void inputLingkunganRuangKelas(){
			System.out.println("Masukkan KondisiLantai : ");
			KondisiLantai= input.nextLine();
			System.out.println("Masukkan Kondisi Dinding : ");
			KondisiDinding = input.nextLine();
			System.out.println("Masukkan Kondisi Atap : ");
			KondisiAtap = input.nextLine();
			System.out.println("Masukkan Kondisi Pintu : ");
			KondisiPintu = input.nextLine();
			System.out.println("Masukkan Jumlah Jendela : ");
			KondisiJendela = input.nextLine();
		
		}
		
	//###########################################################################
		
	//KebersihanRuangKelas
		private String SirkulasiUdara;
		private String NilaiPencahayaan;
		private String Kelembapan;
		private String Suhu;
		private String Kebisingan;
		private String Bau;
		private String Kebocoran;
		private String Kerusakan;
		private String Keausan;
		
	///////////////////////////////////////////////////////////////////////////
		
		void inputKebersihanRuangKelas(){
			System.out.println("Masukkan Sirkulasi Udara : ");
			SirkulasiUdara= input.nextLine();
			System.out.println("Masukkan Nilai Pecahan : ");
			NilaiPencahayaan= input.nextLine();
			System.out.println("Masukkan Kelembapan : ");
			Kelembapan= input.nextLine();
			System.out.println("Masukkan Suhu : ");
			Suhu= input.nextLine();
			System.out.println("Masukkan Kebisingan : ");
			Kebisingan= input.nextLine();
			System.out.println("Masukkan Bau : ");
			Bau= input.nextLine();
			System.out.println("Masukkan Kebocoran : ");
			Kebocoran= input.nextLine();
			System.out.println("Masukkan Kerusakan : ");
			Kerusakan = input.nextLine();
			System.out.println("Masukkan Keausan : ");
			Keausan = input.nextLine();
			
		}
		
	//###########################################################################
		
	//KeamananRuangKelas
		private String Kekokohan;
		private String KunciDanJendela;
		private String Bahaya;

	///////////////////////////////////////////////////////////////////////////
		
		void inputKeamananRuangKelas(){
		System.out.println("Masukkan Kekokohan : ");
		Kekokohan = input.nextLine();
		System.out.println("Masukkan Kunci Dan Jendela : ");
		KunciDanJendela = input.nextLine();
		System.out.println("Masukkan Bahaya : ");
		Bahaya = input.nextLine();
		}
		
	//###########################################################################
		
		
		
		
	//==========================================================
	//IdentitasRuangKelas			
		
		public String[] getNamaRuang() {
			return NamaRuang;
		}
		public void setNamaRuang(String[] namaRuang) {
			NamaRuang = namaRuang;
		}
	//==========================================================
		public String[] getLokasiRuang() {
			return LokasiRuang;
		}
		public void setLokasiRuang(String[] lokasiRuang) {
			LokasiRuang = lokasiRuang;
		}
	//==========================================================
		public int getProgramSF() {
			return ProgramSF;
		}
		public void setProgramSF(int programSF) {
			ProgramSF = programSF;
		}
		
	//==========================================================
	//KondisiRuangKelas
		public int getPanjangRuangKelas() {
			return PanjangRuangKelas;
		}
		public void setPanjangRuangKelas(int panjangRuangKelas) {
			PanjangRuangKelas = panjangRuangKelas;
		}
		public int getLebarRuang() {
			return LebarRuang;
		}
		public void setLebarRuang(int lebarRuang) {
			LebarRuang = lebarRuang;
		}
		public int getJumlahKursi() {
			return JumlahKursi;
		}
		public void setJumlahKursi(int jumlahKursi) {
			JumlahKursi = jumlahKursi;
		}
		public int getJumlahPintu() {
			return JumlahPintu;
		}
		public void setJumlahPintu(int jumlahPintu) {
			JumlahPintu = jumlahPintu;
		}
		public int getJumlahJendela() {
			return JumlahJendela;
		}
		public void setJumlahJendela(int jumlahJendela) {
			JumlahJendela = jumlahJendela;
		}
		
	//==========================================================
	//KondisiRuangKelas
	//StopKontak
		public int getJumlahStopKontak() {
			return JumlahStopKontak;
		}
		public void setJumlahStopKontak(int jumlahStopKontak) {
			JumlahStopKontak = jumlahStopKontak;
		}
		public String getKondisiStopKontak() {
			return KondisiStopKontak;
		}
		public void setKondisiStopKontak(String kondisiStopKontak) {
			this.KondisiStopKontak = kondisiStopKontak;
		}
		public String getPosisiStopKontak() {
			return PosisiStopKontak;
		}
		public void setPosisiStopKontak(String posisiStopKontak) {
			this.PosisiStopKontak = posisiStopKontak;
		}
	//KabelLCD
		public int getJumlahKabelLCD() {
			return JumlahKabelLCD;
		}
		public void setJumlahKabelLCD(int jumlahKabelLCD) {
			JumlahKabelLCD = jumlahKabelLCD;
		}
		public String getKondisiKabelLCD() {
			return KondisiKabelLCD;
		}
		public void setKondisiKabelLCD(String kondisiKabelLCD) {
			KondisiKabelLCD = kondisiKabelLCD;
		}
		public String getPosisiKabelLCD() {
			return PosisiKabelLCD;
		}
		public void setPosisiKabelLCD(String posisiKabelLCD) {
			this.PosisiKabelLCD = posisiKabelLCD;
		}
		
	//KondisiLampu
		public int getJumlahLampu() {
			return JumlahLampu;
		}
		public void setJumlahLampu(int jumlahLampu) {
			JumlahLampu = jumlahLampu;
		}
		public String getKondisiLampu() {
			return KondisiLampu;
		}
		public void setKondisiLampu(String kondisiLampu) {
			KondisiLampu = kondisiLampu;
		}
		public String getPosisiKondisiLampu() {
			return PosisiLampu;
		}
		public void setPosisiLampu(String posisiLampu) {
			this.PosisiLampu = posisiLampu;
		}
	//KipasAngin
		public int getJumlahKipasAngin() {
			return JumlahKipasAngin;
		}
		public void setJumlahKipasAngin(int jumlahKipasAngin) {
			JumlahKipasAngin = jumlahKipasAngin;
		}
		public String getKondisiKipasAngin() {
			return KondisiKipasAngin;
		}
		public void setKondisiKipasAngin(String kondisiKipasAngin) {
			KondisiKipasAngin = kondisiKipasAngin;
		}
		public String getPosisiKipasAngin() {
			return PosisiKipasAngin;
		}
		public void setPosisiKipasAngin(String posisiKipasAngin) {
			this.PosisiKipasAngin = posisiKipasAngin;
		}
	//AC
		public int getJumlahAC() {
			return JumlahAC;
		}
		public void setJumlahAC(int jumlahAC) {
			JumlahAC = jumlahAC;
		}
		public String getKondisiAC() {
			return KondisiAC;
		}
		public void setKondisiAC(String kondisiAC) {
			KondisiAC = kondisiAC;
		}
		public String getPosisiAC() {
			return PosisiAC;
		}
		public void setPosisiAC(String posisiAC) {
			this.PosisiAC = posisiAC;
		}
		
		//==========================================================	
		public String getSSID() {
			return SSID;
		}
		public void setSSID(String sSID) {
			SSID = sSID;
		}
		public String getBandwith() {
			return Bandwith;
		}
		public void setBandwith(String bandwith) {
			Bandwith = bandwith;
		}
		//==========================================================
	//CCTV
		public int getJumlahCCTV() {
			return JumlahCCTV;
		}
		public void setJumlahCCTV(int jumlahCCTV) {
			JumlahCCTV = jumlahCCTV;
		}
		public String getKondisiCCTV() {
			return KondisiCCTV;
		}
		public void setKondisiCCTV(String kondisiCCTV) {
			KondisiCCTV = kondisiCCTV;
		}
		public String getPosisiCCTV() {
			return PosisiCCTV;
		}
		public void setPosisiCCTV(String posisiCCTV) {
			this.PosisiCCTV = posisiCCTV;
		}
		
	//==========================================================
	//LingkunganRuangKelas
		public String getKondisiLantai() {
			return KondisiLantai;
		}
		public void setKondisiLantai(String kondisiLantai) {
			KondisiLantai = kondisiLantai;
		}
		//==========================================================
		public String getKondisiDinding() {
			return KondisiDinding;
		}
		public void setKondisiDinding(String kondisiDinding) {
			KondisiDinding = kondisiDinding;
		}
		//==========================================================
		public String getKondisiAtap() {
			return KondisiAtap;
		}
		public void setKondisiAtap(String kondisiAtap) {
			KondisiAtap = kondisiAtap;
		}
		//==========================================================
		public String getKondisiPintu() {
			return KondisiPintu;
		}
		public void setKondisiPintu(String kondisiPintu) {
			KondisiPintu = kondisiPintu;
		}
		//==========================================================
		public String getKondisiJendela() {
			return KondisiJendela;
		}
		public void setKondisiJendela(String kondisiJendela) {
			KondisiJendela = kondisiJendela;
		}
		
	//==========================================================
		
		public Scanner getInput() {
			return input;
		}
		public void setInput(Scanner input) {
			this.input = input;
		}
		public String getSirkulasiUdara() {
			return SirkulasiUdara;
		}
		public void setSirkulasiUdara(String sirkulasiUdara) {
			SirkulasiUdara = sirkulasiUdara;
		}
		public String getNilaiPencahayaan() {
			return NilaiPencahayaan;
		}
		public void setNilaiPencahayaan(String nilaiPencahayaan) {
			NilaiPencahayaan = nilaiPencahayaan;
		}
		public String getKelembapan() {
			return Kelembapan;
		}
		public void setKelembapan(String kelembapan) {
			Kelembapan = kelembapan;
		}
		public String getSuhu() {
			return Suhu;
		}
		public void setSuhu(String suhu) {
			Suhu = suhu;
		}
		public String getKebisingan() {
			return Kebisingan;
		}
		public void setKebisingan(String kebisingan) {
			Kebisingan = kebisingan;
		}
		public String getBau() {
			return Bau;
		}
		public void setBau(String bau) {
			Bau = bau;
		}
		public String getKebocoran() {
			return Kebocoran;
		}
		public void setKebocoran(String kebocoran) {
			Kebocoran = kebocoran;
		}
		public String getKerusakan() {
			return Kerusakan;
		}
		public void setKerusakan(String kerusakan) {
			Kerusakan = kerusakan;
		}
		public String getKeausan() {
			return Keausan;
		}
		public void setKeausan(String keausan) {
			Keausan = keausan;
		}
		public String getKekokohan() {
			return Kekokohan;
		}
		public void setKekokohan(String kekokohan) {
			Kekokohan = kekokohan;
		}
		public String getKunciDanJendela() {
			return KunciDanJendela;
		}
		public void setKunciDanJendela(String kunciDanJendela) {
			KunciDanJendela = kunciDanJendela;
		}
		public String getBahaya() {
			return Bahaya;
		}
		public void setBahaya(String bahaya) {
			Bahaya = bahaya;
		}

	public static void main(String[] args) {
			
		}
	//=================================================================
	double luas (){
		return PanjangRuangKelas*LebarRuang;
	}
	double rasioLuas(){
		return luas()/JumlahKursi;
	}
	//=================================================================


		
	}




	
