package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import p246f6.InterfaceC5442a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhlo implements Iterator, InterfaceC5442a {
    final /* synthetic */ Iterator zza;
    private final /* synthetic */ Iterator zzb;

    zzhlo(Iterator it) {
        this.zza = it;
        this.zzb = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new zzhlq((Map.Entry) this.zza.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
