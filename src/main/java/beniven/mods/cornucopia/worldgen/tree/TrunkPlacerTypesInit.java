package beniven.mods.cornucopia.worldgen.tree;
import beniven.mods.cornucopia.cornucopia;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class TrunkPlacerTypesInit {
    public static final DeferredRegister<TrunkPlacerType<?>> TRUNK_PLACERS =
            DeferredRegister.create(Registries.TRUNK_PLACER_TYPE, cornucopia.MODID);

    public static final RegistryObject<TrunkPlacerType<MapleTrunkPlacer>> MAPLE_TRUNK_PLACER =
            TRUNK_PLACERS.register("maple_trunk_placer", () -> new TrunkPlacerType<>(MapleTrunkPlacer.CODEC));

    public static void register(IEventBus eventBus) {
        TRUNK_PLACERS.register(eventBus);
    }
}