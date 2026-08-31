package p360t6;

import p238e6.InterfaceC5371p;

/* JADX INFO: renamed from: t6.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7117a {

    /* JADX INFO: renamed from: a */
    private static final C7104D f28407a = new C7104D("CLOSED");

    /* JADX INFO: renamed from: b */
    public static final AbstractC7118b m31429b(AbstractC7118b abstractC7118b) {
        while (true) {
            Object objM31434g = abstractC7118b.m31434g();
            if (objM31434g == f28407a) {
                return abstractC7118b;
            }
            AbstractC7118b abstractC7118b2 = (AbstractC7118b) objM31434g;
            if (abstractC7118b2 != null) {
                abstractC7118b = abstractC7118b2;
            } else if (abstractC7118b.m31441m()) {
                return abstractC7118b;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static final Object m31430c(AbstractC7101A abstractC7101A, long j7, InterfaceC5371p interfaceC5371p) {
        while (true) {
            if (abstractC7101A.f28391c >= j7 && !abstractC7101A.mo31378k()) {
                return AbstractC7102B.m31382a(abstractC7101A);
            }
            Object objM31434g = abstractC7101A.m31434g();
            if (objM31434g == f28407a) {
                return AbstractC7102B.m31382a(f28407a);
            }
            AbstractC7101A abstractC7101A2 = (AbstractC7101A) ((AbstractC7118b) objM31434g);
            if (abstractC7101A2 == null) {
                abstractC7101A2 = (AbstractC7101A) interfaceC5371p.invoke(Long.valueOf(abstractC7101A.f28391c + 1), abstractC7101A);
                if (abstractC7101A.m31443o(abstractC7101A2)) {
                    if (abstractC7101A.mo31378k()) {
                        abstractC7101A.m31442n();
                    }
                }
            }
            abstractC7101A = abstractC7101A2;
        }
    }
}
