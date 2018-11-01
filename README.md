## New project

Create new project in Android Studio for version >= Android 6.0

## Import Retrofit

Right-Click on app in project explorer, New->Module. Select "Import Jar/.AAR Package" -> Select the path of retrofit jar file ->  Finish the wizard

## Add the compile dependencies

Add in build.gradle in dependencies following lines

implementation 'com.squareup.retrofit2:retrofit:2.4.0'
implementation 'com.google.code.gson:gson:2.6.2'
implementation 'com.squareup.retrofit2:converter-gson:2.1.0'

## Add The internet access

In Android Manifest add the internet access
<uses-permission android:name="android.permission.INTERNET" />

## Create new package

Right click on java in project explorer -> New -> Package -> select the main folder in directory structure -> Add the followiung package name
com.example.biabe.DatabaseFunctionsGenerator

## Copy services and adapters

Copy from generated results the controller folder in the new package folder and the models folder(with folder)

## Copy layouts

If you want to display data in a list view, copy the generated files from layouts into the res/layout in android project.

## Display data from api into ui with a list view

To display data from api into ui, create a simple list view in main layout, get it into activity by id:

final ListView listView = (ListView) findViewById(R.id.listView);

Add the event handler to handle data received from server

Users.getUsers(new Callback<List<User>>() {
    @Override
    public void onResponse(Call<List<User>> call, Response<List<User>> response) {
	List<User> users = response.body();
	listView.setAdapter(new UserAdapter(users,getApplicationContext()));
	//Toast.makeText(MainActivity.this, "not error", Toast.LENGTH_LONG).show();

	//List<User> test=Users.getUsersByUsernamePassword("Test2", "Test");
    }

    @Override
    public void onFailure(Call<List<User>> call, Throwable t) {
	Toast.makeText(MainActivity.this, "error", Toast.LENGTH_LONG).show();
    }
});

## Import app main package in Adapters

Import app main package in Adapters to finds the ids for text boxes
import com.example.biabe.backendgeneratorandroidsample.R;

