package com.pam.pamhc2trees.entities.ai;

import net.minecraft.entity.CreatureEntity;
import net.minecraft.entity.ai.goal.TemptGoal;
import net.minecraft.item.crafting.Ingredient;

public class MoreTemptation extends TemptGoal {
	public MoreTemptation(CreatureEntity creatureIn, double speedIn, boolean scaredByPlayerMovementIn, Ingredient temptItemsIn) {
		super(creatureIn, speedIn, scaredByPlayerMovementIn, temptItemsIn);
	}
}
