package test.guitest;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class GUIStorage extends GUIBuilder {

     static Material material;
     static String name;
     static String lore;

     static ItemStack ItemInfo;


    public static ItemStack getStorage(int ID) {
            //Switch case that determines what item is added to which inventory_
            //_spot, based on the MapArray
            //todo TINGORA: Lets think about using a .yml file here instead of a class to store material, name and lore.

            switch (ID) {

                case 1:
                    material = Material.NETHERITE_AXE;
                    name = "Deathmatch";
                    lore = "Kill points until win";
                    break;

                case 2:
                    material = Material.DIAMOND_SWORD;
                    name = "Standard";
                    lore = "Its KoTH but bigga";
                    break;

                case 3:
                    material = Material.WOODEN_AXE;
                    name = "King of the Hill";
                    lore = "No really, it took like 30 seconds";
                    break;

                case 4:
                    material = Material.OAK_SIGN;
                    name = "Page Forward";
                    lore = "This moves the page forward";
                    break;

                case 5:
                    material = Material.DARK_OAK_SIGN;
                    name = "Page Backward";
                    lore = "This moves the page backwards";
                    break;
                case 6:
                    material = Material.IRON_BARS;
                    name = "";
                    lore = "";

            }

        //Get the info as an itemstack and then return
        ItemInfo = GetItemstack(material,name,lore);
        return ItemInfo;
    }

    private static ItemStack GetItemstack(Material material, String name, String lore){
            //Set the item being used
            final ItemStack item = new ItemStack(material,1);
            //get original metadata of item
            final ItemMeta meta = item.getItemMeta();
            // Set the name of the item
            meta.setDisplayName(name);

            // Set the lore of the item
            meta.setLore(Arrays.asList(lore));
            //Set metadata for the item as a whole
            item.setItemMeta(meta);
            return item;


    }
    public static boolean EventCheck(String ItemDisplayName, Player player){


        //Just for display purposes, but commands would be added for each button here. Allows for re-use
        switch (ItemDisplayName){
            case "Deathmatch":
                player.sendMessage(ItemDisplayName);
                break;

            case "Standard":
                player.sendMessage(ItemDisplayName);
                break;

            case "King of The Hill":
                player.sendMessage(ItemDisplayName);
                break;

            case "Page Forward":
                player.sendMessage(ItemDisplayName);
                break;

            case "Page Backward":
                player.sendMessage(ItemDisplayName);
                break;



        }
        return true;
    }

}
