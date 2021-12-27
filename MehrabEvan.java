package com.company;

abstract class Features{

    abstract void ColdCoffee();
    abstract void HotCoffee();
    abstract void Cappuccino();
}

class Coffee extends Features{
    Coffee(){}
    public void getdetails(){
        System.out.println("Coffe is a good drink for us");
    }
    Coffee(int cost){
        System.out.println("Coffee usually costs "+cost+"Taka");
    }

    @Override
    void ColdCoffee() {
        System.out.println("This is Cold Coffee");
    }

    @Override
    void HotCoffee() {
        System.out.println("This is Hot Coffee");
    }
    @Override
    void Cappuccino() {
        System.out.println("This is Cappucino");
    }
}

class Coin extends Coffee  {
    public void getdetails(){
        System.out.println("Ammount : 5 Pound Country : England Year : 2000");
    }
    Coin(int coffeecost,int Sugar_cost){
        super(coffeecost-1000);
        System.out.println("Coffee costs " + coffeecost+"  "+ Sugar_cost);
    }
    @Override
    public void ColdCoffee(){
        System.out.println("Cold Coffee is so Cold");
    }

}



public class MehrabEvan {
    public static void main(String[] args) {
        Coffee Rio = new Coffee(4000);

        System.out.println("Details about this Coffee\n" );

        Rio.getdetails();
        System.out.println(".....................\n");
        Coin phone1 = new Coin(5000,2000);
        System.out.println("Details about this Coin\n" );
        phone1.getdetails();
        System.out.println(".....................\n");
        phone1.ColdCoffee();
        phone1.HotCoffee();
        phone1.Cappuccino();
    }
}