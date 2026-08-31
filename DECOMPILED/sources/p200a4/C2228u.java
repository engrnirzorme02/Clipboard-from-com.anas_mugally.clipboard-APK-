package p200a4;

import androidx.appcompat.app.AbstractC2263x;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import p116O4.AbstractC1145a;
import p116O4.InterfaceC1146b;
import p116O4.InterfaceC1147c;
import p116O4.InterfaceC1148d;

/* JADX INFO: renamed from: a4.u */
/* JADX INFO: loaded from: classes.dex */
class C2228u implements InterfaceC1148d, InterfaceC1147c {

    /* JADX INFO: renamed from: a */
    private final Map f7201a = new HashMap();

    /* JADX INFO: renamed from: b */
    private Queue f7202b = new ArrayDeque();

    /* JADX INFO: renamed from: c */
    private final Executor f7203c;

    C2228u(Executor executor) {
        this.f7203c = executor;
    }

    /* JADX INFO: renamed from: e */
    private synchronized Set m9043e(AbstractC1145a abstractC1145a) {
        throw null;
    }

    @Override // p116O4.InterfaceC1148d
    /* JADX INFO: renamed from: a */
    public synchronized void mo4970a(Class cls, Executor executor, InterfaceC1146b interfaceC1146b) {
        try {
            AbstractC2205D.m8948b(cls);
            AbstractC2205D.m8948b(interfaceC1146b);
            AbstractC2205D.m8948b(executor);
            if (!this.f7201a.containsKey(cls)) {
                this.f7201a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f7201a.get(cls)).put(interfaceC1146b, executor);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p116O4.InterfaceC1148d
    /* JADX INFO: renamed from: b */
    public void mo4971b(Class cls, InterfaceC1146b interfaceC1146b) {
        mo4970a(cls, this.f7203c, interfaceC1146b);
    }

    /* JADX INFO: renamed from: d */
    void m9044d() {
        Queue queue;
        synchronized (this) {
            try {
                queue = this.f7202b;
                if (queue != null) {
                    this.f7202b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (queue != null) {
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                AbstractC2263x.m9328a(it.next());
                m9045f(null);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m9045f(final AbstractC1145a abstractC1145a) {
        AbstractC2205D.m8948b(abstractC1145a);
        synchronized (this) {
            try {
                Queue queue = this.f7202b;
                if (queue != null) {
                    queue.add(abstractC1145a);
                    return;
                }
                for (final Map.Entry entry : m9043e(abstractC1145a)) {
                    ((Executor) entry.getValue()).execute(new Runnable(entry, abstractC1145a) { // from class: a4.t

                        /* JADX INFO: renamed from: a */
                        public final /* synthetic */ Map.Entry f7200a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            ((InterfaceC1146b) this.f7200a.getKey()).mo4969a(null);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
