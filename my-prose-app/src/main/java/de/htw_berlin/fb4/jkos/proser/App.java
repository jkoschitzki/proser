/*
 * Copyright 2026 Proser contributors
 *
 * SPDX-License-Identifier: Apache-2.0
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * See the NOTICE file distributed with this work for additional information.
 */

package de.htw_berlin.fb4.jkos.proser;

import de.htw_berlin.fb4.ossd.prose.ProseBuilder;

public class App 
{
    public static void main( String[] args )
    {
        // Create instances of custom sentences
        OpeningSentence opening = new OpeningSentence("Once upon a time, in a land far away, there was a brilliant idea.");
        ClosingSentence closing = new ClosingSentence("And they lived happily ever after, forever changed by this journey.");

        // Use ProseBuilder to register sentences
        ProseBuilder proseBuilder = new ProseBuilder();
        proseBuilder.register(opening);
        proseBuilder.register(closing);

        // Get and print the complete prose
        String prose = proseBuilder.get();
        System.out.println("Generated Prose:");
        System.out.println(prose);
    }
}
