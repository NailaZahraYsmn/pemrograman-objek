public class MainApp {
    public static void main (String[] args) {
        Lowongan loker = new Lowongan(1001, "Bobby Constrution", "Kab. Madiun", 223344, "Bangunan");
        loker.idLowongan = 1000;
        loker.namaLowongan = "Pendaftaran Karyawan Baru";
        loker.kategoriPelamar = "SMA Sederajat";
        loker.infoLowongan();

        DataKaryawan k = new DataKaryawan();
        k.setIdPerusahaan(1001);
        k.idKaryawan = 1;
        k.namaKaryawan = "Yuwa";
        k.alamatKaryawan = "Dolopo";
        k.kontakKaryawan = 445566;
        k.infoKaryawan();

        DataKaryawanPasif p = new DataKaryawanPasif();
        p.setIdPerusahaan(1001);
        p.idKaryawan = 22;
        p.namaKaryawan = "naila";
        p.alamatKaryawan ="Dagangan";
        p.kontakKaryawan = 445544;
        p.alasan = "Cuti";
        p.infoKaryawanPasif();
    }
}
    
