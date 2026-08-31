package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.AbstractC3490o0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbnj extends zzbzt {
    private final Object zza = new Object();
    private final zzbno zzb;
    private boolean zzc;

    public zzbnj(zzbno zzbnoVar) {
        this.zzb = zzbnoVar;
    }

    public final void zza() {
        AbstractC3490o0.m17545k("release: Trying to acquire lock");
        synchronized (this.zza) {
            try {
                AbstractC3490o0.m17545k("release: Lock acquired");
                if (this.zzc) {
                    AbstractC3490o0.m17545k("release: Lock already released");
                    return;
                }
                this.zzc = true;
                zze(new zzbng(this), new zzbzp());
                zze(new zzbnh(this), new zzbni(this));
                AbstractC3490o0.m17545k("release: Lock released");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ zzbno zzb() {
        return this.zzb;
    }
}
