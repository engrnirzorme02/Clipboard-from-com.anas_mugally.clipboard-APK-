package com.google.firebase.firestore;

import com.google.protobuf.C5125s0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p158U4.AbstractC1697u;
import p158U4.AbstractC1701y;
import p158U4.C1682f;
import p158U4.C1687k;
import p164V3.C1774s;
import p186Y4.AbstractC2034b;
import p186Y4.AbstractC2049q;
import p351s5.C7019a;
import p351s5.C7039u;

/* JADX INFO: renamed from: com.google.firebase.firestore.A */
/* JADX INFO: loaded from: classes.dex */
public class C4912A {

    /* JADX INFO: renamed from: a */
    private final FirebaseFirestore f18642a;

    /* JADX INFO: renamed from: b */
    private final C4924j.a f18643b;

    /* JADX INFO: renamed from: com.google.firebase.firestore.A$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f18644a;

        static {
            int[] iArr = new int[C4924j.a.values().length];
            f18644a = iArr;
            try {
                iArr[C4924j.a.PREVIOUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18644a[C4924j.a.ESTIMATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C4912A(FirebaseFirestore firebaseFirestore, C4924j.a aVar) {
        this.f18642a = firebaseFirestore;
        this.f18643b = aVar;
    }

    /* JADX INFO: renamed from: a */
    private List m22134a(C7019a c7019a) {
        ArrayList arrayList = new ArrayList(c7019a.m30670i0());
        Iterator it = c7019a.mo30668g().iterator();
        while (it.hasNext()) {
            arrayList.add(m22139f((C7039u) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    private Object m22135c(C7039u c7039u) {
        C1682f c1682fM7067h = C1682f.m7067h(c7039u.m31041t0());
        C1687k c1687kM7087k = C1687k.m7087k(c7039u.m31041t0());
        C1682f c1682fM22148d = this.f18642a.m22148d();
        if (!c1682fM7067h.equals(c1682fM22148d)) {
            AbstractC2049q.m8505d("DocumentSnapshot", "Document %s contains a document reference within a different database (%s/%s) which is not supported. It will be treated as a reference in the current database (%s/%s) instead.", c1687kM7087k.m7095t(), c1682fM7067h.m7070k(), c1682fM7067h.m7069j(), c1682fM22148d.m7070k(), c1682fM22148d.m7069j());
        }
        return new C4923i(c1687kM7087k, this.f18642a);
    }

    /* JADX INFO: renamed from: d */
    private Object m22136d(C7039u c7039u) {
        int i7 = a.f18644a[this.f18643b.ordinal()];
        if (i7 != 1) {
            if (i7 != 2) {
                return null;
            }
            return m22137e(AbstractC1697u.m7150a(c7039u));
        }
        C7039u c7039uM7151b = AbstractC1697u.m7151b(c7039u);
        if (c7039uM7151b == null) {
            return null;
        }
        return m22139f(c7039uM7151b);
    }

    /* JADX INFO: renamed from: e */
    private Object m22137e(C5125s0 c5125s0) {
        return new C1774s(c5125s0.m23586e0(), c5125s0.m23585d0());
    }

    /* JADX INFO: renamed from: b */
    Map m22138b(Map map) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            map2.put((String) entry.getKey(), m22139f((C7039u) entry.getValue()));
        }
        return map2;
    }

    /* JADX INFO: renamed from: f */
    public Object m22139f(C7039u c7039u) {
        switch (AbstractC1701y.m7171I(c7039u)) {
            case 0:
                return null;
            case 1:
                return Boolean.valueOf(c7039u.m31035m0());
            case 2:
                return c7039u.m31044w0().equals(C7039u.c.INTEGER_VALUE) ? Long.valueOf(c7039u.m31039r0()) : Double.valueOf(c7039u.m31037p0());
            case 3:
                return m22137e(c7039u.m31043v0());
            case 4:
                return m22136d(c7039u);
            case 5:
                return c7039u.m31042u0();
            case 6:
                return C4915a.m22150d(c7039u.m31036n0());
            case 7:
                return m22135c(c7039u);
            case 8:
                return new C4933s(c7039u.m31038q0().m33392d0(), c7039u.m31038q0().m33393e0());
            case 9:
                return m22134a(c7039u.m31034l0());
            case 10:
                return m22140g(c7039u.m31040s0().m30811d0());
            case 11:
                return m22138b(c7039u.m31040s0().m30811d0());
            default:
                throw AbstractC2034b.m8457a("Unknown value type: " + c7039u.m31044w0(), new Object[0]);
        }
    }

    /* JADX INFO: renamed from: g */
    C4913B m22140g(Map map) {
        List listMo30668g = ((C7039u) map.get("value")).m31034l0().mo30668g();
        double[] dArr = new double[listMo30668g.size()];
        for (int i7 = 0; i7 < listMo30668g.size(); i7++) {
            dArr[i7] = ((C7039u) listMo30668g.get(i7)).m31037p0();
        }
        return new C4913B(dArr);
    }
}
