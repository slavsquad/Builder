package com.ihamen.Builders;

public abstract class Builder {
    /**
     * Интерфейс Строителя объявляет все возможные этапы и шаги
     * конфигурации продукта.
     * Реализован может быть как через interface так и через abstract class
     */
    public void setCPU(int frequency){};
    public void setRAM(int volume){};
    public void setDisplay(float diagonal){};
    public void setBattery(int capacity){};
    public void setCamera(float camera){};
    public void setMemory(int memory){};
    public void setHddMemory(int memory){};
    public void setGPU(int memory){};
}
