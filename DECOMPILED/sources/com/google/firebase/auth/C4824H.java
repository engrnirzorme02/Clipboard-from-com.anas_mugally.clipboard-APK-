package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.firebase.auth.H */
/* JADX INFO: loaded from: classes.dex */
public class C4824H extends AbstractC1945a {
    public static final Parcelable.Creator<C4824H> CREATOR = new C4857h0();

    C4824H() {
    }

    /* JADX INFO: renamed from: T */
    public static C4824H m22011T() {
        return new C4824H();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        AbstractC1947c.m8054b(parcel, AbstractC1947c.m8053a(parcel));
    }
}
