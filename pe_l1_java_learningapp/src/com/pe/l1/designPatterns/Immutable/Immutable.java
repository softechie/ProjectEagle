package com.pe.l1.designPatterns.Immutable;

import java.util.Date;

public class Immutable {
	private final String username;
	private final String password;

	private final Date creationDate;

	private Immutable(UserBuilder builder) {
		this.username = builder.username;
		this.password = builder.password;
		this.creationDate = builder.creationDate;
		
	}

	public static class UserBuilder {
		private final String username;
		private final String password;
		private final Date creationDate;
		

		public UserBuilder(String username, String password) {
			this.username = username;
			this.password = password;
			this.creationDate = new Date();
		}

	

		public Immutable build() {
			//IDIOM:Item-0373: Immutable use builder pattern

			System.out.println("----OUTPUT----");
			System.out.println("--In Immuatble Builder pattern method--\n");
			return new Immutable(this);
			
		}
	}

	public String getUsername() {
		
		return username;
	}

	public String getPassword() {
		return password;
	}



	public Date getCreationDate() {
		return new Date(creationDate.getTime());
	}
}