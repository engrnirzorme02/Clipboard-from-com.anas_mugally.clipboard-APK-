package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzayb;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3343g0 extends zzaxz implements InterfaceC3347h0 {
    C3343g0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdPreloadCallbackV2");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3347h0
    /* JADX INFO: renamed from: G */
    public final void mo17227G(String str, C3324b1 c3324b1) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzayb.zzc(parcelZza, c3324b1);
        zzdf(3, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3347h0
    /* JADX INFO: renamed from: o0 */
    public final void mo17228o0(String str, InterfaceC3328c1 interfaceC3328c1) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzayb.zze(parcelZza, interfaceC3328c1);
        zzdf(1, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3347h0
    public final void zzf(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzdf(2, parcelZza);
    }
}
