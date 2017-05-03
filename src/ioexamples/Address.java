/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ioexamples;

/**
 *
 * @author Instlogin
 */
public class Address {
    private String address;
    private String city;
    private String state;
    private String zip;
    
//    public String getCity() {
//        String[] nameArray = address.split(" ");
//        String temp = nameArray[0];
//        return temp.substring(0, temp.length()-1);
//    }

    public Address(String address, String city, String State, String zip) {
        this.address = address;
        this.city = city;
        this.state = State;
        this.zip = zip;
    }

    
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String State) {
        this.state = State;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
    
    
    
    
    public String toString() {
        return address + " " + city + ", " + state + " " + zip;
    }
}
