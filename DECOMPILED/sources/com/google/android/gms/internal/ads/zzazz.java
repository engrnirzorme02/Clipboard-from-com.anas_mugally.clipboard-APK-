package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AbstractBinderC3320a1;
import com.google.android.gms.ads.internal.client.InterfaceC3301U0;
import com.google.android.gms.ads.internal.client.InterfaceC3312Y;
import com.google.android.gms.ads.internal.client.InterfaceC3328c1;
import com.google.android.gms.dynamic.InterfaceC3772a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzazz extends zzaxz implements zzbab {
    zzazz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final InterfaceC3312Y zze() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final void zzf(InterfaceC3772a interfaceC3772a, zzbai zzbaiVar) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzayb.zze(parcelZza, zzbaiVar);
        zzdf(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final InterfaceC3328c1 zzg() {
        Parcel parcelZzde = zzde(5, zza());
        InterfaceC3328c1 interfaceC3328c1Zzb = AbstractBinderC3320a1.zzb(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return interfaceC3328c1Zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final void zzh(boolean z7) {
        Parcel parcelZza = zza();
        int i7 = zzayb.zza;
        parcelZza.writeInt(z7 ? 1 : 0);
        zzdf(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final void zzi(InterfaceC3301U0 interfaceC3301U0) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3301U0);
        zzdf(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final String zzj() {
        Parcel parcelZzde = zzde(8, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final long zzk() {
        Parcel parcelZzde = zzde(9, zza());
        long j7 = parcelZzde.readLong();
        parcelZzde.recycle();
        return j7;
    }

    @Override // com.google.android.gms.internal.ads.zzbab
    public final void zzl(long j7) {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j7);
        zzdf(10, parcelZza);
    }
}
