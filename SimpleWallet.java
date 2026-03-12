import java.util.Scanner;

public class SimpleWallet {
    private String name;
    private double balance;

    //constuctror
    public SimpleWallet(String name, double initialDeposit) {
    this.name = name;
    
        if(initialDeposit < 0) {
            this.balance = 0;
            System.out.println("WARNING: Initial balance cannot be negative. Setting balance to 0.");
        } else {
            this.balance = initialDeposit;
        }
    }

    public String getName() {
        return name;
    }

    public String getBalance() {
        return "IDR" + balance;
    }

    public double getBalanceValue() {
        return balance;
    }
    
    public boolean deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if(amount > 0) {
            balance -= amount;
            return true;
        }
        return false;
    } 
    
    public boolean transfer(SimpleWallet target, double amount) {
        if (this.withdraw(amount)) { 
            target.deposit(amount); 
            return true;
        }
        return false;
    } 

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan nama wallet: ");
        String walletName = sc.nextLine();

        System.out.println("Masukkan saldo awal: ");
        double initialDeposit = sc.nextDouble();

        SimpleWallet wallet = new SimpleWallet(walletName, initialDeposit);
        SimpleWallet targetWallet = new SimpleWallet( "Saldoku", 0);
        boolean continueMenu = true;
       
        while (continueMenu) {
            System.out.println("\nMenu:");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");
            System.out.print("Pilih menu: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Saldo Anda: " + wallet.getBalance());
                    break;
                case 2:
                    System.out.print("Masukkan jumlah deposit: ");
                    double depositAmount = sc.nextDouble();
                    if (wallet.deposit(depositAmount)) {
                        System.out.println("Deposit berhasil! Saldo baru: " + wallet.getBalance());
                    } else {
                        System.out.println("Deposit gagal! Jumlah harus lebih besar dari 0.");
                    }
                    break;
                case 3:
                    System.out.print("Masukkan jumlah withdraw: ");
                    double withdrawAmount = sc.nextDouble();

                    if (withdrawAmount > wallet.getBalanceValue()) {
                        System.out.println("Withdraw gagal! Saldo tidak mencukupi.");
                    } else if (wallet.withdraw(withdrawAmount)) {
                        System.out.println("Withdraw berhasil! Saldo baru: " + wallet.getBalance());
                    } else {
                        System.out.println("Withdraw gagal! Jumlah harus lebih besar dari 0.");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan jumlah transfer: ");
                    double transferAmount = sc.nextDouble();
                    if (transferAmount > wallet.getBalanceValue()) {
                        System.out.println("Transfer gagal! Saldo tidak mencukupi.");
                    } else if (wallet.transfer(targetWallet, transferAmount)) {
                        System.out.println("Transfer berhasil! Saldo baru: " + wallet.getBalance());
                        System.out.println("Saldo Target Wallet: " + targetWallet.getBalance());
                    } else {
                        System.out.println("Transfer gagal! Jumlah harus lebih besar dari 0.");
                    }
                    break;
                case 5:
                    continueMenu = false;
                    System.out.println("Terima kasih telah menggunakan SimpleWallet. Sampai jumpa!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        }
        sc.close();

    }
}
       
