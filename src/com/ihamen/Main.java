package com.ihamen;

public class Main {

    public static void main(String[] args) {
	// write your code here
        NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8).fat(10).calories(100).sodium(35).carbohydrate(27).build();
        cocaCola.setServingSize(99999);
        System.out.println(cocaCola);
        System.out.println("FAt:"+cocaCola.getFat());

        Smartphone smartphoneNokia = new Smartphone.Builder("Nokia").build();
        Smartphone smartphoneMotorolla = new Smartphone.Builder("Motorolla").
                setFrontCamera(3.1f).
                setDisplaySize(6.0f).
                setBatteryVolume(6000).
                setBackCamera(15.5f).
                build();
        System.out.println(smartphoneNokia);
        System.out.println(smartphoneMotorolla);

    }
}
