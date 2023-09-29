package beniven.mods.cornucopia.worldgen;
import beniven.mods.cornucopia.cornucopia;
import beniven.mods.cornucopia.worldgen.tree.MapleFoliagePlacer;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class FoliagePlacerTypesInit {
    public static final DeferredRegister<FoliagePlacerType<?>> FOLIAGE_PLACERS =
            DeferredRegister.create(Registries.FOLIAGE_PLACER_TYPE, cornucopia.MODID);

    public static final RegistryObject<FoliagePlacerType<MapleFoliagePlacer>> MAPLE_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("maple_foliage_placer", () -> new FoliagePlacerType<>(MapleFoliagePlacer.CODEC));

    public static void register(IEventBus eventBus) {
        FOLIAGE_PLACERS.register(eventBus);
    }
}