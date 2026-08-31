package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.common.server.response.g */
/* JADX INFO: loaded from: classes.dex */
public final class C3740g extends AbstractC1945a {
    public static final Parcelable.Creator<C3740g> CREATOR = new C3738e();

    /* JADX INFO: renamed from: a */
    final int f14890a;

    /* JADX INFO: renamed from: b */
    final String f14891b;

    /* JADX INFO: renamed from: c */
    final AbstractC3734a.a f14892c;

    C3740g(int i7, String str, AbstractC3734a.a aVar) {
        this.f14890a = i7;
        this.f14891b = str;
        this.f14892c = aVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f14890a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, i8);
        AbstractC1947c.m8044E(parcel, 2, this.f14891b, false);
        AbstractC1947c.m8042C(parcel, 3, this.f14892c, i7, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    C3740g(String str, AbstractC3734a.a aVar) {
        this.f14890a = 1;
        this.f14891b = str;
        this.f14892c = aVar;
    }
}
