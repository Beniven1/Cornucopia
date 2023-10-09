package beniven.mods.cornucopia.datagen;
import beniven.mods.cornucopia.cornucopia;
import beniven.mods.cornucopia.worldgen.ConfiguredFeaturesInit;
import beniven.mods.cornucopia.worldgen.PlacedFeaturesInit;
import beniven.mods.cornucopia.worldgen.biome.BiomeInit;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class WorldGenProviderInit extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, ConfiguredFeaturesInit::bootstrap)
            .add(Registries.PLACED_FEATURE, PlacedFeaturesInit::bootstrap)
            .add(Registries.BIOME, BiomeInit::boostrap);

    public WorldGenProviderInit(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(cornucopia.MODID));
    }
}