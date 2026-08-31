package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AbstractBinderC3336e1;
import com.google.android.gms.ads.internal.client.C3349h2;
import com.google.android.gms.ads.internal.client.C3369m2;
import com.google.android.gms.ads.internal.client.InterfaceC3340f1;
import com.google.android.gms.dynamic.InterfaceC3772a;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzboy extends zzaxz implements zzbpa {
    zzboy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzA(boolean z7) {
        Parcel parcelZza = zza();
        int i7 = zzayb.zza;
        parcelZza.writeInt(z7 ? 1 : 0);
        zzdf(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final InterfaceC3340f1 zzB() {
        Parcel parcelZzde = zzde(26, zza());
        InterfaceC3340f1 interfaceC3340f1Zzb = AbstractBinderC3336e1.zzb(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return interfaceC3340f1Zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final zzbpm zzC() {
        zzbpm zzbpkVar;
        Parcel parcelZzde = zzde(27, zza());
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            zzbpkVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbpkVar = iInterfaceQueryLocalInterface instanceof zzbpm ? (zzbpm) iInterfaceQueryLocalInterface : new zzbpk(strongBinder);
        }
        parcelZzde.recycle();
        return zzbpkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzD(InterfaceC3772a interfaceC3772a, C3349h2 c3349h2, String str, zzbpd zzbpdVar) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzayb.zzc(parcelZza, c3349h2);
        parcelZza.writeString(str);
        zzayb.zze(parcelZza, zzbpdVar);
        zzdf(28, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzE(InterfaceC3772a interfaceC3772a) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzdf(30, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzF(InterfaceC3772a interfaceC3772a, zzblo zzbloVar, List list) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzayb.zze(parcelZza, zzbloVar);
        parcelZza.writeTypedList(list);
        zzdf(31, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzG(InterfaceC3772a interfaceC3772a, C3349h2 c3349h2, String str, zzbpd zzbpdVar) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzayb.zzc(parcelZza, c3349h2);
        parcelZza.writeString(str);
        zzayb.zze(parcelZza, zzbpdVar);
        zzdf(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final zzbrl zzH() {
        Parcel parcelZzde = zzde(33, zza());
        zzbrl zzbrlVar = (zzbrl) zzayb.zzb(parcelZzde, zzbrl.CREATOR);
        parcelZzde.recycle();
        return zzbrlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final zzbrl zzI() {
        Parcel parcelZzde = zzde(34, zza());
        zzbrl zzbrlVar = (zzbrl) zzayb.zzb(parcelZzde, zzbrl.CREATOR);
        parcelZzde.recycle();
        return zzbrlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzJ(InterfaceC3772a interfaceC3772a, C3369m2 c3369m2, C3349h2 c3349h2, String str, String str2, zzbpd zzbpdVar) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzayb.zzc(parcelZza, c3369m2);
        zzayb.zzc(parcelZza, c3349h2);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayb.zze(parcelZza, zzbpdVar);
        zzdf(35, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final zzbpg zzK() {
        zzbpg zzbpeVar;
        Parcel parcelZzde = zzde(36, zza());
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            zzbpeVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbpeVar = iInterfaceQueryLocalInterface instanceof zzbpg ? (zzbpg) iInterfaceQueryLocalInterface : new zzbpe(strongBinder);
        }
        parcelZzde.recycle();
        return zzbpeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzL(InterfaceC3772a interfaceC3772a) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzdf(37, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzM(InterfaceC3772a interfaceC3772a, C3349h2 c3349h2, String str, zzbpd zzbpdVar) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzayb.zzc(parcelZza, c3349h2);
        parcelZza.writeString(str);
        zzayb.zze(parcelZza, zzbpdVar);
        zzdf(38, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzN(InterfaceC3772a interfaceC3772a) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzdf(39, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final zzbpi zzO() {
        zzbpi zzbpiVar;
        Parcel parcelZzde = zzde(15, zza());
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            zzbpiVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzbpiVar = iInterfaceQueryLocalInterface instanceof zzbpi ? (zzbpi) iInterfaceQueryLocalInterface : new zzbpi(strongBinder);
        }
        parcelZzde.recycle();
        return zzbpiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final zzbpj zzP() {
        zzbpj zzbpjVar;
        Parcel parcelZzde = zzde(16, zza());
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            zzbpjVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzbpjVar = iInterfaceQueryLocalInterface instanceof zzbpj ? (zzbpj) iInterfaceQueryLocalInterface : new zzbpj(strongBinder);
        }
        parcelZzde.recycle();
        return zzbpjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zze(InterfaceC3772a interfaceC3772a, C3369m2 c3369m2, C3349h2 c3349h2, String str, zzbpd zzbpdVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final InterfaceC3772a zzf() {
        Parcel parcelZzde = zzde(2, zza());
        InterfaceC3772a interfaceC3772aM18219L0 = InterfaceC3772a.a.m18219L0(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return interfaceC3772aM18219L0;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzg(InterfaceC3772a interfaceC3772a, C3349h2 c3349h2, String str, zzbpd zzbpdVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzh() {
        zzdf(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzi() {
        zzdf(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzj(InterfaceC3772a interfaceC3772a, C3369m2 c3369m2, C3349h2 c3349h2, String str, String str2, zzbpd zzbpdVar) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzayb.zzc(parcelZza, c3369m2);
        zzayb.zzc(parcelZza, c3349h2);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayb.zze(parcelZza, zzbpdVar);
        zzdf(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzk(InterfaceC3772a interfaceC3772a, C3349h2 c3349h2, String str, String str2, zzbpd zzbpdVar) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzayb.zzc(parcelZza, c3349h2);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayb.zze(parcelZza, zzbpdVar);
        zzdf(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzl() {
        zzdf(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzm() {
        zzdf(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzn(InterfaceC3772a interfaceC3772a, C3349h2 c3349h2, String str, zzbvs zzbvsVar, String str2) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzayb.zzc(parcelZza, c3349h2);
        parcelZza.writeString(null);
        zzayb.zze(parcelZza, zzbvsVar);
        parcelZza.writeString(str2);
        zzdf(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzo(C3349h2 c3349h2, String str) {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, c3349h2);
        parcelZza.writeString(str);
        zzdf(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzp() {
        zzdf(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final boolean zzq() {
        Parcel parcelZzde = zzde(13, zza());
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzr(InterfaceC3772a interfaceC3772a, C3349h2 c3349h2, String str, String str2, zzbpd zzbpdVar, zzbfl zzbflVar, List list) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzayb.zzc(parcelZza, c3349h2);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayb.zze(parcelZza, zzbpdVar);
        zzayb.zzc(parcelZza, zzbflVar);
        parcelZza.writeStringList(list);
        zzdf(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final Bundle zzs() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final Bundle zzt() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final Bundle zzu() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzv(C3349h2 c3349h2, String str, String str2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzw(InterfaceC3772a interfaceC3772a) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzdf(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final boolean zzx() {
        Parcel parcelZzde = zzde(22, zza());
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final void zzy(InterfaceC3772a interfaceC3772a, zzbvs zzbvsVar, List list) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzayb.zze(parcelZza, zzbvsVar);
        parcelZza.writeStringList(list);
        zzdf(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpa
    public final zzbgq zzz() {
        throw null;
    }
}
