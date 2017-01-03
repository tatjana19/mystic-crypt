/**
 * The MIT License
 *
 * Copyright (C) 2015 Asterios Raptis
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package de.alpharogroup.crypto.aes;

import de.alpharogroup.crypto.chainable.ChainableStringDecryptor;
import de.alpharogroup.crypto.core.ChainableDecryptor;
import de.alpharogroup.crypto.interfaces.Decryptor;

/**
 * The class {@link ChainedStringDecryptor} can take many {@code Decryptor} objects and decrypts the
 * given string with all the given {@code Decryptor} objects. The {@code Decryptor} objects must be
 * in a reverse order as they was given in the {@code ChainedEncryptor} object. For an example see
 * the unit test.
 *
 * @deprecated use instead the new class {@link ChainableStringDecryptor}. This class will be
 *             removed in the next major release.
 */
@Deprecated
public class ChainedStringDecryptor extends ChainableDecryptor<String>
{

	/**
	 * Instantiates a new {@link ChainedStringDecryptor} object.
	 *
	 * @param decryptors
	 *            the decryptors
	 */
	@SafeVarargs
	public ChainedStringDecryptor(final Decryptor<String, String>... decryptors)
	{
		super(decryptors);
	}

}
