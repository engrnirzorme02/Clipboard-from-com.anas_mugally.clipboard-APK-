package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.AbstractC3686c;
import java.util.Objects;
import p170W2.C1837b;

/* JADX INFO: loaded from: classes2.dex */
final class zzbao implements AbstractC3686c.b {
    final /* synthetic */ zzbap zza;

    zzbao(zzbap zzbapVar) {
        Objects.requireNonNull(zzbapVar);
        this.zza = zzbapVar;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c.b
    public final void onConnectionFailed(C1837b c1837b) {
        zzbap zzbapVar = this.zza;
        synchronized (zzbapVar.zzh()) {
            try {
                zzbapVar.zzk(null);
                if (zzbapVar.zzi() != null) {
                    zzbapVar.zzj(null);
                }
                zzbapVar.zzh().notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
