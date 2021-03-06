/*
 * Copyright 2013 Simply Measured, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.simplymeasured.prognosticator;

/**
 * An interface denoting a forward-only cursor for interacting with a query
 *
 * @author rob@simplymeasured.com
 * @since 6/24/13
 */
public interface QueryCursor<T> {
    /**
     * Move the cursor forward one row, if available.
     *
     * @return true if a row is available.
     */
    public boolean next();

    /**
     * Retrieve the row at our current position
     *
     * @return row as T
     */
    public T get();
}
