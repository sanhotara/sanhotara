package com.springaop;

public class EmployeeDTO {
    private Integer id;
    private String firstName;
    private String lastName;
    //Setters and Getters
    public void setid(Integer id){
        this.id = id;
    }
    public Integer getId(){
        System.out.println("ID: "+ id);
        return id;
    }
    public String geFirstName() {
        System.out.println("First Name: "+ firstName);
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getlastName() {
        System.out.println("Last Name: "+ lastName);
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
    public void throwsException(){
        System.out.println(("A new exception is raised"));
        throw new IllegalArgumentException();
    }
}
