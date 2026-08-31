package com.google.android.gms.internal.common;

import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class zzah extends zzae {
    public zzah() {
        throw null;
    }

    public final zzah zzb(Object obj) {
        super.zza(obj);
        return this;
    }

    public final zzah zzc(Iterator it) {
        while (it.hasNext()) {
            super.zza(it.next());
        }
        return this;
    }

    zzah(int i7) {
        super(4);
    }
}
