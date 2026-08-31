package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC3772a;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbsu extends zzaxz implements zzbsw {
    zzbsu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzH(int i7, String[] strArr, int[] iArr) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i7);
        parcelZza.writeStringArray(strArr);
        parcelZza.writeIntArray(iArr);
        zzdf(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zze() {
        zzdf(10, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzf() {
        zzdf(14, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final boolean zzg() {
        Parcel parcelZzde = zzde(11, zza());
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzh(Bundle bundle) {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, bundle);
        zzdf(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzi() {
        zzdf(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzj() {
        zzdf(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzk() {
        zzdf(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzl() {
        zzdf(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzm(int i7, int i8, Intent intent) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i7);
        parcelZza.writeInt(i8);
        zzayb.zzc(parcelZza, intent);
        zzdf(12, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzn(InterfaceC3772a interfaceC3772a) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzdf(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzo(Bundle bundle) {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, bundle);
        Parcel parcelZzde = zzde(6, parcelZza);
        if (parcelZzde.readInt() != 0) {
            bundle.readFromParcel(parcelZzde);
        }
        parcelZzde.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzp() {
        zzdf(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzq() {
        zzdf(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbsw
    public final void zzs() {
        zzdf(9, zza());
    }
}
