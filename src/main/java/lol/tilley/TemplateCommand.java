package lol.tilley;

import org.rusherhack.client.api.feature.command.Command;
import org.rusherhack.core.command.annotations.CommandExecutor;

public class TemplateCommand extends Command {

	public TemplateCommand() {
		super("command", "description");
	}
	

	@CommandExecutor
	private String template() {
		return "command";
	}
	
}
