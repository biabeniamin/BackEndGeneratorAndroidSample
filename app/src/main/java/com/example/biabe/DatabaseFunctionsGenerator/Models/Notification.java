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

public class Notification
{
	private Integer  notificationId;
	private Integer  deviceOrWatch;
	private String title;
	private String message;
	private Date creationTime;
	
	public Integer  getNotificationId()
	{
		return this.notificationId;
	}
	
	public void setNotificationId(Integer  notificationId)
	{
		this.notificationId = notificationId;
	}
	
	public Integer  getDeviceOrWatch()
	{
		return this.deviceOrWatch;
	}
	
	public void setDeviceOrWatch(Integer  deviceOrWatch)
	{
		this.deviceOrWatch = deviceOrWatch;
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public String getMessage()
	{
		return this.message;
	}
	
	public void setMessage(String message)
	{
		this.message = message;
	}
	
	public Date getCreationTime()
	{
		return this.creationTime;
	}
	
	public void setCreationTime(Date creationTime)
	{
		this.creationTime = creationTime;
	}
	
	
	public Notification(Integer  deviceOrWatch, String title, String message)
	{
		this.deviceOrWatch = deviceOrWatch;
		this.title = title;
		this.message = message;
	}
	
	public Notification()
	{
		this(
			0, //DeviceOrWatch
			"Test", //Title
			"Test" //Message
		);
		this.notificationId = 0;
		this.creationTime = new Date(0);
	
	}
	

}
