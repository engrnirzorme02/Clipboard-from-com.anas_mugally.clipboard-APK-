package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AbstractBinderC3320a1;
import com.google.android.gms.ads.internal.client.C3349h2;
import com.google.android.gms.ads.internal.client.InterfaceC3292R0;
import com.google.android.gms.ads.internal.client.InterfaceC3301U0;
import com.google.android.gms.ads.internal.client.InterfaceC3328c1;
import com.google.android.gms.dynamic.InterfaceC3772a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbvy extends zzaxz implements zzbwa {
    zzbvy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzb(InterfaceC3772a interfaceC3772a) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzdf(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzc(C3349h2 c3349h2, zzbwh zzbwhVar) {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, c3349h2);
        zzayb.zze(parcelZza, zzbwhVar);
        zzdf(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzd(C3349h2 c3349h2, zzbwh zzbwhVar) {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, c3349h2);
        zzayb.zze(parcelZza, zzbwhVar);
        zzdf(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zze(zzbwd zzbwdVar) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, zzbwdVar);
        zzdf(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzf(InterfaceC3292R0 interfaceC3292R0) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3292R0);
        zzdf(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final Bundle zzg() {
        Parcel parcelZzde = zzde(9, zza());
        Bundle bundle = (Bundle) zzayb.zzb(parcelZzde, Bundle.CREATOR);
        parcelZzde.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzh(zzbwo zzbwoVar) {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, zzbwoVar);
        zzdf(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final boolean zzi() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final String zzj() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzk(InterfaceC3772a interfaceC3772a, boolean z7) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final zzbvx zzl() {
        zzbvx zzbvvVar;
        Parcel parcelZzde = zzde(11, zza());
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            zzbvvVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
            zzbvvVar = iInterfaceQueryLocalInterface instanceof zzbvx ? (zzbvx) iInterfaceQueryLocalInterface : new zzbvv(strongBinder);
        }
        parcelZzde.recycle();
        return zzbvvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final InterfaceC3328c1 zzm() {
        Parcel parcelZzde = zzde(12, zza());
        InterfaceC3328c1 interfaceC3328c1Zzb = AbstractBinderC3320a1.zzb(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return interfaceC3328c1Zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final String zzn() {
        Parcel parcelZzde = zzde(16, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzo(InterfaceC3301U0 interfaceC3301U0) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3301U0);
        zzdf(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzp(boolean z7) {
        Parcel parcelZza = zza();
        int i7 = zzayb.zza;
        parcelZza.writeInt(z7 ? 1 : 0);
        zzdf(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final long zzq() {
        Parcel parcelZzde = zzde(17, zza());
        long j7 = parcelZzde.readLong();
        parcelZzde.recycle();
        return j7;
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzr(long j7) {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j7);
        zzdf(18, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwa
    public final void zzs(zzbwi zzbwiVar) {
        throw null;
    }
}
