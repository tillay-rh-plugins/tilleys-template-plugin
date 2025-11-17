package lol.tilley;

import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.subscribe.Subscribe;


public class TemplateModule extends ToggleableModule {

	public TemplateModule() {
        super("Example", "Example plugin module", ModuleCategory.CLIENT);
    }

    @Subscribe
    public void onUpdate(EventUpdate event){

    }
}
