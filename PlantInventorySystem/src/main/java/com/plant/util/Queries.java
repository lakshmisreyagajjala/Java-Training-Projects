package com.plant.util;

public class Queries {

	public static final String CREATEQUERY = 
			"create table plants (plantName varchar(30), plantId integer primary key, type varchar(30), species varchar(30), "
			+ "origin varchar(30), price float)";
	public static final String INSERTQUERY = 
			"insert into plants(plantName, plantId, type, species, origin, price) values(?,?,?,?,?,?)";
	public static final String UPDATEQUERY = 
			"update plants set type=? where plantId=?";
	public static final String DELETEQUERY = 
			"delete from plants where plantId=?";
	public static final String QUERYBYID = 
			"select * from plants where plantId=?";
	public static final String GETALLQUERY = 
			"select * from plants";
	public static final String QUERYBYORIGIN = 
			"select * from plants where origin=?";
	public static final String QUERYBYORIGINANDSPECIES = 
			"select * from plants where origin=? and species=?";
	public static final String QUERYBYORIGINANDPRICE = 
			"select * from plants where origin=? and price=?";
	
	


}

