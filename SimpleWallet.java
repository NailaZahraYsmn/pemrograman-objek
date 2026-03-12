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
    
    public boolean deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
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
        SimpleWallet myWallet1 = new SimpleWallet("Naila", 50000);
        SimpleWallet myWallet2 = new SimpleWallet("Jaehyun",    100000);

        System.out.println("Saldo awal Naila : " + myWallet1.getBalance());
        System.out.println("Saldo awal Jaehyun : " + myWallet2.getBalance());

        double jumlahTransfer = 20000;
       
        if(myWallet1.transfer(myWallet2, jumlahTransfer)) {
            System.out.println("Transfer berhasil!");
        } else {
            System.out.println("Transfer gagal! Saldo tidak mencukupi.");
        }

        System.out.println("Saldo Naila setelah transfer 20k: " + myWallet1.getBalance());

        myWallet1.deposit(50000);
        System.out.println("Saldo Naila setelah deposit 50k: " + myWallet1.getBalance());

        System.out.println("Saldo akhir " + myWallet1.getName() + ": " + myWallet1.getBalance());
        System.out.println("Saldo akhir " + myWallet2.getName() + ": " + myWallet2.getBalance());
    }

} 
