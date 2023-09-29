package beniven.mods.cornucopia;

import beniven.mods.cornucopia.blocks.BlockInit;
import beniven.mods.cornucopia.items.ItemInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(cornucopia.MODID)
public class cornucopia {
    public static final String MODID = "cornucopia";

    public cornucopia() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.register(modEventBus);
        BlockInit.register(modEventBus);
    }
}
