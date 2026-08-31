package com.google.android.gms.internal.p409authapi;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import p114O2.C1120c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zbk extends zbb implements zbl {
    public zbk() {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
    }

    @Override // com.google.android.gms.internal.p409authapi.zbb
    protected final boolean zba(int i7, Parcel parcel, Parcel parcel2, int i8) {
        if (i7 != 1) {
            return false;
        }
        Status status = (Status) zbc.zba(parcel, Status.CREATOR);
        C1120c c1120c = (C1120c) zbc.zba(parcel, C1120c.CREATOR);
        zbc.zbd(parcel);
        zbb(status, c1120c);
        return true;
    }
}
