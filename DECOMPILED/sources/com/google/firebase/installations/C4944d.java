package com.google.firebase.installations;

import p164V3.C1768m;

/* JADX INFO: renamed from: com.google.firebase.installations.d */
/* JADX INFO: loaded from: classes.dex */
public class C4944d extends C1768m {

    /* JADX INFO: renamed from: a */
    private final a f18763a;

    /* JADX INFO: renamed from: com.google.firebase.installations.d$a */
    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public C4944d(a aVar) {
        this.f18763a = aVar;
    }

    public C4944d(String str, a aVar) {
        super(str);
        this.f18763a = aVar;
    }
}
