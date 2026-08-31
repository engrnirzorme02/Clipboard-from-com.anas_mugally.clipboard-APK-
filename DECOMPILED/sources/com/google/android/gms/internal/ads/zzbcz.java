package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.dynamic.InterfaceC3772a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbcz extends zzaya implements zzbda {
    public zzbcz() {
        super("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            String strZzb = zzb();
            parcel2.writeNoException();
            parcel2.writeString(strZzb);
        } else if (i7 == 2) {
            String strZzc = zzc();
            parcel2.writeNoException();
            parcel2.writeString(strZzc);
        } else if (i7 == 3) {
            InterfaceC3772a interfaceC3772aM18219L0 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
            zzayb.zzh(parcel);
            zzd(interfaceC3772aM18219L0);
            parcel2.writeNoException();
        } else if (i7 == 4) {
            zze();
            parcel2.writeNoException();
        } else {
            if (i7 != 5) {
                return false;
            }
            zzf();
            parcel2.writeNoException();
        }
        return true;
    }
}
