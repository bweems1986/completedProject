package com.company;

public class Employee {
    private String firstName;
    private String lastName;
    private String email;
    private String userName;
    private String passWord;
    private String phoneNumber;
    private String jobTitle;

    public Employee(String firstName, String lastName, String email, String userName, String passWord, String phoneNumber, String jobTitle){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.userName = userName;
        this.passWord = passWord;
        this.phoneNumber = phoneNumber;
        this.jobTitle = jobTitle;
    }

    /**
     * sets last name of employee
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * set email of employee
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * set username of employee
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * set password for employee
     * @param passWord
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    /**
     * set phone number for employee
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * set job title for employee
     * @param jobTitle
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * gets first name of an employee
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * gets the last name of an employee
     * @return
     */
    public String getLastName(){
        return lastName;
    }

    /**
     * gets the email address of an employee
     * @return
     */
    public String getEmail(){
        return email;
    }

    /**
     * gets the user name of an employee
     * @return
     */
    public String getUserName(){
        return userName;
    }

    /**
     * gets the password of an employee
     * @return
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * gets the phone number of an employee
     * @return
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * gets the job title of an employee
     * @return
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * store serialized bikePart into an String array of values
     * @param serializedEmployee
     */
    public Employee(String serializedEmployee) {

        String[] values = serializedEmployee.split(",");

        this.firstName = values[0];
        this.lastName = values[1];
        this.email = values[2];
        this.userName = values[3];
        this.passWord = values[4];
        this.phoneNumber = values[5];
        this.jobTitle = values[6];
    }
    /**
     * convert its state to a byte stream so that the byte stream can be reverted back into a copy of the object
     * @return serializeEmployee
     */
    public String Serialize() {
        String serializedEmployee = (this.firstName + "," + (this.lastName)
                + "," + (this.email) + "," + (this.userName)
                + "," + (this.passWord) + "," + (this.phoneNumber) + "," + (this.jobTitle)  + ("\n"));
        return serializedEmployee;
    }


}
