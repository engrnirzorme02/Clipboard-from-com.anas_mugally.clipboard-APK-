package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC3772a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfqe extends zzaxz implements zzfqg {
    zzfqe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final void zze() {
        zzdf(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final void zzf(int[] iArr) {
        Parcel parcelZza = zza();
        parcelZza.writeIntArray(null);
        zzdf(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final void zzg(byte[] bArr) {
        Parcel parcelZza = zza();
        parcelZza.writeByteArray(bArr);
        zzdf(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final void zzh(int i7) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i7);
        zzdf(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final void zzi(int i7) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i7);
        zzdf(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfqg
    public final void zzj(InterfaceC3772a interfaceC3772a, String str, String str2) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        parcelZza.writeString(str);
        parcelZza.writeString(null);
        zzdf(8, parcelZza);
    }
}
