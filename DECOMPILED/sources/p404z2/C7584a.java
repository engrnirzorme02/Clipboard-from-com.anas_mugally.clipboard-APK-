package p404z2;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: z2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7584a extends AbstractC1945a {
    public static final Parcelable.Creator<C7584a> CREATOR = new C7609z();

    /* JADX INFO: renamed from: a */
    public String f30226a;

    /* JADX INFO: renamed from: b */
    public int f30227b;

    /* JADX INFO: renamed from: c */
    public int f30228c;

    /* JADX INFO: renamed from: d */
    public boolean f30229d;

    /* JADX INFO: renamed from: e */
    public boolean f30230e;

    public C7584a(int i7, int i8, boolean z7) {
        this(i7, i8, z7, false, false);
    }

    /* JADX INFO: renamed from: T */
    public static C7584a m33270T() {
        return new C7584a(12451000, 12451000, true);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 2, this.f30226a, false);
        AbstractC1947c.m8072t(parcel, 3, this.f30227b);
        AbstractC1947c.m8072t(parcel, 4, this.f30228c);
        AbstractC1947c.m8059g(parcel, 5, this.f30229d);
        AbstractC1947c.m8059g(parcel, 6, this.f30230e);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    public C7584a(int i7, int i8, boolean z7, boolean z8) {
        this(i7, i8, z7, false, z8);
    }

    public C7584a(int i7, int i8, boolean z7, boolean z8, boolean z9) {
        String str;
        if (z7) {
            str = "0";
        } else {
            str = z8 ? "2" : "1";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 13 + String.valueOf(i8).length() + 1 + str.length());
        sb.append("afma-sdk-a-v");
        sb.append(i7);
        sb.append(".");
        sb.append(i8);
        sb.append(".");
        sb.append(str);
        this(sb.toString(), i7, i8, z7, z9);
    }

    C7584a(String str, int i7, int i8, boolean z7, boolean z8) {
        this.f30226a = str;
        this.f30227b = i7;
        this.f30228c = i8;
        this.f30229d = z7;
        this.f30230e = z8;
    }
}
