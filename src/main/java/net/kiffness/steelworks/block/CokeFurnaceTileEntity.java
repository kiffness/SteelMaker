package net.kiffness.steelworks.block;

import net.minecraft.client.renderer.texture.Tickable;
import net.minecraft.core.BlockPos;
import net.minecraft.core.NonNullList;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class CokeFurnaceTileEntity extends BlockEntity implements Tickable {
    private NonNullList<ItemStack> inventory = NonNullList.withSize(2, ItemStack.EMPTY);
    private int burnTime = 0;

    public CokeFurnaceTileEntity(BlockPos pos, BlockState state) {
        super (ModTileEntities.COKE_FURNACE.get(), pos, state);
    }

    @Override
    public void tick() {

    }
}
