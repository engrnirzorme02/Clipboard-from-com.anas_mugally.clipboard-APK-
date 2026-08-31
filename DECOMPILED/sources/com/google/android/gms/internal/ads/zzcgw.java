package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import p404z2.C7584a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcgw {
    private C7584a zza;
    private Context zzb;
    private long zzc;
    private WeakReference zzd;

    public final zzcgw zza(C7584a c7584a) {
        this.zza = c7584a;
        return this;
    }

    public final zzcgw zzb(Context context) {
        this.zzd = new WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.zzb = context;
        return this;
    }

    public final zzcgw zzc(long j7) {
        this.zzc = j7;
        return this;
    }

    final /* synthetic */ C7584a zzd() {
        return this.zza;
    }

    final /* synthetic */ Context zze() {
        return this.zzb;
    }

    final /* synthetic */ long zzf() {
        return this.zzc;
    }

    final /* synthetic */ WeakReference zzg() {
        return this.zzd;
    }
}
