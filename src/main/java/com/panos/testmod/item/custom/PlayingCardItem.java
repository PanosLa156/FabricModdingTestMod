package com.panos.testmod.item.custom;

import com.panos.testmod.entity.custom.PlayingCardEntity;
import com.panos.testmod.item.ModItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ProjectileItem;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Position;
import net.minecraft.world.World;

public class PlayingCardItem extends Item implements ProjectileItem {

    public PlayingCardItem(Item.Settings settings) {
        super(settings);
    }


    @Override
    public boolean allowComponentsUpdateAnimation(PlayerEntity player, Hand hand, ItemStack oldStack, ItemStack newStack) {
        return super.allowComponentsUpdateAnimation(player, hand, oldStack, newStack);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        world.playSound(
                null,
                user.getX(),
                user.getY(),
                user.getZ(),
                SoundEvents.ENTITY_SNOWBALL_THROW,
                SoundCategory.NEUTRAL,
                0.5F,
                0.4F / (world.getRandom().nextFloat() * 0.4F + 0.8F)
        );
        if (!world.isClient) {
            PlayingCardEntity playingCardEntity = new PlayingCardEntity(world, user, ModItems.PLAYING_CARD.getDefaultStack());
            playingCardEntity.getDefaultItemStack();
            playingCardEntity.setVelocity(user, user.getPitch(), user.getYaw(), -5F, 1.5F, 0.5F);
            world.spawnEntity(playingCardEntity);
        }

        user.incrementStat(Stats.USED.getOrCreateStat(this));
        itemStack.decrementUnlessCreative(1, user);
        return TypedActionResult.success(itemStack, world.isClient());
    }

    @Override
    public ProjectileEntity createEntity(World world, Position pos, ItemStack stack, Direction direction) {
        return new PlayingCardEntity(world, pos.getX(), pos.getY(), pos.getZ(), ModItems.PLAYING_CARD.getDefaultStack());
    }


    @Override
    public ProjectileItem.Settings getProjectileSettings() {
        return ProjectileItem.Settings.builder()
                .uncertainty(ProjectileItem.Settings.DEFAULT.uncertainty() * 0.5F)
                .power(ProjectileItem.Settings.DEFAULT.power() * 2F)
                .build();
    }

    /*@Override
    public void initializeProjectile(ProjectileEntity entity, double x, double y, double z, float power, float uncertainty) {
        ProjectileItem.super.initializeProjectile(entity, x, y, z, power, uncertainty);
    }*/
}
