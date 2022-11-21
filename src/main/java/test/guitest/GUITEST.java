package test.guitest;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;

public final class GUITEST extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new GUIEvents(), this);




    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String Label, String[] args){
        if (Label.equalsIgnoreCase("TestGui")) {

            int[][] PlayerGUI = {{1,0,0,0,6,0,0,0,2},
                                 {0,0,0,1,6,1,0,0,0},
                                 {6,6,6,6,6,6,6,6,6},
                                 {0,0,0,1,6,1,0,0,0},
                                 {1,0,0,0,6,0,0,0,2}};



            GUIBuilder.Init(PlayerGUI, sender);
        }
        return true;
    }
}
