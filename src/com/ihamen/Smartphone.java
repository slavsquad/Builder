package com.ihamen;

/**
 * Created by stepanenko.sg on 17.09.2017.
 */
public class Smartphone {
    //В данном случае переменный final т.к. нам требуется создать Immutable объект
    private final String model;
    private final float displaySize;
    private final int weight;
    private final int batteryVolume;
    private final float backCamera;
    private final float frontCamera;

    public static class Builder{
        //Обязательные параметры
        //Поле model final т.к. явзяется не изменяемым параметром, метод setModel отсутсвует.
        private final String model;
        //Дополнительные параметрам объекта - присваеваем значения по умолчаню.
        private float displaySize = 5.5f;
        private int weight = 100;
        private int batteryVolume = 3000;
        private float backCamera = 12.0f;
        private float frontCamera = 5.0f;

        Builder(String model){
            this.model = model;
        }

        public Builder setDisplaySize(float displaySize) {
            this.displaySize = displaySize;
            return this;
        }

        public Builder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public Builder setBatteryVolume(int batteryVolume) {
            this.batteryVolume = batteryVolume;
            return this;
        }

        public Builder setBackCamera(float backCamera) {
            this.backCamera = backCamera;
            return this;
        }

        public Builder setFrontCamera(float frontCamera) {
            this.frontCamera = frontCamera;
            return this;
        }

        public Smartphone build(){
            return new Smartphone(this);
        }

    }
    private Smartphone(Builder builder){
        this.model = builder.model;
        this.displaySize = builder.displaySize;
        this.weight = builder.weight;
        this.batteryVolume = builder.batteryVolume;
        this.backCamera = builder.backCamera;
        this.frontCamera = builder.frontCamera;
    }

    @Override
    public String toString() {
        return String.format("Model: %s. Display size: %.1f . Weight: %d. Battery volume: %d. Back Camera px: %.1f. Front Camera px: %.1f",model,displaySize,weight,batteryVolume,backCamera,frontCamera);
    }
}
