package lol.tilley.test;

import org.rusherhack.client.api.RusherHackAPI;
import org.rusherhack.client.api.plugin.Plugin;

public class PluginMain extends Plugin {
	
	@Override
	public void onLoad() {
		this.getLogger().info("Plugin test loaded");
                        RusherHackAPI.getModuleManager().registerFeature(new testerModule());
    }

	@Override
	public void onUnload() {
		this.getLogger().info("Plugin test unloaded!");
	}
	
}