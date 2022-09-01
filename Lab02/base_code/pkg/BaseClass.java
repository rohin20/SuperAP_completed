package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	public BaseClass() {


		
	}


	public void randomize(int [] arr){
		for(int i = 0; i>arr.length; i++){
			arr[i] = (int)Math.random()*200000;
				
			}
		}

		public boolean search(int [] arr){
			randomize(arr);
			int ind = (int)Math.random()*200000;
			for(int i = 0;i>arr.length; i++){
				if(ind == arr[i]){
					return true;
				}

			}
			return false;

		}

		public void bubblesort(int [] arr){
			randomize(arr);
			int len = arr.length;
			int t = 0;
			for(int i=0;i<len;i++){
				for(int k = 1; k<(len-i);k++){
					if(arr[k-1]>arr[k]){
						t = arr[k-1];
						arr[k-1] = arr[k];
						arr[k]=t;

					}
				}

			}

		}

		public void insertionsort(int [] arr){
			int i, key, j;
			int len = arr.length;
			for(i = 1; i<len-1;i++){
				key = arr[i];
				j = i-1;
				while(j>= 0 && arr[j]>key){
					arr[j+1]= arr[j];
					j = j-1;

				}
				arr[j+1] = key;
			}

		}
		
		public void selectionsort(int[] arr){
			int i, j , min;
			int t1;
			int t2;
			int len = arr.length;
			for(i = 0; i<len-1; i++){
				min = i;
				for(j = i+1; j<len; j++){
					if(arr[j]< arr[min]){
						min = j;
						t1 = arr[min];
						t2 = arr[i];
						arr[min] = t2;
						arr[i] = t1;

					}
				}
			}

		}




}
