package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AbstractBinderC3320a1;
import com.google.android.gms.ads.internal.client.AbstractBinderC3336e1;
import com.google.android.gms.ads.internal.client.InterfaceC3260G0;
import com.google.android.gms.ads.internal.client.InterfaceC3272K0;
import com.google.android.gms.ads.internal.client.InterfaceC3301U0;
import com.google.android.gms.ads.internal.client.InterfaceC3328c1;
import com.google.android.gms.ads.internal.client.InterfaceC3340f1;
import com.google.android.gms.dynamic.InterfaceC3772a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbho extends zzaxz implements zzbhq {
    zzbho(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final boolean zzA() {
        Parcel parcelZzde = zzde(24, zza());
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzB(InterfaceC3272K0 interfaceC3272K0) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3272K0);
        zzdf(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzC(InterfaceC3260G0 interfaceC3260G0) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3260G0);
        zzdf(26, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzD() {
        zzdf(27, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzE() {
        zzdf(28, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final zzbft zzF() {
        zzbft zzbfrVar;
        Parcel parcelZzde = zzde(29, zza());
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            zzbfrVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzbfrVar = iInterfaceQueryLocalInterface instanceof zzbft ? (zzbft) iInterfaceQueryLocalInterface : new zzbfr(strongBinder);
        }
        parcelZzde.recycle();
        return zzbfrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final boolean zzG() {
        Parcel parcelZzde = zzde(30, zza());
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final InterfaceC3328c1 zzH() {
        Parcel parcelZzde = zzde(31, zza());
        InterfaceC3328c1 interfaceC3328c1Zzb = AbstractBinderC3320a1.zzb(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return interfaceC3328c1Zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzI(InterfaceC3301U0 interfaceC3301U0) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3301U0);
        zzdf(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzJ(Bundle bundle) {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, bundle);
        zzdf(33, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final long zzK() {
        Parcel parcelZzde = zzde(34, zza());
        long j7 = parcelZzde.readLong();
        parcelZzde.recycle();
        return j7;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzL(long j7) {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j7);
        zzdf(35, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final String zze() {
        Parcel parcelZzde = zzde(2, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final List zzf() {
        Parcel parcelZzde = zzde(3, zza());
        ArrayList arrayListZzf = zzayb.zzf(parcelZzde);
        parcelZzde.recycle();
        return arrayListZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final String zzg() {
        Parcel parcelZzde = zzde(4, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final zzbfw zzh() {
        zzbfw zzbfuVar;
        Parcel parcelZzde = zzde(5, zza());
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            zzbfuVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbfuVar = iInterfaceQueryLocalInterface instanceof zzbfw ? (zzbfw) iInterfaceQueryLocalInterface : new zzbfu(strongBinder);
        }
        parcelZzde.recycle();
        return zzbfuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final String zzi() {
        Parcel parcelZzde = zzde(6, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final String zzj() {
        Parcel parcelZzde = zzde(7, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final double zzk() {
        Parcel parcelZzde = zzde(8, zza());
        double d7 = parcelZzde.readDouble();
        parcelZzde.recycle();
        return d7;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final String zzl() {
        Parcel parcelZzde = zzde(9, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final String zzm() {
        Parcel parcelZzde = zzde(10, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final InterfaceC3340f1 zzn() {
        Parcel parcelZzde = zzde(11, zza());
        InterfaceC3340f1 interfaceC3340f1Zzb = AbstractBinderC3336e1.zzb(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return interfaceC3340f1Zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final String zzo() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzp() {
        zzdf(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final zzbfp zzq() {
        zzbfp zzbfnVar;
        Parcel parcelZzde = zzde(14, zza());
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            zzbfnVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
            zzbfnVar = iInterfaceQueryLocalInterface instanceof zzbfp ? (zzbfp) iInterfaceQueryLocalInterface : new zzbfn(strongBinder);
        }
        parcelZzde.recycle();
        return zzbfnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzr(Bundle bundle) {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, bundle);
        zzdf(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final boolean zzs(Bundle bundle) {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, bundle);
        Parcel parcelZzde = zzde(16, parcelZza);
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzt(Bundle bundle) {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, bundle);
        zzdf(17, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final InterfaceC3772a zzu() {
        Parcel parcelZzde = zzde(18, zza());
        InterfaceC3772a interfaceC3772aM18219L0 = InterfaceC3772a.a.m18219L0(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return interfaceC3772aM18219L0;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final InterfaceC3772a zzv() {
        Parcel parcelZzde = zzde(19, zza());
        InterfaceC3772a interfaceC3772aM18219L0 = InterfaceC3772a.a.m18219L0(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return interfaceC3772aM18219L0;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final Bundle zzw() {
        Parcel parcelZzde = zzde(20, zza());
        Bundle bundle = (Bundle) zzayb.zzb(parcelZzde, Bundle.CREATOR);
        parcelZzde.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzx(zzbhn zzbhnVar) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, zzbhnVar);
        zzdf(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final void zzy() {
        zzdf(22, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbhq
    public final List zzz() {
        Parcel parcelZzde = zzde(23, zza());
        ArrayList arrayListZzf = zzayb.zzf(parcelZzde);
        parcelZzde.recycle();
        return arrayListZzf;
    }
}
