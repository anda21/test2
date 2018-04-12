package jsonGenerator;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;

public class Main {

	public static void main(String[] args) throws IOException {
		JsonFactory factory = new JsonFactory();

		JsonGenerator generator = factory.createGenerator(
		    new File("C:\\Users\\user\\Documents\\TESTCODE\\test\\src\\jsonGenerator\\output.json"), JsonEncoding.UTF8);

		generator.writeStartObject();
		generator.writeStringField("brand", "Mercedes");
		generator.writeNumberField("doors", 5);
		generator.writeStringField("brand", "Mercedes1");
		generator.writeStringField("brand2", "Mercedes2");
		generator.writeStringField("brand3", "Mercedes3");
		generator.writeStringField("brand4", "Mercedes4");
		generator.writeEndObject();

		generator.close();
	}

}
