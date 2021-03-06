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
package de.alpharogroup.crypto.interfaces;

/**
 * Generic interface for encrypting objects.
 *
 * @author Asterios Raptis
 * @version 1.0
 * @param <T> the generic type of the input to encrypt
 * @param <R> the generic type of the result
 */
public interface GenericEncryptor<T,R>
{
	/**
	 * Encrypt the given object.
	 *
	 * @param toEncrypt
	 *            The object to encrypt.
	 * @return The encrypted object.
	 * @throws Exception
	 *             is thrown if encryption fails.
	 */
	public R encrypt(final T toEncrypt) throws Exception;

}
