/*
 * Copyright 2014 AndroidPlot.com
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.androidplot.xy;

/**
 * Alternative to using Android's Pair class so that backwards compatibility with
 * API level 4 is maintained.
 */
public class XYPair {
    public Number x;
    public Number y;

    public XYPair(Number x, Number y) {
        this.x = x;
        this.y = y;
    }
}
