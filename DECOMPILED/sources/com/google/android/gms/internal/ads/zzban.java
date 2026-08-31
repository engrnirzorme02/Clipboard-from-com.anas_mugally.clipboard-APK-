package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.common.internal.AbstractC3686c;
import java.util.Objects;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
final class zzban implements AbstractC3686c.a {
    final /* synthetic */ zzbap zza;

    zzban(zzbap zzbapVar) {
        Objects.requireNonNull(zzbapVar);
        this.zza = zzbapVar;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c.a
    public final void onConnected(Bundle bundle) {
        zzbap zzbapVar = this.zza;
        synchronized (zzbapVar.zzh()) {
            try {
                if (zzbapVar.zzi() != null) {
                    zzbapVar.zzk(zzbapVar.zzi().zzq());
                }
            } catch (DeadObjectException e7) {
                int i7 = AbstractC3490o0.f14278b;
                AbstractC7599p.m33329d("Unable to obtain a cache service instance.", e7);
                this.zza.zzg();
            }
            this.zza.zzh().notifyAll();
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c.a
    public final void onConnectionSuspended(int i7) {
        zzbap zzbapVar = this.zza;
        synchronized (zzbapVar.zzh()) {
            zzbapVar.zzk(null);
            zzbapVar.zzh().notifyAll();
        }
    }
}
