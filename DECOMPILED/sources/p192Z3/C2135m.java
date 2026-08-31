package p192Z3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3718s;
import com.google.firebase.auth.AbstractC4817C;
import com.google.firebase.auth.AbstractC4819E;
import com.google.firebase.auth.C4827K;
import com.google.firebase.auth.C4830N;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: Z3.m */
/* JADX INFO: loaded from: classes.dex */
public final class C2135m extends AbstractC4819E {
    public static final Parcelable.Creator<C2135m> CREATOR = new C2138p();

    /* JADX INFO: renamed from: a */
    private String f6976a;

    /* JADX INFO: renamed from: b */
    private String f6977b;

    /* JADX INFO: renamed from: c */
    private List f6978c;

    /* JADX INFO: renamed from: d */
    private List f6979d;

    /* JADX INFO: renamed from: e */
    private C2126h f6980e;

    private C2135m() {
    }

    /* JADX INFO: renamed from: T */
    public static C2135m m8740T(List list, String str) {
        AbstractC3718s.m18083l(list);
        AbstractC3718s.m18077f(str);
        C2135m c2135m = new C2135m();
        c2135m.f6978c = new ArrayList();
        c2135m.f6979d = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC4817C abstractC4817C = (AbstractC4817C) it.next();
            if (abstractC4817C instanceof C4827K) {
                c2135m.f6978c.add((C4827K) abstractC4817C);
            } else {
                if (!(abstractC4817C instanceof C4830N)) {
                    throw new IllegalArgumentException("MultiFactorInfo must be either PhoneMultiFactorInfo or TotpMultiFactorInfo. The factorId of this MultiFactorInfo: " + abstractC4817C.mo21967V());
                }
                c2135m.f6979d.add((C4830N) abstractC4817C);
            }
        }
        c2135m.f6977b = str;
        return c2135m;
    }

    /* JADX INFO: renamed from: U */
    public final String m8741U() {
        return this.f6976a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8044E(parcel, 1, this.f6976a, false);
        AbstractC1947c.m8044E(parcel, 2, this.f6977b, false);
        AbstractC1947c.m8048I(parcel, 3, this.f6978c, false);
        AbstractC1947c.m8048I(parcel, 4, this.f6979d, false);
        AbstractC1947c.m8042C(parcel, 5, this.f6980e, i7, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    public final String zzc() {
        return this.f6977b;
    }

    C2135m(String str, String str2, List list, List list2, C2126h c2126h) {
        this.f6976a = str;
        this.f6977b = str2;
        this.f6978c = list;
        this.f6979d = list2;
        this.f6980e = c2126h;
    }
}
