package net.wakkle.titaniummod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.wakkle.titaniummod.TitaniumMod;

public class ModeCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TitaniumMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TITANIUM_MOD_TAB = CREATIVE_MODE_TABS.register("titanium_mod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TITANIUM_INGOT.get()))
                    .title(Component.translatable("creativetab.titanium_mod_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.TITANIUM_ORE.get());
                        pOutput.accept(ModItems.TITANIUM_INGOT.get());

                        pOutput.accept(Items.CRAFTING_TABLE);
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
