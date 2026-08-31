package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import com.google.android.gms.common.internal.AbstractC3686c;
import java.util.concurrent.Executor;
import p157U3.InterfaceFutureC1673e;
import p170W2.C1837b;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzdyv implements AbstractC3686c.a, AbstractC3686c.b {
    protected final zzbzm zza = new zzbzm();
    protected final Object zzb = new Object();
    protected boolean zzc = false;
    protected boolean zzd = false;
    protected zzbuv zze;
    protected zzbua zzf;

    static void zzc(Context context, InterfaceFutureC1673e interfaceFutureC1673e, Executor executor) {
        if (((Boolean) zzbea.zzj.zze()).booleanValue() || ((Boolean) zzbea.zzh.zze()).booleanValue()) {
            zzgot.zzq(interfaceFutureC1673e, new zzdys(context), executor);
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c.a
    public abstract /* synthetic */ void onConnected(Bundle bundle);

    public void onConnectionFailed(C1837b c1837b) {
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33326a("Disconnected from remote ad request service.");
        this.zza.zzd(new zzdzk(1));
    }

    @Override // com.google.android.gms.common.internal.AbstractC3686c.a
    public final void onConnectionSuspended(int i7) {
        int i8 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33326a("Cannot connect to remote service, fallback to local instance.");
    }

    protected final void zzb() {
        synchronized (this.zzb) {
            try {
                this.zzd = true;
                if (this.zzf.isConnected() || this.zzf.isConnecting()) {
                    this.zzf.disconnect();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
