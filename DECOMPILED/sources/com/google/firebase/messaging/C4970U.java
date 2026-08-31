package com.google.firebase.messaging;

import java.util.Locale;

/* JADX INFO: renamed from: com.google.firebase.messaging.U */
/* JADX INFO: loaded from: classes.dex */
public final class C4970U extends Exception {

    /* JADX INFO: renamed from: a */
    private final int f18854a;

    C4970U(String str) {
        super(str);
        this.f18854a = m22401a(str);
    }

    /* JADX INFO: renamed from: a */
    private int m22401a(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        lowerCase.getClass();
        switch (lowerCase) {
            case "service_not_available":
                return 3;
            case "toomanymessages":
                return 4;
            case "invalid_parameters":
            case "missing_to":
                return 1;
            case "messagetoobig":
                return 2;
            default:
                return 0;
        }
    }
}
