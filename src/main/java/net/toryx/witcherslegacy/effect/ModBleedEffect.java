package net.toryx.witcherslegacy.effect;

import net.minecraft.entity.effect.*;

public class ModBleedEffect extends StatusEffect{

    public ModBleedEffect() {
        super(StatusEffectCategory.HARMFUL, 0xeb4c42); // Color in RGB
    }

    @Override
    public boolean canApplyUpdateEffect(int amplifier, int duration) {
        return true;
    }
}
