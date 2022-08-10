package com.hexaware.practiceproj;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SellerOper {
	List <Seller> SList = new ArrayList <Seller> ();
	
	public void addrecords() {
		Seller s1 = new Seller(1,"Akanksha","aka@gmail.com","Vijayawada");
		Seller s2 = new Seller(2,"Abhiram","abhi12@gmail.com","Vizag");
		Seller s3 = new Seller(3,"Vaishnavi","vai96@gmail.com","Mumbai");
		Seller s4 = new Seller(4,"Kavya","kav@gmail.com","Ahmedabad");
		Seller s5 = new Seller(5,"Madhav","ma45@gmail.com","Warangal");
		SList.add(s1);
		SList.add(s2);
		SList.add(s3);
		SList.add(s4);
		SList.add(s5);
	}
	
	public void addnewrec(int sid, String sname, String semail, String slocation) {
		SList.add(new Seller(sid, sname, semail, slocation));
		System.out.println("Seller Added");
	}
	
	public void displayAllSellers() {
		SList.stream().forEach((seller) -> System.out.println(seller));
	}
	
	public void searchBysid(int sid) {
		SList.stream().filter((seller) -> sid == seller.getId())
		.forEach((seller) -> System.out.println(seller));
	}
	
	public void deleteBysid(int sid) {		
		SList =  SList.stream()
		.filter((seller) -> sid != seller.getId())
		.collect(Collectors.toList());
		
		SList.stream()
		.forEach((seller) -> System.out.println(seller));
	}
	
	public void updateBysid(int sid, String sname, String semail, String slocation) {
		SList.stream()
		.filter((seller) -> sid == seller.getId())
		.forEach((seller) -> {
			seller.setId(sid);
			seller.setName(sname);
			seller.setEmail(semail);
			seller.setLocation(slocation);
		});
		
		SList.stream().forEach((seller) -> System.out.println(seller));

	}
	
	public void displayBySLocation(String slocation) {
		SList.stream()
		.filter((seller) -> slocation.equals(seller.getLocation()))
		.forEach((seller) -> System.out.println(seller));
	}
	
	
}
