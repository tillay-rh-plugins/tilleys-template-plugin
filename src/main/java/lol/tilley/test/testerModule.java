package lol.tilley.test;

import org.rusherhack.client.api.events.client.EventUpdate;
import org.rusherhack.client.api.feature.module.ModuleCategory;
import org.rusherhack.client.api.feature.module.ToggleableModule;
import org.rusherhack.core.event.subscribe.Subscribe;


public class testerModule extends ToggleableModule {

	public testerModule() {
        super("Example", "New Module", ModuleCategory.CLIENT);
    }

    @Subscribe
    public void onUpdate(EventUpdate event){

    }
}
