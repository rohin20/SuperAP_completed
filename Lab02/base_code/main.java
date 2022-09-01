import pkg.*;
import java.util.*;
import java.time.*;
import java.lang.*;


class main {
	static final long createdNano = System.nanoTime();

	public static void main(String args[]) {
		
		long start = System.nanoTime();
		long finish = System.nanoTime();
		System.out.println("Created: " + createdNano);
		
		int [] times = {10, 100, 1000, 10000, 100000, 1000000, 10000000};
		int [] nums = new int[100];


		System.out.println("-------------------Test-------------------");
		System.out.println("");
		for(int i : times){
			System.out.println("Interval: " + i);
			
			nums = new int[i];
			start = System.nanoTime();

			//  Put your method between these two comments
			BaseClass boy = new BaseClass();
			//boy.bubblesort(nums);

			//boy.selectionsort(nums);

			boy.insertionsort(nums);
			



			//😀😀

			finish = System.nanoTime();
			System.out.println("Started: " + start);
			System.out.println("Finished: " + finish);
			System.out.println("Duration: " + (finish-start));
			System.out.println("");
		}
	}
}


// bubble sort
// Interval: 10
// Started: 442339578455208
// Finished: 442339578987291
// Duration: 532083

// Interval: 100
// Started: 442339579663708
// Finished: 442339579923208
// Duration: 259500

// Interval: 1000
// Started: 442339579982791
// Finished: 442339585991958
// Duration: 6009167

// Interval: 10000
// Started: 442339586085000
// Finished: 442339609034500
// Duration: 22949500

// Interval: 100000
// Started: 442339609321500
// Finished: 442341613531750
// Duration: 2004210250

// Interval: 1000000
// Started: 442341615069166
// Finished: 442542183151625
// Duration: 200568082459

// Interval: 10000000


// selectionsort
// Interval: 10
// Started: 445776583980417
// Finished: 445776584625375
// Duration: 644958

// Interval: 100
// Started: 445776585432958
// Finished: 445776585551750
// Duration: 118792

// Interval: 1000
// Started: 445776585613167
// Finished: 445776588299750
// Duration: 2686583

// Interval: 10000
// Started: 445776588423208
// Finished: 445776601368792
// Duration: 12945584

// Interval: 100000
// Started: 445776601616250
// Finished: 445777493294667
// Duration: 891678417

// Interval: 1000000
// Started: 445777494659958
// Finished: 445870052075750
// Duration: 92557415792

// Interval: 10000000




// insertionsort
// Interval: 10
// Started: 446018940635958
// Finished: 446018941236208
// Duration: 600250

// Interval: 100
// Started: 446018941835625
// Finished: 446018941841958
// Duration: 6333

// Interval: 1000
// Started: 446018941906125
// Finished: 446018941966083
// Duration: 59958

// Interval: 10000
// Started: 446018942039250
// Finished: 446018942587375
// Duration: 548125

// Interval: 100000
// Started: 446018942762292
// Finished: 446018946214708
// Duration: 3452416

// Interval: 1000000
// Started: 446018947267708
// Finished: 446018950055542
// Duration: 2787834

// Interval: 10000000
// Started: 446018959727833
// Finished: 446018965418417
// Duration: 5690584