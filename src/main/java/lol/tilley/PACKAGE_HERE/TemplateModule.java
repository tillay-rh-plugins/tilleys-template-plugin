package lol.tilley.PACKAGE_HERE;

import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.subscribe.Subscribe;


public class TemplateModule extends ToggleableModule {

	public TemplateModule() {
        super("TemplateModule", "Does things", ModuleCategory.CLIENT);
    }

    @Subscribe
    public void onUpdate(EventUpdate event){

    }
}
