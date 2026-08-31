package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcwk extends zzdbq {
    private boolean zzb;

    public zzcwk(Set set) {
        super(set);
        this.zzb = false;
    }

    public final synchronized void zza() {
        if (this.zzb) {
            return;
        }
        zzs(zzcwj.zza);
        this.zzb = true;
    }
}
