package com.google.android.datatransport.cct;

import p226d2.AbstractC5219h;
import p226d2.InterfaceC5215d;
import p226d2.InterfaceC5224m;

/* JADX INFO: loaded from: classes.dex */
public class CctBackendFactory implements InterfaceC5215d {
    @Override // p226d2.InterfaceC5215d
    public InterfaceC5224m create(AbstractC5219h abstractC5219h) {
        return new C3239d(abstractC5219h.mo24124b(), abstractC5219h.mo24127e(), abstractC5219h.mo24126d());
    }
}
