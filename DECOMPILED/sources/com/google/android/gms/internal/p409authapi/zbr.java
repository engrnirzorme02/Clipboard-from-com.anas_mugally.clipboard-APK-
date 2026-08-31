package com.google.android.gms.internal.p409authapi;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import p114O2.C1126i;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zbr extends zbb implements zbs {
    public zbr() {
        super("com.google.android.gms.auth.api.identity.internal.ISaveAccountLinkingTokenCallback");
    }

    @Override // com.google.android.gms.internal.p409authapi.zbb
    protected final boolean zba(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        Status status = (Status) zbc.zba(parcel, Status.CREATOR);
        C1126i c1126i = (C1126i) zbc.zba(parcel, C1126i.CREATOR);
        zbc.zbd(parcel);
        zbb(status, c1126i);
        return true;
    }
}
