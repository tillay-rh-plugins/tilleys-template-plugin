package lol.tilley;

import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.plugin.Plugin;

public class PluginMainClass extends Plugin {
	
	@Override
	public void onLoad() {
        RusherHackAPI.getCommandManager().registerFeature(new TemplateCommand());
        RusherHackAPI.getHudManager().registerFeature(new TemplateHudElement());
        RusherHackAPI.getModuleManager().registerFeature(new TemplateModule());
    }

	@Override
	public void onUnload() {
		this.getLogger().info("Example plugin unloaded!");
	}
	
}