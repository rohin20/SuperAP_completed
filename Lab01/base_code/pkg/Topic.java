package pkg;
import java.util.*;
import java.io.*;

public class Topic extends Message {

	// Default Constructor

	public Topic() {

	}

	// Parameterized constructor
	public Topic(String auth, String subj, String bod, int i) {
		author = auth;
		sub = subj;
		body = bod;
		id = i;

	}

	// Returns if it's a reply (false)
	public boolean isReply(){

	}
}
