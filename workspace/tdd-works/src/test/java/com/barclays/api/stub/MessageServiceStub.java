package com.barclays.api.stub;

import java.util.Arrays;
import java.util.List;

import com.barclays.interfaces.IMessageService;

public class MessageServiceStub implements IMessageService {

	// assume that this method will connect to db and get the data 
	@Override
	public List<String> getMessages(String author) {
		List<String> asList = Arrays.asList("first message from krishna", "Another message from Ayushi",
				"new book lauched by krishna", "testng message by amogh");

		return asList;
	}

	// this is dummy implementation 
	@Override
	public boolean deleteMessage(String author) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String insertMessage(String message) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateMessage(String message) {
		// TODO Auto-generated method stub
		return null;
	}
 

}
