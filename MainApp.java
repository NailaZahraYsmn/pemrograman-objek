public class MainApp {
    public static void main (String[] args) {
        Perusahaan ptBobby = new Perusahaan(1001, "Bobby Construction", "Kab. Madiun", 223344, "Bangunan");
        Lowongan loker = new Lowongan(ptBobby, 2001, "admin", "SMA Sederajat");
        DataKaryawan dataKaryawan = new DataKaryawan(1, "naila", "Dagangan", 445544, ptBobby);
        DataKaryawanPasif karyawanPasif = new DataKaryawanPasif(22, "naila", "Dagangan", 445544, "Cuti");

        System.out.println("\n===== DATA SISTEM =====");
        Info[] semuaEntity = {ptBobby, loker, dataKaryawan, karyawanPasif};
        for (Info entity : semuaEntity) {
            InfoPrinter.cetakInfo(entity);
        }

        System.out.println("\n===== EXPORT SISTEM =====");
        Exportable[] exportableItems = {ptBobby, dataKaryawan, karyawanPasif};
        for (Exportable item : exportableItems) {
            InfoPrinter.eksporData(item);
        }

        System.out.println("\n===== PEMBAYARAN GAJI =====");
        PembayaranGaji pembayaran1 = new TransferBank("BCA");
        PembayaranGaji pembayaran2 = new EWallet("OVO");

        pembayaran1.prosesPembayaran(5000000);
        pembayaran2.prosesPembayaran(250000);
    
    }
}