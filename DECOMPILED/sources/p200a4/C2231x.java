package p200a4;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p211b5.InterfaceC2972b;

/* JADX INFO: renamed from: a4.x */
/* JADX INFO: loaded from: classes.dex */
class C2231x implements InterfaceC2972b {

    /* JADX INFO: renamed from: b */
    private volatile Set f7208b = null;

    /* JADX INFO: renamed from: a */
    private volatile Set f7207a = Collections.newSetFromMap(new ConcurrentHashMap());

    C2231x(Collection collection) {
        this.f7207a.addAll(collection);
    }

    /* JADX INFO: renamed from: b */
    static C2231x m9046b(Collection collection) {
        return new C2231x((Set) collection);
    }

    /* JADX INFO: renamed from: d */
    private synchronized void m9047d() {
        try {
            Iterator it = this.f7207a.iterator();
            while (it.hasNext()) {
                this.f7208b.add(((InterfaceC2972b) it.next()).get());
            }
            this.f7207a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    synchronized void m9048a(InterfaceC2972b interfaceC2972b) {
        try {
            if (this.f7208b == null) {
                this.f7207a.add(interfaceC2972b);
            } else {
                this.f7208b.add(interfaceC2972b.get());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p211b5.InterfaceC2972b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set get() {
        if (this.f7208b == null) {
            synchronized (this) {
                try {
                    if (this.f7208b == null) {
                        this.f7208b = Collections.newSetFromMap(new ConcurrentHashMap());
                        m9047d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Collections.unmodifiableSet(this.f7208b);
    }
}
