
package com.mycompany.company.system;


public class CustomAddressFormatter implements AddressFormatter{
    
    @Override
    public String formatAddress(Address address) {
        // Custom logic for formatting address
        return address.getStreetNo() + ", " + address.getCity() + ", " + address.getState();
    }
}
