package br.edu.unifei.ecot12a;

public class Contract {
    private String benefit;
    private String payment;
    private String terminationClause;
    public String getBenefit() {
        return benefit;
    }
    public void setBenefit(String benefit) {
        this.benefit = benefit;
    }
    public String getPayment() {
        return payment;
    }
    public void setPayment(String payment) {
        this.payment = payment;
    }
    public String getTerminationClause() {
        return terminationClause;
    }
    public void setTerminationClause(String terminationClause) {
        this.terminationClause = terminationClause;
    }
}
