package com.google.protobuf;

import java.util.List;

/* JADX INFO: renamed from: com.google.protobuf.t0 */
/* JADX INFO: loaded from: classes.dex */
public class C5127t0 extends RuntimeException {

    /* JADX INFO: renamed from: a */
    private final List f19533a;

    public C5127t0(InterfaceC5082U interfaceC5082U) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f19533a = null;
    }

    /* JADX INFO: renamed from: a */
    public C5065C m23592a() {
        return new C5065C(getMessage());
    }
}
