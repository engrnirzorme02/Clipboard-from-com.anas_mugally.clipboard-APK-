package com.google.android.gms.internal.ads;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6118n;
import p246f6.InterfaceC5442a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhln implements Iterator, InterfaceC5442a {
    private final /* synthetic */ Iterator zza;

    public zzhln(Iterator delegate) {
        AbstractC6118n.m27187e(delegate, "delegate");
        this.zza = delegate;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
