package com.minnobe.minnobe.classes;

import java.util.ArrayList;
import jakarta.persistence.*;


//import com.minnobe.minnobe.classes.History;
//import com.minnobe.minnobe.classes.Transaction;
@Entity
@Table(name="minnos")
 public class Minno {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	String userID;

	@Column(name = "firstname")
	String firstname;

	@Column(name = "lastname")
	String lastname;

	@Column(name="phone")
	String phonenumber;

	@Column(name = "email")
	String email;

	@Column(name = "username")
	String username;

	@Column(name = "password")
	String password;
	//Add PAssword Hashing

	@Column(name = "balance")
	double balance;

	@Column(name = "itemlist")
	ArrayList<String> itemList;
	
	
	public Minno(String userID, String firstname, String lastname, String phonenumber, String email,
			 String username, String password, double balance, ArrayList<String> itemList) {
		super();
		this.userID = userID;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phonenumber = phonenumber;
		this.email = email;
		this.username = username;
		this.password = password;
		this.balance = balance;
		this.itemList = itemList;
	}
	



	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public ArrayList<String> getItemList() {
		return itemList;
	}

	public void setItemList(ArrayList<String> itemList) {
		this.itemList = itemList;
	}


	@Override
	public String toString() {
		return "Minno [userID=" + userID + ", firstname=" + firstname + ", lastname=" + lastname + ", phonenumber="
				+ phonenumber + ", email=" + email + ", username=" + username + ", password=" + password + ", balance="
				+ balance + ", itemList=" + itemList + "]";
	}

	

}
