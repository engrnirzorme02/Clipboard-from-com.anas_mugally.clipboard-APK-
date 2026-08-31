package p301m5;

import android.content.Context;
import android.os.Process;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1430h;
import p145S5.AbstractC1440r;
import p145S5.C1435m;
import p145S5.InterfaceC1429g;
import p152T5.AbstractC1610H;
import p238e6.InterfaceC5356a;

/* JADX INFO: renamed from: m5.A */
/* JADX INFO: loaded from: classes.dex */
public final class C6347A implements InterfaceC6395w {

    /* JADX INFO: renamed from: a */
    private final Context f24201a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1429g f24202b;

    /* JADX INFO: renamed from: c */
    private final int f24203c;

    /* JADX INFO: renamed from: d */
    private final InterfaceC1429g f24204d;

    /* JADX INFO: renamed from: e */
    private final InterfaceC1429g f24205e;

    /* JADX INFO: renamed from: f */
    private boolean f24206f;

    public C6347A(Context appContext, final InterfaceC6371Z uuidGenerator) {
        AbstractC6118n.m27187e(appContext, "appContext");
        AbstractC6118n.m27187e(uuidGenerator, "uuidGenerator");
        this.f24201a = appContext;
        this.f24202b = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: m5.x
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return C6347A.m27358p(this.f24424a);
            }
        });
        this.f24203c = Process.myPid();
        this.f24204d = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: m5.y
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return C6347A.m27359q(uuidGenerator);
            }
        });
        this.f24205e = AbstractC1430h.m6066b(new InterfaceC5356a() { // from class: m5.z
            @Override // p238e6.InterfaceC5356a
            public final Object invoke() {
                return C6347A.m27357o(this.f24426a);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    private final List m27354j() {
        return C6350D.f24213a.m27376a(this.f24201a);
    }

    /* JADX INFO: renamed from: l */
    private final C6349C m27355l() {
        return (C6349C) this.f24205e.getValue();
    }

    /* JADX INFO: renamed from: n */
    private final boolean m27356n(C6349C c6349c, C6394v c6394v) {
        if (AbstractC6118n.m27183a(mo27362c(), c6349c.m27373c())) {
            return (c6349c.m27372b() == c6394v.m27511a() && AbstractC6118n.m27183a(m27367m(), c6394v.m27512b())) ? false : true;
        }
        return c6349c.m27372b() != c6394v.m27511a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C6349C m27357o(C6347A c6347a) {
        return C6350D.f24213a.m27377b(c6347a.f24201a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final String m27358p(C6347A c6347a) {
        return c6347a.m27355l().m27373c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final String m27359q(InterfaceC6371Z interfaceC6371Z) {
        String string = interfaceC6371Z.next().toString();
        AbstractC6118n.m27186d(string, "toString(...)");
        return string;
    }

    @Override // p301m5.InterfaceC6395w
    /* JADX INFO: renamed from: a */
    public void mo27360a() {
        this.f24206f = true;
    }

    @Override // p301m5.InterfaceC6395w
    /* JADX INFO: renamed from: b */
    public boolean mo27361b(Map processDataMap) {
        AbstractC6118n.m27187e(processDataMap, "processDataMap");
        if (this.f24206f) {
            return false;
        }
        List<C6349C> listM27354j = m27354j();
        ArrayList<C1435m> arrayList = new ArrayList();
        for (C6349C c6349c : listM27354j) {
            C6394v c6394v = (C6394v) processDataMap.get(c6349c.m27373c());
            C1435m c1435m = c6394v != null ? new C1435m(c6349c, c6394v) : null;
            if (c1435m != null) {
                arrayList.add(c1435m);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        for (C1435m c1435m2 : arrayList) {
            if (!m27356n((C6349C) c1435m2.m6068a(), (C6394v) c1435m2.m6069b())) {
                return false;
            }
        }
        return true;
    }

    @Override // p301m5.InterfaceC6395w
    /* JADX INFO: renamed from: c */
    public String mo27362c() {
        return (String) this.f24202b.getValue();
    }

    @Override // p301m5.InterfaceC6395w
    /* JADX INFO: renamed from: d */
    public boolean mo27363d(Map processDataMap) {
        AbstractC6118n.m27187e(processDataMap, "processDataMap");
        C6394v c6394v = (C6394v) processDataMap.get(mo27362c());
        return (c6394v != null && c6394v.m27511a() == m27366k() && AbstractC6118n.m27183a(c6394v.m27512b(), m27367m())) ? false : true;
    }

    @Override // p301m5.InterfaceC6395w
    /* JADX INFO: renamed from: e */
    public Map mo27364e() {
        return InterfaceC6395w.a.m27515a(this);
    }

    @Override // p301m5.InterfaceC6395w
    /* JADX INFO: renamed from: f */
    public Map mo27365f(Map map) {
        Map mapT;
        if (map != null && (mapT = AbstractC1610H.m6638t(map)) != null) {
            mapT.put(mo27362c(), new C6394v(Process.myPid(), m27367m()));
            Map mapR = AbstractC1610H.m6636r(mapT);
            if (mapR != null) {
                return mapR;
            }
        }
        return AbstractC1610H.m6624f(AbstractC1440r.m6083a(mo27362c(), new C6394v(Process.myPid(), m27367m())));
    }

    /* JADX INFO: renamed from: k */
    public int m27366k() {
        return this.f24203c;
    }

    /* JADX INFO: renamed from: m */
    public String m27367m() {
        return (String) this.f24204d.getValue();
    }
}
