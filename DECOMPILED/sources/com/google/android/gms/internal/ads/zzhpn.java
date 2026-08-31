package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzhpn implements Iterator {
    int zza = 0;
    final /* synthetic */ zzhpo zzb;

    zzhpn(zzhpo zzhpoVar) {
        this.zzb = zzhpoVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7 = this.zza;
        zzhpo zzhpoVar = this.zzb;
        return i7 < zzhpoVar.zza.size() || zzhpoVar.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i7 = this.zza;
        zzhpo zzhpoVar = this.zzb;
        List list = zzhpoVar.zza;
        if (i7 >= list.size()) {
            list.add(zzhpoVar.zzb.next());
            return next();
        }
        int i8 = this.zza;
        this.zza = i8 + 1;
        return list.get(i8);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
