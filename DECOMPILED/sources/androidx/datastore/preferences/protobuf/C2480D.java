package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.D */
/* JADX INFO: loaded from: classes.dex */
public final class C2480D extends LinkedHashMap {

    /* JADX INFO: renamed from: b */
    private static final C2480D f9437b;

    /* JADX INFO: renamed from: a */
    private boolean f9438a;

    static {
        C2480D c2480d = new C2480D();
        f9437b = c2480d;
        c2480d.m10877i();
    }

    private C2480D() {
        this.f9438a = true;
    }

    /* JADX INFO: renamed from: a */
    static int m10869a(Map map) {
        int iM10870b = 0;
        for (Map.Entry entry : map.entrySet()) {
            iM10870b += m10870b(entry.getValue()) ^ m10870b(entry.getKey());
        }
        return iM10870b;
    }

    /* JADX INFO: renamed from: b */
    private static int m10870b(Object obj) {
        return obj instanceof byte[] ? AbstractC2534u.m11640d((byte[]) obj) : obj.hashCode();
    }

    /* JADX INFO: renamed from: c */
    private static void m10871c(Map map) {
        for (Object obj : map.keySet()) {
            AbstractC2534u.m11637a(obj);
            AbstractC2534u.m11637a(map.get(obj));
        }
    }

    /* JADX INFO: renamed from: d */
    public static C2480D m10872d() {
        return f9437b;
    }

    /* JADX INFO: renamed from: e */
    private void m10873e() {
        if (!m10876h()) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: f */
    private static boolean m10874f(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    /* JADX INFO: renamed from: g */
    static boolean m10875g(Map map, Map map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !m10874f(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        m10873e();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && m10875g(this, (Map) obj);
    }

    /* JADX INFO: renamed from: h */
    public boolean m10876h() {
        return this.f9438a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return m10869a(this);
    }

    /* JADX INFO: renamed from: i */
    public void m10877i() {
        this.f9438a = false;
    }

    /* JADX INFO: renamed from: k */
    public void m10878k(C2480D c2480d) {
        m10873e();
        if (c2480d.isEmpty()) {
            return;
        }
        putAll(c2480d);
    }

    /* JADX INFO: renamed from: l */
    public C2480D m10879l() {
        return isEmpty() ? new C2480D() : new C2480D(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        m10873e();
        AbstractC2534u.m11637a(obj);
        AbstractC2534u.m11637a(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        m10873e();
        m10871c(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        m10873e();
        return super.remove(obj);
    }

    private C2480D(Map map) {
        super(map);
        this.f9438a = true;
    }
}
