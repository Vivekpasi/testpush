package com.limetray.app;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

 public class user_creation_run {
  @SuppressWarnings("static-access")
@Test(priority=0)
  
public void user_creation_testng() {
	  
   User_create user_create_object = new User_create();
   
   user_create_object.user_creation();
  
  }
/*
@SuppressWarnings("static-access")

@Test(priority=1)
public void user_creation_send_email()
{
	try 
	{
  send_email_api_output email_sent_creation_obj = new send_email_api_output();
  
  email_sent_creation_obj.auto_email_user_create();
  
	}catch(Exception e){System.out.println(e);}
}
*/
}
