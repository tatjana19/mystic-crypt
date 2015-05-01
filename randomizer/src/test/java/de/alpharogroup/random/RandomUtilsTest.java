/**
 * Copyright (C) 2007 Asterios Raptis
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.alpharogroup.random;

import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import de.alpharogroup.BaseTestCase;

import de.alpharogroup.test.objects.Gender;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Test class for the class RandomUtils.
 *
 * @version 1.0
 * @author Asterios Raptis
 */
public class RandomUtilsTest extends BaseTestCase
{

	/**
	 * {@inheritDoc}
	 */
	@Override
	@BeforeMethod
	protected void setUp() throws Exception
	{
		super.setUp();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	@AfterMethod
	protected void tearDown() throws Exception
	{
		super.tearDown();
	}


	/**
	 * Test method for
	 * {@link net.sourceforge.jaulp.random.RandomUtils#getRandomEntry(java.util.List)} .
	 */
	@Test
	public void testGetRandomEntryList()
	{
		final List<String> list = new ArrayList<>();
		list.add("Anton");
		list.add("Kosta");
		list.add("Caesar");
		list.add("Asterios");
		list.add("Anastasia");
		list.add("Katerina");
		for (int i = 0; i < 100; i++)
		{
			final String randomEntry = RandomUtils.getRandomEntry(list);
			this.result = list.contains(randomEntry);
			AssertJUnit.assertTrue("", this.result);
		}
	}

	/**
	 * Test method for
	 * {@link net.sourceforge.jaulp.random.RandomUtils#getRandomEntry(java.util.Map)} .
	 */
	@Test
	public void testGetRandomEntryMap()
	{
		final Map<String, String> map = new HashMap<>();
		map.put("1", "novalue");
		map.put("2", "somevalue");
		map.put("3", "othervalue");
		map.put("4", "value");
		map.put("5", "value");
		final Collection<String> values = map.values();
		for (int i = 0; i < 100; i++)
		{
			final String randomValue = (String)RandomUtils.getRandomEntry(map);
			this.result = values.contains(randomValue);
			AssertJUnit.assertTrue("", this.result);
		}
	}

	/**
	 * Test method for {@link net.sourceforge.jaulp.random.RandomUtils#getRandomFloat(int, int)} .
	 */
	@Test
	public void testGetRandomFloat()
	{
		final int beforeComma = 2;
		final int afterComma = 4;
		for (int i = 0; i < 100; i++)
		{
			final float randomFloat = RandomUtils.getRandomFloat(afterComma, beforeComma);
			this.result = 0 < randomFloat;
			AssertJUnit.assertTrue("", this.result);
		}
	}

	/**
	 * Test method for {@link net.sourceforge.jaulp.random.RandomUtils#getRandomKey(java.util.Map)}
	 * .
	 */
	@Test
	public void testGetRandomKey()
	{
		final Map<String, String> map = new HashMap<>();
		map.put("1", "novalue");
		map.put("2", "somevalue");
		map.put("3", "othervalue");
		map.put("4", "value");
		map.put("5", "value");
		final Set<String> keys = map.keySet();
		for (int i = 0; i < 100; i++)
		{
			final String randomKey = (String)RandomUtils.getRandomKey(map);
			this.result = keys.contains(randomKey);
			AssertJUnit.assertTrue("", this.result);
		}
	}

	/**
	 * Test method for {@link net.sourceforge.jaulp.random.RandomUtils#randomBoolean()}.
	 */
	@Test
	public void testRandomBoolean()
	{

	}

	/**
	 * Test method for {@link net.sourceforge.jaulp.random.RandomUtils#randomChar(java.lang.String)}
	 * .
	 */
	@Test
	public void testRandomChar()
	{
		final String string = Constants.LOWCASECHARS;
		for (int i = 0; i < 100; i++)
		{
			final char randomChar = RandomUtils.randomChar(string);
			final CharBuffer charBuffer = CharBuffer.allocate(1);
			charBuffer.put(randomChar);
			this.result = string.contains(charBuffer);
			AssertJUnit.assertTrue("", this.result);
		}
	}

	/**
	 * Test method for {@link net.sourceforge.jaulp.random.RandomUtils#randomInt(int)}.
	 */
	@Test
	public void testRandomInt()
	{
		System.out.println("Generate 100 secure random numbers:");
		for (int i = 0; i < 100; i++)
		{
			int randomInt = RandomUtils.randomInt(5);
			System.out.println(randomInt);
		}
	}

	/**
	 * Test method for
	 * {@link net.sourceforge.jaulp.random.RandomUtils#getRandomString(java.lang.String[])} .
	 */
	@Test
	public void testRandomStringStringArray()
	{
		final String[] array = { "blab", "flih", "klap", "teta", "brut", "gzft", "ccp" };
		final List<String> listFromArray = Arrays.asList(array);
		for (int i = 0; i < 100; i++)
		{
			final String randomString = RandomUtils.getRandomString(array);
			this.result = listFromArray.contains(randomString);
			AssertJUnit.assertTrue("", this.result);
		}
	}

	/**
	 * Test method for
	 * {@link net.sourceforge.jaulp.random.RandomUtils#getRandomString(java.lang.String, int)} .
	 */
	@Test
	public void testRandomStringStringInt()
	{
		final CharBuffer charBuffer = CharBuffer.allocate(45);
		final int length = 5;
		final String chars = Constants.LCCHARSWNASC;
		charBuffer.put(chars);
		for (int i = 0; i < 100; i++)
		{
			final String randomString = RandomUtils.getRandomString(chars, length);
			this.result = randomString.contains(charBuffer);
			AssertJUnit.assertTrue("", this.result);
		}
	}

	@Test
	public void testRandomByteArray()
	{
		byte[] randomByteArray = RandomUtils.randomByteArray(8);
		System.out.println(new String(randomByteArray, Charset.forName("UTF-8")));
	}

	@Test
	public void testGetRandomEnum()
	{
		Gender[] genders = Gender.values();
		Gender randomEnumEntry = RandomUtils.getRandomEnum(genders);
		System.out.println(randomEnumEntry.name());

		randomEnumEntry = RandomUtils.getRandomEnum(randomEnumEntry);
		System.out.println(randomEnumEntry.name());

		randomEnumEntry = RandomUtils.getRandomEnum(Gender.class);
		System.out.println(randomEnumEntry.name());
	}

}
