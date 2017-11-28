package com.database;

import java.util.HashMap;
import java.util.Map;

import com.model.Message;
import com.model.Profile;

public class Database {

	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<Long, Profile> profiles = new HashMap<>();
	
	public static Map<Long, Message> getMessages() {
		return messages;
	}
	public static void setMessages(Map<Long, Message> messages) {
		Database.messages = messages;
	}
	public static Map<Long, Profile> getProfiles() {
		return profiles;
	}
	public static void setProfiles(Map<Long, Profile> profiles) {
		Database.profiles = profiles;
	}
	
}
