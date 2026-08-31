package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC3772a;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* JADX INFO: renamed from: com.google.android.gms.dynamite.n */
/* JADX INFO: loaded from: classes.dex */
public final class C3791n extends zza implements IInterface {
    C3791n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    /* JADX INFO: renamed from: L0 */
    public final InterfaceC3772a m18242L0(InterfaceC3772a interfaceC3772a, String str, int i7, InterfaceC3772a interfaceC3772a2) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, interfaceC3772a);
        parcelZza.writeString(str);
        parcelZza.writeInt(i7);
        zzc.zze(parcelZza, interfaceC3772a2);
        Parcel parcelZzB = zzB(2, parcelZza);
        InterfaceC3772a interfaceC3772aM18219L0 = InterfaceC3772a.a.m18219L0(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return interfaceC3772aM18219L0;
    }

    /* JADX INFO: renamed from: M0 */
    public final InterfaceC3772a m18243M0(InterfaceC3772a interfaceC3772a, String str, int i7, InterfaceC3772a interfaceC3772a2) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, interfaceC3772a);
        parcelZza.writeString(str);
        parcelZza.writeInt(i7);
        zzc.zze(parcelZza, interfaceC3772a2);
        Parcel parcelZzB = zzB(3, parcelZza);
        InterfaceC3772a interfaceC3772aM18219L0 = InterfaceC3772a.a.m18219L0(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return interfaceC3772aM18219L0;
    }
}
