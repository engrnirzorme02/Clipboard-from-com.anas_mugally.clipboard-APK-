package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AbstractBinderC3336e1;
import com.google.android.gms.ads.internal.client.InterfaceC3340f1;
import com.google.android.gms.dynamic.InterfaceC3772a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbpk extends zzaxz implements zzbpm {
    zzbpk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final float zzA() {
        Parcel parcelZzde = zzde(24, zza());
        float f7 = parcelZzde.readFloat();
        parcelZzde.recycle();
        return f7;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final float zzB() {
        Parcel parcelZzde = zzde(25, zza());
        float f7 = parcelZzde.readFloat();
        parcelZzde.recycle();
        return f7;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzC() {
        zzdf(26, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final String zze() {
        Parcel parcelZzde = zzde(2, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final List zzf() {
        Parcel parcelZzde = zzde(3, zza());
        ArrayList arrayListZzf = zzayb.zzf(parcelZzde);
        parcelZzde.recycle();
        return arrayListZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final String zzg() {
        Parcel parcelZzde = zzde(4, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final zzbfw zzh() {
        Parcel parcelZzde = zzde(5, zza());
        zzbfw zzbfwVarZzh = zzbfv.zzh(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzbfwVarZzh;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final String zzi() {
        Parcel parcelZzde = zzde(6, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final String zzj() {
        Parcel parcelZzde = zzde(7, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final double zzk() {
        Parcel parcelZzde = zzde(8, zza());
        double d7 = parcelZzde.readDouble();
        parcelZzde.recycle();
        return d7;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final String zzl() {
        Parcel parcelZzde = zzde(9, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final String zzm() {
        Parcel parcelZzde = zzde(10, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final InterfaceC3340f1 zzn() {
        Parcel parcelZzde = zzde(11, zza());
        InterfaceC3340f1 interfaceC3340f1Zzb = AbstractBinderC3336e1.zzb(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return interfaceC3340f1Zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final zzbfp zzo() {
        Parcel parcelZzde = zzde(12, zza());
        zzbfp zzbfpVarZzj = zzbfo.zzj(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return zzbfpVarZzj;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final InterfaceC3772a zzp() {
        Parcel parcelZzde = zzde(13, zza());
        InterfaceC3772a interfaceC3772aM18219L0 = InterfaceC3772a.a.m18219L0(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return interfaceC3772aM18219L0;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final InterfaceC3772a zzq() {
        Parcel parcelZzde = zzde(14, zza());
        InterfaceC3772a interfaceC3772aM18219L0 = InterfaceC3772a.a.m18219L0(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return interfaceC3772aM18219L0;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final InterfaceC3772a zzr() {
        Parcel parcelZzde = zzde(15, zza());
        InterfaceC3772a interfaceC3772aM18219L0 = InterfaceC3772a.a.m18219L0(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return interfaceC3772aM18219L0;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final Bundle zzs() {
        Parcel parcelZzde = zzde(16, zza());
        Bundle bundle = (Bundle) zzayb.zzb(parcelZzde, Bundle.CREATOR);
        parcelZzde.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final boolean zzt() {
        Parcel parcelZzde = zzde(17, zza());
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final boolean zzu() {
        Parcel parcelZzde = zzde(18, zza());
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzv() {
        zzdf(19, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzw(InterfaceC3772a interfaceC3772a) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzdf(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzx(InterfaceC3772a interfaceC3772a, InterfaceC3772a interfaceC3772a2, InterfaceC3772a interfaceC3772a3) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzayb.zze(parcelZza, interfaceC3772a2);
        zzayb.zze(parcelZza, interfaceC3772a3);
        zzdf(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final void zzy(InterfaceC3772a interfaceC3772a) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzdf(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpm
    public final float zzz() {
        Parcel parcelZzde = zzde(23, zza());
        float f7 = parcelZzde.readFloat();
        parcelZzde.recycle();
        return f7;
    }
}
