package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1946b;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.firebase.messaging.Q */
/* JADX INFO: loaded from: classes.dex */
public class C4967Q implements Parcelable.Creator {
    /* JADX INFO: renamed from: c */
    static void m22396c(C4966P c4966p, Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8062j(parcel, 2, c4966p.f18821a, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C4966P createFromParcel(Parcel parcel) {
        int iM8011M = AbstractC1946b.m8011M(parcel);
        Bundle bundleM8019f = null;
        while (parcel.dataPosition() < iM8011M) {
            int iM8002D = AbstractC1946b.m8002D(parcel);
            if (AbstractC1946b.m8036w(iM8002D) != 2) {
                AbstractC1946b.m8010L(parcel, iM8002D);
            } else {
                bundleM8019f = AbstractC1946b.m8019f(parcel, iM8002D);
            }
        }
        AbstractC1946b.m8035v(parcel, iM8011M);
        return new C4966P(bundleM8019f);
    }

    @Override // android.os.Parcelable.Creator
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C4966P[] newArray(int i7) {
        return new C4966P[i7];
    }
}
