package com.example.assignment5;

public class DataModel {
    private String pvm, nimi;

    public String getPvm(){
        String[] arr = pvm.split(" ", 0);
        return arr[0];
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void setPvm(String pvm) {
        this.pvm = pvm;
    }
}
