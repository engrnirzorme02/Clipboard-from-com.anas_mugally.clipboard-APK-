package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.common.api.c */
/* JADX INFO: loaded from: classes.dex */
public final class C3555c extends AbstractC1945a {
    public static final Parcelable.Creator<C3555c> CREATOR = C3651u.m17971a();

    /* JADX INFO: renamed from: b */
    private static final C3555c f14528b = m17753V().m17754a();

    /* JADX INFO: renamed from: a */
    private final C3557e f14529a;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private C3557e f14530a;

        /* JADX INFO: renamed from: a */
        public C3555c m17754a() {
            return new C3555c(this.f14530a);
        }

        /* JADX INFO: renamed from: b */
        public a m17755b(C3557e c3557e) {
            this.f14530a = c3557e;
            return this;
        }
    }

    C3555c(C3557e c3557e) {
        this.f14529a = c3557e;
    }

    /* JADX INFO: renamed from: T */
    public static final C3555c m17751T(C3557e c3557e) {
        a aVarM17753V = m17753V();
        aVarM17753V.m17755b(c3557e);
        return aVarM17753V.m17754a();
    }

    /* JADX INFO: renamed from: U */
    public static final C3555c m17752U() {
        return f14528b;
    }

    /* JADX INFO: renamed from: V */
    public static a m17753V() {
        return new a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3555c) {
            return Objects.equals(this.f14529a, ((C3555c) obj).f14529a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f14529a);
    }

    public final String toString() {
        return "ApiMetadata(complianceOptions=" + String.valueOf(this.f14529a) + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(-204102970);
        C3557e c3557e = this.f14529a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8042C(parcel, 1, c3557e, i7, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
