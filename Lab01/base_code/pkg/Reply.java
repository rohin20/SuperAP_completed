package pkg;
import java.util.*;
import java.io.*;

public class Reply extends Message {

	// Default Constructor
	public Reply() {

	}

	// Parameterized Constructor
	public Reply(String auth, String subj, String bod, int i) {
		author = auth;
		sub = subj;
		body = bod;
		id = i;
		
	}

	// Returns if this is a reply (true)
	public boolean isReply(){
		return true;
	}
}
