package orden;

public class Burbuja_inversa {
	public static void main(String[] args) {
		
		
        int[] lista = {2, 4, 3, 1};
   /*     int vueltas = lista.length;
        //Bucle externo para las vueltas
        for (int i = 1; i <= vueltas - 1; i++) {
            //Bucle interno para comparar parejas
            for (int j = 1; j <= vueltas - i; j++) { 
                if (lista[j - 1] < lista[j]) {
                    int tmp = lista[j];
                    lista[j] = lista[j-1];
                    lista[j-1] = tmp;
                }
            }
        }
        //Mostramos el array ordenado
        for (int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }
        System.out.println();*/
        
        for (int i=lista.length; i>=0; i--) {
        	for (int j=lista.length;j<=1; j--) {
        		if (lista[j]<lista[j-1]) {
        			int nm = lista[j];
        			lista[j-1] = lista[j];
        			lista[j]=nm;
        		}
        	}
        	
        	
        }
        for (int a = 0; a < lista.length; a++) {
            System.out.print(lista[a] + " ");
        }

		
		
		
	}
}
