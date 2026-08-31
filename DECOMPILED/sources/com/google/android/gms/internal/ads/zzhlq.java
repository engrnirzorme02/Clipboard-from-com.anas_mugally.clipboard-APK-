package com.google.android.gms.internal.ads;

import java.util.Map;
import kotlin.jvm.internal.AbstractC6118n;
import p246f6.InterfaceC5442a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhlq implements Map.Entry, InterfaceC5442a {
    private final /* synthetic */ Map.Entry zza;

    public zzhlq(Map.Entry delegate) {
        AbstractC6118n.m27187e(delegate, "delegate");
        this.zza = delegate;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.zza.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
