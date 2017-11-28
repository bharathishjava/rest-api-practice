package com.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.model.Message;
import com.services.MessageService;

@Path("messages")
public class MessageResource {

	private final MessageService messageService = new MessageService();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getAllMessage(){
		return messageService.getAllMessages();
	}
}
