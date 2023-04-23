package sef.module8.activity;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Thsi class represents a simple representation of an account encapsulating
 * a name 
 * 
 * @author Rey Victor Mendillo
 *
 */
public class Account {

	private String name;

	/**
	 * Creates an Account object with the specified name.  If the accout name
	 * given violates the minimum requirements, then an AccountException is thrown
	 * 
	 * @param accountName
	 * @throws AccountException
	 */
	public  Account(String accountName) throws AccountException{
			if (accountName.length() <= 4)
				throw new AccountException(AccountException.NAME_TOO_SHORT, accountName);
			if (!Pattern.matches("[a-zA-Z0-9]*", accountName))
				throw new AccountException(AccountException.NAME_TOO_SIMPLE, accountName);
			this.name = accountName;

	}
	
	
	/**
	 * Returns the account name
	 * 
	 * @return the account name
	 */
	public String getName(){
		return name;
	}
}
