/**
* FileName : UUIDGen.java
* Created  : 2016. 1. 20.
* Author   : hghan
* Summary  :
 * Copyright (C) 2016 Formal Works Inc. All rights reserved.
*
* 이 문서의 모든 저작권 및 지적 재산권은 (주)포멀웍스에게 있습니다.
* 이 문서의 어떠한 부분도 허가 없이 복제 또는 수정 하거나, 전송할 수 없습니다.
*/
package hhg0104.projects.converter.utils;

import java.util.UUID;

/**
 * Unique uuid key generator
 * 
 * @author hghan
 *
 */
public class UniqueKeyGen {

	/**
	 * Generate unique key string
	 * 
	 * @see UUID#randomUUID()
	 * @see System#currentTimeMillis()
	 * @return generated unique key
	 */
	public static String generate() {

		UUID randomUUID = UUID.randomUUID();
		String uuidStr = randomUUID.toString();

		long currentTimeMill = System.currentTimeMillis();
		String timeMillStr = String.valueOf(currentTimeMill);

		return uuidStr + StringConstants.UNDER_LINE + timeMillStr;
	}

	private UniqueKeyGen() {
		// Declare by constructor not allowed
	}
}
