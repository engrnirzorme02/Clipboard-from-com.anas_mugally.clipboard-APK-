package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6118n;
import p246f6.InterfaceC5442a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhlp extends zzhlm implements Set, InterfaceC5442a {
    private final Set zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhlp(Set delegate) {
        super(delegate);
        AbstractC6118n.m27187e(delegate, "delegate");
        this.zza = delegate;
    }

    @Override // com.google.android.gms.internal.ads.zzhlm, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return super.contains((Map.Entry) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzhlm, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new zzhlo(this.zza.iterator());
    }
}
