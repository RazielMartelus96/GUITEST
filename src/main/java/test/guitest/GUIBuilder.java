package test.guitest;


import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;


public class GUIBuilder {
private static ItemStack MetData;

private int[] list = {};



    public static void Init(int[][] ArrayMap, CommandSender sender) {
        int row_num = 0;
        int InvSpace_Num = 0;
        //todo Make sure that the row num and inv space num are replaced with some sort_
        //_ of value that corresponds to the array for the GUI
        //make the inventory and takes into account the array map's number of rows*9 (for correct amount of inv space)
        Inventory inv = Bukkit.createInventory(null, ArrayMap.length*9, "Example");

        //For loop that calls each row of the array, and then each element in_
        //_the subsequent array.
        for (int[] row: ArrayMap){
            //keeping track of row number and resetting Index number for row elements per loop
            row_num = row_num+1;
            InvSpace_Num = 0;
            for (int InvSpace: row){

                //Element within current row
                InvSpace_Num = InvSpace_Num + 1;

                //Set the item in the inventory space currently selected to the item designated by the number
                if (InvSpace != 0){
                    inv.setItem(TranslatedInvSpot(row_num, InvSpace_Num), GUIStorage.getStorage(InvSpace));


                }



            }
        }
        Player player = (Player) sender;
        player.openInventory(inv);
    }

    private static int TranslatedInvSpot(int row_num, int InvSpace_num){
        //translates the row and element into the minecraft inventory index format.
        int inv_index = ((row_num-1)*9)+(InvSpace_num-1);

        //##These 3 messages were for dedbugging purposes of fixing a problem that was with the inv_index equation
        //##The problem was caused by misunderstanding how indexes worked for chests (mistook for player inv).
            //"The row number is "+ row_num);
            //getLogger().info("The inv number number is "+ InvSpace_num);
            //getLogger().info("The translated number is "+ inv_index);

        return inv_index;
    }



}

