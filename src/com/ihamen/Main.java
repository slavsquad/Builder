package com.ihamen;

import com.ihamen.Builders.Builder;
import com.ihamen.Builders.MobilePhoneBuilder;
import com.ihamen.Builders.NotebookBuilder;
import com.ihamen.Director.Director;
import com.ihamen.Product.MobilePhone;
import com.ihamen.Product.Notebook;
import com.ihamen.miniBuilder.Smartphone;

public class Main {

    public static void main(String[] args) {
        Smartphone smartphoneNokia = new Smartphone.Builder("Nokia").build();
        Smartphone smartphoneMotorolla = new Smartphone.Builder("Motorolla").
                setFrontCamera(3.1f).
                setDisplaySize(6.0f).
                setBatteryVolume(6000).
                setBackCamera(15.5f).
                build();
        System.out.println(smartphoneNokia);
        System.out.println(smartphoneMotorolla);
        System.out.println(smartphoneMotorolla.getModel());


        System.out.println();

        Director director = new Director();

        NotebookBuilder builder = new NotebookBuilder();
        director.constructSuperNotebook(builder);
        Notebook notebook = builder.getResult();

        MobilePhoneBuilder mobilePhoneBuilder = new MobilePhoneBuilder();
        director.counstructMobilePhone(mobilePhoneBuilder);
        MobilePhone mobilePhone = mobilePhoneBuilder.getResult();

        System.out.println(notebook);
        System.out.println(mobilePhone);

        director.constructNotebook(builder);
        System.out.println(builder.getResult());

    }
}
