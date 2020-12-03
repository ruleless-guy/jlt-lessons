package com.jlt.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlDB {
	private Connection connection;
	public void init() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/test";
		String username = "root";
		String password = "";
		try {
			connection = DriverManager.getConnection(url,username,password);
			System.out.println("Connected");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public Connection getConnection() {
		return connection;
	}
	
	public void insertPerson(Person p) {
		String sql = "INSERT INTO `person` (`name`,`age`) VALUES (?,?)";
		try(
				PreparedStatement preSt = connection.prepareStatement(sql)
			)
		{
			preSt.setString(1, p.getName());
			preSt.setInt(2, p.getAge());
			int rowCount = preSt.executeUpdate();
			System.out.println(rowCount+" row(s) effected.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void getAllPeople() {
		String sql = "SELECT * FROM `person`";
		try(
				Statement st = connection.createStatement()
		) {
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				StringBuilder sb = new StringBuilder();
				sb.append(rs.getInt(1))
				.append("->")
				.append(rs.getString(2))
				.append("->")
				.append(rs.getInt(3));
				System.out.println(sb.toString());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void updatePersonById(int id, Person p) {
		String sql = "UPDATE `person` SET `name`=?, `age`=? where id=?";
		try(
			PreparedStatement st = connection.prepareStatement(sql)
		){
			st.setString(1, p.getName());
			st.setInt(2, p.getAge());
			st.setInt(3, id);
			int rowCount = st.executeUpdate();
			System.out.println(rowCount > 0? "Updated" : "Not Updated");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public void deletePersonById(int id) {
		String sql = "DELETE FROM `person` WHERE `id`=?";
		try(
				PreparedStatement preSt = connection.prepareStatement(sql)
		){
			preSt.setInt(1, id);
			int rowCount = preSt.executeUpdate();
			System.out.println(rowCount > 0 ? "Deleted" : "Not Deleted");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
