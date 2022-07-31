
public class DeepAssign {
	private static void numberIsIncresingOrder(int i) {
		int numDig=0;
		int digit=1;
		while(i>0) {
			int lastdig=i%10;
			i=i/10;
			numDig=numDig+1;
            System.out.println(numDig);
			while(i>0) {
				int l=i%10;
				if(l<lastdig) {
					digit=digit+1;
                    System.out.println(digit);break;
				}
			}
		}
		if (numDig==digit) {
			System.out.println("digit are present in increasing order");
		}
        else
        System.out.println("digit are Not present in increasing order");
	}

	public static void main(String[] args) {
        System.out.println("your answer is below");
	numberIsIncresingOrder(12345);	
	}

	

}
