package annotation;

import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.net.URL;
import java.util.Map;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	public static void main(String[] args) throws JsonParseException, IOException {
		String carJson =
		        "{ \"brand\" : \"Mercedes\", \"doors\" : 5 }";

		JsonFactory factory = new JsonFactory();
		JsonParser  parser  = factory.createParser(carJson);
		
		Car car = new Car();
		while(!parser.isClosed()){
		    JsonToken jsonToken = parser.nextToken();

		    if(JsonToken.FIELD_NAME.equals(jsonToken)){
		        String fieldName = parser.getCurrentName();
		        System.out.println(fieldName);

		        jsonToken = parser.nextToken();

		        if("brand".equals(fieldName)){
		            car.brand = parser.getValueAsString();
		        } else if ("doors".equals(fieldName)){
		            car.doors = parser.getValueAsInt();
		        }
		    }
		}

		System.out.println("car.brand = " + car.brand);
		System.out.println("car.doors = " + car.doors);
		
	}

}
