package com.sjc0910.betterrecipes.materials;

import net.minecraft.item.Item;
import com.sjc0910.betterrecipes.ModGroup;
import net.minecraftforge.fml.common.Mod;

public class DiamondStick extends Item {
    public DiamondStick() {
        super(new Properties().group(ModGroup.BRGroup).maxStackSize(16));
    }
}
