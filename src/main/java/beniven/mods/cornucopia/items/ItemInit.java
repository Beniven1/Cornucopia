package beniven.mods.cornucopia.items;

import beniven.mods.cornucopia.cornucopia;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.sql.Ref;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, cornucopia.MODID);

    public static final RegistryObject<Item> CAN = ITEMS.register("can",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> CANNED_PUMPKIN = ITEMS.register("canned_pumpkin",
            () -> new Item(new Item.Properties().food(FoodPropertiesInit.CANNED_PUMPKIN)));

    public static final RegistryObject<Item> CANNED_APPLE = ITEMS.register("canned_apple",
            () -> new Item(new Item.Properties().food(FoodPropertiesInit.CANNED_APPLE)));

    public static final RegistryObject<Item> APPLE_PIE = ITEMS.register("apple_pie",
            () -> new Item(new Item.Properties().food(FoodPropertiesInit.APPLE_PIE)));

    public static final RegistryObject<Item> CANNED_MELON = ITEMS.register("canned_melon",
            () -> new Item(new Item.Properties().food(FoodPropertiesInit.CANNED_MELON)));

    public static final RegistryObject<Item> MELON_PIE = ITEMS.register("melon_pie",
            () -> new Item(new Item.Properties().food(FoodPropertiesInit.MELON_PIE)));

    public static final RegistryObject<Item> CORNUCOPIA = ITEMS.register("cornucopia",
            () -> new Item(new Item.Properties().food(FoodPropertiesInit.CORNUCOPIA)));


    public static final RegistryObject<Item> PUMPKILN_GREAT_SWORD = ITEMS.register("pumpkiln_great_sword",
            () -> new SwordItem(ToolTierInit.PUMPKILN, 4, 6, new Item.Properties().durability(356)));
    public static final RegistryObject<Item> PUMPKILN_SWORD = ITEMS.register("pumpkiln_sword",
            () -> new SwordItem(ToolTierInit.PUMPKILN, 2, 3, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> PUMPKILN_PICKAXE = ITEMS.register("pumpkiln_pickaxe",
            () -> new PickaxeItem(ToolTierInit.PUMPKILN, 1, 2, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> PUMPKILN_SHOVEL = ITEMS.register("pumpkiln_shovel",
            () -> new ShovelItem(ToolTierInit.PUMPKILN, 2, 3, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> PUMPKILN_AXE = ITEMS.register("pumpkiln_axe",
            () -> new AxeItem(ToolTierInit.PUMPKILN, 2, 3, new Item.Properties().durability(256)));
    public static final RegistryObject<Item> PUMPKILN_HOE = ITEMS.register("pumpkiln_hoe",
            () -> new HoeItem(ToolTierInit.PUMPKILN, 2, 3, new Item.Properties().durability(256)));

    public static final RegistryObject<Item> CORNUCOPIA_CANNON = ITEMS.register("cornucopia_cannon",
            () -> new BowItem((new Item.Properties()).durability(384)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}