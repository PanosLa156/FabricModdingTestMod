// Save this class in your mod and generate all required imports
/**
 * Made with Blockbench 4.10.4
 * Exported for Minecraft version 1.19 or later with Yarn mappings
 * @author Author
 */
public class NautilusModelAnimation {
	public static final Animation idleAnimation = Animation.Builder.create(2.0F).looping()
		.addBoneAnimation("bone2", new Transformation(Transformation.Targets.ROTATE, 
			new Keyframe(0.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(1.3333F, AnimationHelper.createRotationalVector(2.5F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(2.0F, AnimationHelper.createRotationalVector(0.0F, 0.0F, 0.0F), Transformation.Interpolations.LINEAR)
		))
		.build();

	public static final Animation animation = Animation.Builder.create(1.0F)
		.addBoneAnimation("bone2", new Transformation(Transformation.Targets.SCALE, 
			new Keyframe(0.0F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5F, AnimationHelper.createScalingVector(1.05F, 1.05F, 1.1F), Transformation.Interpolations.LINEAR),
			new Keyframe(0.5833F, AnimationHelper.createScalingVector(1.0F, 1.0F, 1.0F), Transformation.Interpolations.LINEAR)
		))
		.build();
}