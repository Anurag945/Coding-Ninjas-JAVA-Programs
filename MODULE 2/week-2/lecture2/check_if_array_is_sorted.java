package lecture2;

public class check_if_array_is_sorted {

public static boolean checksorted(int input[]){
          
		if(input.length <= 1){
			return true;
		}
		
		int smallInput[] = new int[input.length - 1];
		for(int i = 1; i < input.length; i++){
			smallInput[i - 1] = input[i];
		}
		
		boolean smallAns = checksorted(smallInput);
		if(!smallAns){
			return false;
		}
		if(input[0] <= input[1]){
			return true;
		}else{
			return false;
		}
		
	}


}

    

