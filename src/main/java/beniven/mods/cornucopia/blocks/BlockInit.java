package beniven.mods.cornucopia.blocks;

import beniven.mods.cornucopia.cornucopia;
import beniven.mods.cornucopia.items.ItemInit;
import beniven.mods.cornucopia.worldgen.tree.MapleTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, cornucopia.MODID);

    public static final RegistryObject<Block> MAPLE_LOG = registerBlock("maple_log",
            () -> new FlammableRotatedPillarBlockInit(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log",
            () -> new FlammableRotatedPillarBlockInit(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> MAPLE_SAPLING = registerBlock("maple_sapling",
            () -> new SaplingBlockInit(new MapleTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    public static final RegistryObject<Block> DEAD_ROSE = registerBlock("dead_rose",
            () -> new FlowerBlock(MobEffects.CONFUSION, 5, BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PLANT)
                    .noCollission()
                    .instabreak()
                    .sound(SoundType.GRASS)
                    .offsetType(BlockBehaviour.OffsetType.XZ)
                    .pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> MAPLE_PLANKS = registerBlock("maple_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 5;
                }
            });

    public static final RegistryObject<Block> MAPLE_LEAVES = registerBlock("maple_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)) {
                @Override
                public boolean isFlammable(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter level, BlockPos pos, Direction direction) {
                    return 30;
                }
            });

    public static final RegistryObject<Block> PUMPKILN_BRICKS = registerBlock("pumpkiln_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

    public static final RegistryObject<Block> CHISELED_PUMPKILN_BRICKS = registerBlock("chiseled_pumpkiln_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));

    public static final RegistryObject<Block> CRACKED_PUMPKILN_BRICKS = registerBlock("cracked_pumpkiln_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CRACKED_STONE_BRICKS)));

    public static final RegistryObject<Block> MOLDY_PUMPKILN_BRICKS = registerBlock("moldy_pumpkiln_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICKS)));

    public static final RegistryObject<Block> MOSSY_PUMPKILN_BRICKS = registerBlock("mossy_pumpkiln_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.MOSSY_STONE_BRICKS)));

    public static final RegistryObject<Block> SMOOTH_PUMPKILN_BRICKS = registerBlock("smooth_pumpkiln_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SMOOTH_STONE)));


    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}