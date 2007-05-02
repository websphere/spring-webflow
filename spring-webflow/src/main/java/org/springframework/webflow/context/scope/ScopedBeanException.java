/*
 * Copyright 2004-2007 the original author or authors.
 *
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
 */
package org.springframework.webflow.context.scope;

import org.springframework.webflow.core.FlowException;

/**
 * Thrown when a bean cannot be retrieved because the scope it resides in
 * has not yet been populated.  This might occur if the bean is being referenced
 * before the FlowExecution has been retrieved.
 * 
 * @author Ben Hale
 * @since 1.1
 */
public class ScopedBeanException extends FlowException {

	/**
	 * Create a new scoped bean exception.
	 * @param message the message
	 * @param cause the root cause of the failure
	 */
	public ScopedBeanException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Create a new scoped bean exception.
	 * @param message the message
	 */
	public ScopedBeanException(String message) {
		super(message);
	}

}