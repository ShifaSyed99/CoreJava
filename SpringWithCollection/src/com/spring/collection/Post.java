package com.spring.collection;

import java.util.Iterator;
import java.util.List;

public class Post {
	
	private int postId;
	
	private String postName;
	
	private List<String> comments;

	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Post(int postId, String postName, List<String> comments) {
		super();
		this.postId = postId;
		this.postName = postName;
		this.comments = comments;
	}
	
	public void show()
	{
		System.out.println("Post ID is "+postId+"\n Post Name is "+postName);
		
		System.out.println("Comments are : ");
		
		Iterator<String> itr = comments.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
