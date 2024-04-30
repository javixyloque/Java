package metodos2;
import java.util.StringTokenizer;

public class Stringtokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "Blanco, verde, rojo y azul";
		StringTokenizer st = new StringTokenizer (cadena);
		while (st.hasMoreTokens ()) {
			System.out.println(st.nextToken());
		}

	}

}
