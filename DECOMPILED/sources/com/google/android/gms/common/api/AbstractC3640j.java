package com.google.android.gms.common.api;

import com.google.android.gms.common.api.internal.C3630v;
import com.google.android.gms.common.internal.AbstractC3718s;

/* JADX INFO: renamed from: com.google.android.gms.common.api.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3640j {
    /* JADX INFO: renamed from: a */
    public static AbstractC3561i m17969a(InterfaceC3643m interfaceC3643m, AbstractC3560h abstractC3560h) {
        AbstractC3718s.m18084m(interfaceC3643m, "Result must not be null");
        AbstractC3718s.m18073b(!interfaceC3643m.getStatus().m17747X(), "Status code must not be SUCCESS");
        C3650t c3650t = new C3650t(abstractC3560h, interfaceC3643m);
        c3650t.setResult(interfaceC3643m);
        return c3650t;
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC3561i m17970b(Status status, AbstractC3560h abstractC3560h) {
        AbstractC3718s.m18084m(status, "Result must not be null");
        C3630v c3630v = new C3630v(abstractC3560h);
        c3630v.setResult(status);
        return c3630v;
    }
}
