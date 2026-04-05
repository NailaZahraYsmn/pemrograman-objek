public class MainApp {
    public static void main (String[] args) {
        Perusahaan ptBobby = new Perusahaan(1001, "Bobby Construction", "Kab. Madiun", 223344, "Bangunan");
        ptBobby.tampilInfo();
      
        Lowongan loker = new Lowongan(ptBobby, 2001, "admin", "SMA Sederajat");
        loker.tampilInfo();

        DataKaryawan dataKaryawan = new DataKaryawan(1, "naila", "Dagangan", 445544, ptBobby);
        dataKaryawan.tampilInfo();

        DataKaryawanPasif karyawanPasif = new DataKaryawanPasif(22, "naila", "Dagangan", 445544, "Cuti");
        karyawanPasif.tampilInfo();
    }
}