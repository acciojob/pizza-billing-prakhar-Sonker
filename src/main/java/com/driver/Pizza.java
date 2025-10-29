package com.driver;

public class Pizza {

    private int price;
    private boolean isVeg;
    private String bill;

    private int basePrice;
    private boolean extraCheeseAdded;
    private boolean extraToppingsAdded;
    private boolean paperBagAdded;

    public Pizza(boolean isVeg){
        this.isVeg = isVeg;

        if(isVeg){
            this.basePrice = 300;
        } else {
            this.basePrice = 400;
        }

        this.price = this.basePrice;
        this.bill = "Base Price Of The Pizza: " + this.basePrice + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!extraCheeseAdded){
            this.price += 80;
            extraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(!extraToppingsAdded){
            if(isVeg) this.price += 70;
            else this.price += 120;
            extraToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if(!paperBagAdded){
            this.price += 20;
            paperBagAdded = true;
        }
    }

    public String getBill(){
        if(extraCheeseAdded){
            bill += "Extra Cheese Added: 80\n";
        }
        if(extraToppingsAdded){
            if(isVeg) bill += "Extra Toppings Added: 70\n";
            else bill += "Extra Toppings Added: 120\n";
        }
        if(paperBagAdded){
            bill += "Paperbag Added: 20\n";
        }
        bill += "Total Price: " + this.price + "\n";

        return this.bill;
    }
}
