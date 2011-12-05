/**
 * Licensed to jclouds, Inc. (jclouds) under one or more
 * contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  jclouds licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jclouds.cloudstack;

import java.util.concurrent.TimeUnit;

import org.jclouds.cloudstack.features.GlobalAccountClient;
import org.jclouds.cloudstack.features.GlobalAlertClient;
import org.jclouds.cloudstack.features.GlobalOfferingClient;
import org.jclouds.concurrent.Timeout;
import org.jclouds.rest.annotations.Delegate;

/**
 * Provides synchronous access to CloudStack.
 * <p/>
 * 
 * @author Adrian Cole
 * @see CloudStackDomainAsyncClient
 * @see <a href=
 *      "http://download.cloud.com/releases/2.2.0/api_2.2.12/TOC_Global_Admin.html"
 *      />
 */
@Timeout(duration = 60, timeUnit = TimeUnit.SECONDS)
public interface CloudStackGlobalClient extends CloudStackDomainClient {

   /**
    * Provides synchronous access to Accounts
    */
   @Delegate
   @Override
   GlobalAccountClient getAccountClient();

   /**
    * Provides synchronous access to Alerts
    */
   @Delegate
   GlobalAlertClient getAlertClient();

   /**
    * Provides synchronous access to Offerings
    */
   @Delegate
   @Override
   GlobalOfferingClient getOfferingClient();

}