/**
 * Copyright (c) 2007-2014 Kaazing Corporation. All rights reserved.
 * 
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
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

package org.kaazing.gateway.client.impl.autobahn.opcodes;

import java.net.URI;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;

import org.kaazing.net.ws.WebSocket;
import org.kaazing.net.ws.WebSocketFactory;
import org.kaazing.net.ws.WebSocketMessageReader;
import org.kaazing.net.ws.WebSocketMessageWriter;
import org.kaazing.robot.junit.annotation.Robotic;
import org.kaazing.robot.junit.rules.RobotRule;

public class OpcodesIT {
    @Rule
    public RobotRule robot = new RobotRule();

    @Ignore("KG-12432")
    @Robotic(script = "sendFrameWithReservedControlOpcodeEquals11")
    @Test(timeout = 1500)
    public void sendFrameWithReservedControlOpcodeEquals11() throws Exception {

        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        robot.join();
    }

    @Ignore("KG-12432")
    @Robotic(script = "sendFrameWithReservedControlOpcodeEquals12AndNonEmptyPayload")
    @Test(timeout = 1500)
    public void sendFrameWithReservedControlOpcodeEquals12AndNonEmptyPayload() throws Exception {

        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        robot.join();
    }

    @Ignore("KG-12432")
    @Robotic(script = "sendFrameWithReservedControlOpcodeEquals13ThenPing")
    @Test(timeout = 1500)
    public void sendFrameWithReservedControlOpcodeEquals13ThenPing() throws Exception {

        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        robot.join();
    }

    @Ignore("KG-12432")
    @Robotic(script = "sendFrameWithReservedNonControlOpcodeEquals3")
    @Test(timeout = 1500)
    public void sendFrameWithReservedNonControlOpcodeEquals3() throws Exception {

        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        robot.join();
    }

    @Ignore("KG-12432")
    @Robotic(script = "sendFrameWithReservedNonControlOpcodeEquals4AndNonEmptyPayload")
    @Test(timeout = 1500)
    public void sendFrameWithReservedNonControlOpcodeEquals4AndNonEmptyPayload() throws Exception {

        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        robot.join();
    }

    @Ignore("KG-12432")
    @Robotic(script = "sendSmallTextMessageThenFrameWithReservedControlOpcodeEquals14AndNonEmptyPayloadThenPing")
    @Test(timeout = 1500)
    public void sendSmallTextMessageThenFrameWithReservedControlOpcodeEquals14AndNonEmptyPayloadThenPing()
            throws Exception {

        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        robot.join();
    }

    @Ignore("KG-12432")
    @Robotic(script = "sendSmallTextMessageThenFrameWithReservedControlOpcodeEquals15AndNonEmptyPayloadThenPing")
    @Test(timeout = 1500)
    public void sendSmallTextMessageThenFrameWithReservedControlOpcodeEquals15AndNonEmptyPayloadThenPing()
            throws Exception {

        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        robot.join();
    }

    @Ignore("KG-12432")
    @Robotic(script = "sendSmallTextMessageThenFrameWithReservedNonControlOpcodeEquals5ThenPing")
    @Test(timeout = 1500)
    public void sendSmallTextMessageThenFrameWithReservedNonControlOpcodeEquals5ThenPing() throws Exception {

        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        robot.join();
    }

    @Ignore("KG-12432")
    @Robotic(script = "sendSmallTextMessageThenFrameWithReservedNonControlOpcodeEquals6AndNonEmptyPayloadThenPing")
    @Test(timeout = 1500)
    public void sendSmallTextMessageThenFrameWithReservedNonControlOpcodeEquals6AndNonEmptyPayloadThenPing()
            throws Exception {

        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        robot.join();
    }

    @Ignore("KG-12432")
    @Robotic(script = "sendSmallTextMessageThenFrameWithReservedNonControlOpcodeEquals7AndNonEmptyPayloadThenPing")
    @Test(timeout = 1500)
    public void sendSmallTextMessageThenFrameWithReservedNonControlOpcodeEquals7AndNonEmptyPayloadThenPing()
            throws Exception {

        WebSocket webSocket;
        URI location = new URI("ws://localhost:8001/echo");
        WebSocketFactory wsFactory = WebSocketFactory.createWebSocketFactory();
        webSocket = wsFactory.createWebSocket(location);

        webSocket.connect();

        WebSocketMessageWriter writer = webSocket.getMessageWriter();
        WebSocketMessageReader reader = webSocket.getMessageReader();

        reader.next();
        CharSequence text = reader.getText();
        writer.writeText(text);

        robot.join();
    }
}
