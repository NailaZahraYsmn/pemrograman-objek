public class MainApp {
    public static void main (String[] args) {
        Perusahaan ptBobby = new Perusahaan(1001, "Bobby Construction", "Kab. Madiun", 223344, "Bangunan");
        Lowongan loker = new Lowongan(ptBobby, 2001, "admin", "SMA Sederajat");
        DataKaryawan dataKaryawan = new DataKaryawan(1, "naila", "Dagangan", 445544, ptBobby);
        DataKaryawanPasif karyawanPasif = new DataKaryawanPasif(22, "naila", "Dagangan", 445544, "Cuti");

        Info[] semuaEntity = {ptBobby, loker, dataKaryawan, karyawanPasif};
        for (Info entity : semuaEntity) {
            InfoPrinter.cetakInfo(entity);
        }

        Exportable[] exportableItems = {ptBobby, dataKaryawan};
        for (Exportable item : exportableItems) {
            InfoPrinter.eksporData(item);
        }
    }
}