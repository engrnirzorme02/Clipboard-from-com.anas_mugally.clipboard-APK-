package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC3772a;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayb;
import p388x2.C7403a;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.util.P */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3450P extends zzaya implements InterfaceC3452Q {
    public AbstractBinderC3450P() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            InterfaceC3772a interfaceC3772aM18219L0 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
            String string = parcel.readString();
            String string2 = parcel.readString();
            zzayb.zzh(parcel);
            boolean zZze = zze(interfaceC3772aM18219L0, string, string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZze ? 1 : 0);
        } else if (i7 == 2) {
            InterfaceC3772a interfaceC3772aM18219L1 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
            zzayb.zzh(parcel);
            zzf(interfaceC3772aM18219L1);
            parcel2.writeNoException();
        } else {
            if (i7 != 3) {
                return false;
            }
            InterfaceC3772a interfaceC3772aM18219L2 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
            C7403a c7403a = (C7403a) zzayb.zzb(parcel, C7403a.CREATOR);
            zzayb.zzh(parcel);
            boolean zZzg = zzg(interfaceC3772aM18219L2, c7403a);
            parcel2.writeNoException();
            parcel2.writeInt(zZzg ? 1 : 0);
        }
        return true;
    }
}
