package p380w2;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: w2.l */
/* JADX INFO: loaded from: classes.dex */
public final class C7343l extends AbstractC1945a {
    public static final Parcelable.Creator<C7343l> CREATOR = new C7344m();

    /* JADX INFO: renamed from: a */
    public final boolean f29220a;

    /* JADX INFO: renamed from: b */
    public final boolean f29221b;

    /* JADX INFO: renamed from: c */
    public final String f29222c;

    /* JADX INFO: renamed from: d */
    public final boolean f29223d;

    /* JADX INFO: renamed from: e */
    public final float f29224e;

    /* JADX INFO: renamed from: f */
    public final int f29225f;

    /* JADX INFO: renamed from: r */
    public final boolean f29226r;

    /* JADX INFO: renamed from: s */
    public final boolean f29227s;

    /* JADX INFO: renamed from: t */
    public final boolean f29228t;

    C7343l(boolean z7, boolean z8, String str, boolean z9, float f7, int i7, boolean z10, boolean z11, boolean z12) {
        this.f29220a = z7;
        this.f29221b = z8;
        this.f29222c = str;
        this.f29223d = z9;
        this.f29224e = f7;
        this.f29225f = i7;
        this.f29226r = z10;
        this.f29227s = z11;
        this.f29228t = z12;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        boolean z7 = this.f29220a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8059g(parcel, 2, z7);
        AbstractC1947c.m8059g(parcel, 3, this.f29221b);
        AbstractC1947c.m8044E(parcel, 4, this.f29222c, false);
        AbstractC1947c.m8059g(parcel, 5, this.f29223d);
        AbstractC1947c.m8068p(parcel, 6, this.f29224e);
        AbstractC1947c.m8072t(parcel, 7, this.f29225f);
        AbstractC1947c.m8059g(parcel, 8, this.f29226r);
        AbstractC1947c.m8059g(parcel, 9, this.f29227s);
        AbstractC1947c.m8059g(parcel, 10, this.f29228t);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    public C7343l(boolean z7, boolean z8, boolean z9, float f7, int i7, boolean z10, boolean z11, boolean z12) {
        this(z7, z8, null, z9, f7, -1, z10, z11, z12);
    }
}
