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
public class Material {
    
    String ID;
    String Name;
    String UnitPrice;
    String EstimatedAmount;
    String PurchasedAmount;
    String TotalCost;

    public Material(String ID, String Name, String UnitPrice, String EstimatedAmount, String PurchasedCost, String TotalCost) {
        this.ID = ID;
        this.Name = Name;
        this.UnitPrice = UnitPrice;
        this.EstimatedAmount = EstimatedAmount;
        this.PurchasedAmount = PurchasedCost;
        this.TotalCost = TotalCost;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getUnitPrice() {
        return UnitPrice;
    }

    public String getEstimatedAmount() {
        return EstimatedAmount;
    }

    public String getPurchasedAmount() {
        return PurchasedAmount;
    }

    public String getTotalCost() {
        return TotalCost;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setUnitPrice(String UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    public void setEstimatedAmount(String EstimatedAmount) {
        this.EstimatedAmount = EstimatedAmount;
    }

    public void setPurchasedAmount(String PurchasedAmount) {
        this.PurchasedAmount = PurchasedAmount;
    }

    public void setTotalCost(String TotalCost) {
        this.TotalCost = TotalCost;
    }
    
    
    
}
