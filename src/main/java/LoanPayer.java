


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Locke
 */
public class LoanPayer {
    int CountDown = 500;
    
    private int Amount;

    public LoanPayer(int Amount) {
        this.Amount = Amount;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }
    
}
