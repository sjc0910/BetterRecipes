package com.sjc0910.betterrecipes.foods;
import com.sjc0910.betterrecipes.ModGroup;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

import javax.swing.*;

public class ObsidianApple extends Item {
    // ����ʯƻ��
    // �ָ�10����ֵ��10���Ͷ�
    // Buff:
    // 1. ˲������ 3
    // 2. Ѫ������ 5 5m
    // 3. �������� 5 8m
    // 4. Ѫ���ָ� 1 30s
    // Debuff:
    // 1. �ж� 1 3s 75%
    // 2. ���� 2 30s 50%
    // 3. ���� 3 20s
    // 4. ʧ�� 1 5s 80%
    private static final Food food = (new Food.Builder())
            .saturation(10)
            .hunger(10)
            .effect(()-> new EffectInstance(Effects.REGENERATION, 30 * 20, 1), 1)
            .effect(()-> new EffectInstance(Effects.POISON, 3 * 20, 1), (float).75)
            .effect(()-> new EffectInstance(Effects.INSTANT_HEALTH,1, 3), 1)
            .effect(()-> new EffectInstance(Effects.HEALTH_BOOST, 5 * 60 * 20, 5), 1)
            .effect(()-> new EffectInstance(Effects.HUNGER, 30 * 20, 2), (float).5)
            .effect(()-> new EffectInstance(Effects.SLOWNESS, 20 * 20, 3), 1)
            .effect(()-> new EffectInstance(Effects.INVISIBILITY, 5 * 20, 1), (float).8)
            .effect(()-> new EffectInstance(Effects.STRENGTH, 8 * 60 * 20, 5), 1)
            .effect(()-> new EffectInstance(Effects.FIRE_RESISTANCE, 10 * 60 * 20, 1), 1)
            .setAlwaysEdible()
            .build();
    public ObsidianApple() {
        super(new Properties().food(food).group(ItemGroup.FOOD));
    }
}