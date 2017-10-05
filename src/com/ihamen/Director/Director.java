package com.ihamen.Director;

import com.ihamen.Builders.Builder;

/**
 * Директор знает в какой последовательности заставлять работать строителя. Он
 * работает с ним через общий интерфейс Строителя. Из-за этого, он может не
 * знать какой конкретно продукт сейчас строится.
 */

public class Director {
    public void constructSuperNotebook(Builder builder){
        builder.setCPU(4000);
        builder.setRAM(16000);
        builder.setGPU(4096);
        builder.setDisplay(17.4f);
        builder.setHddMemory(2048);
        builder.setBattery(20000);
    }

    public void constructNotebook(Builder builder){
        builder.setCPU(2000);
        builder.setRAM(4000);
        builder.setGPU(1096);
        builder.setDisplay(15.3f);
        builder.setHddMemory(500);
        builder.setBattery(10000);
    }

    public void counstructMobilePhone(Builder builder){
        builder.setCPU(1000);
        builder.setRAM(1024);
        builder.setDisplay(5.5f);
        builder.setCamera(13.4f);
        builder.setMemory(16);
        builder.setBattery(3000);
    }
}
