package io.github.haykam821.codebreaker;

import io.github.haykam821.codebreaker.game.CodebreakerConfig;
import io.github.haykam821.codebreaker.game.code.provider.CodeProvider;
import io.github.haykam821.codebreaker.game.code.provider.RandomCodeProvider;
import io.github.haykam821.codebreaker.game.phase.CodebreakerWaitingPhase;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import xyz.nucleoid.plasmid.game.GameType;

public class Main implements ModInitializer {
	private static final String MOD_ID = "codebreaker";

	private static final Identifier CODEBREAKER_ID = new Identifier(MOD_ID, "codebreaker");
	public static final GameType<CodebreakerConfig> CODEBREAKER_TYPE = GameType.register(CODEBREAKER_ID, CodebreakerConfig.CODEC, CodebreakerWaitingPhase::open);

	private static final Identifier RANDOM_ID = new Identifier(MOD_ID, "random");

	@Override
	public void onInitialize() {
		CodeProvider.REGISTRY.register(RANDOM_ID, RandomCodeProvider.CODEC);
	}
}