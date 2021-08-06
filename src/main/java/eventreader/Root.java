package eventreader;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Root {
	RequestDetails RequestDetails;
	List<Event> Event;

	public Root() {
	}

	public Root(eventreader.RequestDetails requestDetails, List<eventreader.Event> event) {
		super();
		RequestDetails = requestDetails;
		Event = event;
	}

	@XmlElement
	public RequestDetails getRequestDetails() {
		return RequestDetails;
	}

	public void setRequestDetails(RequestDetails requestDetails) {
		RequestDetails = requestDetails;
	}

	@XmlElement
	public List<Event> getEvent() {
		return Event;
	}

	public void setEvent(List<Event> event) {
		Event = event;
	}
}
