/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construction.Class;

/**
 *
 * @author faisa
 */
public class Payment {
    
    String PaymentID;
    String Date;
    String ToPayment;
    String ReceiverID;
    String Type;
    String Amount;
    String TrID;
    String BankName;
    String BankAccount;

    public Payment(String PaymentID, String Date, String ToPayment, String ReceiverID, String Type, String Amount, String TrID, String BankName, String BankAccount) {
        this.PaymentID = PaymentID;
        this.Date = Date;
        this.ToPayment = ToPayment;
        this.ReceiverID = ReceiverID;
        this.Type = Type;
        this.Amount = Amount;
        this.TrID = TrID;
        this.BankName = BankName;
        this.BankAccount = BankAccount;
    }

    public String getPaymentID() {
        return PaymentID;
    }

    public String getDate() {
        return Date;
    }

    public String getToPayment() {
        return ToPayment;
    }

    public String getReceiverID() {
        return ReceiverID;
    }

    public String getType() {
        return Type;
    }

    public String getAmount() {
        return Amount;
    }

    public String getTrID() {
        return TrID;
    }

    public String getBankName() {
        return BankName;
    }

    public String getBankAccount() {
        return BankAccount;
    }

    public void setPaymentID(String PaymentID) {
        this.PaymentID = PaymentID;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public void setToPayment(String ToPayment) {
        this.ToPayment = ToPayment;
    }

    public void setReceiverID(String ReceiverID) {
        this.ReceiverID = ReceiverID;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public void setAmount(String Amount) {
        this.Amount = Amount;
    }

    public void setTrID(String TrID) {
        this.TrID = TrID;
    }

    public void setBankName(String BankName) {
        this.BankName = BankName;
    }

    public void setBankAccount(String BankAccount) {
        this.BankAccount = BankAccount;
    }   
    
}
