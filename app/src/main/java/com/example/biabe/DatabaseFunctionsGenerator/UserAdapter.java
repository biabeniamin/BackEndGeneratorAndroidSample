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
		TextView usernameTextBox;
		TextView passwordTextBox;
		TextView emailTextBox;
		TextView ageTextBox;
		TextView descriptionTextBox;
		TextView cNPTextBox;
		TextView dateOfBirthTextBox;
		TextView creationTimeTextBox;
		
		user = getItem(position);
		
		if(null == convertView)
		{
			convertView = LayoutInflater.from(context).inflate(R.layout.user_view, parent, false);
		}
		
		userIdTextBox = (TextView) convertView.findViewById(R.id.userIdTextBox);
		usernameTextBox = (TextView) convertView.findViewById(R.id.usernameTextBox);
		passwordTextBox = (TextView) convertView.findViewById(R.id.passwordTextBox);
		emailTextBox = (TextView) convertView.findViewById(R.id.emailTextBox);
		ageTextBox = (TextView) convertView.findViewById(R.id.ageTextBox);
		descriptionTextBox = (TextView) convertView.findViewById(R.id.descriptionTextBox);
		cNPTextBox = (TextView) convertView.findViewById(R.id.cNPTextBox);
		dateOfBirthTextBox = (TextView) convertView.findViewById(R.id.dateOfBirthTextBox);
		creationTimeTextBox = (TextView) convertView.findViewById(R.id.creationTimeTextBox);
		
		userIdTextBox.setText(user.getUserId().toString());
		usernameTextBox.setText(user.getUsername());
		passwordTextBox.setText(user.getPassword());
		emailTextBox.setText(user.getEmail());
		ageTextBox.setText(user.getAge().toString());
		descriptionTextBox.setText(user.getDescription());
		cNPTextBox.setText(user.getCNP());
		dateOfBirthTextBox.setText(user.getDateOfBirth().toString());
		creationTimeTextBox.setText(user.getCreationTime().toString());
		
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
