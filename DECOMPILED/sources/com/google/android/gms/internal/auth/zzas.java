package com.google.android.gms.internal.auth;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import p107N2.C0948a;
import p107N2.C0949b;
import p107N2.C0956i;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzas extends zzb implements zzat {
    public zzas() {
        super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    protected final boolean zza(int i7, Parcel parcel, Parcel parcel2, int i8) {
        switch (i7) {
            case 1:
                Status status = (Status) zzc.zza(parcel, Status.CREATOR);
                zzc.zzb(parcel);
                zzh(status);
                return true;
            case 2:
                Status status2 = (Status) zzc.zza(parcel, Status.CREATOR);
                C0956i c0956i = (C0956i) zzc.zza(parcel, C0956i.CREATOR);
                zzc.zzb(parcel);
                zzf(status2, c0956i);
                return true;
            case 3:
                Status status3 = (Status) zzc.zza(parcel, Status.CREATOR);
                C0949b c0949b = (C0949b) zzc.zza(parcel, C0949b.CREATOR);
                zzc.zzb(parcel);
                zzg(status3, c0949b);
                return true;
            case 4:
                zze();
                return true;
            case 5:
                Status status4 = (Status) zzc.zza(parcel, Status.CREATOR);
                zzc.zzb(parcel);
                zzd(status4);
                return true;
            case 6:
                byte[] bArrCreateByteArray = parcel.createByteArray();
                zzc.zzb(parcel);
                zzb(bArrCreateByteArray);
                return true;
            case 7:
                C0948a c0948a = (C0948a) zzc.zza(parcel, C0948a.CREATOR);
                zzc.zzb(parcel);
                zzc(c0948a);
                return true;
            default:
                return false;
        }
    }
}
