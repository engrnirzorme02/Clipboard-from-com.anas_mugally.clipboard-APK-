package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class zzzj implements Comparator {
    static final /* synthetic */ zzzj zza = new zzzj();

    private /* synthetic */ zzzj() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        return Float.compare(((zzzi) obj).zzc, ((zzzi) obj2).zzc);
    }
}
