package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC3772a;
import p388x2.C7403a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbsn extends zzaxz implements zzbsp {
    zzbsn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.google.android.gms.internal.ads.zzbsp
    public final void zze(Intent intent) {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, intent);
        zzdf(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsp
    public final void zzf(InterfaceC3772a interfaceC3772a, String str, String str2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbsp
    public final void zzg() {
        zzdf(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsp
    public final void zzh(InterfaceC3772a interfaceC3772a) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzdf(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsp
    public final void zzi(String[] strArr, int[] iArr, InterfaceC3772a interfaceC3772a) {
        Parcel parcelZza = zza();
        parcelZza.writeStringArray(strArr);
        parcelZza.writeIntArray(iArr);
        zzayb.zze(parcelZza, interfaceC3772a);
        zzdf(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsp
    public final void zzj(InterfaceC3772a interfaceC3772a, C7403a c7403a) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzayb.zzc(parcelZza, c7403a);
        zzdf(6, parcelZza);
    }
}
