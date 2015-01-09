/*******************************************************************************
 * Copyright (c) 2010, 2015 SAP SE and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     SAP SE - initial API and implementation
 *******************************************************************************/
package org.eclipse.tycho.p2.tools.publisher.facade;

import java.util.List;

import org.eclipse.tycho.ReactorProject;
import org.eclipse.tycho.core.shared.TargetEnvironment;

public interface PublisherServiceFactory {

    /**
     * Creates a {@link PublisherService} instance that can be used to publish artifacts. The
     * results are stored in the build output p2 repository of the given project.
     * 
     * @param project
     *            The project for which to publish artifacts.
     * @param environments
     *            The list of environments to publish for.
     * @return A new {@link PublisherService} instance.
     */
    // TODO separate publishers per artifact type
    PublisherService createPublisher(ReactorProject project, List<TargetEnvironment> environments);

    PublishProductTool createProductPublisher(ReactorProject project, List<TargetEnvironment> environments);

}
