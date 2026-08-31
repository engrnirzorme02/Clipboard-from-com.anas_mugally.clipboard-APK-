package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.internal.AbstractC3686c;
import p170W2.C1837b;

/* JADX INFO: loaded from: classes2.dex */
final class zzfos implements AbstractC3686c.a, AbstractC3686c.b {
    private final zzfpj zza;
    private final zzfpd zzb;
    private final Object zzc = new Object();
    private boolean zzd = false;
    private boolean zze = false;

    zzfos(Context context, Looper looper, zzfpd zzfpdVar) {
        this.zzb = zzfpdVar;
        this.zza = new zzfpj(context, looper, this, this, 12800000);
    }

    private final void zzb() {
        synchronized (this.zzc) {
            try {
                zzfpj zzfpjVar = this.zza;
                if (zzfpjVar.isConnected() || zzfpjVar.isConnecting()) {
                    zzfpjVar.disconnect();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c.a
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzc) {
            try {
                if (this.zze) {
                    return;
                }
                this.zze = true;
                try {
                    this.zza.zzp().zzf(new zzfph(this.zzb.zzaN()));
                } catch (Exception unused) {
                } finally {
                    zzb();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c.b
    public final void onConnectionFailed(C1837b c1837b) {
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c.a
    public final void onConnectionSuspended(int i7) {
    }

    final void zza() {
        synchronized (this.zzc) {
            try {
                if (!this.zzd) {
                    this.zzd = true;
                    this.zza.checkAvailabilityAndConnect();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
