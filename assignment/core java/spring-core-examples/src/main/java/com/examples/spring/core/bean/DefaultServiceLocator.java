package com.examples.spring.core.bean;

public class DefaultServiceLocator {
	
	GreetingService greetingService = new GreetingService();
	AccountService accountService = new AccountService();
	
	public GreetingService createGreetingService()
	{
		return greetingService;
	}
	
	public AccountService createAccountService()
	{
		return accountService;
	}	

}

// creation of bean by service locator class
// geeting service cant be created directly
// greeting service assigned to gretting service id
