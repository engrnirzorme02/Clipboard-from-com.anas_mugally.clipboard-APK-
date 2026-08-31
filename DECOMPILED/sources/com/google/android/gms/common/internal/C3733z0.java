package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC3772a;
import com.google.android.gms.internal.common.zza;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C3733z0 extends zza implements InterfaceC3678W {
    C3733z0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.google.android.gms.common.internal.InterfaceC3678W
    public final int zzc() {
        Parcel parcelZzB = zzB(2, zza());
        int i7 = parcelZzB.readInt();
        parcelZzB.recycle();
        return i7;
    }

    @Override // com.google.android.gms.common.internal.InterfaceC3678W
    public final InterfaceC3772a zzd() {
        Parcel parcelZzB = zzB(1, zza());
        InterfaceC3772a interfaceC3772aM18219L0 = InterfaceC3772a.a.m18219L0(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return interfaceC3772aM18219L0;
    }
}
