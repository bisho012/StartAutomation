package com.automation.tests;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends PageBase{

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    private By lblpersonalinfo = By.xpath("//h3[.='Your personal information']");
    private By rb_title = By.id("id_gender1");
    private By txtCustomerFirstName = By.id("customer_firstname");
    private By txtCustomerLastName = By.id("customer_lastname");
    private By txtEmail = By.id("email");
    private By txtPassword = By.id("passwd");
    private By ddlDay = By.xpath("//select[@id='days']");
    private By ddlDayValue = By.xpath("//select[@id='days']//option[@value='3']");
    private By ddlMonths = By.id("months");
    private By ddlMonthsValue = By.xpath("//select[@id='months']//option[@value='3']");
    private By ddlYears = By.id("years");
    private By ddlYearsValue = By.xpath("//option[@value='1945']");
    private By btnSignUpNewsLetter = By.xpath("//label[@for='newsletter']");
    private By btnRecieveSpecialOffers = By.xpath("//label[@for='optin']");
    private By txtFirstName = By.id("firstname");
    private By txtLastName = By.id("lastname");
    private By txtCompany = By.id("company");
    private By txtAddress = By.id("address1");
    private By txtAddress2 = By.id("address2");
    private By txtCity = By.id("city");
    private By txtState = By.id("id_state");
    private By txtStateValue = By.xpath("//option[normalize-space()='Connecticut']");
    private By txtPostalCode = By.id("postcode");
    private By btnCountry = By.id("id_country");
    private By btnCountryValue = By.id("//option[normalize-space()='United States']");
    private By txtAdditionalInfo = By.id("other");
    private By txtPhone = By.id("phone");
    private By txtMobilePhone = By.id("phone_mobile");
    private By txtAlias = By.id("alias");
    private By btnRegister = By.id("//span[normalize-space()='Register']");

    public void setRb_title(){
        click(rb_title);
    }

    @Step("Set Customer First Name [{customerFirstName}]")
    public void setTxtCustomerFirstName(String customerFirstName){
        setText(txtCustomerFirstName, customerFirstName);
    }

    public void setTxtCustomerLastName(String customerLastName){
        setText(txtCustomerLastName, customerLastName);
    }

    public void setTxtEmail(String email){
        setText(txtEmail, email);
    }

    public void setTxtPassword(String password){
        setText(txtPassword, password);
    }

    public void setDdlDay(){
        selectData(ddlDay,1);
    }

    public void setDdlMonths(){
        selectData(ddlMonths,8);
    }

    public void setDdlYears(){
        selectData(ddlYears,9);
    }

    public void setBtnSignUpNewsLetter(){
        click(btnSignUpNewsLetter);
    }

    public void setBtnRecieveSpecialOffers(){
        click(btnRecieveSpecialOffers);
    }

    public void setTxtFirstName(String firstName){
        setText(txtFirstName, firstName);
    }

    public void setTxtLastName(String lastName){
        setText(txtLastName, lastName);
    }

    public void setTxtCompany(String company){
        setText(txtCompany, company);
    }

    public void setTxtAddress(String address){
        setText(txtAddress, address);
    }

    public void setTextAddress2(String address2){
        setText(txtAddress2, address2);
    }

    public void setTxtCity(String city){
        setText(txtCity, city);
    }

    public void setTxtState(){
        click(txtState);
        click(txtStateValue);
    }

    public void setTxtPostalCode(String postalCode){
        setText(txtPostalCode, postalCode);
    }

    public void setTxtCountry(){
        click(btnCountry);
        click(btnCountryValue);
    }

    public boolean infoIsDisplayed(){
        return isDisplayed(lblpersonalinfo);
    }

    public void setTxtAdditionalInfo(String additionalInfo){
        setText(txtAdditionalInfo, additionalInfo);
    }

    public void setTxtPhone(String phone){
        setText(txtPhone, phone);
    }

    public void setTxtMobilePhone(String mobilePhone){
        setText(txtMobilePhone, mobilePhone);
    }

    public void setTxtAlias(String alias){
        setText(txtAlias, alias);
    }

    @Step("Click Register")
    public void setBtnRegister(){
        click(btnRegister);
    }
}
