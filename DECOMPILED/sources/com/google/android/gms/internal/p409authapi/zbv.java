package com.google.android.gms.internal.p409authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.C3555c;
import com.google.android.gms.common.api.internal.InterfaceC3602h;
import p114O2.C1119b;
import p114O2.C1123f;
import p114O2.C1124g;

/* JADX INFO: loaded from: classes2.dex */
public final class zbv extends zba implements IInterface {
    zbv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void zbc(zbl zblVar, C1119b c1119b, C3555c c3555c) {
        Parcel parcelZba = zba();
        zbc.zbc(parcelZba, zblVar);
        zbc.zbb(parcelZba, c1119b);
        zbc.zbb(parcelZba, c3555c);
        zbb(1, parcelZba);
    }

    public final void zbd(InterfaceC3602h interfaceC3602h, String str, C3555c c3555c) {
        Parcel parcelZba = zba();
        zbc.zbc(parcelZba, interfaceC3602h);
        parcelZba.writeString(str);
        zbc.zbb(parcelZba, c3555c);
        zbb(2, parcelZba);
    }

    public final void zbe(zbq zbqVar, C1124g c1124g, C3555c c3555c) {
        Parcel parcelZba = zba();
        zbc.zbc(parcelZba, zbqVar);
        zbc.zbb(parcelZba, c1124g);
        zbc.zbb(parcelZba, c3555c);
        zbb(3, parcelZba);
    }

    public final void zbf(zbo zboVar, C1123f c1123f, String str, C3555c c3555c) {
        Parcel parcelZba = zba();
        zbc.zbc(parcelZba, zboVar);
        zbc.zbb(parcelZba, c1123f);
        parcelZba.writeString(str);
        zbc.zbb(parcelZba, c3555c);
        zbb(4, parcelZba);
    }
}
