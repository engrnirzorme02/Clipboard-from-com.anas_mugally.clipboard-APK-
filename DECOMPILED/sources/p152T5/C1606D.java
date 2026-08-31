package p152T5;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6118n;
import p246f6.InterfaceC5442a;

/* JADX INFO: renamed from: T5.D */
/* JADX INFO: loaded from: classes.dex */
final class C1606D implements Map, Serializable, InterfaceC5442a {

    /* JADX INFO: renamed from: a */
    public static final C1606D f5367a = new C1606D();

    private C1606D() {
    }

    /* JADX INFO: renamed from: a */
    public boolean m6608a(Void value) {
        AbstractC6118n.m27187e(value, "value");
        return false;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Void get(Object obj) {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public Set m6610c() {
        return C1607E.f5368a;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return m6608a((Void) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public Set m6611d() {
        return C1607E.f5368a;
    }

    /* JADX INFO: renamed from: e */
    public int m6612e() {
        return 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return m6610c();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    /* JADX INFO: renamed from: f */
    public Collection m6613f() {
        return C1605C.f5366a;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return m6611d();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m6612e();
    }

    public String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return m6613f();
    }
}
