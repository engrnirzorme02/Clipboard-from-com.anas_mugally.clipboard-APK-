package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC3772a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbfy extends zzaxz implements zzbga {
    zzbfy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zzb(String str, InterfaceC3772a interfaceC3772a) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzayb.zze(parcelZza, interfaceC3772a);
        zzdf(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final InterfaceC3772a zzc(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzde = zzde(2, parcelZza);
        InterfaceC3772a interfaceC3772aM18219L0 = InterfaceC3772a.a.m18219L0(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return interfaceC3772aM18219L0;
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zzd(InterfaceC3772a interfaceC3772a) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzdf(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zzdG(InterfaceC3772a interfaceC3772a) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzdf(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zzdH(InterfaceC3772a interfaceC3772a) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzdf(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zzdI(zzbft zzbftVar) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, zzbftVar);
        zzdf(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zze() {
        zzdf(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zzf(InterfaceC3772a interfaceC3772a, int i7) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        parcelZza.writeInt(i7);
        zzdf(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbga
    public final void zzg(InterfaceC3772a interfaceC3772a) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzdf(6, parcelZza);
    }
}
