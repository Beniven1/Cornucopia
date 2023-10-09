package beniven.mods.cornucopia.datagen;
import beniven.mods.cornucopia.cornucopia;
import beniven.mods.cornucopia.items.ItemInit;
import beniven.mods.cornucopia.loot.AddItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class GlobalLootModifierProviderInit extends GlobalLootModifierProvider {
    public GlobalLootModifierProviderInit(PackOutput output) {
        super(output, cornucopia.MODID);
    }

    @Override
    protected void start() {
        add("canned_pumpkin_mineshaft", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/abandoned_mineshaft")).build() },
                ItemInit.CANNED_PUMPKIN.get()));

        add("canned_apple_mineshaft", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/abandoned_mineshaft")).build() },
                ItemInit.CANNED_APPLE.get()));

        add("canned_melon_mineshaft", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/abandoned_mineshaft")).build() },
                ItemInit.CANNED_MELON.get()));
    }
}