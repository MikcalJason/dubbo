/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.dubbo.test.check;

import org.apache.dubbo.test.check.registrycenter.GlobalRegistryCenter;

import org.junit.platform.launcher.TestPlan;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/**
 * The entrance to terminate the mocked registry center.
 */
public class RegistryCenterFinished extends AbstractRegistryCenterTestExecutionListener {

    @Override
    public void testPlanExecutionFinished(TestPlan testPlan) {
        super.testPlanExecutionFinished(testPlan);
        try {
            if(needRegistryCenter(testPlan)){
                GlobalRegistryCenter.shutdown();
            }
        } catch (Throwable cause) {
            throw new IllegalStateException("Failed to terminate zookeeper instance in unit test",cause);
        }
    }
}
