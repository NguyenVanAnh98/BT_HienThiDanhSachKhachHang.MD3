package com.example.bt_hienthidanhsachkhachhang;


import java.time.LocalDate;

public class Customer {
    private int id;
    private String name;
    private String address;
    private LocalDate createdAt;
    private String img;

    public Customer(int id, String name, String address, LocalDate createdAt, String img) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.createdAt = createdAt;
        this.img = img;
    }

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
}
