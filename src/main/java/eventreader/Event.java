package eventreader;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Event {
	String Id;
	String Type;
	String InsuredId;
	List<Product> Product;

	public Event() {
	}

	public Event(String id, String type, String insuredId, List<eventreader.Product> product) {
		super();
		Id = id;
		Type = type;
		InsuredId = insuredId;
		Product = product;
	}

	@XmlElement
	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	@XmlElement
	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	@XmlElement
	public String getInsuredId() {
		return InsuredId;
	}

	public void setInsuredId(String insuredId) {
		InsuredId = insuredId;
	}

	@XmlElement
	public List<Product> getProduct() {
		return Product;
	}

	public void setProduct(List<Product> product) {
		Product = product;
	}
}
