package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Model;

public class ModelTest {

	private Model model;	
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	char[] pf_password;
	
	
	@BeforeEach
	public void setUp() throws Exception {
		model = new Model();
		
		//user test
		username = "Test";
		password = "thisisatest";
		firstName = "Yoni";
		lastName = "Costa";
		email = "test@test.com";
		
		pf_password = new char[password.length()];
		for(int i =0 ; i < password.length() ; i++)
		{
			pf_password[i] = password.charAt(i);
		}
		
		model.addUser(username, firstName, lastName, pf_password, email);
		//
		
	}

	@AfterEach
	public void tearDown() throws Exception {
	}

	@Test
	public void userTest() {
		try
		{
			model.isUserExist(username, pf_password);
		}
		catch(Exception e)
		{
			e.getMessage();
			fail("Existing username not found");
		}
		
		try
		{
			model.isUserNameExist(username);
		}
		catch(Exception e)
		{
			e.getMessage();
			fail("Existing username not found");
		}
	}

}
