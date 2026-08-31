package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.C3424C;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdyu extends zzbum {
    private final zzbzm zza;
    private final zzbuv zzb;

    zzdyu(zzbzm zzbzmVar, zzbuv zzbuvVar) {
        this.zza = zzbzmVar;
        this.zzb = zzbuvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbun
    public final void zze(ParcelFileDescriptor parcelFileDescriptor) {
        this.zza.zzc(new zzdzl(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), this.zzb));
    }

    @Override // com.google.android.gms.internal.ads.zzbun
    public final void zzf(C3424C c3424c) {
        this.zza.zzd(c3424c.m17381U());
    }

    @Override // com.google.android.gms.internal.ads.zzbun
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbuv zzbuvVar) {
        this.zza.zzc(new zzdzl(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzbuvVar));
    }
}
