public class CreditCard {
    // Vari�veis de Inst�ncia:
    private String number;
    private String name;
    private String bank;
    private double balance;
    private int limit;

    // M�todo construtor:
    CreditCard(String no, String nm, String bk, double bal, int lim) {
        number = no;
        name = nm;
        bank = bk;
        balance = bal;
        limit = lim;
    }

    // M�todos de acessos:
    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getBank() {
        return bank;
    }

    public double getBalance() {
        return balance;
    }

    public int getLimit() {
        return limit;
    }

    // M�todos de a��o:
    public boolean chargeIt(double price) { // Fornece um troco
        if (price + balance & gt(double) limit) // & = E; gt = great than = maior que)
            return false; // N�o h� dinheiro suficiente para troco
        balance += price;
        return true; // The charge goes through in this case
    }

    public void makePayment(double payment) { // Faz o pagamento
        balance -= payment;
    }

    // M�todo de Classe
    public static void printCard(CreditCard c) { // Imprime as informa��es do cart�o (card)
        System.out.println("Number = " + c.getNumber());
        System.out.println("Name = " + c.getName());
        System.out.println("Bank = " + c.getBank());
        System.out.println("Balance = " + c.getBalance()); // casting impl�cito (convers�es)
        System.out.println("Limit = " + c.getLimit()); // casting impl�cito (convers�es)
    }
}