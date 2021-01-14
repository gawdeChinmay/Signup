
package com.cloud.services;


public class SignupDetails {
                
             private String UserFirstName;
               private String UserLastName;
               private Integer PhoneNumber;
               private String Password;

    public SignupDetails(String UserFirstName, String UserLastName, Integer PhoneNumber, String Password) {
        this.UserFirstName = UserFirstName;
        this.UserLastName = UserLastName;
        this.PhoneNumber = PhoneNumber;
        this.Password = Password;
    }
public SignupDetails(){}
    @Override
    public String toString() {
        return "SignupDetails{" + "UserFirstName=" + UserFirstName + ", UserLastName=" + UserLastName + ", PhoneNumber=" + PhoneNumber + ", Password=" + Password + '}';
    }

    public String getUserFirstName() {
        return UserFirstName;
    }

    public void setUserFirstName(String UserFirstName) {
        this.UserFirstName = UserFirstName;
    }

    public String getUserLastName() {
        return UserLastName;
    }

    public void setUserLastName(String UserLastName) {
        this.UserLastName = UserLastName;
    }

    public Integer getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(Integer PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
               
               
               
}
