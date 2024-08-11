package com.panos.testmod.util;

import com.panos.testmod.item.ModItems;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifier {
    private static final Identifier WITHER_SKELETON_ID = Identifier
            .of("minecraft", "entities/wither_skeleton");
    private static final Identifier DESERT_PYRAMID_ID = Identifier
            .of("minecraft", "archaeology/desert_pyramid");
    private static final Identifier RUINED_PORTAL_ID = Identifier
            .of("minecraft", "chests/ruined_portal");
    public static void modifyLootTables()
    {
        LootTableEvents.MODIFY.register((key, original, source) -> {
            if(WITHER_SKELETON_ID.equals(key.getValue()))
            {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModItems.WITHERED_BONE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(0.0f, 3.0f)).build());
                original.pool(poolBuilder.build());
            }
        });
        LootTableEvents.MODIFY.register((key, original, source) -> {
            if(DESERT_PYRAMID_ID.equals(key.getValue()))
            {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModItems.RUBY))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(5.0f, 10.0f)).build());
                original.pool(poolBuilder.build());
            }
        });
        LootTableEvents.MODIFY.register((key, original, source) -> {
            if(RUINED_PORTAL_ID.equals(key.getValue()))
            {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(1f)) // Drops 100% of the time
                        .with(ItemEntry.builder(ModItems.RUBY))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(5.0f, 10.0f)).build());
                original.pool(poolBuilder.build());
            }
        });
    }
}
