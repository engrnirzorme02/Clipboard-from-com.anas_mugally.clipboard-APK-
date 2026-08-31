package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.InterfaceC3494q0;
import com.google.android.gms.common.util.InterfaceC3750e;

/* JADX INFO: loaded from: classes2.dex */
final class zzbxm {
    private Context zza;
    private InterfaceC3750e zzb;
    private InterfaceC3494q0 zzc;
    private zzbxr zzd;

    private zzbxm() {
        throw null;
    }

    public final zzbxm zza(Context context) {
        context.getClass();
        this.zza = context;
        return this;
    }

    public final zzbxm zzb(InterfaceC3750e interfaceC3750e) {
        interfaceC3750e.getClass();
        this.zzb = interfaceC3750e;
        return this;
    }

    public final zzbxm zzc(InterfaceC3494q0 interfaceC3494q0) {
        this.zzc = interfaceC3494q0;
        return this;
    }

    public final zzbxm zzd(zzbxr zzbxrVar) {
        this.zzd = zzbxrVar;
        return this;
    }

    public final zzbxs zze() {
        zzhqf.zzc(this.zza, Context.class);
        zzhqf.zzc(this.zzb, InterfaceC3750e.class);
        zzhqf.zzc(this.zzc, InterfaceC3494q0.class);
        zzhqf.zzc(this.zzd, zzbxr.class);
        return new zzbxn(this.zza, this.zzb, this.zzc, this.zzd);
    }

    /* synthetic */ zzbxm(byte[] bArr) {
    }
}
