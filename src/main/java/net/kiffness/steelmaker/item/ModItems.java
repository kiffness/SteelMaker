package net.kiffness.steelmaker.item;

import net.kiffness.steelmaker.SteelMakerMod;
import net.kiffness.steelmaker.item.custom.FuelItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SteelMakerMod.MOD_ID);

    // Coke
    public static final RegistryObject<Item> COAL_COKE = ITEMS.register("coke",
            () -> new FuelItem(new Item.Properties(), 200));
}
