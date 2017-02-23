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

package org.apache.rocketmq.jms;

import javax.jms.Message;

public enum JMSHeaderEnum {

    JMSDestination,
    JMSDeliveryMode,
    JMSMessageID,
    JMSTimestamp,
    JMSCorrelationID,
    JMSReplyTo,
    JMSRedelivered,
    JMSType,
    JMSExpiration,
    JMSPriority,
    JMSDeliveryTime;

    public static final int JMS_DELIVERY_MODE_DEFAULT_VALUE = Message.DEFAULT_DELIVERY_MODE;
    public static final long JMS_TIME_TO_LIVE_DEFAULT_VALUE = Message.DEFAULT_TIME_TO_LIVE;
    public static final int JMS_PRIORITY_DEFAULT_VALUE = Message.DEFAULT_PRIORITY;
    public static final long JMS_DELIVERY_TIME_DEFAULT_VALUE = Message.DEFAULT_DELIVERY_DELAY;
    public static final boolean JMS_REDELIVERED_DEFAULT_VALUE = false;
    public static final int JMS_TIMESTAMP_DEFAULT_VALUE = 0;
    public static final int JMS_EXPIRATION_DEFAULT_VALUE = 0;

}
