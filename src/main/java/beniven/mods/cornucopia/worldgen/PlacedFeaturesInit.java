package beniven.mods.cornucopia.worldgen;
import beniven.mods.cornucopia.blocks.BlockInit;
import beniven.mods.cornucopia.cornucopia;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class PlacedFeaturesInit {
    public static final ResourceKey<PlacedFeature> MAPLE_PLACED_KEY = registerKey("maple_placed");

    public static final ResourceKey<PlacedFeature> DEAD_ROSE_PLACED_KEY = registerKey("dead_rose_placed");

    public static final ResourceKey<PlacedFeature> ROSE_PLACED_KEY = registerKey("rose_placed");

    public static final ResourceKey<PlacedFeature> TULIP_PLACED_KEY = registerKey("tulip_placed");

    public static final ResourceKey<PlacedFeature> FARM_PLACED_KEY = registerKey("farm_placed");

    public static void bootstrap(BootstapContext<PlacedFeature> context) {
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, MAPLE_PLACED_KEY, configuredFeatures.getOrThrow(ConfiguredFeaturesInit.MAPLE_KEY),
                VegetationPlacements.treePlacement(PlacementUtils.countExtra(3, 0.1f, 2),
                        BlockInit.MAPLE_SAPLING.get()));


        register(context, DEAD_ROSE_PLACED_KEY, configuredFeatures.getOrThrow(ConfiguredFeaturesInit.DEAD_ROSE_KEY),
                List.of(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, ROSE_PLACED_KEY, configuredFeatures.getOrThrow(ConfiguredFeaturesInit.ROSE_KEY),
                List.of(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));

        register(context, TULIP_PLACED_KEY, configuredFeatures.getOrThrow(ConfiguredFeaturesInit.TULIP_KEY),
                List.of(RarityFilter.onAverageOnceEvery(16), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome()));
    }


    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, new ResourceLocation(cornucopia.MODID, name));
    }

    private static void register(BootstapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}