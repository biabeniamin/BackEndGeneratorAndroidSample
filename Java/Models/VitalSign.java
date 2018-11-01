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

public class VitalSign
{
	private Integer  vitalSignId;
	private Integer  userId;
	private String deviceName;
	private Integer  pulse;
	private Integer  bodyTemperature;
	private Date creationTime;
	private User user;
	
	public Integer  getVitalSignId()
	{
		return this.vitalSignId;
	}
	
	public void setVitalSignId(Integer  vitalSignId)
	{
		this.vitalSignId = vitalSignId;
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
	
	public Integer  getPulse()
	{
		return this.pulse;
	}
	
	public void setPulse(Integer  pulse)
	{
		this.pulse = pulse;
	}
	
	public Integer  getBodyTemperature()
	{
		return this.bodyTemperature;
	}
	
	public void setBodyTemperature(Integer  bodyTemperature)
	{
		this.bodyTemperature = bodyTemperature;
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
	
	
	public VitalSign(Integer  userId, String deviceName, Integer  pulse, Integer  bodyTemperature)
	{
		this.userId = userId;
		this.deviceName = deviceName;
		this.pulse = pulse;
		this.bodyTemperature = bodyTemperature;
	}
	
	public VitalSign(Integer  userId, String deviceName, Integer  pulse, Integer  bodyTemperature, User user)
	{
		this(
			0, //UserId
			"Test", //DeviceName
			0, //Pulse
			0 //BodyTemperature
		);
		this.user = user;
	
	}
	
	public VitalSign()
	{
		this(
			0, //UserId
			"Test", //DeviceName
			0, //Pulse
			0 //BodyTemperature
		);
		this.vitalSignId = 0;
		this.creationTime = new Date(0);
	
	}
	

}
