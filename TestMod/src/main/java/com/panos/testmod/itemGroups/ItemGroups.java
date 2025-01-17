package com.panos.testmod.itemGroups;

import com.panos.testmod.PanosTestMod;
import com.panos.testmod.block.ModBlocks;
import com.panos.testmod.item.ModItems;
import io.netty.handler.ipfilter.IpSubnetFilter;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.network.state.PlayStateFactories;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

public class ItemGroups {
    public static final Text EXAMPLE_TITLE = Text.translatable("itemGroup." + PanosTestMod.MOD_ID + ".example_group");
    public static final ItemGroup EXAMPLE_GROUP = register("panos_mod_group", FabricItemGroup.builder()
            .displayName(EXAMPLE_TITLE)
            .icon(ModItems.VODKA::getDefaultStack)
            .entries((context, entries) -> {

                entries.add(ModItems.WITHERED_BONE);
                entries.add(ModItems.VODKA);
                entries.add(ModItems.SMALL_EXP_BOTTLE);
                entries.add(ModItems.MEDIUM_EXP_BOTTLE);
                entries.add(ModItems.LARGE_EXP_BOTTLE);
                entries.add(ModItems.GRAND_EXP_BOTTLE);
                entries.add(ModItems.NAUTILUS_SPAWN_EGG);
                entries.add(ModItems.DRAGON_ELYTRA);
                entries.add(ModItems.PLAYING_CARD);

                entries.add(ModBlocks.WHITE_COBBLESTONE);
                entries.add(ModBlocks.BLUE_WOOD_PLANKS);
                entries.add(ModBlocks.COPPER_LANTERN);
                entries.add(ModBlocks.COPPER_TORCH);
                entries.add(ModBlocks.ENDER_LANTERN);
                entries.add(ModBlocks.ENDER_TORCH);
                entries.add(ModBlocks.DEADWOOD_PLANKS);
                entries.add(ModBlocks.DEADWOOD_LOG);
                entries.add(ModBlocks.DEADWOOD_WOOD);
                entries.add(ModBlocks.STRIPPED_DEADWOOD_LOG);
                entries.add(ModBlocks.STRIPPED_DEADWOOD_WOOD);
                    })
            .build());
            public static <T extends ItemGroup> T register(String name, T itemGroup)
            {
                return Registry.register(Registries.ITEM_GROUP, PanosTestMod.id(name), itemGroup);
            }

            public static void load()
            {

            }
}
