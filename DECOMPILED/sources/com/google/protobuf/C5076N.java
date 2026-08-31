package com.google.protobuf;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.protobuf.N */
/* JADX INFO: loaded from: classes.dex */
public final class C5076N extends LinkedHashMap {

    /* JADX INFO: renamed from: b */
    private static final C5076N f19345b;

    /* JADX INFO: renamed from: a */
    private boolean f19346a;

    static {
        C5076N c5076n = new C5076N();
        f19345b = c5076n;
        c5076n.m22950i();
    }

    private C5076N() {
        this.f19346a = true;
    }

    /* JADX INFO: renamed from: a */
    static int m22942a(Map map) {
        int iM22943b = 0;
        for (Map.Entry entry : map.entrySet()) {
            iM22943b += m22943b(entry.getValue()) ^ m22943b(entry.getKey());
        }
        return iM22943b;
    }

    /* JADX INFO: renamed from: b */
    private static int m22943b(Object obj) {
        if (obj instanceof byte[]) {
            return AbstractC5063B.m22840d((byte[]) obj);
        }
        if (obj instanceof AbstractC5063B.a) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: c */
    private static void m22944c(Map map) {
        for (Object obj : map.keySet()) {
            AbstractC5063B.m22837a(obj);
            AbstractC5063B.m22837a(map.get(obj));
        }
    }

    /* JADX INFO: renamed from: d */
    public static C5076N m22945d() {
        return f19345b;
    }

    /* JADX INFO: renamed from: e */
    private void m22946e() {
        if (!m22949h()) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: f */
    private static boolean m22947f(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    /* JADX INFO: renamed from: g */
    static boolean m22948g(Map map, Map map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !m22947f(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        m22946e();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && m22948g(this, (Map) obj);
    }

    /* JADX INFO: renamed from: h */
    public boolean m22949h() {
        return this.f19346a;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return m22942a(this);
    }

    /* JADX INFO: renamed from: i */
    public void m22950i() {
        this.f19346a = false;
    }

    /* JADX INFO: renamed from: k */
    public void m22951k(C5076N c5076n) {
        m22946e();
        if (c5076n.isEmpty()) {
            return;
        }
        putAll(c5076n);
    }

    /* JADX INFO: renamed from: l */
    public C5076N m22952l() {
        return isEmpty() ? new C5076N() : new C5076N(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        m22946e();
        AbstractC5063B.m22837a(obj);
        AbstractC5063B.m22837a(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        m22946e();
        m22944c(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        m22946e();
        return super.remove(obj);
    }

    private C5076N(Map map) {
        super(map);
        this.f19346a = true;
    }
}
