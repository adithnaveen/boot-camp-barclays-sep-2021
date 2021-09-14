package com.barclays.mock;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*; 

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ListMockTest {

	@Test
	void testListSize() {
		List<String> list = new ArrayList(); 
		list.add("Ayushi");
		list.add("Naman");
		
		assertEquals(2, list.size());
		
	}
	
	
	// 	mock 
	@Test
	void mockTestListSize() {
		List<String> list =  mock(List.class);
		 
		when(list.size()).thenReturn(10);
		assertEquals(10, list.size());
	}

	@Test
	void mockTestListNames() {
		List<String> list =  mock(List.class);
		when(list.get(1)).thenReturn("Sujeeth"); 
		assertEquals("Sujeeth", list.get(1));
	}

	@Test
	void mockTestListNames1() {
		List<String> list =  mock(List.class);
		when(list.get(anyInt())).thenReturn("Sujeeth").thenReturn("Adhamya");
		assertEquals("Sujeeth", list.get(10));
		assertEquals("Adhamya", list.get(4));
	}
	
	@Test
	void mockToThrowException() {
		List<String> list =  mock(List.class);
		when(list.get(0)).thenThrow(new RuntimeException("Some Exception Message"));
		Assertions.assertThrows(RuntimeException.class, () -> list.get(0));
	}
}








