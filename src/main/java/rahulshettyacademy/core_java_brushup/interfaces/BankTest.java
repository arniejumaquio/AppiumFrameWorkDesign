package rahulshettyacademy.core_java_brushup.interfaces;

public class BankTest {

    public static void main(String[] args) {

        //Runtime polymorphism

        Bank bank = new Bank();
        bank.payDue(1000);
        bank.transferMoney("500");
        bank.checkBalance();
        bank.payQr("QRPh");

        BankingStandard bankTwo = new Bank();
        //bankTwo.payQr("QRPh");

        InvestmentStandard bankThree = new Bank();
        bankThree.sellStocks();
        bankThree.sellMutualFunds();
        bankThree.buyStocks();
        bankThree.buyMutualFunds();


        Bank bankFour = new Bank();



    }

}
