package com.google.firebase.auth;

import p164V3.C1768m;
import p191Z2.C2086a;

/* JADX INFO: renamed from: com.google.firebase.auth.I */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4825I {
    private static final C2086a zza = new C2086a("PhoneAuthProvider", new String[0]);

    public abstract void onCodeAutoRetrievalTimeOut(String str);

    public abstract void onCodeSent(String str, C4824H c4824h);

    public abstract void onVerificationCompleted(C4823G c4823g);

    public abstract void onVerificationFailed(C1768m c1768m);
}
