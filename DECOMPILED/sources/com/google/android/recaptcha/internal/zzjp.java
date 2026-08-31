package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class zzjp extends zzjk {
    final /* synthetic */ Iterable zza;
    final /* synthetic */ int zzb;

    zzjp(Iterable iterable, int i7) {
        this.zza = iterable;
        this.zzb = i7;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterable iterable = this.zza;
        if (iterable instanceof List) {
            List list = (List) iterable;
            return list.subList(Math.min(list.size(), this.zzb), list.size()).iterator();
        }
        int i7 = this.zzb;
        Iterator it = iterable.iterator();
        it.getClass();
        zzjf.zzb(i7 >= 0, "numberToAdvance must be nonnegative");
        for (int i8 = 0; i8 < i7 && it.hasNext(); i8++) {
            it.next();
        }
        return new zzjo(this, it);
    }
}
