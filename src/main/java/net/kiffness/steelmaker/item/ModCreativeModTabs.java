package net.kiffness.steelmaker.item;

import net.kiffness.steelmaker.SteelMakerMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SteelMakerMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> STEELMAKER_TAB = CREATIVE_MODE_TABS.register("steelmaker_tab",
            () ->
                CreativeModeTab
                        .builder()
                        .title(Component.translatable("creativetab.steelmaker_tab"))
                        .displayItems((displayParameters, output) -> {
                            output.accept(ModItems.COAL_COKE.get());
                        })
                        .build());
}
