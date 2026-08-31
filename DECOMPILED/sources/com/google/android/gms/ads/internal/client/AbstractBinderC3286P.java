package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayb;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.P */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3286P extends zzaya implements InterfaceC3289Q {
    public AbstractBinderC3286P() {
        super("com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            C3349h2 c3349h2 = (C3349h2) zzayb.zzb(parcel, C3349h2.CREATOR);
            zzayb.zzh(parcel);
            zze(c3349h2);
            parcel2.writeNoException();
        } else if (i7 == 2) {
            String strZzf = zzf();
            parcel2.writeNoException();
            parcel2.writeString(strZzf);
        } else if (i7 == 3) {
            boolean zZzg = zzg();
            parcel2.writeNoException();
            int i9 = zzayb.zza;
            parcel2.writeInt(zZzg ? 1 : 0);
        } else if (i7 == 4) {
            String strZzh = zzh();
            parcel2.writeNoException();
            parcel2.writeString(strZzh);
        } else {
            if (i7 != 5) {
                return false;
            }
            C3349h2 c3349h3 = (C3349h2) zzayb.zzb(parcel, C3349h2.CREATOR);
            int i10 = parcel.readInt();
            zzayb.zzh(parcel);
            zzi(c3349h3, i10);
            parcel2.writeNoException();
        }
        return true;
    }
}
