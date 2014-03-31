package biz.blha303.foobar;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Player;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.command.CommandSender;
import org.bukkit.command.Command;

public class Foobar extends JavaPlugin {

	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if (sender instanceof Player) {
			sender.sendMessage("[Foobar] foo");
		} else if (sender instanceof ConsoleCommandSender) {
			sender.sendMessage("[Foobar] bar");
		} else {
			sender.sendMessage("[Foobar] foobar");
		}
		return True;
	}

}