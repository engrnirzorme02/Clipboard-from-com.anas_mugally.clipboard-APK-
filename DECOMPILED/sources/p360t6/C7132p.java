package p360t6;

import androidx.concurrent.futures.AbstractC2404b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: t6.p */
/* JADX INFO: loaded from: classes.dex */
public class C7132p {

    /* JADX INFO: renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f28433a = AtomicReferenceFieldUpdater.newUpdater(C7132p.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public C7132p(boolean z7) {
        this._cur$volatile = new C7133q(8, z7);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m31487a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28433a;
        while (true) {
            C7133q c7133q = (C7133q) atomicReferenceFieldUpdater.get(this);
            int iM31499a = c7133q.m31499a(obj);
            if (iM31499a == 0) {
                return true;
            }
            if (iM31499a == 1) {
                AbstractC2404b.m10339a(f28433a, this, c7133q, c7133q.m31503l());
            } else if (iM31499a == 2) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m31488b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28433a;
        while (true) {
            C7133q c7133q = (C7133q) atomicReferenceFieldUpdater.get(this);
            if (c7133q.m31500d()) {
                return;
            } else {
                AbstractC2404b.m10339a(f28433a, this, c7133q, c7133q.m31503l());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m31489c() {
        return ((C7133q) f28433a.get(this)).m31501g();
    }

    /* JADX INFO: renamed from: e */
    public final Object m31490e() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f28433a;
        while (true) {
            C7133q c7133q = (C7133q) atomicReferenceFieldUpdater.get(this);
            Object objM31504m = c7133q.m31504m();
            if (objM31504m != C7133q.f28437h) {
                return objM31504m;
            }
            AbstractC2404b.m10339a(f28433a, this, c7133q, c7133q.m31503l());
        }
    }
}
