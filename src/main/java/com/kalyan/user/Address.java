package com.kalyan.user;

public class Address {


    private String Country;
    private String city;
    private String street;
    private String district;

    public Address(String country, String city, String street, String district) {
        Country = country;
        this.city = city;
        this.street = street;
        this.district = district;
    }
    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}
