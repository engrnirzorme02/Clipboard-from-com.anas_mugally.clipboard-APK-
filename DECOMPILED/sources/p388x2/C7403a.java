package p388x2;

import android.os.Parcel;
import android.os.Parcelable;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: x2.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7403a extends AbstractC1945a {
    public static final Parcelable.Creator<C7403a> CREATOR = new C7404b();

    /* JADX INFO: renamed from: a */
    public final String f29650a;

    /* JADX INFO: renamed from: b */
    public final String f29651b;

    /* JADX INFO: renamed from: c */
    public final String f29652c;

    public C7403a(String str, String str2, String str3) {
        this.f29650a = str;
        this.f29651b = str2;
        this.f29652c = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.f29650a;
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 1, str, false);
        AbstractC1947c.m8044E(parcel, 2, this.f29651b, false);
        AbstractC1947c.m8044E(parcel, 3, this.f29652c, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
