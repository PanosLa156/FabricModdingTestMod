package com.panos.testmod.list;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class FoodList {
    public static final FoodComponent VODKA_SETTINGS = new FoodComponent.Builder()
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200 , 2), 1F)
            .statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 1 , 0), 0.5F)
            .statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 80 , 1), 0.25F)
            .build();
}
