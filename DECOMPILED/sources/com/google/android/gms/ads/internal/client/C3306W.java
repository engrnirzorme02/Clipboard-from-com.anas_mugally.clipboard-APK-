package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC3772a;
import com.google.android.gms.internal.ads.zzaxz;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzbae;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.W */
/* JADX INFO: loaded from: classes.dex */
public final class C3306W extends zzaxz implements InterfaceC3312Y {
    C3306W(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final InterfaceC3340f1 zzF() {
        InterfaceC3340f1 c3332d1;
        Parcel parcelZzde = zzde(26, zza());
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            c3332d1 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            c3332d1 = iInterfaceQueryLocalInterface instanceof InterfaceC3340f1 ? (InterfaceC3340f1) iInterfaceQueryLocalInterface : new C3332d1(strongBinder);
        }
        parcelZzde.recycle();
        return c3332d1;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzG(C3321a2 c3321a2) {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, c3321a2);
        zzdf(29, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzJ(zzbae zzbaeVar) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, zzbaeVar);
        zzdf(40, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzK(boolean z7) {
        Parcel parcelZza = zza();
        int i7 = zzayb.zza;
        parcelZza.writeInt(z7 ? 1 : 0);
        zzdf(34, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzP(InterfaceC3301U0 interfaceC3301U0) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3301U0);
        zzdf(42, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzQ(C3349h2 c3349h2, InterfaceC3280N interfaceC3280N) {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, c3349h2);
        zzayb.zze(parcelZza, interfaceC3280N);
        zzdf(43, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzR(InterfaceC3772a interfaceC3772a) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3772a);
        zzdf(44, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzS(InterfaceC3403v0 interfaceC3403v0) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3403v0);
        zzdf(45, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzT(long j7) {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j7);
        zzdf(48, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final long zzU() {
        Parcel parcelZzde = zzde(47, zza());
        long j7 = parcelZzde.readLong();
        parcelZzde.recycle();
        return j7;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final InterfaceC3772a zzb() {
        Parcel parcelZzde = zzde(1, zza());
        InterfaceC3772a interfaceC3772aM18219L0 = InterfaceC3772a.a.m18219L0(parcelZzde.readStrongBinder());
        parcelZzde.recycle();
        return interfaceC3772aM18219L0;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzc() {
        zzdf(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzdW(InterfaceC3271K interfaceC3271K) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3271K);
        zzdf(7, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final boolean zze(C3349h2 c3349h2) {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, c3349h2);
        Parcel parcelZzde = zzde(4, parcelZza);
        boolean zZza = zzayb.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzf() {
        zzdf(5, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzg() {
        zzdf(6, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzi(InterfaceC3375o0 interfaceC3375o0) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3375o0);
        zzdf(8, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final C3369m2 zzn() {
        Parcel parcelZzde = zzde(12, zza());
        C3369m2 c3369m2 = (C3369m2) zzayb.zzb(parcelZzde, C3369m2.CREATOR);
        parcelZzde.recycle();
        return c3369m2;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzo(C3369m2 c3369m2) {
        Parcel parcelZza = zza();
        zzayb.zzc(parcelZza, c3369m2);
        zzdf(13, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final InterfaceC3328c1 zzt() {
        InterfaceC3328c1 c3316z0;
        Parcel parcelZzde = zzde(41, zza());
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            c3316z0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            c3316z0 = iInterfaceQueryLocalInterface instanceof InterfaceC3328c1 ? (InterfaceC3328c1) iInterfaceQueryLocalInterface : new C3316Z0(strongBinder);
        }
        parcelZzde.recycle();
        return c3316z0;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final String zzu() {
        Parcel parcelZzde = zzde(31, zza());
        String string = parcelZzde.readString();
        parcelZzde.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final InterfaceC3375o0 zzv() {
        InterfaceC3375o0 c3367m0;
        Parcel parcelZzde = zzde(32, zza());
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            c3367m0 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            c3367m0 = iInterfaceQueryLocalInterface instanceof InterfaceC3375o0 ? (InterfaceC3375o0) iInterfaceQueryLocalInterface : new C3367m0(strongBinder);
        }
        parcelZzde.recycle();
        return c3367m0;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final InterfaceC3271K zzw() {
        InterfaceC3271K c3265i;
        Parcel parcelZzde = zzde(33, zza());
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            c3265i = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            c3265i = iInterfaceQueryLocalInterface instanceof InterfaceC3271K ? (InterfaceC3271K) iInterfaceQueryLocalInterface : new C3265I(strongBinder);
        }
        parcelZzde.recycle();
        return c3265i;
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzy(InterfaceC3262H interfaceC3262H) {
        Parcel parcelZza = zza();
        zzayb.zze(parcelZza, interfaceC3262H);
        zzdf(20, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.InterfaceC3312Y
    public final void zzz(boolean z7) {
        Parcel parcelZza = zza();
        int i7 = zzayb.zza;
        parcelZza.writeInt(z7 ? 1 : 0);
        zzdf(22, parcelZza);
    }
}
