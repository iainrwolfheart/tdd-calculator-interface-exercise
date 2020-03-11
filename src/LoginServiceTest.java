import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.easymock.EasyMock;

import static org.easymock.EasyMock.createMock;

public class LoginServiceTest {
	
	LoginService service;
	AccessValidation access;

	@Before
	public void setUp() throws Exception {
		service = createMock(LoginService.class);
		access = new AccessValidation(service);
	}

	@Test
	public void testMethodOne() {
		EasyMock.expect(service.isValidPass("Iain")).andReturn(true);
		EasyMock.expect(service.generateCode()).andReturn("Passcode");
		EasyMock.replay(service);
		assertEquals(true, access.getService().isValidPass("Iain"));
		assertEquals("Passcode", access.getService().generateCode());
	}
	
	@Test
	public void testMethodTwo() {
		EasyMock.expect(service.isValidPass("Iain")).andReturn(true);
		EasyMock.expect(service.generateCode()).andReturn("Passcode");
		EasyMock.replay(service);
		
		if (access.getService().isValidPass("Iain") && access.getService().generateCode().equals("Passcode")) {
			access.setAccessCode("Some other code");
		}
		assertEquals("Some other code", access.getAccessCode());
		EasyMock.verify(service);
	}

	@After
	public void tearDown() throws Exception {
		
	}
}
