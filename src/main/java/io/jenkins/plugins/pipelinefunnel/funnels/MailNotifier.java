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
package io.jenkins.plugins.pipelinefunnel.funnels;

import hudson.Extension;
import io.jenkins.plugins.pipelinefunnel.Funnel;
import io.jenkins.plugins.pipelinefunnel.FunnelType;

import java.util.Arrays;
import java.util.List;

@Extension
public class MailNotifier extends Funnel {

    @Override
    public String getName() {
        return "email";
    }

    @Override
    public List<String> getFields() {
        return Arrays.asList(
                "to",
                "from",
                "charset",
                "subject",
                "body",
                "cc",
                "bcc",
                "replyTo",
                "mimeType"
        );
    }

    @Override
    public String getFunnelClass() {
        return "MailNotifierImpl";
    }

    @Override
    public FunnelType funnelType() {
        return FunnelType.NOTIFIER;
    }
}
