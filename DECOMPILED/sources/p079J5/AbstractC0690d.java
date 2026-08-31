package p079J5;

import io.grpc.internal.AbstractC5757S;
import io.grpc.internal.AbstractC5758S0;
import java.util.ArrayList;
import java.util.List;
import p063H5.AbstractC0518M;
import p063H5.C0530Z;
import p072I6.C0651h;
import p095L5.C0848d;
import p122P3.AbstractC1209m;

/* JADX INFO: renamed from: J5.d */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0690d {

    /* JADX INFO: renamed from: a */
    public static final C0848d f2678a;

    /* JADX INFO: renamed from: b */
    public static final C0848d f2679b;

    /* JADX INFO: renamed from: c */
    public static final C0848d f2680c;

    /* JADX INFO: renamed from: d */
    public static final C0848d f2681d;

    /* JADX INFO: renamed from: e */
    public static final C0848d f2682e;

    /* JADX INFO: renamed from: f */
    public static final C0848d f2683f;

    static {
        C0651h c0651h = C0848d.f3350g;
        f2678a = new C0848d(c0651h, "https");
        f2679b = new C0848d(c0651h, "http");
        C0651h c0651h2 = C0848d.f3348e;
        f2680c = new C0848d(c0651h2, "POST");
        f2681d = new C0848d(c0651h2, "GET");
        f2682e = new C0848d(AbstractC5757S.f22234j.m2302d(), "application/grpc");
        f2683f = new C0848d("te", "trailers");
    }

    /* JADX INFO: renamed from: a */
    private static List m3228a(List list, C0530Z c0530z) {
        byte[][] bArrM25696d = AbstractC5758S0.m25696d(c0530z);
        for (int i7 = 0; i7 < bArrM25696d.length; i7 += 2) {
            C0651h c0651hM3085x = C0651h.m3085x(bArrM25696d[i7]);
            if (c0651hM3085x.m3090F() != 0 && c0651hM3085x.m3099k(0) != 58) {
                list.add(new C0848d(c0651hM3085x, C0651h.m3085x(bArrM25696d[i7 + 1])));
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: b */
    public static List m3229b(C0530Z c0530z, String str, String str2, String str3, boolean z7, boolean z8) {
        AbstractC1209m.m5303o(c0530z, "headers");
        AbstractC1209m.m5303o(str, "defaultPath");
        AbstractC1209m.m5303o(str2, "authority");
        m3230c(c0530z);
        ArrayList arrayList = new ArrayList(AbstractC0518M.m2167a(c0530z) + 7);
        if (z8) {
            arrayList.add(f2679b);
        } else {
            arrayList.add(f2678a);
        }
        if (z7) {
            arrayList.add(f2681d);
        } else {
            arrayList.add(f2680c);
        }
        arrayList.add(new C0848d(C0848d.f3351h, str2));
        arrayList.add(new C0848d(C0848d.f3349f, str));
        arrayList.add(new C0848d(AbstractC5757S.f22236l.m2302d(), str3));
        arrayList.add(f2682e);
        arrayList.add(f2683f);
        return m3228a(arrayList, c0530z);
    }

    /* JADX INFO: renamed from: c */
    private static void m3230c(C0530Z c0530z) {
        c0530z.m2282e(AbstractC5757S.f22234j);
        c0530z.m2282e(AbstractC5757S.f22235k);
        c0530z.m2282e(AbstractC5757S.f22236l);
    }
}
