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

public class Device
{
	private Integer  deviceId;
	private Integer  gasLevel;
	private Integer  temperature;
	private Date creationTime;
	
	public Integer  getDeviceId()
	{
		return this.deviceId;
	}
	
	public void setDeviceId(Integer  deviceId)
	{
		this.deviceId = deviceId;
	}
	
	public Integer  getGasLevel()
	{
		return this.gasLevel;
	}
	
	public void setGasLevel(Integer  gasLevel)
	{
		this.gasLevel = gasLevel;
	}
	
	public Integer  getTemperature()
	{
		return this.temperature;
	}
	
	public void setTemperature(Integer  temperature)
	{
		this.temperature = temperature;
	}
	
	public Date getCreationTime()
	{
		return this.creationTime;
	}
	
	public void setCreationTime(Date creationTime)
	{
		this.creationTime = creationTime;
	}
	
	
	public Device(Integer  gasLevel, Integer  temperature)
	{
		this.gasLevel = gasLevel;
		this.temperature = temperature;
	}
	
	public Device()
	{
		this(
			0, //GasLevel
			0 //Temperature
		);
		this.deviceId = 0;
		this.creationTime = new Date(0);
	
	}
	

}
