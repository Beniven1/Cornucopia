package beniven.mods.cornucopia.items;

import beniven.mods.cornucopia.blocks.BlockInit;
import beniven.mods.cornucopia.cornucopia;
import beniven.mods.cornucopia.painting.PaintingInit;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeModeTabInit {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, cornucopia.MODID);

    public static final RegistryObject<CreativeModeTab> CORNUCOPIA = CREATIVE_MODE_TABS.register("cornucopia",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ItemInit.CANNED_PUMPKIN.get()))
                    .title(Component.translatable("creativetab.cornucopia"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ItemInit.CAN.get());
                        output.accept(ItemInit.CANNED_PUMPKIN.get());
                        output.accept(ItemInit.CANNED_APPLE.get());
                        output.accept(ItemInit.APPLE_PIE.get());
                        output.accept(ItemInit.CANNED_MELON.get());
                        output.accept(ItemInit.MELON_PIE.get());
                        output.accept(ItemInit.CORNUCOPIA.get());
                        output.accept(ItemInit.CORNUCOPIA_CANNON.get());

                        output.accept(ItemInit.PUMPKILN_GREAT_SWORD.get());
                        output.accept(ItemInit.PUMPKILN_SWORD.get());
                        output.accept(ItemInit.PUMPKILN_SHOVEL.get());
                        output.accept(ItemInit.PUMPKILN_PICKAXE.get());
                        output.accept(ItemInit.PUMPKILN_AXE.get());
                        output.accept(ItemInit.PUMPKILN_HOE.get());

                        output.accept(BlockInit.MAPLE_LEAVES.get());
                        output.accept(BlockInit.MAPLE_LOG.get());
                        output.accept(BlockInit.STRIPPED_MAPLE_LOG.get());
                        output.accept(BlockInit.MAPLE_SAPLING.get());
                        output.accept(BlockInit.MAPLE_PLANKS.get());
                        output.accept(BlockInit.PUMPKILN_BRICKS.get());
                        output.accept(BlockInit.CHISELED_PUMPKILN_BRICKS.get());
                        output.accept(BlockInit.CRACKED_PUMPKILN_BRICKS.get());
                        output.accept(BlockInit.MOLDY_PUMPKILN_BRICKS.get());
                        output.accept(BlockInit.MOSSY_PUMPKILN_BRICKS.get());
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
