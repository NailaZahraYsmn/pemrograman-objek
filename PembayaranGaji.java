// superclass
interface PembayaranGaji {
    void prosesPembayaran(double jumlah);
}

// subclass transfer bank
class TransferBank implements PembayaranGaji {
    private String namaBank;

    public TransferBank(String namaBank) {
        this.namaBank = namaBank;
    }

    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Transfer ke Bank " + namaBank + " sebesar Rp " + jumlah);
    }
}

// subclass e-wallet 
class EWallet implements PembayaranGaji {
    private String namaWallet;

    public EWallet(String namaWallet) {
        this.namaWallet = namaWallet;
    }

    @Override
    public void prosesPembayaran(double jumlah) {
        System.out.println("Bayar via E-Wallet " + namaWallet + " sebesar Rp " + jumlah);
    }
}