package eventreader;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RequestDetails {

	String Id;
	String AcceptDate;
	String SourceCompany;

	public RequestDetails() {
	}

	public RequestDetails(String id, String acceptDate, String sourceCompany) {
		super();
		Id = id;
		AcceptDate = acceptDate;
		SourceCompany = sourceCompany;
	}

	@XmlElement
	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	@XmlElement
	public String getAcceptDate() {
		return AcceptDate;
	}

	public void setAcceptDate(String acceptDate) {
		AcceptDate = acceptDate;
	}

	@XmlElement
	public String getSourceCompany() {
		return SourceCompany;
	}

	public void setSourceCompany(String sourceCompany) {
		SourceCompany = sourceCompany;
	}

}
