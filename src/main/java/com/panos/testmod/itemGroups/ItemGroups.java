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
                        entries.add(ModBlocks.WHITE_COBBLESTONE);
                        entries.add(ModBlocks.BLUE_WOOD_PLANKS);
                        entries.add(ModBlocks.COPPER_LANTERN);
                        entries.add(ModBlocks.COPPER_TORCH);
                        entries.add(ModBlocks.ENDER_LANTERN);
                        entries.add(ModBlocks.ENDER_TORCH);
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
