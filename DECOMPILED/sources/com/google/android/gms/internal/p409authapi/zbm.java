package com.google.android.gms.internal.p409authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.C3555c;
import p114O2.C1127j;

/* JADX INFO: loaded from: classes2.dex */
public final class zbm extends zba implements IInterface {
    zbm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
    }

    public final void zbc(zbs zbsVar, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest, C3555c c3555c) {
        Parcel parcelZba = zba();
        zbc.zbc(parcelZba, zbsVar);
        zbc.zbb(parcelZba, saveAccountLinkingTokenRequest);
        zbc.zbb(parcelZba, c3555c);
        zbb(1, parcelZba);
    }

    public final void zbd(zbu zbuVar, C1127j c1127j, C3555c c3555c) {
        Parcel parcelZba = zba();
        zbc.zbc(parcelZba, zbuVar);
        zbc.zbb(parcelZba, c1127j);
        zbc.zbb(parcelZba, c3555c);
        zbb(2, parcelZba);
    }
}
