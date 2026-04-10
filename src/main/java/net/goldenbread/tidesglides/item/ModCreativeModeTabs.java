package net.goldenbread.tidesglides.item;

import net.goldenbread.tidesglides.TidesAndGlides;
import net.goldenbread.tidesglides.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TidesAndGlides.MOD_ID);

    public static final Supplier<CreativeModeTab> TIDES_AND_GLIDES_TAB = CREATIVE_MODE_TAB.register("tides_and_glides_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.OYSTER_SHELL.get()))
                    .title(Component.translatable("creativetab.tidesglides.tides_and_glides_tab"))
                    .displayItems((Parameters, output) -> {
                        output.accept(ModItems.OYSTER);
                        output.accept(ModItems.OYSTER_SHELL);
                        output.accept(ModItems.PEARL);
                        output.accept(ModBlocks.BLACK_SAND);
                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }

}
