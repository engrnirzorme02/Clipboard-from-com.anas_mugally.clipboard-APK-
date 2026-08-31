package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Future;
import p380w2.C7351t;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbbd {
    private zzbas zza;
    private boolean zzb;
    private final Context zzc;
    private final Object zzd = new Object();

    zzbbd(Context context) {
        this.zzc = context;
    }

    final Future zza(zzbat zzbatVar) {
        zzbax zzbaxVar = new zzbax(this);
        zzbbb zzbbbVar = new zzbbb(this, zzbatVar, zzbaxVar);
        zzbbc zzbbcVar = new zzbbc(this, zzbaxVar);
        synchronized (this.zzd) {
            zzbas zzbasVar = new zzbas(this.zzc, C7351t.m32365w().m17489a(), zzbbbVar, zzbbcVar);
            this.zza = zzbasVar;
            zzbasVar.checkAvailabilityAndConnect();
        }
        return zzbaxVar;
    }

    final /* synthetic */ void zzb() {
        synchronized (this.zzd) {
            try {
                zzbas zzbasVar = this.zza;
                if (zzbasVar == null) {
                    return;
                }
                zzbasVar.disconnect();
                this.zza = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    final /* synthetic */ zzbas zzc() {
        return this.zza;
    }

    final /* synthetic */ boolean zzd() {
        return this.zzb;
    }

    final /* synthetic */ void zze(boolean z7) {
        this.zzb = true;
    }

    final /* synthetic */ Object zzf() {
        return this.zzd;
    }
}
