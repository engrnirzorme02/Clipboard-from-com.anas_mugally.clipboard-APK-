package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzgkz extends zzgld {
    final /* synthetic */ Comparator zza;

    zzgkz(Comparator comparator) {
        this.zza = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzgld
    final Map zza() {
        return new TreeMap(this.zza);
    }
}
