package de.mlu.de.mlu.highsore.client.work;

import java.util.List;

import org.eclipse.scout.rt.platform.Order;
import org.eclipse.scout.rt.client.ui.desktop.outline.AbstractOutline;
import org.eclipse.scout.rt.client.ui.desktop.outline.pages.IPage;
import org.eclipse.scout.rt.shared.TEXTS;

import de.mlu.de.mlu.highsore.client.helloworld.HelloWorldPage;
import de.mlu.de.mlu.highsore.shared.Icons;

/**
 * <h3>{@link WorkOutline}</h3>
 *
 * @author Matthias Lupfer
 */
@Order(1000)
public class WorkOutline extends AbstractOutline {

	@Override
	protected void execCreateChildPages(List<IPage<?>> pageList) {
		super.execCreateChildPages(pageList);
		pageList.add(new HelloWorldPage());
	}

	@Override
	protected String getConfiguredTitle() {
		return TEXTS.get("Work");
	}

	@Override
	protected String getConfiguredIconId() {
		return Icons.Pencil;
	}
}
