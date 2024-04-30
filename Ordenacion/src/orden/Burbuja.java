package orden;

public class Burbuja {
	 public static void main(String[] args) {
        int[] lista = {2, 4, 3, 6, 9, 1};
        boolean cambio = false;
        int aux;
       /* for (int i = 0; i < lista.length; i++) {
        	System.out.print(lista[i]+ ", ");
        }
        
        for (int j = 0; j<lista.length; j++) {
        	cambio = false;
        	for (int i = 0; i <lista.length -(1+j); i++) {
        		if (lista[i] > lista[i+1]);
        		aux = lista[i];
        		lista[i]=lista[i+1];
        		lista[i+1] = aux;
        		cambio = true;
        		
        	}
        	System.out.println(">>"+lista[j]);
        	if (!cambio) {
        		break;
        	}
        }
        
       */
        
        
       int vueltas = lista.length;
        // Ciclo para recorrer el array (length a 1)
        for (int i = 1; i <= vueltas - 1; i++) {
            // Ciclo compara parejas
            for (int j = 1; j <= vueltas - i; j++) { 
                if (lista[j - 1] > lista[j]) {
                    int tmp = lista[j - 1];
                    lista[j - 1] = lista[j];
                    lista[j] = tmp;
                }
            }
        }
        // Mostrar array
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i] + " ");
        }
        
        
    }
}
