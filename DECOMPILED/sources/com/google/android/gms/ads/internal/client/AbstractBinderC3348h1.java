package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayb;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.h1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3348h1 extends zzaya implements InterfaceC3352i1 {
    public AbstractBinderC3348h1() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 == 1) {
            zze();
        } else if (i7 == 2) {
            zzf();
        } else if (i7 == 3) {
            zzg();
        } else if (i7 == 4) {
            zzh();
        } else {
            if (i7 != 5) {
                return false;
            }
            boolean zZza = zzayb.zza(parcel);
            zzayb.zzh(parcel);
            zzi(zZza);
        }
        parcel2.writeNoException();
        return true;
    }
}
