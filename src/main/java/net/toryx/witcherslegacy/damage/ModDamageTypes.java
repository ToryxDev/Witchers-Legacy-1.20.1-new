package net.toryx.witcherslegacy.damage;

import net.minecraft.entity.damage.*;
import net.minecraft.registry.*;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;

public class ModDamageTypes {

    public static final RegistryKey<DamageType> BLEED_DAMAGE_SOURCE = RegistryKey.of(RegistryKeys.DAMAGE_TYPE, new Identifier("witcherslegacy", "bleeding"));

    public static DamageSource of(World world, RegistryKey<DamageType> key) {
        return new DamageSource(world.getRegistryManager().get(RegistryKeys.DAMAGE_TYPE).entryOf(key));
    }
}
