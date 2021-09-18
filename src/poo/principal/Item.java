package src.poo.principal;

import java.util.Date;

public class Item {
    public String name;
    public Double price;
    public Double tax;
    private Date expirationDate;

    public Item (){

    }

    public Double getTotalToPay() {
        return price + tax;
    }

    public void calculateTax(){
        tax = price * 0.19;
    }

    public Boolean canItBeSold(){
        Date today = new Date();
        return getExpirationDate().after(today);
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }
}
