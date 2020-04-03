package com.capgemini.librarymanagementsystem.controller;

import java.util.Scanner;

import com.capgemini.librarymanagementsystem.dto.AdminInfo;
import com.capgemini.librarymanagementsystem.dto.BooksInfo;
import com.capgemini.librarymanagementsystem.dto.UserInfo;
import com.capgemini.librarymanagementsystem.factory.CommonFactory;
import com.capgemini.librarymanagementsystem.service.AdminService;
import com.capgemini.librarymanagementsystem.service.UserService;

public class LibraryMain {
	public static void main(String[] args) {

		do {
			Scanner sc=new Scanner(System.in);
			System.out.println("Press A for Admin");
			System.out.println("Press B for User");
			String option=sc.next();
			boolean changeStatus=true;
			switch(option) {
			case "A":
				do {
					System.out.println("Welcome Admin");
					Scanner scanner=new Scanner(System.in);
					AdminService adser=CommonFactory.getAdminService();

					System.out.println("Press 1 to Register");
					System.out.println("Press 2 to Authenticate");
					System.out.println("Press 3 to Add Book");
					System.out.println("Press 4 to Remove Book");
					System.out.println("Press 5 to search book");
					System.out.println("Press 6 to Issue book");
					int choice=scanner.nextInt();
					
						switch (choice) {
						case 1:
							System.out.println("enter id");
							int regId=scanner.nextInt();
							System.out.println("enter name");
							String regName=scanner.next();
							System.out.println("enter password");
							String regPassword=scanner.next();
							AdminInfo adi=new AdminInfo();
							adi.setAdid(regId);
							adi.setAdname(regName);
							adi.setAdpassword(regPassword);
							boolean check=adser.registerAdmin(adi);
							if(check)
								System.out.println("Already user is registered");
							else 
								System.out.println("Registered successfully");

						
						case 2:
							System.out.println("enter id");
							int adid=scanner.nextInt();
							System.out.println("enter name");
							String adname=scanner.next();
							System.out.println("enter password");
							String adpassword=scanner.next();

							try {
								AdminInfo ai=adser.auth(adname, adpassword);
								System.out.println("Logged in");
							}catch (Exception e) {
								System.out.println("Invalid credentials");
							}
							break;

						case 3:
							System.out.println("enter bid");
							int bid=scanner.nextInt();
							System.out.println("enter book edition");
							String bookEdition=scanner.next();
							System.out.println("enter author");
							String author=scanner.next();
							System.out.println("enter subject");
							String subject=scanner.next();
							BooksInfo bi=new BooksInfo();
							boolean check2=adser.addBook(bi);
							if(check2)
								System.out.println("Book added");
							else
								System.out.println("Book not added");
							break;

						case 4:
							System.out.println("enter bid");
							int bkid=scanner.nextInt();
							System.out.println("enter book edition");
							String bookedition=scanner.next();
							System.out.println("enter author");
							String bkauthor=scanner.next();
							System.out.println("enter subject");
							String sub=scanner.next();
							BooksInfo bin=new BooksInfo();
							boolean check3=adser.removeBook(bkid);
							if (check3) {
								System.out.println("Book removed");
							}else {
								System.out.println("No Book removed");
							}break;

						case 5:
							System.out.println("enter bid");
							int bookid=scanner.nextInt();
							System.out.println("enter book edition");
							String booked=scanner.next();
							System.out.println("enter author");
							String bookauth=scanner.next();
							System.out.println("enter subject");
							String subj=scanner.next();

							try {//try open
								BooksInfo binf=adser.searchBook(bookid);
								System.out.println("Book found");
							}//try closed
							catch(Exception e){//catch open
								System.out.println("No Book available");
							}// catch closed
							break;

						case 6:
							System.out.println("enter bid");
							int sbid=scanner.nextInt();
							System.out.println("enter subject");
							String ssub=scanner.next();

							BooksInfo bsi=new BooksInfo();
							boolean check4=adser.issueBook(ssub);
							if(check4)
								System.out.println("Book issued");
							else {//else open
								System.out.println("Not issued");

							}break;//else closed
							/*	case 7:
							System.out.println("log out");
							changeStatus = false;
							break;*/
						default:
							System.out.println("Default method");
							break;

						}//choice switch closed


					//}//while(true);


				}while(changeStatus);
			case "B":
				do {
					System.out.println("Welcome to User operations");

					Scanner sc2=new Scanner(System.in);
					UserService service2=CommonFactory.getUserService();
					System.out.println("Press 1 to authentiacate user");
					System.out.println("Press 2 to register user");
					System.out.println("Press 3 to search book");
					System.out.println("Press 4 to request book");
					System.out.println("Press 5 to borrow book");
					int choice2=sc2.nextInt();
					switch(choice2) {
					case 1:
						System.out.println("enter id");
						int id=sc2.nextInt();
						System.out.println("enter name");
						String name=sc2.next();
						System.out.println("enter password");
						String password=sc2.next();

						try {
							UserInfo authInfo=service2.auth(name, password);
							System.out.println("Logged In");
						}catch(Exception e) {
							System.out.println("Invalid Credentials");
						}
						break;
					case 2:
						System.out.println("enter id");
						int regId=sc2.nextInt();
						System.out.println("enter name");
						String regName=sc2.next();
						System.out.println("enter password");
						String regPassword=sc2.next();
						UserInfo ui=new UserInfo();
						ui.setUid(regId);
						ui.setUname(regName);
						ui.setUpassword(regPassword);
						boolean check=service2.registerUser(ui);
						if(check)
							System.out.println("Registered");
						else
							System.out.println("Already user is registered");
						break;
					case 3:
						System.out.println("enter id");
						int searchId=sc2.nextInt();
						try {
							BooksInfo bi2=service2.searchBook(searchId);
							System.out.println("Book searched");
						}catch(Exception e) {
							System.out.println("Invalid credentials");	
						}
						break;
					case 4:
						System.out.println("enter id");
						int reqId=sc2.nextInt();
						System.out.println("enter name");
						String reqName=sc2.next();
						System.out.println("enter book edition");
						int reqedition=sc2.nextInt();
						System.out.println("enter author");
						String reqauthor=sc2.next();
						try {
							boolean bi3=service2.requestBook(reqId,reqauthor,reqedition);
							System.out.println("Book requested");
						}catch(Exception e) {
							System.out.println("Book not available");
						}
						break;
					case 5:
						System.out.println("enter id");
						int borrowId=sc2.nextInt();
						try {
							BooksInfo bi2=service2.searchBook(borrowId);
							System.out.println("Book searched");
						}catch(Exception e) {
							System.out.println("Invalid credentials");	
						}
						break;
					}

				}while(true);

			default:
				System.out.println("Its a default method");
				break;	
			}
		}while(true);

	}
}





