package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.ads.internal.util.InterfaceC3428E;
import com.google.android.gms.common.internal.AbstractC3718s;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbno extends zzbzt {
    private final InterfaceC3428E zzb;
    private final Object zza = new Object();
    private boolean zzc = false;
    private int zzd = 0;

    public zzbno(InterfaceC3428E interfaceC3428E) {
        this.zzb = interfaceC3428E;
    }

    public final zzbnj zza() {
        zzbnj zzbnjVar = new zzbnj(this);
        AbstractC3490o0.m17545k("createNewReference: Trying to acquire lock");
        synchronized (this.zza) {
            AbstractC3490o0.m17545k("createNewReference: Lock acquired");
            zze(new zzbnk(this, zzbnjVar), new zzbnl(this, zzbnjVar));
            AbstractC3718s.m18086o(this.zzd >= 0);
            this.zzd++;
        }
        AbstractC3490o0.m17545k("createNewReference: Lock released");
        return zzbnjVar;
    }

    protected final void zzb() {
        AbstractC3490o0.m17545k("releaseOneReference: Trying to acquire lock");
        synchronized (this.zza) {
            AbstractC3490o0.m17545k("releaseOneReference: Lock acquired");
            AbstractC3718s.m18086o(this.zzd > 0);
            AbstractC3490o0.m17545k("Releasing 1 reference for JS Engine");
            this.zzd--;
            zzd();
        }
        AbstractC3490o0.m17545k("releaseOneReference: Lock released");
    }

    public final void zzc() {
        AbstractC3490o0.m17545k("markAsDestroyable: Trying to acquire lock");
        synchronized (this.zza) {
            AbstractC3490o0.m17545k("markAsDestroyable: Lock acquired");
            AbstractC3718s.m18086o(this.zzd >= 0);
            AbstractC3490o0.m17545k("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.zzc = true;
            zzd();
        }
        AbstractC3490o0.m17545k("markAsDestroyable: Lock released");
    }

    protected final void zzd() {
        AbstractC3490o0.m17545k("maybeDestroy: Trying to acquire lock");
        synchronized (this.zza) {
            try {
                AbstractC3490o0.m17545k("maybeDestroy: Lock acquired");
                AbstractC3718s.m18086o(this.zzd >= 0);
                if (this.zzc && this.zzd == 0) {
                    AbstractC3490o0.m17545k("No reference is left (including root). Cleaning up engine.");
                    zze(new zzbnn(this), new zzbzp());
                } else {
                    AbstractC3490o0.m17545k("There are still references to the engine. Not destroying.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AbstractC3490o0.m17545k("maybeDestroy: Lock released");
    }
}
