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

public class Watche
{
	private Integer  watcheId;
	private Integer  pulse;
	private Integer  step;
	private Integer  fall;
	private Integer  temperature;
	private Date creationTime;
	
	public Integer  getWatcheId()
	{
		return this.watcheId;
	}
	
	public void setWatcheId(Integer  watcheId)
	{
		this.watcheId = watcheId;
	}
	
	public Integer  getPulse()
	{
		return this.pulse;
	}
	
	public void setPulse(Integer  pulse)
	{
		this.pulse = pulse;
	}
	
	public Integer  getStep()
	{
		return this.step;
	}
	
	public void setStep(Integer  step)
	{
		this.step = step;
	}
	
	public Integer  getFall()
	{
		return this.fall;
	}
	
	public void setFall(Integer  fall)
	{
		this.fall = fall;
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
	
	
	public Watche(Integer  pulse, Integer  step, Integer  fall, Integer  temperature)
	{
		this.pulse = pulse;
		this.step = step;
		this.fall = fall;
		this.temperature = temperature;
	}
	
	public Watche()
	{
		this(
			0, //Pulse
			0, //Step
			0, //Fall
			0 //Temperature
		);
		this.watcheId = 0;
		this.creationTime = new Date(0);
	
	}
	

}
