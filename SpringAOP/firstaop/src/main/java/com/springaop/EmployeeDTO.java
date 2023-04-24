package com.springaop;

public class EmployeeDTO {
    private Integer id;
    private String firstName;
    private String lastName;
    //Setters and Getters
    public void setID(Integer id){
        this.id = id;
    }
    public Integer getId(){
        return id;
    }
    public String geFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
