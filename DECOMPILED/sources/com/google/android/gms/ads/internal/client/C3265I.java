package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzayb;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.I */
/* JADX INFO: loaded from: classes.dex */
public final class C3265I extends zzaxz implements InterfaceC3271K {
    C3265I(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3271K
    public final void zzb() {
        zzdf(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3271K
    public final void zzc(int i7) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i7);
        zzdf(2, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3271K
    public final void zzd(C3324b1 c3324b1) {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, c3324b1);
        zzdf(8, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3271K
    public final void zze() {
        zzdf(3, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3271K
    public final void zzf() {
        zzdf(4, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3271K
    public final void zzg() {
        zzdf(5, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3271K
    public final void zzh() {
        zzdf(6, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3271K
    public final void zzi() {
        zzdf(9, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3271K
    public final void zzj() {
        zzdf(7, zza());
    }
}
