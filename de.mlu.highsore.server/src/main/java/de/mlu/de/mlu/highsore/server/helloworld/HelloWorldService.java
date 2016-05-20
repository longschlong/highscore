package de.mlu.de.mlu.highsore.server.helloworld;

import de.mlu.de.mlu.highsore.server.ServerSession;
import de.mlu.de.mlu.highsore.shared.helloworld.HelloWorldFormData;
import de.mlu.de.mlu.highsore.shared.helloworld.IHelloWorldService;

/**
 * <h3>{@link HelloWorldService}</h3>
 *
 * @author Matthias Lupfer
 */
public class HelloWorldService implements IHelloWorldService {

	@Override
	public HelloWorldFormData load(HelloWorldFormData input) {
		StringBuilder msg = new StringBuilder();
		msg.append("Hello ").append(ServerSession.get().getUserId()).append('!');
		input.getMessage().setValue(msg.toString());
		return input;
	}
}
