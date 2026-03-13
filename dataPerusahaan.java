public class dataPerusahaan { 
    public static void main (String[] args) {
        lowongan loker = new lowongan();
        loker.namaPerusahaan = "Bobby Constrution";
        loker.idPerusahaan = 1001;
        loker.kontakPerusahaan = 223344;
        loker.alamatPerusahaan = "Kab. Madiun";
        loker.bidangUsaha = "Bangunan";
        loker.idLowongan = 1000;
        loker.namaLowongan = "Pendaftaran Karyawan Baru";
        loker.kategoriPelamar = "SMA Sederajat";
        loker.infoPerusahaan();
        loker.infoLowongan();

        dataKaryawan k = new dataKaryawan();
        k.idPerusahaan = 1001;
        k.idKaryawan = 1;
        k.namaKaryawan = "Yuwa";
        k.alamatKaryawan = "Dolopo";
        k.kontakKaryawan = 445566;
        k.infoKaryawan();

        dataKaryawanPasif p = new dataKaryawanPasif();
        p.idPerusahaan = 1001;
        p.idKaryawan = 22;
        p.namaKaryawan = "naila";
        p.alamatKaryawan ="Dagangan";
        p.kontakKaryawan = 445544;
        p.alasan = "Cuti";
        p.infoKaryawanPasif();
    }
}

class perusahaan {
    String namaPerusahaan;
    int idPerusahaan;
    int kontakPerusahaan; 
    String alamatPerusahaan;
    String bidangUsaha;
    
    public void infoPerusahaan() {
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

class lowongan extends perusahaan {
    int idLowongan;
    String namaLowongan;
    String kategoriPelamar;

    public void infoLowongan() {
        System.out.println("==================================");
        System.out.println("Lowongan Pekerjaan yang Tersedia");
        System.out.println("==================================");
        System.out.println("ID Perusahaan       : " + idPerusahaan);
        System.out.println("ID Lowongan         : " + idLowongan);
        System.out.println("Nama Lowongan       : " + namaLowongan);
        System.out.println("Kategori Pelamar    : " + kategoriPelamar);
        System.out.println("Lokasi              : " + alamatPerusahaan);
    }
}

class dataKaryawan extends perusahaan {
    int idKaryawan;
    String namaKaryawan;
    String alamatKaryawan;
    int kontakKaryawan;

    public void infoKaryawan() {
        System.out.println("=============================");
        System.out.println("DATA KARYAWAN AKTIF");
        System.out.println("=============================");
        System.out.println("ID Perusahaan       : " + idPerusahaan);
        System.out.println("ID KARYAWAN         : " + idKaryawan);
        System.out.println("Nama                : " + namaKaryawan);
        System.out.println("Alamat              : " + alamatKaryawan);
        System.out.println("Kontak              : " + kontakKaryawan);
    }
}
class dataKaryawanPasif extends perusahaan {
    int idKaryawan;
    String namaKaryawan;
    String alamatKaryawan;
    int kontakKaryawan;
    String alasan;

    public void infoKaryawanPasif() {
        System.out.println("=============================");
        System.out.println("DATA KARYAWAN PASIF");
        System.out.println("=============================");
        System.out.println("ID Perusahaan       : " + idPerusahaan);
        System.out.println("ID KARYAWAN         : " + idKaryawan);
        System.out.println("Nama                : " + namaKaryawan);
        System.out.println("Alamat              : " + alamatKaryawan);
        System.out.println("Kontak              : " + kontakKaryawan);
        System.out.println("Alasan              : " + alasan);
    }
}