import static org.junit.Assert.*;
import org.easymock.EasyMock;
import static org.easymock.EasyMock.createMock;

import org.junit.Before;
import org.junit.Test;

public class OrderReaderTest {

	FileReaderService service;
	
	OrderReader orderReader;

	@Before
	public void setUp() throws Exception {
		service = createMock(FileReaderService.class);
		orderReader = new OrderReader(service);
	}

	@Test
	public void testReadOrderReaderImplementation() {
		EasyMock.expect(service.readLine()).andReturn("Hi,there,you");
		EasyMock.replay(service);
		String line = orderReader.readFirstLine();
		assertEquals("Hi there", line);
		assertNotEquals("Hi there", service);
	}
 
}
