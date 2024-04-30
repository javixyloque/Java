package practicaExcepciones;
import javax.swing.*;

import dialogos.Dialogos;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean continuar =true;
		do {
			try {
				String [] opcs = {"Velero", "Deportiva", "Yate", "Otro"};
				Dialogos.mensajeInfo("Bienvenido al servicio de alquiler de amarres");
				int nBarcos = Dialogos.pedirEntero("Seleccione el número de barcos que quiere registrar");
				Barco b[] = new Barco[nBarcos];
				Alquiler a[] = new Alquiler[nBarcos];
				int amarre[] = {1,1};
				
				String matricula;
				int eslora, anioFab, potencia, nCamarotes, nMastiles;
				
				
				String nombre = Dialogos.pedirCadena("Introduzca su nombre");
				String DNI = Dialogos.pedirCadena("Ahora su DNI");
				for (int i = 0; i<a.length; i++) {
					a[i] = new Alquiler(nombre, DNI);
				}
				for (int i  = 0; i<b.length;i++) {
					int tipo = Dialogos.pedirOpcion("Seleccione el tipo de barco del que se solicita el servicio", "TIPO BARCO", opcs);
					switch (tipo) {
					case -1:
						Dialogos.mensajeInfo("Se acabó el programa");
						System.exit(0);
						
						break;
					case 0:
						b[i] = new Velero();
						matricula = Dialogos.pedirCadena("Introduzca la matrícula del barco");
						b[i].setMatricula(matricula);
						eslora = Dialogos.pedirEntero("Introduzca la eslora");
						b[i].setEslora(eslora);
						anioFab = Dialogos.pedirEntero("Introduzca el año de fabricación");
						b[i].setAnioFab(anioFab);
						nMastiles = Dialogos.pedirEntero("Introduzca el nº de mástiles");
						((Velero) b[i]).setnMastiles(nMastiles);
						amarre[1]++;
						if (amarre[1] == 10) {
							amarre[0]++;
							amarre[1]=1;
						}
						a[i].setBarco(b[i]);
						a[i].setFecha();
						a[i].setAmarre(amarre);
						break;
					case 1:
						b[i] = new Deportiva();
						matricula = Dialogos.pedirCadena("Introduzca la matrícula del barco");
						b[i].setMatricula(matricula);
						eslora = Dialogos.pedirEntero("Introduzca la eslora");
						b[i].setEslora(eslora);
						anioFab = Dialogos.pedirEntero("Introduzca el año de fabricación");
						b[i].setAnioFab(anioFab);
						potencia = Dialogos.pedirEntero("Introduzca la potencia");
						((Deportiva) b[i]).setPotencia(potencia);
						amarre[1]++; 
						if (amarre[1] == 10) {
							amarre[0]++;
							amarre[1]=1;
						}
						a[i].setBarco(b[i]);
						a[i].setFecha();
						a[i].setAmarre(amarre);
						break;
					case 2:
						b[i] = new Yate();
						matricula = Dialogos.pedirCadena("Introduzca la matrícula del barco");
						b[i].setMatricula(matricula);
						eslora = Dialogos.pedirEntero("Introduzca la eslora");
						b[i].setEslora(eslora);
						anioFab = Dialogos.pedirEntero("Introduzca el año de fabricación");
						b[i].setAnioFab(anioFab);
						potencia = Dialogos.pedirEntero("Introduzca la potencia");
						((Yate) b[i]).setPotencia(potencia);
						nCamarotes = Dialogos.pedirEntero("Introduzca el nº de camarotes");
						amarre[1]++;
						if (amarre[1] == 10) {
							amarre[0]++;
							amarre[1]=1;
						}
						a[i].setBarco(b[i]);
						a[i].setFecha();
						a[i].setAmarre(amarre);
						break;
					case 3:
						b[i]=new Barco();
						matricula = Dialogos.pedirCadena("Introduzca la matrícula del barco");
						b[i].setMatricula(matricula);
						eslora = Dialogos.pedirEntero("Introduzca la eslora");
						b[i].setEslora(eslora);
						anioFab = Dialogos.pedirEntero("Introduzca el año de fabricación");
						b[i].setAnioFab(anioFab);
						amarre[1]++;
						if (amarre[1] == 10) {
							amarre[0]++;
							amarre[1]=1;
						}
						
						a[i].setBarco(b[i]);
						a[i].setFecha();
						a[i].setAmarre(amarre);
						break;
					} 
					
				}		for (int i = 0; i<b.length; i++) {
					Dialogos.mensajeWarning("Valor del alquiler: "+b[i].calcularAlquiler(),"Cálculo del alquiler del barco nº "+(i+1));

				}
				
				continuar = false;
			}catch (Exception e) {
				System.out.println("Vuelva a intentarlo");
				continuar = true;
			}
		} while (continuar);
		
	}

}

