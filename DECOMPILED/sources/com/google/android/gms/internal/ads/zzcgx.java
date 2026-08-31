package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import p380w2.C7351t;
import p380w2.RunnableC7342k;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcgx {
    private final C7584a zza;
    private final Context zzb;
    private final long zzc;
    private final WeakReference zzd;

    /* synthetic */ zzcgx(zzcgw zzcgwVar, byte[] bArr) {
        this.zza = zzcgwVar.zzd();
        this.zzb = zzcgwVar.zze();
        this.zzd = zzcgwVar.zzg();
        this.zzc = zzcgwVar.zzf();
    }

    final Context zza() {
        return this.zzb;
    }

    final Context zzb() {
        return this.zzb;
    }

    final WeakReference zzc() {
        return this.zzd;
    }

    final C7584a zzd() {
        return this.zza;
    }

    final String zze() {
        return C7351t.m32349g().m17439O(this.zzb, this.zza.f30226a);
    }

    final zzcgu zzf() {
        return new zzcgu(this.zzb, this.zza);
    }

    public final RunnableC7342k zzg() {
        return new RunnableC7342k(this.zzb, this.zza);
    }

    final zzbfc zzh() {
        return new zzbfc(this.zzb);
    }

    final long zzi() {
        return this.zzc;
    }
}
