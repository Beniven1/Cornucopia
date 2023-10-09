package beniven.mods.cornucopia;

import beniven.mods.cornucopia.blocks.BlockInit;
import beniven.mods.cornucopia.items.CreativeModeTabInit;
import beniven.mods.cornucopia.items.ItemInit;
import beniven.mods.cornucopia.loot.LootModifierInit;
import beniven.mods.cornucopia.painting.PaintingInit;
import beniven.mods.cornucopia.worldgen.ConfiguredFeaturesInit;
import beniven.mods.cornucopia.worldgen.FoliagePlacerTypesInit;
import beniven.mods.cornucopia.worldgen.PlacedFeaturesInit;
import beniven.mods.cornucopia.worldgen.biome.TerraBlenderAPIInit;
import beniven.mods.cornucopia.worldgen.tree.MapleFoliagePlacer;
import beniven.mods.cornucopia.worldgen.tree.MapleTreeGrower;
import beniven.mods.cornucopia.worldgen.tree.MapleTrunkPlacer;
import beniven.mods.cornucopia.worldgen.tree.TrunkPlacerTypesInit;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(cornucopia.MODID)
public class cornucopia {
    public static final String MODID = "cornucopia";

    public cornucopia() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        CreativeModeTabInit.register(modEventBus);

        ItemInit.register(modEventBus);
        BlockInit.register(modEventBus);

        LootModifierInit.register(modEventBus);
        PaintingInit.register(modEventBus);

        TrunkPlacerTypesInit.register(modEventBus);
        FoliagePlacerTypesInit.register(modEventBus);

        TerraBlenderAPIInit.registerRegions();
    }
}
