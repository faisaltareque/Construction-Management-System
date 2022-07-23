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
public class Seller {
    String ID;
    String Name;
    String Contact;
    String Email;
    String Address;
    String TradeID;
    String BankName;
    String BankAccount;
    String AdvancePayment;
    String DuePayment;
    String TotalPayment;
    String Discount;
    String NoOfShipment;
    String NoOfShpmentDue;

    public Seller(String ID, String Name, String Contact, String Email, String Address, String TradeID, String BankName, String BankAccount, String AdvancePayment, String DuePayment, String TotalPayment, String Discount, String NoOfShipment, String NoOfShpmentDue) {
        this.ID = ID;
        this.Name = Name;
        this.Contact = Contact;
        this.Email = Email;
        this.Address = Address;
        this.TradeID = TradeID;
        this.BankName = BankName;
        this.BankAccount = BankAccount;
        this.AdvancePayment = AdvancePayment;
        this.DuePayment = DuePayment;
        this.TotalPayment = TotalPayment;
        this.Discount = Discount;
        this.NoOfShipment = NoOfShipment;
        this.NoOfShpmentDue = NoOfShpmentDue;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getContact() {
        return Contact;
    }

    public String getEmail() {
        return Email;
    }

    public String getAddress() {
        return Address;
    }

    public String getTradeID() {
        return TradeID;
    }

    public String getBankName() {
        return BankName;
    }

    public String getBankAccount() {
        return BankAccount;
    }

    public String getAdvancePayment() {
        return AdvancePayment;
    }

    public String getDuePayment() {
        return DuePayment;
    }

    public String getTotalPayment() {
        return TotalPayment;
    }

    public String getDiscount() {
        return Discount;
    }

    public String getNoOfShipment() {
        return NoOfShipment;
    }

    public String getNoOfShpmentDue() {
        return NoOfShpmentDue;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setTradeID(String TradeID) {
        this.TradeID = TradeID;
    }

    public void setBankName(String BankName) {
        this.BankName = BankName;
    }

    public void setBankAccount(String BankAccount) {
        this.BankAccount = BankAccount;
    }

    public void setAdvancePayment(String AdvancePayment) {
        this.AdvancePayment = AdvancePayment;
    }

    public void setDuePayment(String DuePayment) {
        this.DuePayment = DuePayment;
    }

    public void setTotalPayment(String TotalPayment) {
        this.TotalPayment = TotalPayment;
    }

    public void setDiscount(String Discount) {
        this.Discount = Discount;
    }

    public void setNoOfShipment(String NoOfShipment) {
        this.NoOfShipment = NoOfShipment;
    }

    public void setNoOfShpmentDue(String NoOfShpmentDue) {
        this.NoOfShpmentDue = NoOfShpmentDue;
    }
    
    
    
}
