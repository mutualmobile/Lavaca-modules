package com.lavaca.web.config.xml;

import java.util.List;

import javax.xml.bind.JAXBException;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "scripts")
public class XMLScripts {

	public static XMLScripts parse(String path) throws JAXBException {
		return XMLParser.parse(XMLScripts.class, path);
	}

	private List<XMLPackage> packages;

	@XmlElements({ @XmlElement(name = "package", type = XMLPackage.class) })
	public List<XMLPackage> getPackages() {
		return packages;
	}

	public void setPackages(List<XMLPackage> packages) {
		this.packages = packages;
	}

}