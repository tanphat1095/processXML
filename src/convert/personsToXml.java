package convert;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;




import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import xmlObjects.persons;

public class personsToXml {
public static String writeXml(xmlObject xml, String location){
	String path= location;
	  try {
		SimpleDateFormat sf = new SimpleDateFormat("dd-MM-yyyy");
		path+= sf.format(new Date().getTime())+"_"+new Date().getTime()+".xml";
		File file = new File(path);
		JAXBContext jaxbContext = JAXBContext.newInstance(xmlObject.class);
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

	
		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	
		jaxbMarshaller.marshal(xml, file);
		jaxbMarshaller.marshal(xml, System.out);

	      } catch (JAXBException e) {
		e.printStackTrace();
	      }
	  return path;
}

public static void readXml(String path){
	
     
   
    xmlObject emps;
	try {
		JAXBContext jaxbContext = JAXBContext.newInstance(xmlObject.class);
	    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
	    
		emps = (xmlObject) jaxbUnmarshaller.unmarshal( new File(path) );
		   for(persons emp : emps.getPersionL())
		    {
		       System.out.println(emp.toString());
		    }
		
	} catch (JAXBException e) {
		
		e.printStackTrace();
	}
     
 
	
}



public static void main(String []agrs){
	ArrayList<persons> list = new ArrayList<persons>();
	persons ps = null;
	for(int i =0;i<10;i++){
		ps = new persons();
		ps.setId(i+"");
		ps.setName("Name_"+i);
		ps.setAge(i+"");
		ps.setPhoneNum("19001560");
		ps.setAddress("address"+i);
		list.add(ps);
	}
	
	xmlObject listOb = new xmlObject();
	listOb.setPersionL(list);
	readXml(writeXml(listOb,"D:\\"));
	
}
public static void test_change(){System.out.print("Alertsss");}
}
