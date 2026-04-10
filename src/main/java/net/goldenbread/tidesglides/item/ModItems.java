package net.goldenbread.tidesglides.item;

import net.goldenbread.tidesglides.TidesAndGlides;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TidesAndGlides.MOD_ID);

    public static final DeferredItem<Item> OYSTER_SHELL = ITEMS.register("oyster_shell",
            ()-> new Item(new Item.Properties()));
    public static final DeferredItem <Item> OYSTER = ITEMS.register("oyster",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> PEARL = ITEMS.register("pearl",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
