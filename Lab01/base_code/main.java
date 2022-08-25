import pkg.*;
import java.util.*;
import java.io.*;       

class main {        // This should be all that is in your main.java file.
	public static void main(String args[]) throws FileNotFoundException {
        BBoard myBoard = new BBoard("Rohins Amazing BBoard");          // Feel free to change the name.
        myBoard.loadUsers(args[0]);
        myBoard.run();

        // Feel free to add code for testing purposes. 
        Message hi = new Message("ro", "hi", "hi", 1);
        hi.addChild(new Reply("hi", "ro", "rohin", 2));
        hi.addChild(new Reply("hisdf", "rdfssdfo", "rohisfdsdfn", 3));
        hi.print(2);

        // Examine data.txt for example Messages displayed from the BBoard

        // Examine users.txt for the format of users and their passwords. 
	}
}
