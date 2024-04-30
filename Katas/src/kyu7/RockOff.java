package kyu7;

public class RockOff {
	public static String solveRockOff(final int[] alice, final int[] bob){
        int aliceCnt = 0;
        int bobCnt = 0;
		for (int i = 0; i<alice.length; i++) {
			if (alice[i]>bob[i]) {
				aliceCnt++;
			} else if (alice[i]<bob[i]){
				bobCnt++;
			}
		}
		if (aliceCnt>bobCnt) {
			return aliceCnt+", "+bobCnt+": Alice made \"Kurt\" proud!";
		} else if (aliceCnt<bobCnt) {
			return aliceCnt+", "+ bobCnt+": Bob made \"Jeff\" proud!";
		} else if (aliceCnt == bobCnt) {
			return aliceCnt+", "+bobCnt+": that looks like a \"draw\"! Rock on!";
		}
		return "";
    }
}
