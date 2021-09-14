package com.barclays.mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.barclays.interfaces.IMessageService;
import com.barclays.service.impl.MessageServiceImpl;


@ExtendWith(MockitoExtension.class)
class MessageServiceMockAnnotationTest {
	
	@Mock
	IMessageService service;
	
	@InjectMocks
	MessageServiceImpl messageService; 
	
	@Test
	void messgeServiceImplMockTestWithMockWithAnnotation() {

		List<String> asList = Arrays.asList("first message from krishna", "Another message from Ayushi",
				"new book lauched by krishna", "testng message by amogh");
		
		when(service.getMessages("krishna")).thenReturn(asList);
		List<String> list = messageService.getMessagesFromAuthor("krishna");
		assertEquals(2, list.size());
	}
 
}











