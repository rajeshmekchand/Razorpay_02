package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.Table;
import org.json.JSONObject;






@Entity
@Table(name="orderentity")
public class Orderentity {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long myorder;

private String amount;
private JSONObject notes;
private Integer created_at;
private String amount_due;
private String currency;
private String receipt;
private String id;
private String status;
private String attempts;
public Long getMyorder() {
	return myorder;
}
public void setMyorder(Long myorder) {
	this.myorder = myorder;
}
public String getAmount() {
	return amount;
}
public void setAmount(String string) {
	this.amount = string;
}

//public JSONArray getNotes() {
//	return notes;
//}
//public void setNotes(JSONArray notes) {
//	this.notes = notes;
//}
public Integer getCreated_at() {
	return created_at;
}
public void setCreated_at(Integer created_at) {
	this.created_at = created_at;
}
public String getAmount_due() {
	return amount_due;
}
public void setAmount_due(String amount_due) {
	this.amount_due = amount_due;
}
public String getCurrency() {
	return currency;
}
public void setCurrency(String currency) {
	this.currency = currency;
}
public String getReceipt() {
	return receipt;
}
public void setReceipt(String receipt) {
	this.receipt = receipt;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getAttempts() {
	return attempts;
}
public void setAttempts(String string) {
	this.attempts = string;
}
@Override
public String toString() {
	return "Orderentity [myorder=" + myorder + ", amount=" + amount + ",created_at=" + created_at
			+ ", amount_due=" + amount_due + ", currency=" + currency + ", receipt=" + receipt + ", id=" + id
			+ ", status=" + status + ", attempts=" + attempts + "]";
}

}
