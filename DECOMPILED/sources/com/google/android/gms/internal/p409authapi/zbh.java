package com.google.android.gms.internal.p409authapi;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import p114O2.C1118a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zbh extends zbb implements zbi {
    public zbh() {
        super("com.google.android.gms.auth.api.identity.internal.IAuthorizationCallback");
    }

    @Override // com.google.android.gms.internal.p409authapi.zbb
    protected final boolean zba(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        Status status = (Status) zbc.zba(parcel, Status.CREATOR);
        C1118a c1118a = (C1118a) zbc.zba(parcel, C1118a.CREATOR);
        zbc.zbd(parcel);
        zbb(status, c1118a);
        return true;
    }
}
