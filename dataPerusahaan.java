interface Info {  //Interface Segregation Principle (ISP)
    void tampilInfo();
}
class Perusahaan implements Info{   //Single Responsibility Principle (SRP)
    private String namaPerusahaan;
    private int idPerusahaan;
    private int kontakPerusahaan; 
    private String alamatPerusahaan;
    private String bidangUsaha;
    
    public Perusahaan(int idPerusahaan, String namaPerusahaan, String alamatPerusahaan, int kontakPerusahaan, String bidangUsaha) {
        this.idPerusahaan = idPerusahaan;
        this.namaPerusahaan = namaPerusahaan;
        this.alamatPerusahaan = alamatPerusahaan;
        this.kontakPerusahaan = kontakPerusahaan;
        this.bidangUsaha = bidangUsaha;
    }
    
    public String getAlamatPerusahaan() {
        return alamatPerusahaan;
    }
    public int getIdPerusahaan() {
        return idPerusahaan;
    }
    public void setKontakPerusahaan(int kontakBaru) {
        this.kontakPerusahaan = kontakBaru;
    }
    public String getBidangUsaha() {
        return bidangUsaha;
    }
    
    @Override
    public void tampilInfo() {
        System.out.println("===============================");
        System.out.println("BOBBY CONSTRUCTION SYSTEM");
        System.out.println("===============================");
        System.out.println("Nama Perusahaan     : " + namaPerusahaan);
        System.out.println("ID                  : " + idPerusahaan);
        System.out.println("Kontak              : " + kontakPerusahaan);
        System.out.println("Alamat              : " + alamatPerusahaan);
        System.out.println("Bidang Usaha        : " + bidangUsaha);
    }
}

class Lowongan implements Info{
    private int idLowongan;
    private String namaLowongan;
    private String kategoriPelamar;
    private Perusahaan perusahaan;

    public Lowongan(Perusahaan perusahaan, int idLowongan, String namaLowongan, String kategoriPelamar) {
        this.perusahaan = perusahaan;
        this.idLowongan = idLowongan;
        this.namaLowongan = namaLowongan;
        this.kategoriPelamar = kategoriPelamar;
    }

    public Perusahaan getPerusahaan() {
        return perusahaan; 
    }
    public int getIdLowongan() { 
        return idLowongan;
    }
    public String getNamaLowongan() {
        return namaLowongan; 
    }
    public String getKategoriPelamar() {
        return kategoriPelamar;
    }

    @Override
    public void tampilInfo() {
        System.out.println("=============================");
        System.out.println("INFORMASI LOWONGAN KERJA");
        System.out.println("=============================");
        System.out.println("ID Lowongan         : " + idLowongan);
        System.out.println("Nama Lowongan       : " + namaLowongan);
        System.out.println("Kategori Pelamar    : " + kategoriPelamar);
        System.out.println("Lokasi              : " + perusahaan.getAlamatPerusahaan());
    }
}

abstract class Orang { //superclass untuk data karyawan pasif dan aktif
    protected String nama;
    protected String alamat;
    protected int kontak;

    public Orang(String nama, String alamat, int kontak) {
        this.nama = nama;
        this.alamat = alamat;
        this.kontak = kontak;
    }

    public String getNama() {
        return nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public int getKontak() {
        return kontak;
    }
}
class DataKaryawan extends Orang implements Info {
    private int idKaryawan;
    private Perusahaan perusahaan;

    public DataKaryawan(int id, String namaKaryawan, String alamatKaryawan, int kontakKaryawan, Perusahaan perusahaan ) {
        super(namaKaryawan, alamatKaryawan, kontakKaryawan);
        this.idKaryawan = id;
        this.perusahaan = perusahaan;
    }

    public int getIdKaryawan() {
        return idKaryawan;
    }
    public Perusahaan getPerusahaan() {
        return perusahaan; 
    }

    @Override
    public void tampilInfo() {
        System.out.println("=============================");
        System.out.println("DATA KARYAWAN AKTIF");
        System.out.println("=============================");
        System.out.println("ID Perusahaan       : " + perusahaan.getIdPerusahaan());
        System.out.println("ID KARYAWAN         : " + idKaryawan);
        System.out.println("Nama                : " + nama);
        System.out.println("Alamat              : " + alamat);
        System.out.println("Kontak              : " + kontak);
    }
}
class DataKaryawanPasif extends Orang implements Info {
    private int idKaryawan;
    private String alasan;

    public DataKaryawanPasif(int idKaryawan, String namaKaryawan, String alamatKaryawan, int kontakKaryawan, String alasan) {
        super(namaKaryawan, alamatKaryawan, kontakKaryawan);
        this.idKaryawan = idKaryawan;
        this.alasan = alasan;
    }

    public int getIdKaryawan() {
        return idKaryawan;
    }
    public String getAlasan() {
        return alasan;
    }
    
    @Override
    public void tampilInfo() {
        System.out.println("=============================");
        System.out.println("DATA KARYAWAN PASIF");
        System.out.println("=============================");
        System.out.println("ID KARYAWAN         : " + idKaryawan);
        System.out.println("Nama                : " + nama);
        System.out.println("Alamat              : " + alamat);
        System.out.println("Kontak              : " + kontak);
        System.out.println("Alasan              : " + alasan);
    }
}