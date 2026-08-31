package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.C3250D;
import com.google.android.gms.ads.internal.util.AbstractC3490o0;
import java.util.concurrent.Executor;
import p157U3.InterfaceFutureC1673e;
import p170W2.C1837b;
import p380w2.C7351t;
import p404z2.AbstractC7599p;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdyr extends zzdyv {
    private final Context zzg;
    private final Executor zzh;

    public zzdyr(Context context, Executor executor) {
        this.zzg = context;
        this.zzh = executor;
        this.zzf = new zzbua(context, C7351t.m32365w().m17489a(), this, this);
    }

    @Override // com.google.android.gms.internal.ads.zzdyv, com.google.android.gms.common.internal.AbstractC3686c.a
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            try {
                if (!this.zzd) {
                    this.zzd = true;
                    try {
                        this.zzf.zzp().zze(this.zze, ((Boolean) C3250D.m17200c().zzd(zzbci.zznM)).booleanValue() ? new zzdyu(this.zza, this.zze) : new zzdyt(this));
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.zza.zzd(new zzdzk(1));
                    } catch (Throwable th) {
                        C7351t.m32354l().zzg(th, "RemoteAdRequestClientTask.onConnected");
                        this.zza.zzd(new zzdzk(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdyv, com.google.android.gms.common.internal.AbstractC3686c.b
    public final void onConnectionFailed(C1837b c1837b) {
        int i7 = AbstractC3490o0.f14278b;
        AbstractC7599p.m33326a("Cannot connect to remote service, fallback to local instance.");
        this.zza.zzd(new zzdzk(1));
    }

    public final InterfaceFutureC1673e zza(zzbuv zzbuvVar) {
        synchronized (this.zzb) {
            try {
                if (this.zzc) {
                    return this.zza;
                }
                this.zzc = true;
                this.zze = zzbuvVar;
                this.zzf.checkAvailabilityAndConnect();
                zzbzm zzbzmVar = this.zza;
                zzbzmVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdyq
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzb();
                    }
                }, zzbzh.zzg);
                zzdyv.zzc(this.zzg, zzbzmVar, this.zzh);
                return zzbzmVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
