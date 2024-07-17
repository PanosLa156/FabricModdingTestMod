package com.panos.testmod.item;

import com.panos.testmod.PanosTestMod;
import com.panos.testmod.entity.ModEntities;
import com.panos.testmod.item.custom.SmallExpBottleItem;
import com.panos.testmod.list.FoodList;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item WITHERED_BONE = register("withered_bone", new Item(new Item.Settings()));
    public static final Item RUBY = register("ruby", new Item(new Item.Settings()));
    public static final Item VODKA = register("vodka",
            new Item(new Item.Settings().food(FoodList.VODKA_SETTINGS).maxCount(2)));

    //public static final Item NAUTILUS_SPAWN_EGG = register("nautilus_spawn_egg",
     //   new SpawnEggItem(ModEntities.NAUTILUS, 0xbaad96,0xbaad96,new Item.Settings()));

    public static final Item SMALL_EXP_BOTTLE = register("small_exp_bottle",
            new SmallExpBottleItem(new Item.Settings()));

    public static <T extends Item> T register(String name, T item){
        return Registry.register(Registries.ITEM, PanosTestMod.id(name),item);
    }

    public static final Item NAUTILUS_SPAWN_EGG = registerSpawnEggItem("nautilus_spawn_egg", ModItems.NAUTILUS_SPAWN_EGG);

    public static Item registerSpawnEggItem(String name, Item item) {
        return Registry.register(Registries.ITEM, PanosTestMod.id(name),
                new SpawnEggItem(ModEntities.NAUTILUS, 0xbaad96, 0xca7548, new Item.Settings()));
    }

    public static void load() {}
}