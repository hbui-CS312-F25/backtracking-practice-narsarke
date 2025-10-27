public class Word2{


	/**
	* @param solution current word
	* @param remaining remaining letters
	*/

	public static void combination(String solution, String remaining, int k){
		if(solution.length() == k){
			System.out.println(solution);
			return;
		} else if (remaining.equals("")){
			return;
		} else{
			String r = remaining.substring(0,1);
			remaining = remaining.substring(1,remaining.length());
			combination(solution, remaining,k);
			combination(solution + r, remaining,k);
		}
	}

	public static void main(String [] args){

		if(args.length != 2){
			System.out.println("Usage: java Word yourword number");
			return;
		}
		
		String word = new String(args[0]);

		String empty = new String("");

		int num = Integer.parseInt(args[1]);

		combination(empty, word, num);

	}

}
