package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC3772a;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;
import p170W2.C1826C;
import p170W2.C1828E;
import p170W2.C1830G;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.Z */
/* JADX INFO: loaded from: classes.dex */
public final class C3681Z extends zza implements InterfaceC3685b0 {
    C3681Z(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // com.google.android.gms.common.internal.InterfaceC3685b0
    /* JADX INFO: renamed from: C */
    public final C1828E mo17995C(C1826C c1826c) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, c1826c);
        Parcel parcelZzB = zzB(8, parcelZza);
        C1828E c1828e = (C1828E) zzc.zza(parcelZzB, C1828E.CREATOR);
        parcelZzB.recycle();
        return c1828e;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC3685b0
    /* JADX INFO: renamed from: f0 */
    public final boolean mo17996f0(C1830G c1830g, InterfaceC3772a interfaceC3772a) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, c1830g);
        zzc.zze(parcelZza, interfaceC3772a);
        Parcel parcelZzB = zzB(5, parcelZza);
        boolean zZzf = zzc.zzf(parcelZzB);
        parcelZzB.recycle();
        return zZzf;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC3685b0
    /* JADX INFO: renamed from: n0 */
    public final C1828E mo17997n0(C1826C c1826c) {
        Parcel parcelZza = zza();
        zzc.zzc(parcelZza, c1826c);
        Parcel parcelZzB = zzB(6, parcelZza);
        C1828E c1828e = (C1828E) zzc.zza(parcelZzB, C1828E.CREATOR);
        parcelZzB.recycle();
        return c1828e;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC3685b0
    public final boolean zzi() {
        Parcel parcelZzB = zzB(7, zza());
        boolean zZzf = zzc.zzf(parcelZzB);
        parcelZzB.recycle();
        return zZzf;
    }
}
