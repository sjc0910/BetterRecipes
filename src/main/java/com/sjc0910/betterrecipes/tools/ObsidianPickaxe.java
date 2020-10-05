package com.sjc0910.betterrecipes.tools;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import com.sjc0910.betterrecipes.ModItemTier;

public class ObsidianPickaxe extends PickaxeItem {
    public ObsidianPickaxe() {
        super(ModItemTier.OBSIDIAN, 2, -3F, new Properties().group(ItemGroup.TOOLS));
    }
}
