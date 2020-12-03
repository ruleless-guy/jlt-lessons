package com.jlt.jdbc;

public class App {
	public static void main(String[] args) {
		MySqlDB mySqlDB = new MySqlDB();
		mySqlDB.init();
		
//		Person p = new Person();
//		p.setName("Khun");
//		p.setAge(22);
//		mySqlDB.insertPerson(p);
		
//		mySqlDB.getAllPeople();
		
//		Person p2 = new Person();
//		p2.setName("Than Sin Cho");
//		p2.setAge(22);
//		mySqlDB.updatePersonById(7, p2);
		
		mySqlDB.deletePersonById(5);
	}
}
