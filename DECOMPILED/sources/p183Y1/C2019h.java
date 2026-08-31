package p183Y1;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: Y1.h */
/* JADX INFO: loaded from: classes.dex */
public class C2019h {

    /* JADX INFO: renamed from: a */
    private final Map f6700a = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: b */
    private final long f6701b;

    /* JADX INFO: renamed from: c */
    private long f6702c;

    /* JADX INFO: renamed from: d */
    private long f6703d;

    /* JADX INFO: renamed from: Y1.h$a */
    static final class a {

        /* JADX INFO: renamed from: a */
        final Object f6704a;

        /* JADX INFO: renamed from: b */
        final int f6705b;

        a(Object obj, int i7) {
            this.f6704a = obj;
            this.f6705b = i7;
        }
    }

    public C2019h(long j7) {
        this.f6701b = j7;
        this.f6702c = j7;
    }

    /* JADX INFO: renamed from: f */
    private void m8394f() {
        m8400m(this.f6702c);
    }

    /* JADX INFO: renamed from: b */
    public void m8395b() {
        m8400m(0L);
    }

    /* JADX INFO: renamed from: g */
    public synchronized Object m8396g(Object obj) {
        a aVar;
        aVar = (a) this.f6700a.get(obj);
        return aVar != null ? aVar.f6704a : null;
    }

    /* JADX INFO: renamed from: h */
    public synchronized long m8397h() {
        return this.f6702c;
    }

    /* JADX INFO: renamed from: i */
    protected int mo2045i(Object obj) {
        return 1;
    }

    /* JADX INFO: renamed from: j */
    protected void mo2046j(Object obj, Object obj2) {
    }

    /* JADX INFO: renamed from: k */
    public synchronized Object m8398k(Object obj, Object obj2) {
        int iMo2045i = mo2045i(obj2);
        long j7 = iMo2045i;
        if (j7 >= this.f6702c) {
            mo2046j(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f6703d += j7;
        }
        a aVar = (a) this.f6700a.put(obj, obj2 == null ? null : new a(obj2, iMo2045i));
        if (aVar != null) {
            this.f6703d -= (long) aVar.f6705b;
            if (!aVar.f6704a.equals(obj2)) {
                mo2046j(obj, aVar.f6704a);
            }
        }
        m8394f();
        return aVar != null ? aVar.f6704a : null;
    }

    /* JADX INFO: renamed from: l */
    public synchronized Object m8399l(Object obj) {
        a aVar = (a) this.f6700a.remove(obj);
        if (aVar == null) {
            return null;
        }
        this.f6703d -= (long) aVar.f6705b;
        return aVar.f6704a;
    }

    /* JADX INFO: renamed from: m */
    protected synchronized void m8400m(long j7) {
        while (this.f6703d > j7) {
            Iterator it = this.f6700a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            a aVar = (a) entry.getValue();
            this.f6703d -= (long) aVar.f6705b;
            Object key = entry.getKey();
            it.remove();
            mo2046j(key, aVar.f6704a);
        }
    }
}
