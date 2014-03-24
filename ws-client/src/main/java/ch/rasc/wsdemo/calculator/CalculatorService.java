package ch.rasc.wsdemo.calculator;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.6 in JDK 6 Generated
 * source version: 2.1
 *
 */
@WebServiceClient(name = "CalculatorService", targetNamespace = "http://wsdemo.ralscha.ch/", wsdlLocation = "http://localhost:8080/cxf/Calculator?wsdl")
public class CalculatorService extends Service {

	private final static URL CALCULATORSERVICE_WSDL_LOCATION;

	private final static Logger logger = Logger.getLogger(ch.rasc.wsdemo.calculator.CalculatorService.class.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = ch.rasc.wsdemo.calculator.CalculatorService.class.getResource(".");
			url = new URL(baseUrl, "http://localhost:8080/cxf/Calculator?wsdl");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/cxf/Calculator?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		CALCULATORSERVICE_WSDL_LOCATION = url;
	}

	public CalculatorService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public CalculatorService() {
		super(CALCULATORSERVICE_WSDL_LOCATION, new QName("http://wsdemo.ralscha.ch/", "CalculatorService"));
	}

	/**
	 *
	 * @return returns Calculator
	 */
	@WebEndpoint(name = "CalculatorPort")
	public Calculator getCalculatorPort() {
		return super.getPort(new QName("http://wsdemo.ralscha.ch/", "CalculatorPort"), Calculator.class);
	}

	/**
	 *
	 * @param features A list of {@link javax.xml.ws.WebServiceFeature} to
	 *            configure on the proxy. Supported features not in the
	 *            <code>features</code> parameter will have their default
	 *            values.
	 * @return returns Calculator
	 */
	@WebEndpoint(name = "CalculatorPort")
	public Calculator getCalculatorPort(WebServiceFeature... features) {
		return super.getPort(new QName("http://wsdemo.ralscha.ch/", "CalculatorPort"), Calculator.class, features);
	}

}
