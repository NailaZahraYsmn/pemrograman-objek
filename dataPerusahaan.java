interface Info {
    void tampilInfo();
}

interface Exportable {
    String exportData();
}

class Perusahaan implements Info, Exportable {
    private String namaPerusahaan;
    private int idPerusahaan;
    private String kontakPerusahaan;
    private String alamatPerusahaan;
    private String bidangUsaha;

    public Perusahaan(int idPerusahaan, String namaPerusahaan, String alamatPerusahaan, String kontakPerusahaan, String bidangUsaha) {
        this.idPerusahaan = idPerusahaan;
        this.namaPerusahaan = namaPerusahaan;
        this.alamatPerusahaan = alamatPerusahaan;
        this.kontakPerusahaan = kontakPerusahaan;
        this.bidangUsaha = bidangUsaha;
    }

    public String getAlamatPerusahaan() { return alamatPerusahaan; }
    public int getIdPerusahaan() { return idPerusahaan; }
    public void setKontakPerusahaan(String kontakBaru) { this.kontakPerusahaan = kontakBaru; }
    public String getBidangUsaha() { return bidangUsaha; }

    @Override
    public String exportData() {
        return idPerusahaan + "," + namaPerusahaan + "," + alamatPerusahaan + "," + bidangUsaha;
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

class Lowongan implements Info, Exportable {
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

    public Perusahaan getPerusahaan() { return perusahaan; }
    public int getIdLowongan() { return idLowongan; }
    public String getNamaLowongan() { return namaLowongan; }
    public String getKategoriPelamar() { return kategoriPelamar; }

    @Override
    public String exportData() {
        return idLowongan + "," + namaLowongan + "," + kategoriPelamar + "," + perusahaan.getAlamatPerusahaan();
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

abstract class Orang {
    protected String nama;
    protected String alamat;
    protected String kontak;

    public Orang(String nama, String alamat, String kontak) {
        this.nama = nama;
        this.alamat = alamat;
        this.kontak = kontak;
    }

    public String getNama() { return nama; }
    public String getAlamat() { return alamat; }
    public String getKontak() { return kontak; }
}

class DataKaryawan extends Orang implements Info, Exportable {
    private int idKaryawan;
    private Perusahaan perusahaan;

    public DataKaryawan(int id, String namaKaryawan, String alamatKaryawan, String kontakKaryawan, Perusahaan perusahaan) {
        super(namaKaryawan, alamatKaryawan, kontakKaryawan);
        this.idKaryawan = id;
        this.perusahaan = perusahaan;
    }

    public int getIdKaryawan() { return idKaryawan; }
    public Perusahaan getPerusahaan() { return perusahaan; }

    @Override
    public String exportData() {
        return idKaryawan + "," + nama + "," + alamat + "," + kontak;
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

class DataKaryawanPasif extends Orang implements Info, Exportable {
    private int idKaryawan;
    private String alasan;

    public DataKaryawanPasif(int idKaryawan, String namaKaryawan, String alamatKaryawan, String kontakKaryawan, String alasan) {
        super(namaKaryawan, alamatKaryawan, kontakKaryawan);
        this.idKaryawan = idKaryawan;
        this.alasan = alasan;
    }

    public int getIdKaryawan() { return idKaryawan; }
    public String getAlasan() { return alasan; }

    @Override
    public String exportData() {
        return idKaryawan + "," + nama + "," + alamat + "," + kontak + "," + alasan;
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


//Exception handling menggunakan try-catch-finally
    public static void cetakInfo(Info entity) {
        try {
            if (entity == null) {
                throw new NullPointerException("Data entity kosong");
            }
            entity.tampilInfo();
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Proses cetak info selesai.\n");
        }
    }

    public static void eksporData(Exportable entity) {
        try {
            if (entity == null) {
                throw new NullPointerException("Data export kosong");
            }
            System.out.println("Export: " + entity.exportData());
        } catch (NullPointerException e) {
            System.out.println("Gagal export: " + e.getMessage());
        } finally {
            System.out.println("Proses export selesai.\n");
        }
    }
}