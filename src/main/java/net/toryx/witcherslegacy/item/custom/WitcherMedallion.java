package net.toryx.witcherslegacy.item.custom;

import net.minecraft.item.*;

public class WitcherMedallion extends Item{
    public WitcherMedallion(Settings settings) {
        super(settings);
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return super.hasGlint(stack); // This code already exists in a super method, so why is it here?
    }
}
