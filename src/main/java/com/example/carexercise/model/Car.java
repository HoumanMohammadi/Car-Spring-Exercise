package com.example.carexercise.model;

import java.util.Objects;
import java.util.UUID;

public class Car {

    private String nameOfManufacturer;

    private int wheelNumber;

    UUID uuid;

    private boolean tuevCertified;

    public Car(String nameOfManufacturer, int wheelNumber, UUID uuid, boolean tuevCertified) {
        this.nameOfManufacturer = nameOfManufacturer;
        this.wheelNumber = wheelNumber;
        this.uuid = UUID.randomUUID();
        this.tuevCertified = tuevCertified;
    }

    public String getNameOfManufacturer() {
        return nameOfManufacturer;
    }

    public void setNameOfManufacturer(String nameOfManufacturer) {
        this.nameOfManufacturer = nameOfManufacturer;
    }

    public int getWheelNumber() {
        return wheelNumber;
    }

    public void setWheelNumber(int wheelNumber) {
        this.wheelNumber = wheelNumber;
    }

    public boolean isTuevCertified() {
        return tuevCertified;
    }

    public void setTuevCertified(boolean tuevCertified) {
        this.tuevCertified = tuevCertified;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return wheelNumber == car.wheelNumber && tuevCertified == car.tuevCertified && Objects.equals(nameOfManufacturer, car.nameOfManufacturer) && Objects.equals(uuid, car.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfManufacturer, wheelNumber, uuid, tuevCertified);
    }

    @Override
    public String toString() {
        return "Car{" +
                "nameOfManufacturer='" + nameOfManufacturer + '\'' +
                ", wheelNumber=" + wheelNumber +
                ", uuid=" + uuid +
                ", tuevCertified=" + tuevCertified +
                '}';
    }
}
