package com.pam.pamhc2trees.init;

import java.util.Set;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class WarmFruitTreeWorldGenRegistry {

	public static void register(BiomeLoadingEvent evt) {
		Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(RegistryKey.getOrCreateKey(Registry.BIOME_KEY, evt.getName()));
		//almond
		if (types.contains(BiomeDictionary.Type.JUNGLE)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_almond_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.OCEAN)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_almond_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.SWAMP)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_almond_worldgen);
		}
		//apricot
		if (types.contains(BiomeDictionary.Type.JUNGLE)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_apricot_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.OCEAN)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_apricot_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.SWAMP)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_apricot_worldgen);
		}
		//banana
		if (types.contains(BiomeDictionary.Type.JUNGLE)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_banana_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.OCEAN)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_banana_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.SWAMP)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_banana_worldgen);
		}
		//cashew
		if (types.contains(BiomeDictionary.Type.JUNGLE)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_cashew_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.OCEAN)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_cashew_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.SWAMP)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_cashew_worldgen);
		}
		//cinnamon
		if (types.contains(BiomeDictionary.Type.JUNGLE)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_cinnamon_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.OCEAN)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_cinnamon_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.SWAMP)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_cinnamon_worldgen);
		}
		//coconut
		if (types.contains(BiomeDictionary.Type.JUNGLE)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_coconut_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.OCEAN)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_coconut_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.SWAMP)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_coconut_worldgen);
		}
		//date
		if (types.contains(BiomeDictionary.Type.JUNGLE)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_date_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.OCEAN)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_date_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.SWAMP)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_date_worldgen);
		}
		//dragonfruit
		if (types.contains(BiomeDictionary.Type.JUNGLE)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_dragonfruit_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.OCEAN)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_dragonfruit_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.SWAMP)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_dragonfruit_worldgen);
		}
		//durian
		if (types.contains(BiomeDictionary.Type.JUNGLE)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_durian_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.OCEAN)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_durian_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.SWAMP)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_durian_worldgen);
		}
		//fig
		if (types.contains(BiomeDictionary.Type.JUNGLE)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_fig_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.OCEAN)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_fig_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.SWAMP)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_fig_worldgen);
		}
		//grapefruit
		if (types.contains(BiomeDictionary.Type.JUNGLE)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_grapefruit_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.OCEAN)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_grapefruit_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.SWAMP)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_grapefruit_worldgen);
		}
		//lime
		if (types.contains(BiomeDictionary.Type.JUNGLE)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_lime_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.OCEAN)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_lime_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.SWAMP)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_lime_worldgen);
		}
		//mango
		if (types.contains(BiomeDictionary.Type.JUNGLE)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_mango_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.OCEAN)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_mango_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.SWAMP)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_mango_worldgen);
		}
		//olive
		if (types.contains(BiomeDictionary.Type.JUNGLE)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_olive_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.OCEAN)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_olive_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.SWAMP)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_olive_worldgen);
		}
		//papaya
		if (types.contains(BiomeDictionary.Type.JUNGLE)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_papaya_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.OCEAN)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_papaya_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.SWAMP)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_papaya_worldgen);
		}
		//paperbark
		if (types.contains(BiomeDictionary.Type.JUNGLE)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_paperbark_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.OCEAN)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_paperbark_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.SWAMP)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_paperbark_worldgen);
		}
		//pecan
		if (types.contains(BiomeDictionary.Type.JUNGLE)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_pecan_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.OCEAN)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_pecan_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.SWAMP)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_pecan_worldgen);
		}
		//peppercorn
		if (types.contains(BiomeDictionary.Type.JUNGLE)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_peppercorn_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.OCEAN)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_peppercorn_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.SWAMP)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_peppercorn_worldgen);
		}
		//persimmon
		if (types.contains(BiomeDictionary.Type.JUNGLE)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_persimmon_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.OCEAN)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_persimmon_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.SWAMP)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_persimmon_worldgen);
		}
		//pistachio
		if (types.contains(BiomeDictionary.Type.JUNGLE)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_pistachio_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.OCEAN)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_pistachio_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.SWAMP)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_pistachio_worldgen);
		}
		//pomegranate
		if (types.contains(BiomeDictionary.Type.JUNGLE)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_pomegranate_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.OCEAN)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_pomegranate_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.SWAMP)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_pomegranate_worldgen);
		}
		//starfruit
		if (types.contains(BiomeDictionary.Type.JUNGLE)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_starfruit_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.OCEAN)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_starfruit_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.SWAMP)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_starfruit_worldgen);
		}
		//vanillabean
		if (types.contains(BiomeDictionary.Type.JUNGLE)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_vanillabean_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.OCEAN)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_vanillabean_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.SWAMP)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_vanillabean_worldgen);
		}
		//breadfruit
		if (types.contains(BiomeDictionary.Type.JUNGLE)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_breadfruit_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.OCEAN)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_breadfruit_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.SWAMP)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_breadfruit_worldgen);
		}
		//guava
		if (types.contains(BiomeDictionary.Type.JUNGLE)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_guava_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.OCEAN)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_guava_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.SWAMP)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_guava_worldgen);
		}
		//jackfruit
		if (types.contains(BiomeDictionary.Type.JUNGLE)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_jackfruit_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.OCEAN)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_jackfruit_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.SWAMP)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_jackfruit_worldgen);
		}
		//lychee
		if (types.contains(BiomeDictionary.Type.JUNGLE)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_lychee_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.OCEAN)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_lychee_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.SWAMP)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_lychee_worldgen);
		}
		//passionfruit
		if (types.contains(BiomeDictionary.Type.JUNGLE)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_passionfruit_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.OCEAN)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_passionfruit_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.SWAMP)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_passionfruit_worldgen);
		}
		//rambutan
		if (types.contains(BiomeDictionary.Type.JUNGLE)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_rambutan_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.OCEAN)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_rambutan_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.SWAMP)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_rambutan_worldgen);
		}
		//tamarind
		if (types.contains(BiomeDictionary.Type.JUNGLE)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_tamarind_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.OCEAN)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_tamarind_worldgen);
		}
		if (types.contains(BiomeDictionary.Type.SWAMP)) {
			evt.getGeneration().withFeature(GenerationStage.Decoration.VEGETAL_DECORATION,
					WorldGenRegistry.configured_tamarind_worldgen);
		}
	}
}