package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
final class zzgjn extends zzgjp {
    zzgjn() {
        super(null);
    }

    static final zzgjp zzf(int i7) {
        if (i7 < 0) {
            return zzgjp.zzb;
        }
        return i7 > 0 ? zzgjp.zzc : zzgjp.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgjp
    public final zzgjp zza(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzgjp
    public final zzgjp zzb(int i7, int i8) {
        return zzf(Integer.compare(i7, i8));
    }

    @Override // com.google.android.gms.internal.ads.zzgjp
    public final zzgjp zzc(boolean z7, boolean z8) {
        return zzf(Boolean.compare(z8, z7));
    }

    @Override // com.google.android.gms.internal.ads.zzgjp
    public final zzgjp zzd(boolean z7, boolean z8) {
        return zzf(Boolean.compare(z7, z8));
    }

    @Override // com.google.android.gms.internal.ads.zzgjp
    public final int zze() {
        return 0;
    }
}
