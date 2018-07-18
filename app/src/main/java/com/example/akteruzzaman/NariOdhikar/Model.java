package com.example.akteruzzaman.NariOdhikar;

public class Model {
   private String listText;
   private String listdetails;

    public Model(String listText, String listdetails) {
        this.listText = listText;
        this.listdetails = listdetails;
    }

    public Model() {
    }

    public String getListText() {
        return listText;
    }

    public void setListText(String listText) {
        this.listText = listText;
    }

    public String getListdetails() {
        return listdetails;
    }

    public void setListdetails(String listdetails) {
        this.listdetails = listdetails;
    }
}
