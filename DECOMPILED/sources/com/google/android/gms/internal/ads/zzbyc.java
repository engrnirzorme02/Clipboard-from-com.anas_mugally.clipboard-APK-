package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC3772a;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbyc extends zzaxz implements zzbye {
    zzbyc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    public final void zze(InterfaceC3772a interfaceC3772a, zzbyi zzbyiVar, zzbyb zzbybVar) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzayb.zzc(parcelZza, zzbyiVar);
        zzayb.zze(parcelZza, zzbybVar);
        zzdf(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    public final void zzf(InterfaceC3772a interfaceC3772a) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    public final void zzg(List list, InterfaceC3772a interfaceC3772a, zzbtl zzbtlVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    public final void zzh(List list, InterfaceC3772a interfaceC3772a, zzbtl zzbtlVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    public final void zzi(zzbto zzbtoVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    public final void zzj(InterfaceC3772a interfaceC3772a) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzdf(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    public final void zzk(List list, InterfaceC3772a interfaceC3772a, zzbtl zzbtlVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    public final void zzl(List list, InterfaceC3772a interfaceC3772a, zzbtl zzbtlVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbye
    public final InterfaceC3772a zzm(InterfaceC3772a interfaceC3772a, InterfaceC3772a interfaceC3772a2, String str, InterfaceC3772a interfaceC3772a3) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzayb.zze(parcelZza, interfaceC3772a2);
        parcelZza.writeString(str);
        zzayb.zze(parcelZza, interfaceC3772a3);
        Parcel parcelZzde = zzde(11, parcelZza);
        InterfaceC3772a interfaceC3772aM18219L0 = InterfaceC3772a.a.m18219L0(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return interfaceC3772aM18219L0;
    }
}
