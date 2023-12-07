package com.cloud.cloudvendor.model;

public class CloudVendor {

    private String vendorId;

    private String name;
    private String address;
    private String phoneNumber;

    public CloudVendor() {
    }

    public CloudVendor(String vendorId, String name, String address, String phoneNumber) {
        this.vendorId = vendorId;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;

    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "CloudVendor{" +
                "vendorId='" + vendorId + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
