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
    public void setKontakPerusahaan() {
        return kontakPerusahaan;
    }
    public String getBidangUsaha() {
        return bidangUsaha;
    }
    
    @Override
    public void tampilInfo() {
        System.out.println("Nama Perusahaan: " + namaPerusahaan);
        System.out.println("ID Perusahaan: " + idPerusahaan);
        System.out.println("Alamat: " + alamatPerusahaan);
        System.out.println("Kontak: " + kontakPerusahaan);
        System.out.println("Bidang Usaha: " + bidangUsaha);
    }
}

class Lowongan extends Perusahaan {
    int idLowongan;
    String namaLowongan;
    String kategoriPelamar;

    public Lowongan(int id, String nama, String alamat, int kontak, String bidang) {
        super(id, nama, alamat, kontak, bidang);
    }

    public void infoLowongan() {
        System.out.println("==================================");
        System.out.println("Lowongan Pekerjaan yang Tersedia");
        System.out.println("==================================");
        System.out.println("ID Perusahaan       : " + getIdPerusahaan());
        System.out.println("ID Lowongan         : " + idLowongan);
        System.out.println("Nama Lowongan       : " + namaLowongan);
        System.out.println("Kategori Pelamar    : " + kategoriPelamar);
        System.out.println("Lokasi              : " + getAlamatPerusahaan());
    }
}

class DataKaryawan extends Perusahaan {
    int idKaryawan;
    String namaKaryawan;
    String alamatKaryawan;
    int kontakKaryawan;

    public DataKaryawan(int id, String nama, String alamat, int kontak, String bidang) {
        super(id, nama, alamat, kontak, bidang);
    }

    public void infoKaryawan() {
        System.out.println("=============================");
        System.out.println("DATA KARYAWAN AKTIF");
        System.out.println("=============================");
        System.out.println("ID Perusahaan       : " + getIdPerusahaan());
        System.out.println("ID KARYAWAN         : " + idKaryawan);
        System.out.println("Nama                : " + namaKaryawan);
        System.out.println("Alamat              : " + alamatKaryawan);
        System.out.println("Kontak              : " + kontakKaryawan);
    }
}
class dataKaryawanPasif extends Perusahaan {
    int idKaryawan;
    String namaKaryawan;
    String alamatKaryawan;
    int kontakKaryawan;
    String alasan;

    public dataKaryawanPasif(int id, String nama, String alamat, int kontak, String bidang) {
        super(id, nama, alamat, kontak, bidang);
    }

    public void infoKaryawanPasif() {
        System.out.println("=============================");
        System.out.println("DATA KARYAWAN PASIF");
        System.out.println("=============================");
        System.out.println("ID Perusahaan       : " + getIdPerusahaan());
        System.out.println("ID KARYAWAN         : " + idKaryawan);
        System.out.println("Nama                : " + namaKaryawan);
        System.out.println("Alamat              : " + alamatKaryawan);
        System.out.println("Kontak              : " + kontakKaryawan);
        System.out.println("Alasan              : " + alasan);
    }
}