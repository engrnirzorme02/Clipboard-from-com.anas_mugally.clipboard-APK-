package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.C3424C;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzdyt extends zzbum {
    final /* synthetic */ zzdyv zza;

    protected zzdyt(zzdyv zzdyvVar) {
        Objects.requireNonNull(zzdyvVar);
        this.zza = zzdyvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbun
    public final void zze(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        zzdyv zzdyvVar = this.zza;
        zzdyvVar.zza.zzc(new zzdzl(autoCloseInputStream, zzdyvVar.zze));
    }

    @Override // com.google.android.gms.internal.ads.zzbun
    public final void zzf(C3424C c3424c) {
        this.zza.zza.zzd(c3424c.m17381U());
    }

    @Override // com.google.android.gms.internal.ads.zzbun
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbuv zzbuvVar) {
        this.zza.zza.zzc(new zzdzl(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzbuvVar));
    }
}
