package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
		
		String str = "";
		if (tabell.length == 0) {
			str = ("[]");
		} else {
			str = "[";
			for (int x = 0; x<tabell.length-1; x++) {
				str += tabell[x]+",";	
			}
			
				str += (tabell[tabell.length-1]);
				str += "]";	
		}
		System.out.println(str);
	}

	// b)
	public static String tilStreng(int[] tabell) {
		String str = "";
		if (tabell.length == 0) {
			str = ("[]");
		} else {
			str = "[";
			for (int x = 0; x<tabell.length-1; x++) {
				str += tabell[x]+",";	
			}
			
				str += (tabell[tabell.length-1]);
				str += "]";	
		}
		return(str);
	}
	

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		int i = 0;
		
//		for (int i = 0; i < tabell.length; i++) {
//			sum += tabell[i];
//		}

//		while (count < tabell.length) {
//			sum += tabell[count];
//			i++;
//		}
		
		for (int x: tabell) {
			sum += x;
		}
		
		return sum;
		
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
		boolean x = false;
		
		for (int i: tabell) {
			if (i == tall) {
				x = true;
			}
		}
		
		return x;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int pos = -1;
		
		for (int x = 0; x < tabell.length; x++) {
			if (tabell[x] == tall) {
				pos = x;
			}
		}
		return pos;
	}

	// f)
	public static int[] reverser(int[] tabell) {
		
		int [] arr = new int[tabell.length];
		
		for (int i = 0, x = tabell.length-1; i< tabell.length; i++, x--) {
			arr[i] = tabell[x];
			}
	
		return arr;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		boolean state = false;
		
		if (tabell.length == 1 || tabell.length == 0) {
			state = true;
		} else {
			for (int x = 1; x <= tabell.length-1; x++) {
				if (tabell[x-1] > tabell[x]) {
					state = false;
				}  else {
					state = true;
				}
			}
		}
		return state;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] arr = new int[tabell1.length+tabell2.length];
		
		for (int x = 0; x < tabell1.length; x++) {
			arr[x] = tabell1[x];
		}
		
		for (int x = 0; x < tabell2.length; x++) {
			arr[x+tabell1.length] = tabell2[x];
		}
		
//		System.arraycopy(tabell1, 0, arr, 0,  tabell1.length);
//		System.arraycopy(tabell2, 0, arr, tabell1.length, tabell2.length);
		
		return arr;
	}
}
