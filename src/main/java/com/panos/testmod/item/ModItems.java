package com.panos.testmod.item;

import com.panos.testmod.PanosTestMod;
import com.panos.testmod.item.custom.SmallExpBottleItem;
import com.panos.testmod.list.FoodList;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item WITHERED_BONE = register("withered_bone", new Item(new Item.Settings()));
    public static final Item VODKA = register("vodka",
            new Item(new Item.Settings().food(FoodList.VODKA_SETTINGS).maxCount(2)));

    public static final Item SMALL_EXP_BOTTLE = register("small_exp_bottle",
            new SmallExpBottleItem(new Item.Settings()));

    public static <T extends Item> T register(String name, T item){
        return Registry.register(Registries.ITEM, PanosTestMod.id(name),item);
    }

    public static void load() {}
}
