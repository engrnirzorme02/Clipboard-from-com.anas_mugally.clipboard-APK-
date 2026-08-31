package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.AbstractC3718s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p177X2.AbstractC1945a;
import p177X2.AbstractC1947c;

/* JADX INFO: renamed from: com.google.android.gms.common.server.response.h */
/* JADX INFO: loaded from: classes.dex */
public final class C3741h extends AbstractC1945a {
    public static final Parcelable.Creator<C3741h> CREATOR = new C3742i();

    /* JADX INFO: renamed from: a */
    final int f14893a;

    /* JADX INFO: renamed from: b */
    private final HashMap f14894b;

    /* JADX INFO: renamed from: c */
    private final String f14895c;

    C3741h(int i7, ArrayList arrayList, String str) {
        this.f14893a = i7;
        HashMap map = new HashMap();
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            C3739f c3739f = (C3739f) arrayList.get(i8);
            String str2 = c3739f.f14888b;
            HashMap map2 = new HashMap();
            int size2 = ((ArrayList) AbstractC3718s.m18083l(c3739f.f14889c)).size();
            for (int i9 = 0; i9 < size2; i9++) {
                C3740g c3740g = (C3740g) c3739f.f14889c.get(i9);
                map2.put(c3740g.f14891b, c3740g.f14892c);
            }
            map.put(str2, map2);
        }
        this.f14894b = map;
        this.f14895c = (String) AbstractC3718s.m18083l(str);
        m18140V();
    }

    /* JADX INFO: renamed from: T */
    public final String m18138T() {
        return this.f14895c;
    }

    /* JADX INFO: renamed from: U */
    public final Map m18139U(String str) {
        return (Map) this.f14894b.get(str);
    }

    /* JADX INFO: renamed from: V */
    public final void m18140V() {
        Iterator it = this.f14894b.keySet().iterator();
        while (it.hasNext()) {
            Map map = (Map) this.f14894b.get((String) it.next());
            Iterator it2 = map.keySet().iterator();
            while (it2.hasNext()) {
                ((AbstractC3734a.a) map.get((String) it2.next())).m18131g0(this);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f14894b.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map map = (Map) this.f14894b.get(str);
            for (String str2 : map.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iM8053a = AbstractC1947c.m8053a(parcel);
        AbstractC1947c.m8072t(parcel, 1, this.f14893a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f14894b.keySet()) {
            arrayList.add(new C3739f(str, (Map) this.f14894b.get(str)));
        }
        AbstractC1947c.m8048I(parcel, 2, arrayList, false);
        AbstractC1947c.m8044E(parcel, 3, this.f14895c, false);
        AbstractC1947c.m8054b(parcel, iM8053a);
    }
}
