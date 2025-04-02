package net.kiffness.steelworks.item;

import net.kiffness.steelworks.SteelWorksMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SteelWorksMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> STEELMAKER_TAB = CREATIVE_MODE_TABS.register("steelmaker_tab",
            () ->
                CreativeModeTab
                        .builder()
                        .title(Component.translatable("creativetab.steelmaker_tab"))
                        .displayItems((displayParameters, output) -> {
                            output.accept(ModItems.COAL_COKE.get());
                        })
                        .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
