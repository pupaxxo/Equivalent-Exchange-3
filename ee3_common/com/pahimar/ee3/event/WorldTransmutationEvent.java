package com.pahimar.ee3.event;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class WorldTransmutationEvent extends ActionEvent {

    public int targetID, targetMeta;

    public WorldTransmutationEvent(byte actionType, ItemStack itemStack, EntityPlayer player, World world, int x, int y, int z, boolean hasActionOccured, String data) {

        super(actionType, itemStack, player, world, x, y, z, hasActionOccured, data);
        targetID = Integer.parseInt(data.substring(0, data.indexOf(":")));
        targetMeta = Integer.parseInt(data.substring(data.indexOf(":") + 1));
        actionResult = ActionResult.DEFAULT;
    }

}
