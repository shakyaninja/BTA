package com.example.bta.modals;

public class EmergencyContact {
    protected String serviceProvider;
    protected String contactno;

    public String getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public EmergencyContact(String serviceProvider, String contactno) {
        this.serviceProvider = serviceProvider;
        this.contactno = contactno;
    }
}
