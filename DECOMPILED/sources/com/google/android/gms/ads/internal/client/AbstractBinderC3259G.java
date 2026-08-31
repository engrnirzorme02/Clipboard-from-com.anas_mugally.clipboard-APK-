package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaya;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.G */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC3259G extends zzaya implements InterfaceC3262H {
    public AbstractBinderC3259G() {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    protected final boolean zzdi(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        zzb();
        parcel2.writeNoException();
        return true;
    }
}
