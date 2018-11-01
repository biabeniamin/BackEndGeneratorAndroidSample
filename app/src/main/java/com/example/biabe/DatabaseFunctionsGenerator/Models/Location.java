//generated automatically
package com.example.biabe.DatabaseFunctionsGenerator.Models;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.POST;
import retrofit2.http.Body;
import java.util.Date;

public class Location
{
	private Integer  locationId;
	private Integer  userId;
	private String deviceName;
	private Integer  x;
	private Integer  y;
	private Date creationTime;
	private User user;
	
	public Integer  getLocationId()
	{
		return this.locationId;
	}
	
	public void setLocationId(Integer  locationId)
	{
		this.locationId = locationId;
	}
	
	public Integer  getUserId()
	{
		return this.userId;
	}
	
	public void setUserId(Integer  userId)
	{
		this.userId = userId;
	}
	
	public String getDeviceName()
	{
		return this.deviceName;
	}
	
	public void setDeviceName(String deviceName)
	{
		this.deviceName = deviceName;
	}
	
	public Integer  getX()
	{
		return this.x;
	}
	
	public void setX(Integer  x)
	{
		this.x = x;
	}
	
	public Integer  getY()
	{
		return this.y;
	}
	
	public void setY(Integer  y)
	{
		this.y = y;
	}
	
	public Date getCreationTime()
	{
		return this.creationTime;
	}
	
	public void setCreationTime(Date creationTime)
	{
		this.creationTime = creationTime;
	}
	
	public User getUser()
	{
		return this.user;
	}
	
	public void setUser(User user)
	{
		this.user = user;
	}
	
	
	public Location(Integer  userId, String deviceName, Integer  x, Integer  y)
	{
		this.userId = userId;
		this.deviceName = deviceName;
		this.x = x;
		this.y = y;
	}
	
	public Location(Integer  userId, String deviceName, Integer  x, Integer  y, User user)
	{
		this(
			0, //UserId
			"Test", //DeviceName
			0, //X
			0 //Y
		);
		this.user = user;
	
	}
	
	public Location()
	{
		this(
			0, //UserId
			"Test", //DeviceName
			0, //X
			0 //Y
		);
		this.locationId = 0;
		this.creationTime = new Date(0);
	
	}
	

}
