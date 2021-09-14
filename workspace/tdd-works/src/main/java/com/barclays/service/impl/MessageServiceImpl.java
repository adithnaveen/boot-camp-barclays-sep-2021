package com.barclays.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.barclays.interfaces.IMessageService;

// this is skeleton 
public class MessageServiceImpl {
	
	private IMessageService messageServcie; 
	
	public MessageServiceImpl(IMessageService messageServcie) {
		this.messageServcie = messageServcie; 
	}
	
	public List<String> getMessagesFromAuthor(String author) {
		List<String> messages = messageServcie.getMessages(author);
		
		List<String> filteredMessage = new ArrayList(); 
		for(String message: messages) {
			if(message.contains(author)) {
				filteredMessage.add(message);
			}
		}
		return filteredMessage;
	}
	
}
