package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.C3324b1;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbpb extends zzaxz implements zzbpd {
    zzbpb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zze() {
        zzdf(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzf() {
        zzdf(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzg(int i7) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i7);
        zzdf(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzh() {
        zzdf(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzi() {
        zzdf(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzj() {
        zzdf(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzk() {
        zzdf(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzl(String str, String str2) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzdf(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzm(zzbgq zzbgqVar, String str) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, zzbgqVar);
        parcelZza.writeString(str);
        zzdf(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzn() {
        zzdf(11, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzo() {
        zzdf(13, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzp(zzbvt zzbvtVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzq() {
        zzdf(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzr(zzbvx zzbvxVar) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, zzbvxVar);
        zzdf(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzs(int i7) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzt() {
        zzdf(18, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzu() {
        zzdf(20, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzv(String str) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzdf(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzw(int i7, String str) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i7);
        parcelZza.writeString(str);
        zzdf(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzx(C3324b1 c3324b1) {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, c3324b1);
        zzdf(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzy(C3324b1 c3324b1) {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, c3324b1);
        zzdf(24, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbpd
    public final void zzz() {
        zzdf(25, zza());
    }
}
