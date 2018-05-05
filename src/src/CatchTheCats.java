package src;

public class CatchTheCats {
	
	public int getCats(char[] catsAndDogsArray, int distance) {
		
		int idx = 0;
		int count = 0;
		
		for (char animal : catsAndDogsArray) {
	
			if (animal == 'D') {
				if (idx > distance) {
					
					if (idx+1 == catsAndDogsArray.length) {
						char cat = catsAndDogsArray[catsAndDogsArray.length - distance];
						if (cat == 'C') {
							count ++;	
						}
					} else {
					char cat = catsAndDogsArray[idx - distance]; // check
					if (cat == 'C') {
						count ++;	
					}  else {
					cat = catsAndDogsArray[idx + distance];
					if (cat == 'C') {
						count ++;
					}
				}
				}
			} else {
				char cat = catsAndDogsArray[idx + distance];
				if (cat == 'C') {
					count ++;
				}
			}
	}
		
		idx++;
			
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CatchTheCats o = new CatchTheCats();
		// char[] array1 = { 'D', 'C', 'C', 'D', 'C' };
		// char[] array2 = { 'C', 'C', 'D', 'D', 'C', 'D' };
		// char[] array3 = { 'C', 'C', 'D', 'D', 'C', 'D' };
		char[] array4 = { 'D', 'C', 'D', 'D', 'C' };
		
		int n = o.getCats(array4, 1);
		System.out.println(n);
	}

}
