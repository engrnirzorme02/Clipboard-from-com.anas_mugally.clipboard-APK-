package com.google.android.gms.internal.ads;

import java.util.List;
import p404z2.C7606w;

/* JADX INFO: loaded from: classes2.dex */
public final class zzded {
    private final List zza;
    private final zzfjv zzb;
    private final C7606w zzc;
    private boolean zzd;

    public zzded(zzfcj zzfcjVar, zzfjv zzfjvVar) {
        this.zza = zzfcjVar.zzp;
        this.zzb = zzfjvVar;
        this.zzc = zzfcjVar.zzax;
    }

    public final void zza() {
        if (this.zzd) {
            return;
        }
        this.zzb.zza(this.zza, this.zzc);
        this.zzd = true;
    }
}
