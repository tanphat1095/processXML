package convert;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import xmlObjects.persons;
@XmlRootElement
public class xmlObject {
ArrayList<persons> persionL;

public ArrayList<persons> getPersionL() {
	return persionL;
}
@XmlElement
public void setPersionL(ArrayList<persons> persionL) {
	this.persionL = persionL;
}

}
