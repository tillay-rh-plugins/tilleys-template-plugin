package lol.tilley.PACKAGE_HERE;

import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.plugin.Plugin;

public class PluginMain extends Plugin {

	@Override
	public void onLoad() {
		this.getLogger().info("Plugin NAME_HERE loaded");
		RusherHackAPI.getCommandManager().registerFeature(new TemplateCommand());
		RusherHackAPI.getHudManager().registerFeature(new TemplateHudElement());
		RusherHackAPI.getModuleManager().registerFeature(new TemplateModule());
	}

	@Override
	public void onUnload() {
		this.getLogger().info("Plugin NAME_HERE unloaded!");
	}

}