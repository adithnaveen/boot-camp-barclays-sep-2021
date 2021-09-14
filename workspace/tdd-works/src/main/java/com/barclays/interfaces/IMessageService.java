package com.barclays.interfaces;

import java.util.List;

// POST, PUT, GET, DELETE 
public interface IMessageService {
	
	public List<String> getMessages(String author);
	
	public boolean deleteMessage(String author); 
	
	public String insertMessage(String message); 
	
	public String updateMessage(String message);
}
