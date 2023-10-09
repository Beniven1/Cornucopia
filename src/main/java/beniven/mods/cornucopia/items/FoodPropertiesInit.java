package beniven.mods.cornucopia.items;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class FoodPropertiesInit {
    public static final FoodProperties CANNED_PUMPKIN = new FoodProperties.Builder().nutrition(3).saturationMod(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 200), 0.1f).build();

    public static final FoodProperties CANNED_APPLE = new FoodProperties.Builder().nutrition(3).saturationMod(0.25f).build();

    public static final FoodProperties CANNED_MELON = new FoodProperties.Builder().nutrition(3).saturationMod(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.WATER_BREATHING, 200), 0.1f).build();

    public static final FoodProperties CORNUCOPIA = new FoodProperties.Builder().nutrition(8).saturationMod(0.5f).meat().build();

    public static final FoodProperties APPLE_PIE = new FoodProperties.Builder().nutrition(8).saturationMod(0.3f).meat().build();
    public static final FoodProperties MELON_PIE = new FoodProperties.Builder().nutrition(8).saturationMod(0.3f).meat().build();

}