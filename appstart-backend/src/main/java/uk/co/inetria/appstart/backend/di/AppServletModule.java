/**
 * The contents of this file may be used under the terms of the Apache License, Version 2.0
 * in which case, the provisions of the Apache License Version 2.0 are applicable instead of those above.
 *
 * Copyright 2014, dawelbeit.info
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.co.inetria.appstart.backend.di;

import com.google.inject.servlet.ServletModule;
import com.googlecode.objectify.ObjectifyFilter;

import uk.co.inetria.appstart.backend.servlets.BackendServlet;

/**
 * Register all the servlets & filters here so Guice can manage their dependencies
 * and parse the @Inject annotation. Servlets should be annotated with @Singleton
 * 
 * @author Omer Dawelbeit
 *
 */
public class AppServletModule extends ServletModule {
	
	
	
	/* (non-Javadoc)
	 * @see com.google.inject.servlet.ServletModule#configureServlets()
	 */
	@Override
	protected void configureServlets() {
		
		// filters
		// Objectify filter
		filter("/*").through(ObjectifyFilter.class);

		// servlets
		serve("/backend/process").with(BackendServlet.class);
			
		
	}

}
