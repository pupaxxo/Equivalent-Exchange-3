package com.pahimar.ee3.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;

import com.pahimar.ee3.core.helper.NBTHelper;
import com.pahimar.ee3.lib.Strings;

/**
 * Equivalent-Exchange-3
 * 
 * ContainerPortableTransmutation
 * 
 * @author pahimar
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class ContainerPortableTransmutation extends Container {

    @Override
    public boolean canInteractWith(EntityPlayer var1) {

        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void onCraftGuiClosed(EntityPlayer player) {

        super.onCraftGuiClosed(player);

        if (!player.worldObj.isRemote) {
            InventoryPlayer invPlayer = player.inventory;
            for (ItemStack itemStack : invPlayer.mainInventory) {
                if (itemStack != null) {
                    if (NBTHelper.hasTag(itemStack, Strings.NBT_ITEM_TRANSMUTATION_GUI_OPEN)) {
                        NBTHelper.removeTag(itemStack, Strings.NBT_ITEM_TRANSMUTATION_GUI_OPEN);
                    }
                }
            }
        }
    }
}
