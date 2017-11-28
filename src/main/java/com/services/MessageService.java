package com.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.database.Database;
import com.model.Message;

public class MessageService {

	private Map<Long, Message> messages = Database.getMessages();

	public void addMessage(Message message) {
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
	}

	public List<Message> getAllMessages() {
		List<Message> list =Arrays.asList(new Message(1,"Message1","Bharathish",LocalDate.of(2005, 01, 01)),
				new Message(2,"Message2","Bharathish",LocalDate.of(2005, 01, 01)),
				new Message(3,"Message2","Bharathish",LocalDate.of(2005, 01, 01)));
		list.forEach(m-> messages.put(m.getId(), m));
		return new ArrayList<Message>(messages.values());
	}

	public Message getMessage(long id) {
		return messages.get(id);
	}

	public Message updateMessage(long id, Message message) {
		return messages.put(id, message);
	}
	
	public Message deleteMessage(long id) {
		return messages.remove(messages.get(id));
	}
}
