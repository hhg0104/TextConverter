/**
* FileName : UniqueKeyGenTest.java
* Created  : 2016. 1. 20.
* Author   : hghan
* Summary  :
 * Copyright (C) 2016 Formal Works Inc. All rights reserved.
*
* 이 문서의 모든 저작권 및 지적 재산권은 (주)포멀웍스에게 있습니다.
* 이 문서의 어떠한 부분도 허가 없이 복제 또는 수정 하거나, 전송할 수 없습니다.
*/
package hhg0104.projects.converter.utils;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * Test class for UniqueKeyGen class
 * 
 * @see UniqueKeyGen
 * 
 * @author hghan
 *
 */
public class UniqueKeyGenTest {

	private Logger LOGGER = Logger.getLogger(UniqueKeyGenTest.class);

	/**
	 * Unique key generate test
	 * 
	 * @see UniqueKeyGen#generate()
	 */
	@Test
	public void testGenerate() {

		List<String> uniqueKeys = new ArrayList<String>();

		for (int i = 0; i < 1000; i++) {
			String uniqueKey = UniqueKeyGen.generate();
			uniqueKeys.add(uniqueKey);

			LOGGER.debug(String.format("Generated key: %s", uniqueKey));
		}

		for (String uniqueKey : uniqueKeys) {

			boolean existDulicateKey = existKeyMoreThanOnce(uniqueKey, uniqueKeys);

			assertFalse(existDulicateKey);
		}

	}

	/**
	 * If the key exist in the list more than once. <br>
	 * If it exists more than once, it is considered having duplicate key.
	 * 
	 * @param targetKey
	 *            target key
	 * @param keys
	 *            key list
	 * @return if the key exist more than once in the list
	 */
	private boolean existKeyMoreThanOnce(String targetKey, List<String> keys) {

		int cnt = 0;

		for (String uniqueKey : keys) {
			if (targetKey.equals(uniqueKey)) {
				cnt++;
			}
		}

		return cnt > 1;
	}
}
