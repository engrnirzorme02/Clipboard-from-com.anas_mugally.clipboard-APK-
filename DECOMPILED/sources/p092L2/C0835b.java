package p092L2;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: L2.b */
/* JADX INFO: loaded from: classes.dex */
public class C0835b extends AbstractC1945a {
    public static final Parcelable.Creator<C0835b> CREATOR = new C0838e();

    /* JADX INFO: renamed from: a */
    final int f3300a;

    /* JADX INFO: renamed from: b */
    int f3301b;

    /* JADX INFO: renamed from: c */
    String f3302c;

    /* JADX INFO: renamed from: d */
    Account f3303d;

    C0835b(int i7, int i8, String str, Account account) {
        this.f3300a = i7;
        this.f3301b = i8;
        this.f3302c = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f3303d = account;
        } else {
            this.f3303d = new Account(str, "com.google");
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, this.f3300a);
        AbstractC1947c.m8072t(parcel, 2, this.f3301b);
        AbstractC1947c.m8044E(parcel, 3, this.f3302c, false);
        AbstractC1947c.m8042C(parcel, 4, this.f3303d, i7, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
