package beniven.mods.cornucopia.datagen;
import beniven.mods.cornucopia.cornucopia;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.ForgeAdvancementProvider;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = cornucopia.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeServer(), new RecipeProviderInit(packOutput));
        generator.addProvider(event.includeServer(), LootTableProviderInit.create(packOutput));
        BlockTagsProvider blockTagsProvider = new BlockTagGeneratorInit(packOutput, lookupProvider, existingFileHelper);
        generator.addProvider(event.includeServer(), blockTagsProvider);
        generator.addProvider(event.includeServer(), new ItemTagGeneratorInit(packOutput, lookupProvider, blockTagsProvider.contentsGetter(), existingFileHelper));


        generator.addProvider(event.includeClient(), new BlockStateProviderInit(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new ItemModelProviderInit(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(), new GlobalLootModifierProviderInit(packOutput));
        generator.addProvider(event.includeClient(), new PaintingVariantTagProviderInit(packOutput, lookupProvider, existingFileHelper));

        generator.addProvider(event.includeClient(), new ForgeAdvancementProvider(packOutput, lookupProvider, existingFileHelper, List.of(new AdvancementProviderInit())));

        generator.addProvider(event.includeServer(), new WorldGenProviderInit(packOutput, lookupProvider));
    }
}