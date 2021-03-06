package com.ethlo.time;

/*-
 * #%L
 * Internet Time Utility
 * %%
 * Copyright (C) 2017 Morten Haraldsen (ethlo)
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.junit.Ignore;
import org.junit.Test;

public class StdJdkCorrectnessTest extends CorrectnessTest
{
    @Override
    protected Rfc3339 getInstance()
    {
        return new StdJdkInternetDateTimeUtil();
    }

    @Override
    @Test
    @Ignore
    public void testFormat4TrailingNoise()
    {
        // For ignore marker only
    }

    @Override
    @Test
    @Ignore
    public void testParseUnknownLocalOffsetConvention()
    {
        // For ignore marker only
    }


    @Override
    @Test
    @Ignore
    public void testParseLeapSecondUTC()
    {
        // For ignore marker only
    }

    @Override
    @Test
    @Ignore
    public void testParseLeapSecondPST()
    {
        // For ignore marker only
    }

    @Override
    @Test
    @Ignore
    public void testParseLeapSecondUTCJune()
    {
        // For ignore marker only
    }

    @Override
    @Test
    @Ignore
    public void testParseLeapSecondPSTJune()
    {
        // For ignore marker only
    }
}
