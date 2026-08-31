package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3714q;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.common.api.e */
/* JADX INFO: loaded from: classes.dex */
public final class C3557e extends AbstractC1945a {
    public static final Parcelable.Creator<C3557e> CREATOR;

    /* JADX INFO: renamed from: e */
    public static final C3557e f14531e;

    /* JADX INFO: renamed from: a */
    private final int f14532a;

    /* JADX INFO: renamed from: b */
    private final int f14533b;

    /* JADX INFO: renamed from: c */
    private final int f14534c;

    /* JADX INFO: renamed from: d */
    private final boolean f14535d;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.e$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private int f14536a = -1;

        /* JADX INFO: renamed from: b */
        private int f14537b = -1;

        /* JADX INFO: renamed from: c */
        private int f14538c = 0;

        /* JADX INFO: renamed from: d */
        private boolean f14539d = true;

        /* JADX INFO: renamed from: a */
        public C3557e m17759a() {
            return new C3557e(this.f14536a, this.f14537b, this.f14538c, this.f14539d);
        }

        /* JADX INFO: renamed from: b */
        public a m17760b(int i7) {
            this.f14536a = i7;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public a m17761c(int i7) {
            this.f14537b = i7;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public a m17762d(boolean z7) {
            this.f14539d = z7;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public a m17763e(int i7) {
            this.f14538c = i7;
            return this;
        }
    }

    static {
        a aVarM17757T = m17757T();
        aVarM17757T.m17760b(-1);
        aVarM17757T.m17761c(-1);
        aVarM17757T.m17763e(0);
        aVarM17757T.m17762d(true);
        f14531e = aVarM17757T.m17759a();
        CREATOR = new C3653w();
    }

    C3557e(int i7, int i8, int i9, boolean z7) {
        this.f14532a = i7;
        this.f14533b = i8;
        this.f14534c = i9;
        this.f14535d = z7;
    }

    /* JADX INFO: renamed from: T */
    public static a m17757T() {
        return new a();
    }

    /* JADX INFO: renamed from: U */
    public static final a m17758U(Context context) {
        return m17757T();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3557e)) {
            return false;
        }
        C3557e c3557e = (C3557e) obj;
        return this.f14532a == c3557e.f14532a && this.f14533b == c3557e.f14533b && this.f14534c == c3557e.f14534c && this.f14535d == c3557e.f14535d;
    }

    public final int hashCode() {
        return AbstractC3714q.m18054c(Integer.valueOf(this.f14532a), Integer.valueOf(this.f14533b), Integer.valueOf(this.f14534c), Boolean.valueOf(this.f14535d));
    }

    public final String toString() {
        return "ComplianceOptions{callerProductId=" + this.f14532a + ", dataOwnerProductId=" + this.f14533b + ", processingReason=" + this.f14534c + ", isUserData=" + this.f14535d + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.f14532a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, i8);
        AbstractC1947c.m8072t(parcel, 2, this.f14533b);
        AbstractC1947c.m8072t(parcel, 3, this.f14534c);
        AbstractC1947c.m8059g(parcel, 4, this.f14535d);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
