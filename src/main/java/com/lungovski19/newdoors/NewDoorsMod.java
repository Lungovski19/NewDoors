package com.lungovski19.newdoors;

import com.lungovski19.newdoors.blocks.NewDoorBlock;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.DoorBlock;

public class NewDoorsMod implements ModInitializer {
	public static final String MOD_ID = "newdoors";

	public static NewDoorBlock stone_doorblock;
	public static NewDoorBlock sandstone_doorblock;

	@Override
	public void onInitialize() {
		stone_doorblock = new NewDoorBlock(Block.Settings.copy(Blocks.OAK_DOOR), "stone_door");
		sandstone_doorblock = new NewDoorBlock(Block.Settings.copy(Blocks.OAK_DOOR), "sandstone_door");
	}

	public static BlockState copyState(BlockState copyState) {
		if (!(copyState.getBlock() instanceof DoorBlock)) return copyState;

		BlockState newState = stone_doorblock.getDefaultState();
		return newState.with(DoorBlock.FACING, copyState.get(DoorBlock.FACING)).with(DoorBlock.HINGE, copyState.get(DoorBlock.HINGE)).with(DoorBlock.OPEN, copyState.get(DoorBlock.OPEN));
	}
}
