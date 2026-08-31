package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC3772a;
import com.google.android.gms.internal.common.zza;
import com.google.android.gms.internal.common.zzc;

/* JADX INFO: renamed from: com.google.android.gms.dynamite.m */
/* JADX INFO: loaded from: classes.dex */
public final class C3790m extends zza implements IInterface {
    C3790m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    /* JADX INFO: renamed from: L0 */
    public final int m18236L0(InterfaceC3772a interfaceC3772a, String str, boolean z7) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, interfaceC3772a);
        parcelZza.writeString(str);
        parcelZza.writeInt(z7 ? 1 : 0);
        Parcel parcelZzB = zzB(3, parcelZza);
        int i7 = parcelZzB.readInt();
        parcelZzB.recycle();
        return i7;
    }

    /* JADX INFO: renamed from: M0 */
    public final int m18237M0(InterfaceC3772a interfaceC3772a, String str, boolean z7) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, interfaceC3772a);
        parcelZza.writeString(str);
        parcelZza.writeInt(z7 ? 1 : 0);
        Parcel parcelZzB = zzB(5, parcelZza);
        int i7 = parcelZzB.readInt();
        parcelZzB.recycle();
        return i7;
    }

    /* JADX INFO: renamed from: N0 */
    public final InterfaceC3772a m18238N0(InterfaceC3772a interfaceC3772a, String str, int i7) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, interfaceC3772a);
        parcelZza.writeString(str);
        parcelZza.writeInt(i7);
        Parcel parcelZzB = zzB(2, parcelZza);
        InterfaceC3772a interfaceC3772aM18219L0 = InterfaceC3772a.a.m18219L0(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return interfaceC3772aM18219L0;
    }

    /* JADX INFO: renamed from: O0 */
    public final InterfaceC3772a m18239O0(InterfaceC3772a interfaceC3772a, String str, int i7, InterfaceC3772a interfaceC3772a2) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, interfaceC3772a);
        parcelZza.writeString(str);
        parcelZza.writeInt(i7);
        zzc.zze(parcelZza, interfaceC3772a2);
        Parcel parcelZzB = zzB(8, parcelZza);
        InterfaceC3772a interfaceC3772aM18219L0 = InterfaceC3772a.a.m18219L0(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return interfaceC3772aM18219L0;
    }

    /* JADX INFO: renamed from: P0 */
    public final InterfaceC3772a m18240P0(InterfaceC3772a interfaceC3772a, String str, int i7) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, interfaceC3772a);
        parcelZza.writeString(str);
        parcelZza.writeInt(i7);
        Parcel parcelZzB = zzB(4, parcelZza);
        InterfaceC3772a interfaceC3772aM18219L0 = InterfaceC3772a.a.m18219L0(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return interfaceC3772aM18219L0;
    }

    /* JADX INFO: renamed from: Q0 */
    public final InterfaceC3772a m18241Q0(InterfaceC3772a interfaceC3772a, String str, boolean z7, long j7) {
        Parcel parcelZza = zza();
        zzc.zze(parcelZza, interfaceC3772a);
        parcelZza.writeString(str);
        parcelZza.writeInt(z7 ? 1 : 0);
        parcelZza.writeLong(j7);
        Parcel parcelZzB = zzB(7, parcelZza);
        InterfaceC3772a interfaceC3772aM18219L0 = InterfaceC3772a.a.m18219L0(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return interfaceC3772aM18219L0;
    }

    public final int zze() {
        Parcel parcelZzB = zzB(6, zza());
        int i7 = parcelZzB.readInt();
        parcelZzB.recycle();
        return i7;
    }
}
