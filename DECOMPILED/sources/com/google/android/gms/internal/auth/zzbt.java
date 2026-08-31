package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.AbstractC3560h;
import com.google.android.gms.common.api.AbstractC3561i;
import com.google.android.gms.common.internal.AbstractC3718s;
import p128Q2.C1255b;
import p128Q2.InterfaceC1254a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbt implements InterfaceC1254a {
    public final AbstractC3561i getSpatulaHeader(AbstractC3560h abstractC3560h) {
        AbstractC3718s.m18083l(abstractC3560h);
        return abstractC3560h.mo17772b(new zzbs(this, abstractC3560h));
    }

    public final AbstractC3561i performProxyRequest(AbstractC3560h abstractC3560h, C1255b c1255b) {
        AbstractC3718s.m18083l(abstractC3560h);
        AbstractC3718s.m18083l(c1255b);
        return abstractC3560h.mo17772b(new zzbq(this, abstractC3560h, c1255b));
    }
}
