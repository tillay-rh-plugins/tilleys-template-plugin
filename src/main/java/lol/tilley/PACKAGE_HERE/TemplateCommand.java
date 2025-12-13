package lol.tilley.PACKAGE_HERE;

import org.rusherhack.client.api.feature.command.Command;
import org.rusherhack.core.command.annotations.CommandExecutor;

public class TemplateCommand extends Command {

	public TemplateCommand() {
		super("TemplateCommand", "description");
	}
	

	@CommandExecutor
	private String template() {
		return "command";
	}
	
}
