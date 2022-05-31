package com.herokuapp.booker.restful.Model;

import java.util.List;

public class Userpojo {
    private String firstname;
    private String lastname;
    private Integer totalprice;
    private boolean depositpaid;
    private List<String> bookingdates;
    private String additionalneeds;

    public String getAdditionalneeds() {
        return additionalneeds;
    }

    public void setAdditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }



    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }

    public Boolean getDepositpaid() {
        return depositpaid;
    }

    public void setDepositpaid(Boolean depositpaid) {
        this.depositpaid = depositpaid;
    }

    public List<String> getBookingdates() {
        return bookingdates;
    }

    public void setBookingdates(List<String> bookingdates) {
        this.bookingdates = bookingdates;
    }
}
