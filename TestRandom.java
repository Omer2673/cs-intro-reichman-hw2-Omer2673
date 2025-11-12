
public  class  TestRandom {
	public static void main(String[]  args) {
	    int N = Integer.parseInt(args[0]);

		int countless = 0;
		int countgreater = 0;

		for (int i = 0; i<N; i++) {
			double r = Math.random();
			if (r>0.5) {
				countgreater++;
			}else{
				countless++;
			}
				
			}

		System.out.println("> 0.5: " + countgreater + " times");
        System.out.println("<= 0.5: " + countless + " times");


		if (countless != 0) {
            double ratio = (double) countgreater / countless;
            System.out.println("Ratio: " + ratio);
        }




		}

	}
