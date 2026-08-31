package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AbstractBinderC3336e1;
import com.google.android.gms.ads.internal.client.C3349h2;
import com.google.android.gms.ads.internal.client.C3369m2;
import com.google.android.gms.ads.internal.client.InterfaceC3340f1;
import com.google.android.gms.dynamic.InterfaceC3772a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbqu extends zzaxz implements zzbqw {
    zzbqu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zze(InterfaceC3772a interfaceC3772a, String str, Bundle bundle, Bundle bundle2, C3369m2 c3369m2, zzbqz zzbqzVar) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        parcelZza.writeString(str);
        zzayb.zzc(parcelZza, bundle);
        zzayb.zzc(parcelZza, bundle2);
        zzayb.zzc(parcelZza, c3369m2);
        zzayb.zze(parcelZza, zzbqzVar);
        zzdf(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final zzbrl zzf() {
        Parcel parcelZzde = zzde(2, zza());
        zzbrl zzbrlVar = (zzbrl) zzayb.zzb(parcelZzde, zzbrl.CREATOR);
        parcelZzde.recycle();
        return zzbrlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final zzbrl zzg() {
        Parcel parcelZzde = zzde(3, zza());
        zzbrl zzbrlVar = (zzbrl) zzayb.zzb(parcelZzde, zzbrl.CREATOR);
        parcelZzde.recycle();
        return zzbrlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final InterfaceC3340f1 zzh() {
        Parcel parcelZzde = zzde(5, zza());
        InterfaceC3340f1 interfaceC3340f1Zzb = AbstractBinderC3336e1.zzb(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return interfaceC3340f1Zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzi(String str, String str2, C3349h2 c3349h2, InterfaceC3772a interfaceC3772a, zzbqk zzbqkVar, zzbpd zzbpdVar, C3369m2 c3369m2) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayb.zzc(parcelZza, c3349h2);
        zzayb.zze(parcelZza, interfaceC3772a);
        zzayb.zze(parcelZza, zzbqkVar);
        zzayb.zze(parcelZza, zzbpdVar);
        zzayb.zzc(parcelZza, c3369m2);
        zzdf(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzj(String str, String str2, C3349h2 c3349h2, InterfaceC3772a interfaceC3772a, zzbqn zzbqnVar, zzbpd zzbpdVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayb.zzc(parcelZza, c3349h2);
        zzayb.zze(parcelZza, interfaceC3772a);
        zzayb.zze(parcelZza, zzbqnVar);
        zzayb.zze(parcelZza, zzbpdVar);
        zzdf(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final boolean zzk(InterfaceC3772a interfaceC3772a) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        Parcel parcelZzde = zzde(15, parcelZza);
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzl(String str, String str2, C3349h2 c3349h2, InterfaceC3772a interfaceC3772a, zzbqt zzbqtVar, zzbpd zzbpdVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayb.zzc(parcelZza, c3349h2);
        zzayb.zze(parcelZza, interfaceC3772a);
        zzayb.zze(parcelZza, zzbqtVar);
        zzayb.zze(parcelZza, zzbpdVar);
        zzdf(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final boolean zzm(InterfaceC3772a interfaceC3772a) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        Parcel parcelZzde = zzde(17, parcelZza);
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzn(String str, String str2, C3349h2 c3349h2, InterfaceC3772a interfaceC3772a, zzbqq zzbqqVar, zzbpd zzbpdVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayb.zzc(parcelZza, c3349h2);
        zzayb.zze(parcelZza, interfaceC3772a);
        zzayb.zze(parcelZza, zzbqqVar);
        zzayb.zze(parcelZza, zzbpdVar);
        zzdf(18, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzo(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzdf(19, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzp(String str, String str2, C3349h2 c3349h2, InterfaceC3772a interfaceC3772a, zzbqt zzbqtVar, zzbpd zzbpdVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayb.zzc(parcelZza, c3349h2);
        zzayb.zze(parcelZza, interfaceC3772a);
        zzayb.zze(parcelZza, zzbqtVar);
        zzayb.zze(parcelZza, zzbpdVar);
        zzdf(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzq(String str, String str2, C3349h2 c3349h2, InterfaceC3772a interfaceC3772a, zzbqk zzbqkVar, zzbpd zzbpdVar, C3369m2 c3369m2) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayb.zzc(parcelZza, c3349h2);
        zzayb.zze(parcelZza, interfaceC3772a);
        zzayb.zze(parcelZza, zzbqkVar);
        zzayb.zze(parcelZza, zzbpdVar);
        zzayb.zzc(parcelZza, c3369m2);
        zzdf(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzr(String str, String str2, C3349h2 c3349h2, InterfaceC3772a interfaceC3772a, zzbqq zzbqqVar, zzbpd zzbpdVar, zzbfl zzbflVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayb.zzc(parcelZza, c3349h2);
        zzayb.zze(parcelZza, interfaceC3772a);
        zzayb.zze(parcelZza, zzbqqVar);
        zzayb.zze(parcelZza, zzbpdVar);
        zzayb.zzc(parcelZza, zzbflVar);
        zzdf(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzs(String str, String str2, C3349h2 c3349h2, InterfaceC3772a interfaceC3772a, zzbqh zzbqhVar, zzbpd zzbpdVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayb.zzc(parcelZza, c3349h2);
        zzayb.zze(parcelZza, interfaceC3772a);
        zzayb.zze(parcelZza, zzbqhVar);
        zzayb.zze(parcelZza, zzbpdVar);
        zzdf(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final boolean zzt(InterfaceC3772a interfaceC3772a) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        Parcel parcelZzde = zzde(24, parcelZza);
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }
}
