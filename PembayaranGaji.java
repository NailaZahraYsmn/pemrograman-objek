// superclass
abstract class PembayaranGaji {
    protected double jumlah;

    public PembayaranGaji(double jumlah) {
        this.jumlah = jumlah;
    }

    public abstract void prosesPembayaran();
}

// subclass transfer bank
class TransferBank extends PembayaranGaji {
    private String namaBank;

    public TransferBank(double jumlah, String namaBank) {
        super(jumlah);
        this.namaBank = namaBank;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Transfer ke Bank " + namaBank + " sebesar Rp " + jumlah);
    }
}

// subclass e-wallet 
class EWallet extends PembayaranGaji {
    private String namaWallet;

    public EWallet(double jumlah, String namaWallet) {
        super(jumlah);
        this.namaWallet = namaWallet;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Bayar via E-Wallet " + namaWallet + " sebesar Rp " + jumlah);
    }
}