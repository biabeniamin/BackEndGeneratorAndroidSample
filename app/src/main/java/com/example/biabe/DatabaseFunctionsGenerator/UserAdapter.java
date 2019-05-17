//generated automatically
package com.example.biabe.DatabaseFunctionsGenerator;
import com.example.biabe.DatabaseFunctionsGenerator.Models.*;
import com.example.biabe.backendgeneratorandroidsample.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;
public class UserAdapter extends BaseAdapter
{
	List<User> users;
	Context context;
	
	@Override
	public int getCount()
	{
		return users.size();
	
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{
		User user;
		TextView userIdTextBox;
		TextView numeTextBox;
		TextView prenumeTextBox;
		TextView emailTextBox;
		TextView cNPTextBox;
		TextView numberTelefonTextBox;
		TextView creationTimeTextBox;
		
		user = getItem(position);
		
		if(null == convertView)
		{
			convertView = LayoutInflater.from(context).inflate(R.layout.user_view, parent, false);
		}
		
		userIdTextBox = (TextView) convertView.findViewById(R.id.userIdTextBox);
		numeTextBox = (TextView) convertView.findViewById(R.id.numeTextBox);
		prenumeTextBox = (TextView) convertView.findViewById(R.id.prenumeTextBox);
		emailTextBox = (TextView) convertView.findViewById(R.id.emailTextBox);
		cNPTextBox = (TextView) convertView.findViewById(R.id.cNPTextBox);
		numberTelefonTextBox = (TextView) convertView.findViewById(R.id.numberTelefonTextBox);
		creationTimeTextBox = (TextView) convertView.findViewById(R.id.creationTimeTextBox);
		
		userIdTextBox.setText(user.getUserId().toString());
		numeTextBox.setText(user.getNume());
		prenumeTextBox.setText(user.getPrenume());
		emailTextBox.setText(user.getEmail());
		cNPTextBox.setText(user.getCNP());
		numberTelefonTextBox.setText(user.getNumberTelefon());
		//creationTimeTextBox.setText(user.getCreationTime().toString());
		
		return convertView;
	
	}
	
	@Override
	public User getItem(int position)
	{
		return users.get(position);
	
	}
	
	@Override
	public long getItemId(int position)
	{
		return users.get(position).getUserId();
	
	}
	
	public UserAdapter(List<User> users, Context context)
	{
		this.users = users;
		this.context = context;
	
	}
	

}
