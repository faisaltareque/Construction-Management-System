/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package construction.Class;

/**
 *
 * @author Faisal Tareque
 */
public class Purchase {
    String TrID;
    String TrDate;
    String ItemID;
    String NoOfUnit;
    String SellerID;
    String TotalCost;
    String Paid;
    String Due;
    String NoOfShipment;
    String NoOfShipmentDue;

    public Purchase(String TrID, String TrDate, String ItemID, String NoOfUnit, String SellerID, String TotalCost, String Paid, String Due, String NoOfShipment, String NoOfShipmentDue) {
        this.TrID = TrID;
        this.TrDate = TrDate;
        this.ItemID = ItemID;
        this.NoOfUnit = NoOfUnit;
        this.SellerID = SellerID;
        this.TotalCost = TotalCost;
        this.Paid = Paid;
        this.Due = Due;
        this.NoOfShipment = NoOfShipment;
        this.NoOfShipmentDue = NoOfShipmentDue;
    }

    public String getTrID() {
        return TrID;
    }

    public String getTrDate() {
        return TrDate;
    }

    public String getItemID() {
        return ItemID;
    }

    public String getNoOfUnit() {
        return NoOfUnit;
    }

    public String getSellerID() {
        return SellerID;
    }

    public String getTotalCost() {
        return TotalCost;
    }

    public String getPaid() {
        return Paid;
    }

    public String getDue() {
        return Due;
    }

    public String getNoOfShipment() {
        return NoOfShipment;
    }

    public String getNoOfShipmentDue() {
        return NoOfShipmentDue;
    }

    public void setTrID(String TrID) {
        this.TrID = TrID;
    }

    public void setTrDate(String TrDate) {
        this.TrDate = TrDate;
    }

    public void setItemID(String ItemID) {
        this.ItemID = ItemID;
    }

    public void setNoOfUnit(String NoOfUnit) {
        this.NoOfUnit = NoOfUnit;
    }

    public void setSellerID(String SellerID) {
        this.SellerID = SellerID;
    }

    public void setTotalCost(String TotalCost) {
        this.TotalCost = TotalCost;
    }

    public void setPaid(String Paid) {
        this.Paid = Paid;
    }

    public void setDue(String Due) {
        this.Due = Due;
    }

    public void setNoOfShipment(String NoOfShipment) {
        this.NoOfShipment = NoOfShipment;
    }

    public void setNoOfShipmentDue(String NoOfShipmentDue) {
        this.NoOfShipmentDue = NoOfShipmentDue;
    }
    
    
    
}
