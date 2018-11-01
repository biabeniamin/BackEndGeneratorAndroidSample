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

public class User
{
	private Integer  userId;
	private String username;
	private String password;
	private String email;
	private Integer  age;
	private String description;
	private String cNP;
	private Date dateOfBirth;
	private Date creationTime;
	
	public Integer  getUserId()
	{
		return this.userId;
	}
	
	public void setUserId(Integer  userId)
	{
		this.userId = userId;
	}
	
	public String getUsername()
	{
		return this.username;
	}
	
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	public String getPassword()
	{
		return this.password;
	}
	
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public String getEmail()
	{
		return this.email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public Integer  getAge()
	{
		return this.age;
	}
	
	public void setAge(Integer  age)
	{
		this.age = age;
	}
	
	public String getDescription()
	{
		return this.description;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}
	
	public String getCNP()
	{
		return this.cNP;
	}
	
	public void setCNP(String cNP)
	{
		this.cNP = cNP;
	}
	
	public Date getDateOfBirth()
	{
		return this.dateOfBirth;
	}
	
	public void setDateOfBirth(Date dateOfBirth)
	{
		this.dateOfBirth = dateOfBirth;
	}
	
	public Date getCreationTime()
	{
		return this.creationTime;
	}
	
	public void setCreationTime(Date creationTime)
	{
		this.creationTime = creationTime;
	}
	
	
	public User(String username, String password, String email, Integer  age, String description, String cNP, Date dateOfBirth)
	{
		this.username = username;
		this.password = password;
		this.email = email;
		this.age = age;
		this.description = description;
		this.cNP = cNP;
		this.dateOfBirth = dateOfBirth;
	}
	
	public User()
	{
		this(
			"Test", //Username
			"Test", //Password
			"Test", //Email
			0, //Age
			"Test", //Description
			"Test", //CNP
			new Date(0) //DateOfBirth
		);
		this.userId = 0;
		this.creationTime = new Date(0);
	
	}
	

}
