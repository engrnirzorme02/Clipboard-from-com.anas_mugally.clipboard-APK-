package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.ads.internal.client.C3324b1;
import com.google.android.gms.dynamic.InterfaceC3772a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbqj extends zzaya implements zzbqk {
    public zzbqj() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            InterfaceC3772a interfaceC3772aM18219L0 = InterfaceC3772a.a.m18219L0(parcel.readStrongBinder());
            zzayb.zzh(parcel);
            zze(interfaceC3772aM18219L0);
        } else if (i7 == 2) {
            String string = parcel.readString();
            zzayb.zzh(parcel);
            zzf(string);
        } else if (i7 == 3) {
            C3324b1 c3324b1 = (C3324b1) zzayb.zzb(parcel, C3324b1.CREATOR);
            zzayb.zzh(parcel);
            zzg(c3324b1);
        } else {
            if (i7 != 4) {
                return false;
            }
            zzbpg zzbpgVarZzb = zzbpf.zzb(parcel.readStrongBinder());
            zzayb.zzh(parcel);
            zzh(zzbpgVarZzb);
        }
        parcel2.writeNoException();
        return true;
    }
}
