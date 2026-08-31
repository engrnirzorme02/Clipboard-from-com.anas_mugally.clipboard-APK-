package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.C3324b1;
import com.google.android.gms.dynamic.InterfaceC3772a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbqi extends zzaxz implements zzbqk {
    zzbqi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbqk
    public final void zze(InterfaceC3772a interfaceC3772a) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzdf(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqk
    public final void zzf(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString("Adapter returned null.");
        zzdf(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqk
    public final void zzg(C3324b1 c3324b1) {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, c3324b1);
        zzdf(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqk
    public final void zzh(zzbpg zzbpgVar) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, zzbpgVar);
        zzdf(4, parcelZza);
    }
}
