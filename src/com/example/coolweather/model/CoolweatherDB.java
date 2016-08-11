package com.example.coolweather.model;

import com.example.coolweather.db.Coolweatheropenhelper;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class CoolweatherDB {
	public static final String DB_NAME ="Cool_weather";
	
	public static final int VERSON=1;
	
	private static CoolweatherDB coolweatherDB;
	private SQLiteDatabase db;
	
	public CoolweatherDB(SQLiteDatabase db) {
		Context context = null;
		Coolweatheropenhelper dbhelper =new Coolweatheropenhelper(context,DB_NAME,null,VERSON);
		db=dbhelper.getWritableDatabase();
	}
	
	public synchronized static CoolweatherDB getInstance(Context context)
	{
		if (coolweatherDB=null)
		{
			
		}
	}
	
	
}
