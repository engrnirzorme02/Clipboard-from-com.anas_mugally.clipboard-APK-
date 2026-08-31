package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.common.internal.w */
/* JADX INFO: loaded from: classes.dex */
public class C3726w extends AbstractC1945a {
    public static final Parcelable.Creator<C3726w> CREATOR = new C3658B();

    /* JADX INFO: renamed from: a */
    private final int f14858a;

    /* JADX INFO: renamed from: b */
    private List f14859b;

    public C3726w(int i7, List list) {
        this.f14858a = i7;
        this.f14859b = list;
    }

    /* JADX INFO: renamed from: T */
    public final int m18103T() {
        return this.f14858a;
    }

    /* JADX INFO: renamed from: U */
    public final List m18104U() {
        return this.f14859b;
    }

    /* JADX INFO: renamed from: V */
    public final void m18105V(C3712p c3712p) {
        if (this.f14859b == null) {
            this.f14859b = new ArrayList();
        }
        this.f14859b.add(c3712p);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, this.f14858a);
        AbstractC1947c.m8048I(parcel, 2, this.f14859b, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
