package com.panos.testmod.handler;

import net.fabricmc.fabric.api.entity.event.v1.EntityElytraEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ElytraItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.event.GameEvent;

import java.util.List;

public class ModElytraHandler {
    static {
        EntityElytraEvents.CUSTOM.register((entity, tickElytra) -> {
            ItemStack elytraStack = entity.getEquippedStack(EquipmentSlot.CHEST);
            if (ElytraItem.isUsable(elytraStack)) {
                if (tickElytra) {
                    int nextRoll = entity.getFallFlyingTicks() + 1;

                    if (!entity.getWorld().isClient && nextRoll % 10 == 0) {
                        if ((nextRoll / 10) % 2 == 0) {
                            elytraStack.damage(1, (ServerWorld) entity.getWorld(), (entity instanceof ServerPlayerEntity) ? (ServerPlayerEntity) entity : null, (item) -> {
                                entity.getEquippedStack(EquipmentSlot.CHEST);
                            });
                        }
                        entity.emitGameEvent(GameEvent.ELYTRA_GLIDE);
                    }
                }
                return true;
            }
            return false;
        });
    }
    public static void init() {}
}