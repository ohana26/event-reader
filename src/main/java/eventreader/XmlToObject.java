package eventreader;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class XmlToObject {
	
	public static Root getXml(){

		try {

			File file = new File( "C:/Users/chen/Documents/workspace-spring-tool-suite-4-4.11.0.RELEASE/eventreader/src/main/java/eventreader/Request.xml");
			
			System.out.println(file);
			JAXBContext jaxbContext = JAXBContext.newInstance(Root.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Root que = (Root) jaxbUnmarshaller.unmarshal(file);
			System.out.println(que);
            return que;

		} catch (JAXBException e) {
			e.printStackTrace();
            return null;

		}

	}
}