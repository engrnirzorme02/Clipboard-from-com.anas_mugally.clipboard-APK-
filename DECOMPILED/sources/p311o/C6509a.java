package p311o;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: o.a */
/* JADX INFO: loaded from: classes.dex */
public class C6509a extends C6510b {

    /* JADX INFO: renamed from: e */
    private final HashMap f24622e = new HashMap();

    @Override // p311o.C6510b
    /* JADX INFO: renamed from: b */
    protected C6510b.c mo27729b(Object obj) {
        return (C6510b.c) this.f24622e.get(obj);
    }

    public boolean contains(Object obj) {
        return this.f24622e.containsKey(obj);
    }

    @Override // p311o.C6510b
    /* JADX INFO: renamed from: k */
    public Object mo27730k(Object obj, Object obj2) {
        C6510b.c cVarMo27729b = mo27729b(obj);
        if (cVarMo27729b != null) {
            return cVarMo27729b.f24628b;
        }
        this.f24622e.put(obj, m27736j(obj, obj2));
        return null;
    }

    @Override // p311o.C6510b
    /* JADX INFO: renamed from: m */
    public Object mo27731m(Object obj) {
        Object objMo27731m = super.mo27731m(obj);
        this.f24622e.remove(obj);
        return objMo27731m;
    }

    /* JADX INFO: renamed from: n */
    public Map.Entry m27732n(Object obj) {
        if (contains(obj)) {
            return ((C6510b.c) this.f24622e.get(obj)).f24630d;
        }
        return null;
    }
}
