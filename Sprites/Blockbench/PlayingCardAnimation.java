// Save this class in your mod and generate all required imports
/**
 * Made with Blockbench 4.10.4
 * Exported for Minecraft version 1.19 or later with Yarn mappings
 * @author Author
 */
public class PlayingCardModelAnimation {
	public static final Animation Rotating = Animation.Builder.create(0.25F).looping()
		.addBoneAnimation("CardGroup", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.125F, AnimationHelper.createRotationalVector(0.0F, -180.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.25F, AnimationHelper.createRotationalVector(0.0F, -357.5F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.build();
}