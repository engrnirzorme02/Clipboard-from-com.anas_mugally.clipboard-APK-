package p223d;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.C1444v;
import p238e6.InterfaceC5356a;

/* JADX INFO: renamed from: d.y */
/* JADX INFO: loaded from: classes.dex */
public final class C5195y {

    /* JADX INFO: renamed from: a */
    private final Executor f19834a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC5356a f19835b;

    /* JADX INFO: renamed from: c */
    private final Object f19836c;

    /* JADX INFO: renamed from: d */
    private int f19837d;

    /* JADX INFO: renamed from: e */
    private boolean f19838e;

    /* JADX INFO: renamed from: f */
    private boolean f19839f;

    /* JADX INFO: renamed from: g */
    private final List f19840g;

    /* JADX INFO: renamed from: h */
    private final Runnable f19841h;

    public C5195y(Executor executor, InterfaceC5356a reportFullyDrawn) {
        AbstractC6118n.m27187e(executor, "executor");
        AbstractC6118n.m27187e(reportFullyDrawn, "reportFullyDrawn");
        this.f19834a = executor;
        this.f19835b = reportFullyDrawn;
        this.f19836c = new Object();
        this.f19840g = new ArrayList();
        this.f19841h = new Runnable() { // from class: d.x
            @Override // java.lang.Runnable
            public final void run() {
                C5195y.m24015d(this.f19833a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final void m24015d(C5195y c5195y) {
        synchronized (c5195y.f19836c) {
            try {
                c5195y.f19838e = false;
                if (c5195y.f19837d == 0 && !c5195y.f19839f) {
                    c5195y.f19835b.invoke();
                    c5195y.m24016b();
                }
                C1444v c1444v = C1444v.f4971a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m24016b() {
        synchronized (this.f19836c) {
            try {
                this.f19839f = true;
                Iterator it = this.f19840g.iterator();
                while (it.hasNext()) {
                    ((InterfaceC5356a) it.next()).invoke();
                }
                this.f19840g.clear();
                C1444v c1444v = C1444v.f4971a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m24017c() {
        boolean z7;
        synchronized (this.f19836c) {
            z7 = this.f19839f;
        }
        return z7;
    }
}
