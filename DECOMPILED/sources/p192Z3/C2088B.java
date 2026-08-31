package p192Z3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.auth.AbstractC4817C;
import com.google.firebase.auth.C4827K;
import com.google.firebase.auth.C4830N;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: Z3.B */
/* JADX INFO: loaded from: classes.dex */
public final class C2088B extends AbstractC1945a {
    public static final Parcelable.Creator<C2088B> CREATOR = new C2091E();

    /* JADX INFO: renamed from: a */
    private final List f6879a;

    /* JADX INFO: renamed from: b */
    private final List f6880b;

    C2088B(List list, List list2) {
        this.f6879a = list == null ? new ArrayList() : list;
        this.f6880b = list2 == null ? new ArrayList() : list2;
    }

    /* JADX INFO: renamed from: T */
    public static C2088B m8624T(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC4817C abstractC4817C = (AbstractC4817C) it.next();
            if (abstractC4817C instanceof C4827K) {
                arrayList.add((C4827K) abstractC4817C);
            } else if (abstractC4817C instanceof C4830N) {
                arrayList2.add((C4830N) abstractC4817C);
            }
        }
        return new C2088B(arrayList, arrayList2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8048I(parcel, 1, this.f6879a, false);
        AbstractC1947c.m8048I(parcel, 2, this.f6880b, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }

    public final List zza() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f6879a.iterator();
        while (it.hasNext()) {
            arrayList.add((C4827K) it.next());
        }
        Iterator it2 = this.f6880b.iterator();
        while (it2.hasNext()) {
            arrayList.add((C4830N) it2.next());
        }
        return arrayList;
    }
}
