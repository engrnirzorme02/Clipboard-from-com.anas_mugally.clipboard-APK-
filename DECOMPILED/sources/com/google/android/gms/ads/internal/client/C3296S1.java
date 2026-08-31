package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.ads.internal.client.S1 */
/* JADX INFO: loaded from: classes.dex */
public final class C3296S1 extends AbstractC1945a {
    public static final Parcelable.Creator<C3296S1> CREATOR = new C3299T1();

    /* JADX INFO: renamed from: a */
    public final String f13901a;

    /* JADX INFO: renamed from: b */
    public final int f13902b;

    /* JADX INFO: renamed from: c */
    public final C3349h2 f13903c;

    /* JADX INFO: renamed from: d */
    public final int f13904d;

    public C3296S1(String str, int i7, C3349h2 c3349h2, int i8) {
        this.f13901a = str;
        this.f13902b = i7;
        this.f13903c = c3349h2;
        this.f13904d = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3296S1) {
            C3296S1 c3296s1 = (C3296S1) obj;
            if (this.f13901a.equals(c3296s1.f13901a) && this.f13902b == c3296s1.f13902b && this.f13903c.m17230T(c3296s1.f13903c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f13901a, Integer.valueOf(this.f13902b), this.f13903c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f13901a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 1, str, false);
        AbstractC1947c.m8072t(parcel, 2, this.f13902b);
        AbstractC1947c.m8042C(parcel, 3, this.f13903c, i7, false);
        AbstractC1947c.m8072t(parcel, 4, this.f13904d);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
