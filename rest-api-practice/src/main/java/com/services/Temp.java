package com.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.database.Database;
import com.model.Message;

public class Temp {

	public static void main(String[] args) {
		List<Message> list = getAllMessages();
		list.forEach(m -> System.out.println(m));
	}

	public static List<Message> getAllMessages() {
		Map<Long, Message> messages = Database.getMessages();
		List<Message> list = Arrays.asList(new Message(1, "Message1", "Bharathish", LocalDate.of(2005, 01, 01)),
				new Message(2, "Message2", "Bharathish", LocalDate.of(2005, 01, 01)),
				new Message(3, "Message2", "Bharathish", LocalDate.of(2005, 01, 01)));
		list.forEach(m -> messages.put(m.getId(), m));
		return new ArrayList<Message>(messages.values());
	}
}
