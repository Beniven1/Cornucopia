package beniven.mods.cornucopia.datagen;
import beniven.mods.cornucopia.blocks.BlockInit;
import beniven.mods.cornucopia.cornucopia;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class BlockTagGeneratorInit extends BlockTagsProvider {
    public BlockTagGeneratorInit(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                                 @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, cornucopia.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(BlockInit.PUMPKILN_BRICKS.get(),
                        BlockInit.CHISELED_PUMPKILN_BRICKS.get(),
                        BlockInit.CRACKED_PUMPKILN_BRICKS.get(),
                        BlockInit.MOSSY_PUMPKILN_BRICKS.get(),
                        BlockInit.MOLDY_PUMPKILN_BRICKS.get(),
                        BlockInit.SMOOTH_PUMPKILN_BRICKS.get());


        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(BlockInit.MAPLE_LOG.get())
                .add(BlockInit.STRIPPED_MAPLE_LOG.get());

        this.tag(BlockTags.PLANKS)
                .add(BlockInit.MAPLE_PLANKS.get());
    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}