package test.guitest;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.Listener;


public class GUIEvents implements Listener {

    @EventHandler
    public void clickEvent(InventoryClickEvent Clickevent) {
        //check for what GUI was clicked and what item was clicked
        if (!Clickevent.getView().getTitle().equalsIgnoreCase("Crafting")) {
            MainClick(Clickevent);
            Clickevent.setCancelled(true);


        }
    }

    public void MainClick(InventoryClickEvent Clickevent) {
        String ItemDispName = Clickevent.getCurrentItem().getItemMeta().getDisplayName();
        Player player = (Player) Clickevent.getWhoClicked();
        GUIStorage.EventCheck(ItemDispName,player);

    }


}
