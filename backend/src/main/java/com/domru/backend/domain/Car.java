package com.domru.backend.domain;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.time.Instant;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String model;
    @NotEmpty
    private Integer year;
    @NotBlank
    private String color;
    @NotEmpty
    private Integer rentalFee;
    @NotBlank
    private String carNumber;
    @NotEmpty
    private Instant startRent;
    @NotEmpty
    private Instant endRent;
    @NotBlank
    private String serviceName;

   /* private User currentTenant;

    private List<User> previousTenants;*/

    public Car(@NotBlank String model, @NotEmpty Integer year, @NotBlank String color, @NotEmpty Integer rentalFee, @NotBlank String carNumber, @NotEmpty Instant startRent, @NotEmpty Instant endRent, @NotBlank String serviceName) {
        this.model = model;
        this.year = year;
        this.color = color;
        this.rentalFee = rentalFee;
        this.carNumber = carNumber;
        this.startRent = startRent;
        this.endRent = endRent;
        this.serviceName = serviceName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getRentalFee() {
        return rentalFee;
    }

    public void setRentalFee(Integer rentalFee) {
        this.rentalFee = rentalFee;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public Instant getStartRent() {
        return startRent;
    }

    public void setStartRent(Instant startRent) {
        this.startRent = startRent;
    }

    public Instant getEndRent() {
        return endRent;
    }

    public void setEndRent(Instant endRent) {
        this.endRent = endRent;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", rentalFee=" + rentalFee +
                ", carNumber='" + carNumber + '\'' +
                ", startRent=" + startRent +
                ", endRent=" + endRent +
                ", serviceName='" + serviceName + '\'' +
                '}';
    }
}
