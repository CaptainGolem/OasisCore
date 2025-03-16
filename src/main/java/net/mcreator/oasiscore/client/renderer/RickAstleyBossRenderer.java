
package net.mcreator.oasiscore.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.oasiscore.entity.RickAstleyBossEntity;

public class RickAstleyBossRenderer extends HumanoidMobRenderer<RickAstleyBossEntity, HumanoidModel<RickAstleyBossEntity>> {
	public RickAstleyBossRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
	}

	@Override
	public ResourceLocation getTextureLocation(RickAstleyBossEntity entity) {
		return ResourceLocation.parse("oasiscore:textures/entities/e84c36fd71e883b7.png");
	}
}
