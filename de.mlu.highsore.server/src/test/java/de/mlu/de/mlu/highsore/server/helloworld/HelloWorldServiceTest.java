package de.mlu.de.mlu.highsore.server.helloworld;

import org.eclipse.scout.rt.platform.BEANS;
import org.eclipse.scout.rt.testing.platform.runner.RunWithSubject;
import org.eclipse.scout.rt.testing.server.runner.RunWithServerSession;
import org.eclipse.scout.rt.testing.server.runner.ServerTestRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import de.mlu.de.mlu.highsore.server.ServerSession;
import de.mlu.de.mlu.highsore.shared.helloworld.HelloWorldFormData;
import de.mlu.de.mlu.highsore.shared.helloworld.IHelloWorldService;

/**
 * <h3>{@link HelloWorldServiceTest}</h3>
 *
 * @author Matthias Lupfer
 */
@RunWith(ServerTestRunner.class)
@RunWithSubject(HelloWorldServiceTest.SUBJECT_NAME)
@RunWithServerSession(ServerSession.class)
public class HelloWorldServiceTest {
	public static final String SUBJECT_NAME = "test_subject";

	@Test
	public void testMessageContainsSubjectName() {
		HelloWorldFormData input = new HelloWorldFormData();
		input = BEANS.get(IHelloWorldService.class).load(input);

		Assert.assertNotNull(input.getMessage());
		Assert.assertEquals("Hello " + SUBJECT_NAME + "!", input.getMessage().getValue());
	}
}
