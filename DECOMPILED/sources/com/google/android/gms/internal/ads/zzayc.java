package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC3772a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzayc extends zzaxz implements zzaye {
    zzayc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzaye
    public final void zze(InterfaceC3772a interfaceC3772a, String str) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        parcelZza.writeString("GMA_SDK");
        zzdf(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzaye
    public final void zzf() {
        zzdf(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzaye
    public final void zzg(int[] iArr) {
        Parcel parcelZza = zza();
        parcelZza.writeIntArray(null);
        zzdf(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzaye
    public final void zzh(byte[] bArr) {
        Parcel parcelZza = zza();
        parcelZza.writeByteArray(bArr);
        zzdf(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzaye
    public final void zzi(int i7) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(0);
        zzdf(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzaye
    public final void zzj(int i7) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i7);
        zzdf(7, parcelZza);
    }
}
