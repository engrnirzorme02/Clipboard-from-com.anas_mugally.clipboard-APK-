package p223d;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AbstractC6118n;
import p238e6.InterfaceC5356a;

/* JADX INFO: renamed from: d.A */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5158A {

    /* JADX INFO: renamed from: a */
    private boolean f19739a;

    /* JADX INFO: renamed from: b */
    private final CopyOnWriteArrayList f19740b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c */
    private InterfaceC5356a f19741c;

    public AbstractC5158A(boolean z7) {
        this.f19739a = z7;
    }

    /* JADX INFO: renamed from: a */
    public final void m23907a(InterfaceC5174d cancellable) {
        AbstractC6118n.m27187e(cancellable, "cancellable");
        this.f19740b.add(cancellable);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC5356a m23908b() {
        return this.f19741c;
    }

    /* JADX INFO: renamed from: c */
    public void m23909c() {
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo363d();

    /* JADX INFO: renamed from: e */
    public void m23910e(C5173c backEvent) {
        AbstractC6118n.m27187e(backEvent, "backEvent");
    }

    /* JADX INFO: renamed from: f */
    public void m23911f(C5173c backEvent) {
        AbstractC6118n.m27187e(backEvent, "backEvent");
    }

    /* JADX INFO: renamed from: g */
    public final boolean m23912g() {
        return this.f19739a;
    }

    /* JADX INFO: renamed from: h */
    public final void m23913h() {
        Iterator it = this.f19740b.iterator();
        while (it.hasNext()) {
            ((InterfaceC5174d) it.next()).cancel();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m23914i(InterfaceC5174d cancellable) {
        AbstractC6118n.m27187e(cancellable, "cancellable");
        this.f19740b.remove(cancellable);
    }

    /* JADX INFO: renamed from: j */
    public final void m23915j(boolean z7) {
        this.f19739a = z7;
        InterfaceC5356a interfaceC5356a = this.f19741c;
        if (interfaceC5356a != null) {
            interfaceC5356a.invoke();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m23916k(InterfaceC5356a interfaceC5356a) {
        this.f19741c = interfaceC5356a;
    }
}
