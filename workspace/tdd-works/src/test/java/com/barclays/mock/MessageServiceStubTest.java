package com.barclays.mock;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.barclays.api.stub.MessageServiceStub;
import com.barclays.interfaces.IMessageService;
import com.barclays.service.impl.MessageServiceImpl;

class MessageServiceStubTest {

	@Test
	void testMessageImplWithStubs() {
	 
		IMessageService messageService  = new MessageServiceStub();
		
		MessageServiceImpl msImpl = new MessageServiceImpl(messageService);
		
		List<String> list = msImpl.getMessagesFromAuthor("krishna");
		
		assertEquals(2, list.size());
	}
}
