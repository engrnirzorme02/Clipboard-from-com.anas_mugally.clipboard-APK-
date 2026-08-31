package p092L2;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.List;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: L2.c */
/* JADX INFO: loaded from: classes.dex */
public class C0836c extends AbstractC1945a {
    public static final Parcelable.Creator<C0836c> CREATOR = new C0839f();

    /* JADX INFO: renamed from: a */
    final int f3304a;

    /* JADX INFO: renamed from: b */
    final List f3305b;

    C0836c(int i7, List list) {
        this.f3304a = i7;
        this.f3305b = (List) AbstractC3718s.m18083l(list);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, this.f3304a);
        AbstractC1947c.m8048I(parcel, 2, this.f3305b, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
