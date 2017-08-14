package com.commiao.domain.utils;

import java.math.BigInteger;
import java.util.UUID;

/**
 * @author jingmiao
 *
 */
public class UuidHelper {

	private UuidHelper() {
	}

	public static String randomPrettyString() {
		return toPrettyString(UUID.randomUUID());
	}

	public static String toPrettyString(final UUID uuid) {
		return uuid.toString().replace("-", "");
	}

	public static UUID parsePrettyString(final String uuid) {
		final StringBuilder builder = new StringBuilder();
		try {
			builder.append(uuid.subSequence(0, 8)).append("-");
			builder.append(uuid.subSequence(8, 12)).append("-");
			builder.append(uuid.subSequence(12, 16)).append("-");
			builder.append(uuid.subSequence(16, 20)).append("-");
			builder.append(uuid.subSequence(20, 32)).append("-");
			return UUID.fromString(builder.toString());
		} catch (final Exception x) {
			throw new IllegalArgumentException("无效的UUID字符串[" + uuid + "]", x);
		}
	}

	public BigInteger toBigInteger(final UUID uuid) {
		return new BigInteger(toPrettyString(uuid), 16);
	}

}
