package net.kiffness.steelworks.item;

import net.kiffness.steelworks.SteelWorksMod;
import net.kiffness.steelworks.item.custom.FuelItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SteelWorksMod.MOD_ID);

    // Coke
    public static final RegistryObject<Item> COAL_COKE = ITEMS.register("coal_coke",
            () -> new FuelItem(new Item.Properties(), 1800));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
