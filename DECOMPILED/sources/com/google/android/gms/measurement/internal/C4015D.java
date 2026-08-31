package com.google.android.gms.measurement.internal;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.D */
/* JADX INFO: loaded from: classes2.dex */
final class C4015D implements Iterator {

    /* JADX INFO: renamed from: a */
    final Iterator f15151a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C4023E f15152b;

    C4015D(C4023E c4023e) {
        Objects.requireNonNull(c4023e);
        this.f15152b = c4023e;
        this.f15151a = c4023e.m18485Z().keySet().iterator();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String next() {
        return (String) this.f15151a.next();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f15151a.hasNext();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Remove not supported");
    }
}
