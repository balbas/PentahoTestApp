package jmb.pentahotestapp.data;

import android.content.ContentValues;

import java.util.UUID;

/**
 * Created by jmbalbas on 29/09/2016.
 *
 * Entidad "Cliente"
 */

public class Customer {
    private String id;
    private String name;
    private String surnames;
    private String address;
    private String postalCode;
    private String city;
    private String state;
    private String country;
    private String identityDocument;
    private String phoneNumber;
    private String mobileNumber;
    private String fax;
    private String email;
    private String web;

    /**
     * Constructor
     *
     * @param name
     * @param surnames
     * @param address
     * @param postalCode
     * @param city
     * @param state
     * @param country
     * @param identityDocument
     * @param phoneNumber
     * @param mobileNumber
     * @param fax
     * @param email
     * @param web
     */
    public Customer(String name, String surnames, String address, String postalCode, String city, String state, String country, String identityDocument, String phoneNumber, String mobileNumber, String fax, String email, String web) {
        this.id = UUID.randomUUID().toString();;
        this.name = name;
        this.surnames = surnames;
        this.address = address;
        this.postalCode = postalCode;
        this.city = city;
        this.state = state;
        this.country = country;
        this.identityDocument = identityDocument;
        this.phoneNumber = phoneNumber;
        this.mobileNumber = mobileNumber;
        this.fax = fax;
        this.email = email;
        this.web = web;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
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

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIdentityDocument() {
        return identityDocument;
    }

    public void setIdentityDocument(String identityDocument) {
        this.identityDocument = identityDocument;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public ContentValues toContentValues() {
        ContentValues values = new ContentValues();
        values.put(CustomersContract.CustomerEntry.ID, id);
        values.put(CustomersContract.CustomerEntry.NAME, name);
        values.put(CustomersContract.CustomerEntry.SURNAMES, surnames);
        values.put(CustomersContract.CustomerEntry.ADDRESS, address);
        values.put(CustomersContract.CustomerEntry.POSTAL_CODE, postalCode);
        values.put(CustomersContract.CustomerEntry.CITY, city);
        values.put(CustomersContract.CustomerEntry.STATE, state);
        values.put(CustomersContract.CustomerEntry.COUNTRY, country);
        values.put(CustomersContract.CustomerEntry.IDENTITY_DOCUMENT, identityDocument);
        values.put(CustomersContract.CustomerEntry.PHONE_NUMBER, phoneNumber);
        values.put(CustomersContract.CustomerEntry.MOBILE_NUMBER, mobileNumber);
        values.put(CustomersContract.CustomerEntry.FAX, fax);
        values.put(CustomersContract.CustomerEntry.EMAIL, email);
        values.put(CustomersContract.CustomerEntry.WEB, web);
        return values;
    }
}
