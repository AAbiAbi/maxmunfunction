public class maxf{

    /** Returns the maximum value from m. */
    public static int max(int[] m) {
    	int l = m.length;
    	//int i = 1;
    	int max = m[0];
    	for(int i = 0; i < l ; i++){
    		if(m[i] > max){
    			max = m[i];
    		}

    	}
    	return max;

        //return 0;
    }
    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
       System.out.println(max(numbers));      
    }

}