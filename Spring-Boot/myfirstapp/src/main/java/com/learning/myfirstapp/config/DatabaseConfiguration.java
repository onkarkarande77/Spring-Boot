package com.learning.myfirstapp.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

  
@ConfigurationProperties(prefix="db-service")//it help to inject the value from the properties file by using this prefix
@Component  //this create instance of this class(ClasName n1=new ClassName())
public class DatabaseConfiguration {
private String url;
private String username;
private String password;

public DatabaseConfiguration() {
	super();
	// TODO Auto-generated constructor stub
}

public DatabaseConfiguration(String url, String username, String password) {
	super();
	this.url = url;
	this.username = username;
	this.password = password;
}

public String getUrl() {
	return url;
}

public void setUrl(String url) {
	this.url = url;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}



}
