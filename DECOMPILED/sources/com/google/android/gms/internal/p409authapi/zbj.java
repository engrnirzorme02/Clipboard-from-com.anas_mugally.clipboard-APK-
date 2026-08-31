package com.google.android.gms.internal.p409authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.ClearTokenRequest;
import com.google.android.gms.auth.api.identity.RevokeAccessRequest;
import com.google.android.gms.common.api.C3555c;
import com.google.android.gms.common.api.internal.InterfaceC3602h;

/* JADX INFO: loaded from: classes2.dex */
public final class zbj extends zba implements IInterface {
    zbj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
    }

    public final void zbc(zbi zbiVar, AuthorizationRequest authorizationRequest, C3555c c3555c) {
        Parcel parcelZba = zba();
        zbc.zbc(parcelZba, zbiVar);
        zbc.zbb(parcelZba, authorizationRequest);
        zbc.zbb(parcelZba, c3555c);
        zbb(1, parcelZba);
    }

    public final void zbd(InterfaceC3602h interfaceC3602h, RevokeAccessRequest revokeAccessRequest, C3555c c3555c) {
        Parcel parcelZba = zba();
        zbc.zbc(parcelZba, interfaceC3602h);
        zbc.zbb(parcelZba, revokeAccessRequest);
        zbc.zbb(parcelZba, c3555c);
        zbb(3, parcelZba);
    }

    public final void zbe(InterfaceC3602h interfaceC3602h, ClearTokenRequest clearTokenRequest, C3555c c3555c) {
        Parcel parcelZba = zba();
        zbc.zbc(parcelZba, interfaceC3602h);
        zbc.zbb(parcelZba, clearTokenRequest);
        zbc.zbb(parcelZba, c3555c);
        zbb(4, parcelZba);
    }
}
