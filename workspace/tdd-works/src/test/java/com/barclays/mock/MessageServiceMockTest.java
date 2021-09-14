package com.barclays.mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.barclays.interfaces.IMessageService;
import com.barclays.service.impl.MessageServiceImpl;

class MessageServiceMockTest {

	@Test
	void messgeServiceImplMockTestWithMock() {
		
		List<String> asList = Arrays.asList("first message from krishna", "Another message from Ayushi",
				"new book lauched by krishna", "testng message by amogh");
		
		IMessageService service = mock(IMessageService.class); 
		
		// bdd style to get the value which we need 
		when(service.getMessages("krishna")).thenReturn(asList);
		
		MessageServiceImpl messageServiceImpl = new MessageServiceImpl(service); 
		List<String> list = messageServiceImpl.getMessagesFromAuthor("krishna");
		
		assertEquals(2, list.size());
		
	}

}
