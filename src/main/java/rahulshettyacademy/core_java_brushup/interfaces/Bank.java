package rahulshettyacademy.core_java_brushup.interfaces;

public class Bank implements BankingStandard,InvestmentStandard{
    @Override
    public void checkBalance() {
        System.out.println("Checking balance....");
        System.out.println("Account Balance : "+1_000_000);
    }

    @Override
    public void transferMoney(String amount) {
        System.out.println("Transferring money....");
        System.out.println("Amount : "+amount);
    }

    @Override
    public void payDue(double amount) {
        System.out.println("Paying due....");
        System.out.println("Amount : "+amount);
    }


    public void payQr(String qrType){
        System.out.println("Paying using QR.....");
        System.out.println("QR");
    }

    @Override
    public void buyStocks() {
        System.out.println("Buying stocks....");
    }

    @Override
    public void sellStocks() {
        System.out.println("Selling stocks....");
    }

    @Override
    public void buyMutualFunds() {
        System.out.println("Buying mutual funds....");
    }

    @Override
    public void sellMutualFunds() {
        System.out.println("Selling mutual funds....");
    }
}
