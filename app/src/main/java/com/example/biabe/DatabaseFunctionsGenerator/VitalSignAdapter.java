//generated automatically
package com.example.biabe.DatabaseFunctionsGenerator;
import com.example.biabe.DatabaseFunctionsGenerator.Models.*;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;
public class VitalSignAdapter extends BaseAdapter
{
	List<VitalSign> vitalSigns;
	Context context;
	
	@Override
	public int getCount()
	{
		return vitalSigns.size();
	
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{
		VitalSign vitalSign;
		TextView vitalSignIdTextBox;
		TextView userIdTextBox;
		TextView deviceNameTextBox;
		TextView pulseTextBox;
		TextView bodyTemperatureTextBox;
		TextView creationTimeTextBox;
		
		vitalSign = getItem(position);
		
		if(null == convertView)
		{
			convertView = LayoutInflater.from(context).inflate(R.layout.vitalsign_view, parent, false);
		}
		
		vitalSignIdTextBox = (TextView) convertView.findViewById(R.id.vitalSignIdTextBox);
		userIdTextBox = (TextView) convertView.findViewById(R.id.userIdTextBox);
		deviceNameTextBox = (TextView) convertView.findViewById(R.id.deviceNameTextBox);
		pulseTextBox = (TextView) convertView.findViewById(R.id.pulseTextBox);
		bodyTemperatureTextBox = (TextView) convertView.findViewById(R.id.bodyTemperatureTextBox);
		creationTimeTextBox = (TextView) convertView.findViewById(R.id.creationTimeTextBox);
		
		vitalSignIdTextBox.setText(vitalSign.getVitalSignId().toString());
		userIdTextBox.setText(vitalSign.getUserId().toString());
		deviceNameTextBox.setText(vitalSign.getDeviceName());
		pulseTextBox.setText(vitalSign.getPulse().toString());
		bodyTemperatureTextBox.setText(vitalSign.getBodyTemperature().toString());
		creationTimeTextBox.setText(vitalSign.getCreationTime().toString());
		
		return convertView;
	
	}
	
	@Override
	public VitalSign getItem(int position)
	{
		return vitalSigns.get(position);
	
	}
	
	@Override
	public long getItemId(int position)
	{
		return vitalSigns.get(position).getVitalSignId();
	
	}
	
	public VitalSignAdapter(List<VitalSign> vitalSigns, Context context)
	{
		this.vitalSigns = vitalSigns;
		this.context = context;
	
	}
	

}
