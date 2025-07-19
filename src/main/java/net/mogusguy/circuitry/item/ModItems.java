package net.mogusguy.circuitry.item;

import net.minecraft.world.item.Item;
import net.mogusguy.circuitry.Circuitry;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Circuitry.MOD_ID);

    public static final DeferredItem<Item> ENDERITE = ITEMS.register("enderite",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> E = ITEMS.register("e",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> PEN = ITEMS.register("pen",
            () -> new Item(new Item.Properties()));// Adds a pen

    public static final DeferredItem<Item> NULL = ITEMS.register("null",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
