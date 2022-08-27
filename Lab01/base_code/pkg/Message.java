package pkg;
import java.util.*;
import java.io.*;

public class Message {

	// Default Constructor
	public String author;
	public String sub;
	public String body;
	public int id;
	int i = 0;
	public ArrayList<Message> childList = new ArrayList<Message>();
	public Message() {
		author = "";
		sub = "";
		body = "";
		id = 0;
	}
	
	// Parameterized Constructor
	public Message(String auth, String subj, String bod, int i) {
		author = auth;
		sub = subj;
		body = bod;
		id = i;
	}

	// This function is responsbile for printing the Message
	// (whether Topic or Reply), and all of the Message's "subtree" recursively:

	// After printing the Message with indentation n and appropriate format (see output details),
	// it will invoke itself recursively on all of the Replies inside its childList, 
	// incrementing the indentation value at each new level.

	// Note: Each indentation increment represents 2 spaces. e.g. if indentation ==  1, the reply should be indented 2 spaces, 
	// if it's 2, indent by 4 spaces, etc. 
	public void print(int indentation){
		System.out.println("helllooootest");

	}


	// Default function for inheritance
	public boolean isReply(){
		if(this instanceof Reply){
			return true;

		}
		return false;
	}

	// Returns the subject String
	public String getSubject(){
		return sub;
	
	} 

	// Returns the ID
	public int getId(){
		return id;
	}

	// Adds a child pointer to the parent's childList.
	public void addChild(Message child){
		childList.add(child);
	}

}
