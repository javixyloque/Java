package jaxb;
import javax.xml.bind.JAXBContext;
//import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;


public class AppJaxB1 {

	public static void main(String[] args) {
		//leemos del fichero xml		
		try {
			JAXBContext contexto=JAXBContext.newInstance(Socio.class);
			//vamos a 'desagrupar' los elementos del fichero xml para pasarlos al objeto Socio
			Unmarshaller um=contexto.createUnmarshaller();
			Socio s=(Socio) um.unmarshal(new File("socio.xml"));
			System.out.println(s.toString());
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//escribimos a un fichero xml
		try {
			JAXBContext contexto=JAXBContext.newInstance(Socio.class);
			Marshaller m=contexto.createMarshaller();
			//Queremos agrupar y pasar los elementos del objeto al fichero xml
			Socio s1=new Socio(1,"Armando Fuentes","C/ Fontanería 1","01/09/2021");
			//previamente creamos una salida formateada con setProperty, 
			//sino se escribe todo en una línea
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
			m.marshal(s1,new FileWriter("socio1.xml"));
		}catch (JAXBException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
