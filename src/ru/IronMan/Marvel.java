package ru.IronMan;

public class Marvel {
    public  String nameTrans; //наименование трансформара
    public float machineSpeed; // скорость трансформера
    public Integer modification; // модификаций

    public Marvel(String nameTrans, float machineSpeed, Integer modification) {
        this.nameTrans = nameTrans;
        this.machineSpeed = machineSpeed;
        this.modification = modification;
    }

    public String getNameTrans() {
        return nameTrans;
    }

    public float getMachineSpeed() {
        return machineSpeed;
    }

    public Integer getModification() {
        return modification;
    }

    @Override
    public String toString() {
        return "Marvel{" +
                "nameTrans=" + nameTrans +
                ", machineSpeed=" + machineSpeed +
                ", modification=" + modification +
                '}';
    }
}
