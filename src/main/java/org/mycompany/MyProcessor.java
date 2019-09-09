package org.mycompany;

import java.io.File;
import java.io.InputStream;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class MyProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		String text = exchange.getIn().getBody(String.class);
		byte[] bytes = exchange.getIn().getBody(byte[].class);
		InputStream is = exchange.getIn().getBody(InputStream.class); 
		exchange.getIn().setBody( text);
	}

}
