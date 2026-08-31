package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzayb;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.t0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3395t0 extends zzaxz implements InterfaceC3403v0 {
    C3395t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3403v0
    /* JADX INFO: renamed from: Y */
    public final void mo17203Y(C3324b1 c3324b1) {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, c3324b1);
        zzdf(1, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3403v0
    public final void zzc() {
        zzdf(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3403v0
    public final void zzd() {
        zzdf(3, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3403v0
    public final void zze() {
        zzdf(4, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3403v0
    public final void zzf() {
        zzdf(5, zza());
    }
}
