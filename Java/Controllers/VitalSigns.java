//generated automatically
package com.example.biabe.DatabaseFunctionsGenerator;
import com.example.biabe.DatabaseFunctionsGenerator.Models.*;
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
interface VitalSignService
{
	@GET("VitalSigns.php?cmd=getVitalSigns")
	Call<List<VitalSign>> getVitalSigns();
	
	@GET("VitalSigns.php?cmd=getVitalSignsByDeviceName")
	Call<List<VitalSign>> getVitalSignsByDeviceName(@Query("deviceName")String deviceName);
	
	@GET("VitalSigns.php?cmd=getVitalSignsByVitalSignId")
	Call<List<VitalSign>> getVitalSignsByVitalSignId(@Query("vitalSignId")Integer  vitalSignId);
	
	@POST("VitalSigns.php?cmd=addVitalSign")
	Call<VitalSign> addVitalSign(@Body VitalSign vitalSign);

}

public class VitalSigns
{
	public static List<VitalSign> getVitalSigns(Call<List<VitalSign>> call)
	{
		List<VitalSign> vitalSigns;
		
		vitalSigns = null;
		
		try
		{
			vitalSigns = call.execute().body();
		}
		catch(Exception ee)
		{
			System.out.println(ee.getMessage());
		}
		
		return vitalSigns;
	
	}
	public static List<VitalSign> getVitalSigns()
	{
		List<VitalSign> vitalSigns;
		VitalSignService service;
		Call<List<VitalSign>> call;
		
		vitalSigns = null;
		
		service = RetrofitInstance.GetRetrofitInstance().create(VitalSignService.class);
		try
		{
			call = service.getVitalSigns();
			vitalSigns = getVitalSigns(call);
		}
		catch(Exception ee)
		{
			System.out.println(ee.getMessage());
		}
		
		return vitalSigns;
	
	}
	
	public static List<VitalSign> getVitalSignsByDeviceName(String deviceName)
	{
		List<VitalSign> vitalSigns;
		VitalSignService service;
		Call<List<VitalSign>> call;
		
		vitalSigns = null;
		
		service = RetrofitInstance.GetRetrofitInstance().create(VitalSignService.class);
		try
		{
			call = service.getVitalSignsByDeviceName(deviceName);
			vitalSigns = getVitalSigns(call);
		}
		catch(Exception ee)
		{
			System.out.println(ee.getMessage());
		}
		
		return vitalSigns;
	
	}
	
	public static List<VitalSign> getVitalSignsByVitalSignId(Integer  vitalSignId)
	{
		List<VitalSign> vitalSigns;
		VitalSignService service;
		Call<List<VitalSign>> call;
		
		vitalSigns = null;
		
		service = RetrofitInstance.GetRetrofitInstance().create(VitalSignService.class);
		try
		{
			call = service.getVitalSignsByVitalSignId(vitalSignId);
			vitalSigns = getVitalSigns(call);
		}
		catch(Exception ee)
		{
			System.out.println(ee.getMessage());
		}
		
		return vitalSigns;
	
	}
	
	
	public static void getVitalSigns(Call<List<VitalSign>> call, Callback<List<VitalSign>> callback)
	{
		try
		{
			call.enqueue(callback);
		}
		catch(Exception ee)
		{
			System.out.println(ee.getMessage());
		}
		
	
	}
	public static void getVitalSigns(Callback<List<VitalSign>> callback)
	{
		List<VitalSign> vitalSigns;
		VitalSignService service;
		Call<List<VitalSign>> call;
		
		vitalSigns = null;
		
		service = RetrofitInstance.GetRetrofitInstance().create(VitalSignService.class);
		try
		{
			call = service.getVitalSigns();
			getVitalSigns(call, callback);
		}
		catch(Exception ee)
		{
			System.out.println(ee.getMessage());
		}
		
	
	}
	
	public static void getVitalSignsByDeviceName(String deviceName, Callback<List<VitalSign>> callback)
	{
		List<VitalSign> vitalSigns;
		VitalSignService service;
		Call<List<VitalSign>> call;
		
		vitalSigns = null;
		
		service = RetrofitInstance.GetRetrofitInstance().create(VitalSignService.class);
		try
		{
			call = service.getVitalSignsByDeviceName(deviceName);
			getVitalSigns(call, callback);
		}
		catch(Exception ee)
		{
			System.out.println(ee.getMessage());
		}
		
	
	}
	
	public static void getVitalSignsByVitalSignId(Integer  vitalSignId, Callback<List<VitalSign>> callback)
	{
		List<VitalSign> vitalSigns;
		VitalSignService service;
		Call<List<VitalSign>> call;
		
		vitalSigns = null;
		
		service = RetrofitInstance.GetRetrofitInstance().create(VitalSignService.class);
		try
		{
			call = service.getVitalSignsByVitalSignId(vitalSignId);
			getVitalSigns(call, callback);
		}
		catch(Exception ee)
		{
			System.out.println(ee.getMessage());
		}
		
	
	}
	
	
	public static VitalSign addVitalSign(VitalSign vitalSign)
	{
		VitalSignService service;
		Call<VitalSign> call;
		
		
		service = RetrofitInstance.GetRetrofitInstance().create(VitalSignService.class);
		try
		{
			call = service.addVitalSign(vitalSign);
			vitalSign = call.execute().body();
		}
		catch(Exception ee)
		{
			System.out.println(ee.getMessage());
		}
		
		return vitalSign;
	
	}
	
	public static void addVitalSign(VitalSign vitalSign, Callback<VitalSign> callback)
	{
		VitalSignService service;
		Call<VitalSign> call;
		
		
		service = RetrofitInstance.GetRetrofitInstance().create(VitalSignService.class);
		try
		{
			call = service.addVitalSign(vitalSign);
			call.enqueue(callback);
		}
		catch(Exception ee)
		{
			System.out.println(ee.getMessage());
		}
	
	}
	

}
