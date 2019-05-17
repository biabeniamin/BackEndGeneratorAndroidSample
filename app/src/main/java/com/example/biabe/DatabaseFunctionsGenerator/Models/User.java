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
	private String nume;
	private String prenume;
	private String email;
	private String cNP;
	private String numberTelefon;
	private Date creationTime;
	
	public Integer  getUserId()
	{
		return this.userId;
	}
	
	public void setUserId(Integer  userId)
	{
		this.userId = userId;
	}
	
	public String getNume()
	{
		return this.nume;
	}
	
	public void setNume(String nume)
	{
		this.nume = nume;
	}
	
	public String getPrenume()
	{
		return this.prenume;
	}
	
	public void setPrenume(String prenume)
	{
		this.prenume = prenume;
	}
	
	public String getEmail()
	{
		return this.email;
	}
	
	public void setEmail(String email)
	{
		this.email = email;
	}
	
	public String getCNP()
	{
		return this.cNP;
	}
	
	public void setCNP(String cNP)
	{
		this.cNP = cNP;
	}
	
	public String getNumberTelefon()
	{
		return this.numberTelefon;
	}
	
	public void setNumberTelefon(String numberTelefon)
	{
		this.numberTelefon = numberTelefon;
	}
	
	public Date getCreationTime()
	{
		return this.creationTime;
	}
	
	public void setCreationTime(Date creationTime)
	{
		this.creationTime = creationTime;
	}
	
	
	public User(String nume, String prenume, String email, String cNP, String numberTelefon)
	{
		this.nume = nume;
		this.prenume = prenume;
		this.email = email;
		this.cNP = cNP;
		this.numberTelefon = numberTelefon;
	}
	
	public User()
	{
		this(
			"Test", //Nume
			"Test", //Prenume
			"Test", //Email
			"Test", //CNP
			"Test" //NumberTelefon
		);
		this.userId = 0;
		this.creationTime = new Date(0);
	
	}
	

}
