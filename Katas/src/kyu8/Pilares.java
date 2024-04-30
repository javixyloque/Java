package kyu8;

public class Pilares {
	public static int pillars(int numPill, int dist, int width){
	   if (numPill <= 1) {
		   return 0;
	   } else if (numPill == 2){
		   return (dist*100)+width*(numPill-2);
	   } else {
		   return (dist*100)*(numPill-1)+width*(numPill-2);
	   }
	}
}
