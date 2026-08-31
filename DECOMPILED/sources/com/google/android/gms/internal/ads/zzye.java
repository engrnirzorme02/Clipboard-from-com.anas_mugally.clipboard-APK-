package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class zzye {
    public final zzbf zza;
    public final int[] zzb;

    public zzye(zzbf zzbfVar, int[] iArr, int i7) {
        if (iArr.length == 0) {
            zzds.zzf("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.zza = zzbfVar;
        this.zzb = iArr;
    }
}
