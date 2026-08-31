package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;
import p152T5.AbstractC1631j;
import p152T5.AbstractC1638q;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhy {
    private List zza = AbstractC1638q.m6765j();

    public final long zza(long[] jArr) {
        Iterator it = AbstractC1638q.m6582V(this.zza, AbstractC1631j.m6733d0(jArr)).iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = Long.valueOf(((Number) next).longValue() ^ ((Number) it.next()).longValue());
        }
        return ((Number) next).longValue();
    }

    public final void zzb(long[] jArr) {
        this.zza = AbstractC1631j.m6733d0(jArr);
    }
}
