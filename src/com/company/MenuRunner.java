package com.company;

public class MenuRunner
{
        public static void main(String[] args)
        {
            Sandwich reuben = new Sandwich(price:5.75, name:"Reuben");
            Sandwich bec = new Sandwich(price:2.00, name:"BEC");
            Salad waldorf = new Salad(price:7.25, name:"waldorf");
            Salad caesar = new Salad (price:4.00, name:"Caesar");
            Drink smoothie = new Drink (price:5.50, name:"Smoothie");
            Drink icedTea = new Drink (price:1.50, name:"IcedTea")

            Trio trio1 = new Trio (reuben,waldorf,icedTea);
            Trio trio2 = new Trio (bec, caesar, smoothie);
            Trio trio3 = new Trio (bec,caesar, icedTea);

            System.out.println(trio1.getName() + "Price:" + trio1.getPrice);
            System.out.println(trio2.getName() + "Price:" + trio2.getPrice);
            System.out.println(trio3.getName() + "Price:" + trio3.getPrice);
        }
}