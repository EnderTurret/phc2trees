package com.pam.pamhc2trees.init;

import com.pam.pamhc2trees.Pamhc2trees;
import com.pam.pamhc2trees.config.EnableConfig;
import com.pam.pamhc2trees.worldgen.ColdFruitTreeFeature;
import com.pam.pamhc2trees.worldgen.ColdLogFruitTreeFeature;
import com.pam.pamhc2trees.worldgen.FruitTreeFeature;
import com.pam.pamhc2trees.worldgen.TemperateFruitTreeFeature;
import com.pam.pamhc2trees.worldgen.WarmFruitTreeFeature;
import com.pam.pamhc2trees.worldgen.WarmLogFruitTreeFeature;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.NoFeatureConfig;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;


public class WorldGenRegistry {

	//Temperate Fruits
	public static FruitTreeFeature apple_worldgen;
	public static FruitTreeFeature avocado_worldgen;
	public static FruitTreeFeature candlenut_worldgen;
	public static FruitTreeFeature cherry_worldgen;
	public static FruitTreeFeature chestnut_worldgen;
	public static FruitTreeFeature gooseberry_worldgen;
	public static FruitTreeFeature lemon_worldgen;
	public static FruitTreeFeature nutmeg_worldgen;
	public static FruitTreeFeature orange_worldgen;
	public static FruitTreeFeature peach_worldgen;
	public static FruitTreeFeature pear_worldgen;
	public static FruitTreeFeature plum_worldgen;
	public static FruitTreeFeature walnut_worldgen;
	public static FruitTreeFeature spiderweb_worldgen;
	public static FruitTreeFeature hazelnut_worldgen;
	public static FruitTreeFeature pawpaw_worldgen;
	public static FruitTreeFeature soursop_worldgen;
	//Warm Fruits
	public static FruitTreeFeature almond_worldgen;
	public static FruitTreeFeature apricot_worldgen;
	public static FruitTreeFeature banana_worldgen;
	public static FruitTreeFeature cashew_worldgen;
	public static FruitTreeFeature cinnamon_worldgen;
	public static FruitTreeFeature coconut_worldgen;
	public static FruitTreeFeature date_worldgen;
	public static FruitTreeFeature dragonfruit_worldgen;
	public static FruitTreeFeature durian_worldgen;
	public static FruitTreeFeature fig_worldgen;
	public static FruitTreeFeature grapefruit_worldgen;
	public static FruitTreeFeature lime_worldgen;
	public static FruitTreeFeature mango_worldgen;
	public static FruitTreeFeature olive_worldgen;
	public static FruitTreeFeature papaya_worldgen;
	public static FruitTreeFeature paperbark_worldgen;
	public static FruitTreeFeature pecan_worldgen;
	public static FruitTreeFeature peppercorn_worldgen;
	public static FruitTreeFeature persimmon_worldgen;
	public static FruitTreeFeature pistachio_worldgen;
	public static FruitTreeFeature pomegranate_worldgen;
	public static FruitTreeFeature starfruit_worldgen;
	public static FruitTreeFeature vanillabean_worldgen;
	public static FruitTreeFeature breadfruit_worldgen;
	public static FruitTreeFeature guava_worldgen;
	public static FruitTreeFeature jackfruit_worldgen;
	public static FruitTreeFeature lychee_worldgen;
	public static FruitTreeFeature passionfruit_worldgen;
	public static FruitTreeFeature rambutan_worldgen;
	public static FruitTreeFeature tamarind_worldgen;
	//Cold Fruits
	public static FruitTreeFeature maple_worldgen;
	public static FruitTreeFeature pinenut_worldgen;

	//Temperate Fruits
	public static ConfiguredFeature<?,?> configured_apple_worldgen;
	public static ConfiguredFeature<?,?> configured_avocado_worldgen;
	public static ConfiguredFeature<?,?> configured_candlenut_worldgen;
	public static ConfiguredFeature<?,?> configured_cherry_worldgen;
	public static ConfiguredFeature<?,?> configured_chestnut_worldgen;
	public static ConfiguredFeature<?,?> configured_gooseberry_worldgen;
	public static ConfiguredFeature<?,?> configured_lemon_worldgen;
	public static ConfiguredFeature<?,?> configured_nutmeg_worldgen;
	public static ConfiguredFeature<?,?> configured_orange_worldgen;
	public static ConfiguredFeature<?,?> configured_peach_worldgen;
	public static ConfiguredFeature<?,?> configured_pear_worldgen;
	public static ConfiguredFeature<?,?> configured_plum_worldgen;
	public static ConfiguredFeature<?,?> configured_walnut_worldgen;
	public static ConfiguredFeature<?,?> configured_spiderweb_worldgen;
	public static ConfiguredFeature<?,?> configured_hazelnut_worldgen;
	public static ConfiguredFeature<?,?> configured_pawpaw_worldgen;
	public static ConfiguredFeature<?,?> configured_soursop_worldgen;
	//Warm Fruits
	public static ConfiguredFeature<?,?> configured_almond_worldgen;
	public static ConfiguredFeature<?,?> configured_apricot_worldgen;
	public static ConfiguredFeature<?,?> configured_banana_worldgen;
	public static ConfiguredFeature<?,?> configured_cashew_worldgen;
	public static ConfiguredFeature<?,?> configured_cinnamon_worldgen;
	public static ConfiguredFeature<?,?> configured_coconut_worldgen;
	public static ConfiguredFeature<?,?> configured_date_worldgen;
	public static ConfiguredFeature<?,?> configured_dragonfruit_worldgen;
	public static ConfiguredFeature<?,?> configured_durian_worldgen;
	public static ConfiguredFeature<?,?> configured_fig_worldgen;
	public static ConfiguredFeature<?,?> configured_grapefruit_worldgen;
	public static ConfiguredFeature<?,?> configured_lime_worldgen;
	public static ConfiguredFeature<?,?> configured_mango_worldgen;
	public static ConfiguredFeature<?,?> configured_olive_worldgen;
	public static ConfiguredFeature<?,?> configured_papaya_worldgen;
	public static ConfiguredFeature<?,?> configured_paperbark_worldgen;
	public static ConfiguredFeature<?,?> configured_pecan_worldgen;
	public static ConfiguredFeature<?,?> configured_peppercorn_worldgen;
	public static ConfiguredFeature<?,?> configured_persimmon_worldgen;
	public static ConfiguredFeature<?,?> configured_pistachio_worldgen;
	public static ConfiguredFeature<?,?> configured_pomegranate_worldgen;
	public static ConfiguredFeature<?,?> configured_starfruit_worldgen;
	public static ConfiguredFeature<?,?> configured_vanillabean_worldgen;
	public static ConfiguredFeature<?,?> configured_breadfruit_worldgen;
	public static ConfiguredFeature<?,?> configured_guava_worldgen;
	public static ConfiguredFeature<?,?> configured_jackfruit_worldgen;
	public static ConfiguredFeature<?,?> configured_lychee_worldgen;
	public static ConfiguredFeature<?,?> configured_passionfruit_worldgen;
	public static ConfiguredFeature<?,?> configured_rambutan_worldgen;
	public static ConfiguredFeature<?,?> configured_tamarind_worldgen;
	//Cold Fruits
	public static ConfiguredFeature<?,?> configured_maple_worldgen;
	public static ConfiguredFeature<?,?> configured_pinenut_worldgen;

	public static void registerAll(RegistryEvent.Register<Feature<?>> event) {
		if (!event.getName().equals(ForgeRegistries.FEATURES.getRegistryName()))
			return;
		IForgeRegistry<Feature<?>> r = event.getRegistry();

		//Temperate Fruits
		apple_worldgen = register(r, new TemperateFruitTreeFeature(() -> BlockRegistry.pamapple, EnableConfig.apple_worldgen::get), "apple_worldgen");
		avocado_worldgen = register(r, new TemperateFruitTreeFeature(() -> BlockRegistry.pamavocado, EnableConfig.avocado_worldgen::get), "avocado_worldgen");
		candlenut_worldgen = register(r, new TemperateFruitTreeFeature(() -> BlockRegistry.pamcandlenut, EnableConfig.candlenut_worldgen::get), "candlenut_worldgen");
		cherry_worldgen = register(r, new TemperateFruitTreeFeature(() -> BlockRegistry.pamcherry, EnableConfig.cherry_worldgen::get), "cherry_worldgen");
		chestnut_worldgen = register(r, new TemperateFruitTreeFeature(() -> BlockRegistry.pamchestnut, EnableConfig.chestnut_worldgen::get), "chestnut_worldgen");
		gooseberry_worldgen = register(r, new TemperateFruitTreeFeature(() -> BlockRegistry.pamgooseberry, EnableConfig.gooseberry_worldgen::get), "gooseberry_worldgen");
		lemon_worldgen = register(r, new TemperateFruitTreeFeature(() -> BlockRegistry.pamlemon, EnableConfig.lemon_worldgen::get), "lemon_worldgen");
		nutmeg_worldgen = register(r, new TemperateFruitTreeFeature(() -> BlockRegistry.pamnutmeg, EnableConfig.nutmeg_worldgen::get), "nutmeg_worldgen");
		orange_worldgen = register(r, new TemperateFruitTreeFeature(() -> BlockRegistry.pamorange, EnableConfig.orange_worldgen::get), "orange_worldgen");
		peach_worldgen = register(r, new TemperateFruitTreeFeature(() -> BlockRegistry.pampeach, EnableConfig.peach_worldgen::get), "peach_worldgen");
		pear_worldgen = register(r, new TemperateFruitTreeFeature(() -> BlockRegistry.pampear, EnableConfig.pear_worldgen::get), "pear_worldgen");
		plum_worldgen = register(r, new TemperateFruitTreeFeature(() -> BlockRegistry.pamplum, EnableConfig.plum_worldgen::get), "plum_worldgen");
		walnut_worldgen = register(r, new TemperateFruitTreeFeature(() -> BlockRegistry.pamwalnut, EnableConfig.walnut_worldgen::get), "walnut_worldgen");
		spiderweb_worldgen = register(r, new TemperateFruitTreeFeature(() -> BlockRegistry.pamspiderweb, EnableConfig.spiderweb_worldgen::get), "spiderweb_worldgen");
		hazelnut_worldgen = register(r, new TemperateFruitTreeFeature(() -> BlockRegistry.pamhazelnut, EnableConfig.hazelnut_worldgen::get), "hazelnut_worldgen");
		pawpaw_worldgen = register(r, new TemperateFruitTreeFeature(() -> BlockRegistry.pampawpaw, EnableConfig.pawpaw_worldgen::get), "pawpaw_worldgen");
		soursop_worldgen = register(r, new TemperateFruitTreeFeature(() -> BlockRegistry.pamsoursop, EnableConfig.soursop_worldgen::get), "soursop_worldgen");
		
		//Warm Fruits
		almond_worldgen = register(r, new WarmFruitTreeFeature(() -> BlockRegistry.pamalmond, EnableConfig.almond_worldgen::get), "almond_worldgen");
		apricot_worldgen = register(r, new WarmFruitTreeFeature(() -> BlockRegistry.pamapricot, EnableConfig.apricot_worldgen::get), "apricot_worldgen");
		banana_worldgen = register(r, new WarmFruitTreeFeature(() -> BlockRegistry.pambanana, EnableConfig.banana_worldgen::get), "banana_worldgen");
		cashew_worldgen = register(r, new WarmFruitTreeFeature(() -> BlockRegistry.pamcashew, EnableConfig.cashew_worldgen::get), "cashew_worldgen");
		cinnamon_worldgen = register(r, new WarmLogFruitTreeFeature(() -> BlockRegistry.pamcinnamon, EnableConfig.cinnamon_worldgen::get), "cinnamon_worldgen");
		coconut_worldgen = register(r, new WarmFruitTreeFeature(() -> BlockRegistry.pamcoconut, EnableConfig.coconut_worldgen::get), "coconut_worldgen");
		date_worldgen = register(r, new WarmFruitTreeFeature(() -> BlockRegistry.pamdate, EnableConfig.date_worldgen::get), "date_worldgen");
		dragonfruit_worldgen = register(r, new WarmFruitTreeFeature(() -> BlockRegistry.pamdragonfruit, EnableConfig.dragonfruit_worldgen::get), "dragonfruit_worldgen");
		durian_worldgen = register(r, new WarmFruitTreeFeature(() -> BlockRegistry.pamdurian, EnableConfig.durian_worldgen::get), "durian_worldgen");
		fig_worldgen = register(r, new WarmFruitTreeFeature(() -> BlockRegistry.pamfig, EnableConfig.fig_worldgen::get), "fig_worldgen");
		grapefruit_worldgen = register(r, new WarmFruitTreeFeature(() -> BlockRegistry.pamgrapefruit, EnableConfig.grapefruit_worldgen::get), "grapefruit_worldgen");
		lime_worldgen = register(r, new WarmFruitTreeFeature(() -> BlockRegistry.pamlime, EnableConfig.lime_worldgen::get), "lime_worldgen");
		mango_worldgen = register(r, new WarmFruitTreeFeature(() -> BlockRegistry.pammango, EnableConfig.mango_worldgen::get), "mango_worldgen");
		olive_worldgen = register(r, new WarmFruitTreeFeature(() -> BlockRegistry.pamolive, EnableConfig.olive_worldgen::get), "olive_worldgen");
		papaya_worldgen = register(r, new WarmFruitTreeFeature(() -> BlockRegistry.pampapaya, EnableConfig.papaya_worldgen::get), "papaya_worldgen");
		paperbark_worldgen = register(r, new WarmLogFruitTreeFeature(() -> BlockRegistry.pampaperbark, EnableConfig.paperbark_worldgen::get), "paperbark_worldgen");
		pecan_worldgen = register(r, new WarmFruitTreeFeature(() -> BlockRegistry.pampecan, EnableConfig.pecan_worldgen::get), "pecan_worldgen");
		peppercorn_worldgen = register(r, new WarmFruitTreeFeature(() -> BlockRegistry.pampeppercorn, EnableConfig.peppercorn_worldgen::get), "peppercorn_worldgen");
		persimmon_worldgen = register(r, new WarmFruitTreeFeature(() -> BlockRegistry.pampersimmon, EnableConfig.persimmon_worldgen::get), "persimmon_worldgen");
		pistachio_worldgen = register(r, new WarmFruitTreeFeature(() -> BlockRegistry.pampistachio, EnableConfig.pistachio_worldgen::get), "pistachio_worldgen");
		pomegranate_worldgen = register(r, new WarmFruitTreeFeature(() -> BlockRegistry.pampomegranate, EnableConfig.pomegranate_worldgen::get), "pomegranate_worldgen");
		starfruit_worldgen = register(r, new WarmFruitTreeFeature(() -> BlockRegistry.pamstarfruit, EnableConfig.starfruit_worldgen::get), "starfruit_worldgen");
		vanillabean_worldgen = register(r, new WarmFruitTreeFeature(() -> BlockRegistry.pamvanillabean, EnableConfig.vanillabean_worldgen::get), "vanillabean_worldgen");
		breadfruit_worldgen = register(r, new WarmFruitTreeFeature(() -> BlockRegistry.pambreadfruit, EnableConfig.breadfruit_worldgen::get), "breadfruit_worldgen");
		guava_worldgen = register(r, new WarmFruitTreeFeature(() -> BlockRegistry.pamguava, EnableConfig.guava_worldgen::get), "guava_worldgen");
		jackfruit_worldgen = register(r, new WarmFruitTreeFeature(() -> BlockRegistry.pamjackfruit, EnableConfig.jackfruit_worldgen::get), "jackfruit_worldgen");
		lychee_worldgen = register(r, new WarmFruitTreeFeature(() -> BlockRegistry.pamlychee, EnableConfig.lychee_worldgen::get), "lychee_worldgen");
		passionfruit_worldgen = register(r, new WarmFruitTreeFeature(() -> BlockRegistry.pampassionfruit, EnableConfig.passionfruit_worldgen::get), "passionfruit_worldgen");
		rambutan_worldgen = register(r, new WarmFruitTreeFeature(() -> BlockRegistry.pamrambutan, EnableConfig.rambutan_worldgen::get), "rambutan_worldgen");
		tamarind_worldgen = register(r, new WarmFruitTreeFeature(() -> BlockRegistry.pamtamarind, EnableConfig.tamarind_worldgen::get), "tamarind_worldgen");
		
		//Cold Fruits
		maple_worldgen = register(r, new ColdLogFruitTreeFeature(() -> BlockRegistry.pammaple, EnableConfig.maple_worldgen::get), "maple_worldgen");
		pinenut_worldgen = register(r, new ColdFruitTreeFeature(() -> BlockRegistry.pampinenut, EnableConfig.pinenut_worldgen::get), "pinenut_worldgen");
	}

	public static void registerConfiguredFeatures() {
		configured_apple_worldgen = configure(apple_worldgen);
		configured_avocado_worldgen = configure(avocado_worldgen);
		configured_candlenut_worldgen = configure(candlenut_worldgen);
		configured_cherry_worldgen = configure(cherry_worldgen);
		configured_chestnut_worldgen = configure(chestnut_worldgen);
		configured_gooseberry_worldgen = configure(gooseberry_worldgen);
		configured_lemon_worldgen = configure(lemon_worldgen);
		configured_nutmeg_worldgen = configure(nutmeg_worldgen);
		configured_orange_worldgen = configure(orange_worldgen);
		configured_peach_worldgen = configure(peach_worldgen);
		configured_pear_worldgen = configure(pear_worldgen);
		configured_plum_worldgen = configure(plum_worldgen);
		configured_walnut_worldgen = configure(walnut_worldgen);
		configured_spiderweb_worldgen = configure(spiderweb_worldgen);
		configured_hazelnut_worldgen = configure(hazelnut_worldgen);
		configured_pawpaw_worldgen = configure(pawpaw_worldgen);
		configured_soursop_worldgen = configure(soursop_worldgen);

		configured_almond_worldgen = configure(almond_worldgen);
		configured_apricot_worldgen = configure(apricot_worldgen);
		configured_banana_worldgen = configure(banana_worldgen);
		configured_cashew_worldgen = configure(cashew_worldgen);
		configured_cinnamon_worldgen = configure(cinnamon_worldgen);
		configured_coconut_worldgen = configure(coconut_worldgen);
		configured_date_worldgen = configure(date_worldgen);
		configured_dragonfruit_worldgen = configure(dragonfruit_worldgen);
		configured_durian_worldgen = configure(durian_worldgen);
		configured_fig_worldgen = configure(fig_worldgen);
		configured_grapefruit_worldgen = configure(grapefruit_worldgen);
		configured_lime_worldgen = configure(lime_worldgen);
		configured_mango_worldgen = configure(mango_worldgen);
		configured_olive_worldgen = configure(olive_worldgen);
		configured_papaya_worldgen = configure(papaya_worldgen);
		configured_paperbark_worldgen = configure(paperbark_worldgen);
		configured_pecan_worldgen = configure(pecan_worldgen);
		configured_peppercorn_worldgen = configure(peppercorn_worldgen);
		configured_persimmon_worldgen = configure(persimmon_worldgen);
		configured_pistachio_worldgen = configure(pistachio_worldgen);
		configured_pomegranate_worldgen = configure(pomegranate_worldgen);
		configured_starfruit_worldgen = configure(starfruit_worldgen);
		configured_vanillabean_worldgen = configure(vanillabean_worldgen);
		configured_breadfruit_worldgen = configure(breadfruit_worldgen);
		configured_guava_worldgen = configure(guava_worldgen);
		configured_jackfruit_worldgen = configure(jackfruit_worldgen);
		configured_lychee_worldgen = configure(lychee_worldgen);
		configured_passionfruit_worldgen = configure(passionfruit_worldgen);
		configured_rambutan_worldgen = configure(rambutan_worldgen);
		configured_tamarind_worldgen = configure(tamarind_worldgen);

		configured_maple_worldgen = configure(maple_worldgen);
		configured_pinenut_worldgen = configure(pinenut_worldgen);
	}

	private static ConfiguredFeature<?,?> configure(Feature<NoFeatureConfig> feature) {
		final ConfiguredFeature<?,?> conf = feature.withConfiguration(IFeatureConfig.NO_FEATURE_CONFIG)
		.withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(100, 0F, 0)))
		.withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT);

		Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, feature.getRegistryName(), conf);

		return conf;
	}

	private static <V extends R, R extends IForgeRegistryEntry<R>> V register(IForgeRegistry<R> registry, V value,
			String name) {
		ResourceLocation id = Pamhc2trees.getId(name);
		value.setRegistryName(id);
		registry.register(value);
		return value;
	}
}
