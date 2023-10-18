package beniven.mods.cornucopia.datagen;
import beniven.mods.cornucopia.blocks.BlockInit;
import beniven.mods.cornucopia.cornucopia;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockStateProviderInit extends BlockStateProvider {
    public BlockStateProviderInit(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, cornucopia.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        logBlock(((RotatedPillarBlock) BlockInit.MAPLE_LOG.get()));
        saplingBlock(BlockInit.MAPLE_SAPLING);
        leavesBlock(BlockInit.MAPLE_LEAVES);
        logBlock(((RotatedPillarBlock) BlockInit.STRIPPED_MAPLE_LOG.get()));
        blockWithItem(BlockInit.MAPLE_PLANKS);
        blockWithItem(BlockInit.PUMPKILN_BRICKS);
        blockWithItem(BlockInit.CHISELED_PUMPKILN_BRICKS);
        blockWithItem(BlockInit.CRACKED_PUMPKILN_BRICKS);
        blockWithItem(BlockInit.MOLDY_PUMPKILN_BRICKS);
        blockWithItem(BlockInit.MOSSY_PUMPKILN_BRICKS);
        blockWithItem(BlockInit.SMOOTH_PUMPKILN_BRICKS);

        blockItem(BlockInit.MAPLE_LOG);
        blockItem(BlockInit.STRIPPED_MAPLE_LOG);
    }

    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), new ResourceLocation("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject, String appendix) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("cornucopia:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("cornucopia:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}