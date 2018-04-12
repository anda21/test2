package test;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
public class Example {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
		ByteBuffer buf1 = ByteBuffer.wrap(new byte[]{0x01, 0x02, 0x03, 0x04});
		buf1.order(ByteOrder.LITTLE_ENDIAN);

		int n1 = buf1.getInt();
		System.out.println(n1 == 0x04030201);
		

		ByteBuffer buf2 = ByteBuffer.wrap(new byte[]{0x01, 0x02, 0x03, 0x04});
		buf2.order(ByteOrder.BIG_ENDIAN);

		int n2 = buf2.getInt();
		System.out.println(n2 == 0x01020304);	
		
		
		
		
		JsonTest t = new JsonTest();
		
		Contact c = new Contact("test", "test");
		Contact d = new Contact("test1", "test2");
		Contact e = new Contact("tesat4", "test4");
		Position p = new Position("name", 5);
		Name n =  new Name("fist", "middle", "name");
		 
		ArrayList<Contact> contact = new ArrayList<Contact>();
		contact.add(c);
		contact.add(d);
		contact.add(e);
		t.setContact(contact);
		
		t.setName(n);
		
		t.setId(100L);
		t.setPosition(p);
		ObjectMapper o = new ObjectMapper();	
		o.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		System.out.println(o.writerWithDefaultPrettyPrinter().writeValueAsString(t));

		
	}
}
