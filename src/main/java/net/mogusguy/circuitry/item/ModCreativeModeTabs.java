package net.mogusguy.circuitry.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.mogusguy.circuitry.Circuitry;
import net.mogusguy.circuitry.block.ModBlocks;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create
            (Registries.CREATIVE_MODE_TAB, Circuitry.MOD_ID);

    public static final Supplier<CreativeModeTab> CIRCUITRY_ITEMS_TAB = CREATIVE_MODE_TAB.register(
            "circuitry_items_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(
                    ModItems.ENDERITE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(Circuitry.MOD_ID, "enderite_items_tab"))
                    .title(Component.translatable("creativetab.mog_circuitry.enderite_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ENDERITE);
                        output.accept(ModItems.E);
                        output.accept(ModItems.PEN);
                    }).build());

    public static final Supplier<CreativeModeTab> CIRCUITRY_BLOCK_TAB = CREATIVE_MODE_TAB.register(
            "circuitry_blocks_tab", () -> CreativeModeTab.builder().icon(() -> new ItemStack(
                    ModItems.ENDERITE.get()))
                    .title(Component.translatable("creativetab.mog_circuitry.enderite_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.ENDERITE_BLOCK);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
