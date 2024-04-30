package prueba;

import java.io.*;

public class Ejer24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] precios = {350, 400, 890, 6200, 8730};
		int[] unidades = {5, 7, 12, 8, 30};
		String [] descripciones = {"Cajas de grapas", "Cajas de lapices", "Cajas de boligrafos", "Carteras", "Estilograficas"};
		
		/*
		 * USAR .DAT, NO TXT, PORQUE LA CLASE DATAOUTPUTSTREAM ESCRIBE BYTES EN BINARIO, LO CUAL PROVOCA ERRORES EN 
		 * LA LECTURA DEL ARCHIVO CON EL BLOC DE NOTAS
		 */
		
		try {
			DataOutputStream archivo = new DataOutputStream (new FileOutputStream("pedido.txt"));
			for (int i = 0; i< precios.length; i++) {
				archivo.writeUTF("Objeto del inventario nº"+(i+1)+"\n");
				archivo.writeUTF("Nombre: "+descripciones[i]);
				archivo.writeChar('\n');
				archivo.writeBytes("Unidades: "+String.valueOf(unidades[i]));
				archivo.writeByte('\n');
				archivo.writeBytes("Precio: "+String.valueOf(precios[i]));
				archivo.writeBytes("\n\n");
				
			}
			archivo.close();
		} catch(IOException e) {
			e.printStackTrace();
		} 
		
	}

}
