package com.lungovski19.newdoors.blocks;

import com.lungovski19.newdoors.NewDoorsMod;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.BlockState;
import net.minecraft.block.DoorBlock;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.TallBlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class StoneDoor extends DoorBlock {

    public StoneDoor(Settings block$Settings_1, String name) {
        super(block$Settings_1);
        Registry.register(Registry.BLOCK, new Identifier(NewDoorsMod.MOD_ID, name), this);
        Registry.register(Registry.ITEM, new Identifier(NewDoorsMod.MOD_ID, name), new TallBlockItem(this, new Item.Settings().group(ItemGroup.REDSTONE)));
        BlockRenderLayerMap.INSTANCE.putBlock(this, RenderLayer.getCutout());
    }
}
