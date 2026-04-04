interface Info {  //Interface Segregation Principle (ISP)
    void tampilInfo();
}
class Perusahaan{   //Single Responsibility Principle (SRP)
    private String namaPerusahaan;
    private int idPerusahaan;
    private int kontakPerusahaan; 
    private String alamatPerusahaan;
    private String bidangUsaha;
    
    public Perusahaan(int id, String nama, String alamat, int kontak, String bidang) {
        this.idPerusahaan = id;
        this.namaPerusahaan = nama;
        this.alamatPerusahaan = alamat;
        this.kontakPerusahaan = kontak;
        this.bidangUsaha = bidang;
    }
    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }
    public String getAlamatPerusahaan() {
        return alamatPerusahaan;
    }
    public int getIdPerusahaan() {
        return idPerusahaan;
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