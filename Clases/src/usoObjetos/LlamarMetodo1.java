package usoObjetos;


public class LlamarMetodo1 {
	public static void main(String[] args) {
		AuxEjemplo1 obj1 = new AuxEjemplo1();
		obj1.metodoSaludo2();
	} 
	
}

/*No se puede llamar al objeto dentro del método porque el objeto lo hemos definido
aqui, en el main y toma valores del método, aunque luego llame a un método de 
la propia clase*/