package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
        for (int[] row : matrise) {
            for (int x : row) {
                System.out.print(x + " ");
            }
            	System.out.println();
        }
    }
	

	// b)
	public static String tilStreng(int[][] matrise) {

		String str = "";
        for (int[] row : matrise) {
            for (int x : row) {
            	str +=(x + " ");
            }
            str += "\n";
        }
      	        	
        return str;
    }

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int[][] arr = new int[matrise[0].length][matrise.length];
		
		for (int x = 0; x < matrise.length; x++) {
			for (int i = 0; i < matrise[0].length; i++) {
				arr[i][x] = (matrise[i][x]*tall);
			}
		}
			return arr;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		
		boolean eq = false;
		
		if (a.length == b.length) {
			for (int x = 0; x < a.length; x++) {
				for (int i = 0; i < a[0].length; i++) {
					if (a[i][x] == b [i][x]) {
						eq = true;
					}
				}
			}
	}
		return eq;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
