package p200a4;

import android.util.Log;
import androidx.lifecycle.AbstractC2636b;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p070I4.InterfaceC0637a;
import p116O4.InterfaceC1147c;
import p116O4.InterfaceC1148d;
import p211b5.InterfaceC2971a;
import p211b5.InterfaceC2972b;

/* JADX INFO: renamed from: a4.n */
/* JADX INFO: loaded from: classes.dex */
public class C2221n implements InterfaceC2211d, InterfaceC0637a {

    /* JADX INFO: renamed from: i */
    private static final InterfaceC2972b f7177i = new InterfaceC2972b() { // from class: a4.j
        @Override // p211b5.InterfaceC2972b
        public final Object get() {
            return Collections.EMPTY_SET;
        }
    };

    /* JADX INFO: renamed from: a */
    private final Map f7178a;

    /* JADX INFO: renamed from: b */
    private final Map f7179b;

    /* JADX INFO: renamed from: c */
    private final Map f7180c;

    /* JADX INFO: renamed from: d */
    private final List f7181d;

    /* JADX INFO: renamed from: e */
    private Set f7182e;

    /* JADX INFO: renamed from: f */
    private final C2228u f7183f;

    /* JADX INFO: renamed from: g */
    private final AtomicReference f7184g;

    /* JADX INFO: renamed from: h */
    private final InterfaceC2216i f7185h;

    /* JADX INFO: renamed from: a4.n$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final Executor f7186a;

        /* JADX INFO: renamed from: b */
        private final List f7187b = new ArrayList();

        /* JADX INFO: renamed from: c */
        private final List f7188c = new ArrayList();

        /* JADX INFO: renamed from: d */
        private InterfaceC2216i f7189d = InterfaceC2216i.f7170a;

        b(Executor executor) {
            this.f7186a = executor;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ ComponentRegistrar m9010a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        /* JADX INFO: renamed from: b */
        public b m9011b(C2210c c2210c) {
            this.f7188c.add(c2210c);
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b m9012c(final ComponentRegistrar componentRegistrar) {
            this.f7187b.add(new InterfaceC2972b() { // from class: a4.o
                @Override // p211b5.InterfaceC2972b
                public final Object get() {
                    return C2221n.b.m9010a(componentRegistrar);
                }
            });
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m9013d(Collection collection) {
            this.f7187b.addAll(collection);
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C2221n m9014e() {
            return new C2221n(this.f7186a, this.f7187b, this.f7188c, this.f7189d);
        }

        /* JADX INFO: renamed from: f */
        public b m9015f(InterfaceC2216i interfaceC2216i) {
            this.f7189d = interfaceC2216i;
            return this;
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Object m8998j(C2221n c2221n, C2210c c2210c) {
        c2221n.getClass();
        return c2210c.m8971h().mo2117a(new C2207F(c2210c, c2221n));
    }

    /* JADX INFO: renamed from: m */
    public static b m9001m(Executor executor) {
        return new b(executor);
    }

    /* JADX INFO: renamed from: n */
    private void m9002n(List list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f7181d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((InterfaceC2972b) it.next()).get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f7185h.mo8997a(componentRegistrar));
                        it.remove();
                    }
                } catch (C2229v e7) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e7);
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                for (Object obj : ((C2210c) it2.next()).m8973j().toArray()) {
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (this.f7182e.contains(obj.toString())) {
                            it2.remove();
                            break;
                        }
                        this.f7182e.add(obj.toString());
                    }
                }
            }
            if (this.f7178a.isEmpty()) {
                AbstractC2223p.m9016a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f7178a.keySet());
                arrayList2.addAll(list);
                AbstractC2223p.m9016a(arrayList2);
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                final C2210c c2210c = (C2210c) it3.next();
                this.f7178a.put(c2210c, new C2230w(new InterfaceC2972b() { // from class: a4.k
                    @Override // p211b5.InterfaceC2972b
                    public final Object get() {
                        return C2221n.m8998j(this.f7171a, c2210c);
                    }
                }));
            }
            arrayList.addAll(m9007t(list));
            arrayList.addAll(m9008u());
            m9006s();
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
        }
        m9005r();
    }

    /* JADX INFO: renamed from: o */
    private void m9003o(Map map, boolean z7) {
        for (Map.Entry entry : map.entrySet()) {
            C2210c c2210c = (C2210c) entry.getKey();
            InterfaceC2972b interfaceC2972b = (InterfaceC2972b) entry.getValue();
            if (c2210c.m8975n() || (c2210c.m8976o() && z7)) {
                interfaceC2972b.get();
            }
        }
        this.f7183f.m9044d();
    }

    /* JADX INFO: renamed from: q */
    private static List m9004q(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: r */
    private void m9005r() {
        Boolean bool = (Boolean) this.f7184g.get();
        if (bool != null) {
            m9003o(this.f7178a, bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: s */
    private void m9006s() {
        for (C2210c c2210c : this.f7178a.keySet()) {
            for (C2224q c2224q : c2210c.m8970g()) {
                if (c2224q.m9041g() && !this.f7180c.containsKey(c2224q.m9037c())) {
                    this.f7180c.put(c2224q.m9037c(), C2231x.m9046b(Collections.EMPTY_SET));
                } else if (this.f7179b.containsKey(c2224q.m9037c())) {
                    continue;
                } else {
                    if (c2224q.m9040f()) {
                        throw new C2232y(String.format("Unsatisfied dependency for component %s: %s", c2210c, c2224q.m9037c()));
                    }
                    if (!c2224q.m9041g()) {
                        this.f7179b.put(c2224q.m9037c(), C2204C.m8943e());
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: t */
    private List m9007t(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2210c c2210c = (C2210c) it.next();
            if (c2210c.m8977p()) {
                final InterfaceC2972b interfaceC2972b = (InterfaceC2972b) this.f7178a.get(c2210c);
                for (C2206E c2206e : c2210c.m8973j()) {
                    if (this.f7179b.containsKey(c2206e)) {
                        final C2204C c2204c = (C2204C) ((InterfaceC2972b) this.f7179b.get(c2206e));
                        arrayList.add(new Runnable() { // from class: a4.l
                            @Override // java.lang.Runnable
                            public final void run() {
                                c2204c.m8946g(interfaceC2972b);
                            }
                        });
                    } else {
                        this.f7179b.put(c2206e, interfaceC2972b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: u */
    private List m9008u() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f7178a.entrySet()) {
            C2210c c2210c = (C2210c) entry.getKey();
            if (!c2210c.m8977p()) {
                InterfaceC2972b interfaceC2972b = (InterfaceC2972b) entry.getValue();
                for (C2206E c2206e : c2210c.m8973j()) {
                    if (!map.containsKey(c2206e)) {
                        map.put(c2206e, new HashSet());
                    }
                    ((Set) map.get(c2206e)).add(interfaceC2972b);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.f7180c.containsKey(entry2.getKey())) {
                final C2231x c2231x = (C2231x) this.f7180c.get(entry2.getKey());
                for (final InterfaceC2972b interfaceC2972b2 : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: a4.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            c2231x.m9048a(interfaceC2972b2);
                        }
                    });
                }
            } else {
                this.f7180c.put((C2206E) entry2.getKey(), C2231x.m9046b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    @Override // p200a4.InterfaceC2211d
    /* JADX INFO: renamed from: d */
    public InterfaceC2971a mo8956d(C2206E c2206e) {
        InterfaceC2972b interfaceC2972bMo8957f = mo8957f(c2206e);
        if (interfaceC2972bMo8957f == null) {
            return C2204C.m8943e();
        }
        return interfaceC2972bMo8957f instanceof C2204C ? (C2204C) interfaceC2972bMo8957f : C2204C.m8944f(interfaceC2972bMo8957f);
    }

    @Override // p200a4.InterfaceC2211d
    /* JADX INFO: renamed from: f */
    public synchronized InterfaceC2972b mo8957f(C2206E c2206e) {
        AbstractC2205D.m8949c(c2206e, "Null interface requested.");
        return (InterfaceC2972b) this.f7179b.get(c2206e);
    }

    @Override // p200a4.InterfaceC2211d
    /* JADX INFO: renamed from: g */
    public synchronized InterfaceC2972b mo8958g(C2206E c2206e) {
        C2231x c2231x = (C2231x) this.f7180c.get(c2206e);
        if (c2231x != null) {
            return c2231x;
        }
        return f7177i;
    }

    /* JADX INFO: renamed from: p */
    public void m9009p(boolean z7) {
        HashMap map;
        if (AbstractC2636b.m12603a(this.f7184g, null, Boolean.valueOf(z7))) {
            synchronized (this) {
                map = new HashMap(this.f7178a);
            }
            m9003o(map, z7);
        }
    }

    private C2221n(Executor executor, Iterable iterable, Collection collection, InterfaceC2216i interfaceC2216i) {
        this.f7178a = new HashMap();
        this.f7179b = new HashMap();
        this.f7180c = new HashMap();
        this.f7182e = new HashSet();
        this.f7184g = new AtomicReference();
        C2228u c2228u = new C2228u(executor);
        this.f7183f = c2228u;
        this.f7185h = interfaceC2216i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C2210c.m8969q(c2228u, C2228u.class, InterfaceC1148d.class, InterfaceC1147c.class));
        arrayList.add(C2210c.m8969q(this, InterfaceC0637a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C2210c c2210c = (C2210c) it.next();
            if (c2210c != null) {
                arrayList.add(c2210c);
            }
        }
        this.f7181d = m9004q(iterable);
        m9002n(arrayList);
    }
}
