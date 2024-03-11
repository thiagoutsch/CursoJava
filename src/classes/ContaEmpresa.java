package classes;

public class ContaEmpresa extends Conta {
    
    private Double loanLimit;

    public ContaEmpresa() {
        super();
    }

    public ContaEmpresa(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }


    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
    
    public void loan(double amount) {
        if ( amount <= loanLimit) {
            balance += amount - 10.0;

        }
    }
    
}
