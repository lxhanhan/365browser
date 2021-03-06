
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/WebKit/public/platform/modules/mediasession/media_session.mojom
//

package org.chromium.blink.mojom;

import org.chromium.base.annotations.SuppressFBWarnings;
import org.chromium.mojo.bindings.DeserializationException;

public final class MediaSessionAction {


    public static final int PLAY = 0;

    public static final int PAUSE = PLAY + 1;

    public static final int PREVIOUS_TRACK = PAUSE + 1;

    public static final int NEXT_TRACK = PREVIOUS_TRACK + 1;

    public static final int SEEK_BACKWARD = NEXT_TRACK + 1;

    public static final int SEEK_FORWARD = SEEK_BACKWARD + 1;

    public static final int LAST = (int) (MediaSessionAction.SEEK_FORWARD);


    private static final boolean IS_EXTENSIBLE = false;

    public static boolean isKnownValue(int value) {
        switch (value) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return true;
        }
        return false;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value))
            return;

        throw new DeserializationException("Invalid enum value.");
    }

    private MediaSessionAction() {}

}