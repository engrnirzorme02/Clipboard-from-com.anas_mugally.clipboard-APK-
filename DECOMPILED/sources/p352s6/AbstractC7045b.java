package p352s6;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1436n;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;

/* JADX INFO: renamed from: s6.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7045b {

    /* JADX INFO: renamed from: a */
    private AbstractC7047d[] f28182a;

    /* JADX INFO: renamed from: b */
    private int f28183b;

    /* JADX INFO: renamed from: c */
    private int f28184c;

    /* JADX INFO: renamed from: e */
    protected final AbstractC7047d m31121e() {
        AbstractC7047d abstractC7047dMo30398f;
        synchronized (this) {
            try {
                AbstractC7047d[] abstractC7047dArrMo30399g = this.f28182a;
                if (abstractC7047dArrMo30399g == null) {
                    abstractC7047dArrMo30399g = mo30399g(2);
                    this.f28182a = abstractC7047dArrMo30399g;
                } else if (this.f28183b >= abstractC7047dArrMo30399g.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(abstractC7047dArrMo30399g, abstractC7047dArrMo30399g.length * 2);
                    AbstractC6118n.m27186d(objArrCopyOf, "copyOf(...)");
                    this.f28182a = (AbstractC7047d[]) objArrCopyOf;
                    abstractC7047dArrMo30399g = (AbstractC7047d[]) objArrCopyOf;
                }
                int i7 = this.f28184c;
                do {
                    abstractC7047dMo30398f = abstractC7047dArrMo30399g[i7];
                    if (abstractC7047dMo30398f == null) {
                        abstractC7047dMo30398f = mo30398f();
                        abstractC7047dArrMo30399g[i7] = abstractC7047dMo30398f;
                    }
                    i7++;
                    if (i7 >= abstractC7047dArrMo30399g.length) {
                        i7 = 0;
                    }
                    AbstractC6118n.m27185c(abstractC7047dMo30398f, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!abstractC7047dMo30398f.mo30407a(this));
                this.f28184c = i7;
                this.f28183b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        return abstractC7047dMo30398f;
    }

    /* JADX INFO: renamed from: f */
    protected abstract AbstractC7047d mo30398f();

    /* JADX INFO: renamed from: g */
    protected abstract AbstractC7047d[] mo30399g(int i7);

    /* JADX INFO: renamed from: h */
    protected final void m31122h(AbstractC7047d abstractC7047d) {
        int i7;
        InterfaceC1875e[] interfaceC1875eArrMo30408b;
        synchronized (this) {
            try {
                int i8 = this.f28183b - 1;
                this.f28183b = i8;
                if (i8 == 0) {
                    this.f28184c = 0;
                }
                AbstractC6118n.m27185c(abstractC7047d, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                interfaceC1875eArrMo30408b = abstractC7047d.mo30408b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC1875e interfaceC1875e : interfaceC1875eArrMo30408b) {
            if (interfaceC1875e != null) {
                C1436n.a aVar = C1436n.f4958b;
                interfaceC1875e.resumeWith(C1436n.m6073b(C1444v.f4971a));
            }
        }
    }

    /* JADX INFO: renamed from: i */
    protected final AbstractC7047d[] m31123i() {
        return this.f28182a;
    }
}
