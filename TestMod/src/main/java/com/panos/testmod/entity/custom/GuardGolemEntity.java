package com.panos.testmod.entity.custom;

import com.panos.testmod.item.ModItems;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.passive.GolemEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.recipe.Ingredient;
import net.minecraft.world.World;

public class GuardGolemEntity extends IronGolemEntity {


    public GuardGolemEntity(EntityType<? extends IronGolemEntity> entityType, World world) {
        super(entityType, world);
    }

    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        //this.goalSelector.add(1, new TemptGoal(this, 1.25D, Ingredient.ofItems(ModItems.RUBY),false));
        this.goalSelector.add(1, new AttackGoal( this));
        //this.goalSelector.add(2, new MeleeAttackGoal(this, 1f, true));
        this.goalSelector.add(3, new WanderAroundGoal(this, 1D));
    }

    public static DefaultAttributeContainer.Builder createGuardGolemAttributes(){
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 50f)
                .add(EntityAttributes.GENERIC_WATER_MOVEMENT_EFFICIENCY , 1f)
                .add(EntityAttributes.GENERIC_ARMOR , 1f)
                .add(EntityAttributes.GENERIC_GRAVITY, 1f)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 1f);
    }
}
