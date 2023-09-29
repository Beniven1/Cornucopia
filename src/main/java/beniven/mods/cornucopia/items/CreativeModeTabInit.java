package beniven.mods.cornucopia.items;

import beniven.mods.cornucopia.blocks.BlockInit;
import beniven.mods.cornucopia.cornucopia;
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

    public static final RegistryObject<CreativeModeTab> COURSE_TAB = CREATIVE_MODE_TABS.register("course_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ItemInit.CANNED_PUMPKIN.get()))
                    .title(Component.translatable("creativetab.cornucopia"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ItemInit.CAN.get());
                        output.accept(ItemInit.CANNED_PUMPKIN.get());
                        output.accept(BlockInit.MAPLE_LEAVES.get());
                        output.accept(BlockInit.MAPLE_LOG.get());
                        output.accept(BlockInit.STRIPPED_MAPLE_LOG.get());
                        output.accept(BlockInit.MAPLE_SAPLING.get());
                        output.accept(BlockInit.MAPLE_PLANKS.get());
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
