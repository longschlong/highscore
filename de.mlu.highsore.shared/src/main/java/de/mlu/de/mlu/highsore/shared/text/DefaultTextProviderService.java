package de.mlu.de.mlu.highsore.shared.text;

import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.shared.services.common.text.AbstractDynamicNlsTextProviderService;

/**
 * <h3>{@link DefaultTextProviderService}</h3>
 *
 * @author Matthias Lupfer
 */
@Order(-2000)
public class DefaultTextProviderService extends AbstractDynamicNlsTextProviderService {
	@Override
	protected String getDynamicNlsBaseName() {
		return "de.mlu.de.mlu.highsore.shared.texts.Texts";
	}
}
