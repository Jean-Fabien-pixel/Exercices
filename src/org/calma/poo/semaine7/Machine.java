package org.calma.poo.semaine7;

public abstract class Machine implements Operable {
    private String brand;
    private int energyLevel;
    private Status status;

    public Machine(String brand, int energyLevel){
        this.brand = brand;
        this.energyLevel = energyLevel;
        this.status = Status.INACTIVE;
    }

    public String getBrand() {
        return this.brand;
    }

//    GETSTATUS()
    public Status getStatus() {
        return this.status;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

//    SETENERGY()
    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public boolean start(){
        if(this.energyLevel>0){
            this.status = Status.ACTIVE;
            return true;
        }else{
            return false;
        }
    }

    public boolean stop(){
        this.status = Status.INACTIVE;
        return false;
    }
}
