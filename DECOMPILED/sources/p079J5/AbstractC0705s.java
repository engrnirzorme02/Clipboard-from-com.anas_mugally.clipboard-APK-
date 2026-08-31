package p079J5;

import io.grpc.internal.AbstractC5758S0;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import p063H5.AbstractC0518M;
import p063H5.C0530Z;
import p095L5.C0848d;

/* JADX INFO: renamed from: J5.s */
/* JADX INFO: loaded from: classes.dex */
abstract class AbstractC0705s {

    /* JADX INFO: renamed from: a */
    private static final Logger f2873a = Logger.getLogger(AbstractC0705s.class.getName());

    /* JADX INFO: renamed from: a */
    public static C0530Z m3433a(List list) {
        return AbstractC0518M.m2169c(m3434b(list));
    }

    /* JADX INFO: renamed from: b */
    private static byte[][] m3434b(List list) {
        byte[][] bArr = new byte[list.size() * 2][];
        Iterator it = list.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            C0848d c0848d = (C0848d) it.next();
            int i8 = i7 + 1;
            bArr[i7] = c0848d.f3354a.mo3093K();
            i7 += 2;
            bArr[i8] = c0848d.f3355b.mo3093K();
        }
        return AbstractC5758S0.m25697e(bArr);
    }

    /* JADX INFO: renamed from: c */
    public static C0530Z m3435c(List list) {
        return AbstractC0518M.m2169c(m3434b(list));
    }
}
