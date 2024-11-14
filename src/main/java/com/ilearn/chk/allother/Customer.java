package com.ilearn.chk.allother;

public class Customer {
    private int cid;
    private String cname;
    private String email;
    private int phone;
    private String city;


    public Customer() {
    }

    public Customer(int cid, String cname, String email, int phone, String city) {
        this.cid = cid;
        this.cname = cname;
        this.email = email;
        this.phone = phone;
        this.city = city;
    }

    public Customer(String cname, String email, int phone, String city) {
        this.cname = cname;
        this.email = email;
        this.phone = phone;
        this.city = city;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", city='" + city + '\'' +
                '}';
    }
}
