package com.google.android.gms.internal.p409authapi;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import p114O2.C1128k;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zbt extends zbb implements zbu {
    public zbt() {
        super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback");
    }

    @Override // com.google.android.gms.internal.p409authapi.zbb
    protected final boolean zba(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        Status status = (Status) zbc.zba(parcel, Status.CREATOR);
        C1128k c1128k = (C1128k) zbc.zba(parcel, C1128k.CREATOR);
        zbc.zbd(parcel);
        zbb(status, c1128k);
        return true;
    }
}
