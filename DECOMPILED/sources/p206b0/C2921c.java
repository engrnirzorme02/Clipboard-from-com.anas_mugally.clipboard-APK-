package p206b0;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.AbstractC6119o;
import p145S5.C1435m;
import p152T5.AbstractC1610H;
import p152T5.AbstractC1631j;
import p152T5.AbstractC1638q;
import p238e6.InterfaceC5367l;
import p278j6.AbstractC5905g;

/* JADX INFO: renamed from: b0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2921c extends AbstractC2924f {

    /* JADX INFO: renamed from: a */
    private final Map f12034a;

    /* JADX INFO: renamed from: b */
    private final C2920b f12035b;

    /* JADX INFO: renamed from: b0.c$a */
    static final class a extends AbstractC6119o implements InterfaceC5367l {

        /* JADX INFO: renamed from: a */
        public static final a f12036a = new a();

        a() {
            super(1);
        }

        @Override // p238e6.InterfaceC5367l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Map.Entry entry) {
            AbstractC6118n.m27187e(entry, "entry");
            Object value = entry.getValue();
            return "  " + ((AbstractC2924f.a) entry.getKey()).m14668a() + " = " + (value instanceof byte[] ? AbstractC1631j.m6716M((byte[]) value, ", ", "[", "]", 0, null, null, 56, null) : String.valueOf(entry.getValue()));
        }
    }

    public /* synthetic */ C2921c(Map map, boolean z7, int i7, AbstractC6112h abstractC6112h) {
        this((i7 & 1) != 0 ? new LinkedHashMap() : map, (i7 & 2) != 0 ? true : z7);
    }

    @Override // p206b0.AbstractC2924f
    /* JADX INFO: renamed from: a */
    public Map mo14653a() {
        C1435m c1435m;
        Set<Map.Entry> setEntrySet = this.f12034a.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC5905g.m26654b(AbstractC1610H.m6623e(AbstractC1638q.m6774s(setEntrySet, 10)), 16));
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                AbstractC6118n.m27186d(bArrCopyOf, "copyOf(this, size)");
                c1435m = new C1435m(key, bArrCopyOf);
            } else {
                c1435m = new C1435m(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(c1435m.m6070c(), c1435m.m6071d());
        }
        return AbstractC2919a.m14650b(linkedHashMap);
    }

    @Override // p206b0.AbstractC2924f
    /* JADX INFO: renamed from: b */
    public Object mo14654b(AbstractC2924f.a key) {
        AbstractC6118n.m27187e(key, "key");
        Object obj = this.f12034a.get(key);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        AbstractC6118n.m27186d(bArrCopyOf, "copyOf(this, size)");
        return bArrCopyOf;
    }

    /* JADX INFO: renamed from: e */
    public final void m14655e() {
        if (this.f12035b.m14651a()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0063  */
    public boolean equals(Object obj) {
        boolean zM27183a;
        if (!(obj instanceof C2921c)) {
            return false;
        }
        C2921c c2921c = (C2921c) obj;
        Map map = c2921c.f12034a;
        if (map == this.f12034a) {
            return true;
        }
        if (map.size() != this.f12034a.size()) {
            return false;
        }
        Map map2 = c2921c.f12034a;
        if (map2.isEmpty()) {
            return true;
        }
        for (Map.Entry entry : map2.entrySet()) {
            Object obj2 = this.f12034a.get(entry.getKey());
            if (obj2 != null) {
                Object value = entry.getValue();
                if (!(value instanceof byte[])) {
                    zM27183a = AbstractC6118n.m27183a(value, obj2);
                } else if ((obj2 instanceof byte[]) && Arrays.equals((byte[]) value, (byte[]) obj2)) {
                    zM27183a = true;
                } else {
                    zM27183a = false;
                }
            } else {
                zM27183a = false;
            }
            if (!zM27183a) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final void m14656f() {
        this.f12035b.m14652b(true);
    }

    /* JADX INFO: renamed from: g */
    public final void m14657g(AbstractC2924f.b... pairs) {
        AbstractC6118n.m27187e(pairs, "pairs");
        m14655e();
        if (pairs.length <= 0) {
            return;
        }
        AbstractC2924f.b bVar = pairs[0];
        throw null;
    }

    /* JADX INFO: renamed from: h */
    public final Object m14658h(AbstractC2924f.a key) {
        AbstractC6118n.m27187e(key, "key");
        m14655e();
        return this.f12034a.remove(key);
    }

    public int hashCode() {
        Iterator it = this.f12034a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public final void m14659i(AbstractC2924f.a key, Object obj) {
        AbstractC6118n.m27187e(key, "key");
        m14660j(key, obj);
    }

    /* JADX INFO: renamed from: j */
    public final void m14660j(AbstractC2924f.a key, Object obj) {
        AbstractC6118n.m27187e(key, "key");
        m14655e();
        if (obj == null) {
            m14658h(key);
            return;
        }
        if (obj instanceof Set) {
            this.f12034a.put(key, AbstractC2919a.m14649a((Set) obj));
            return;
        }
        if (!(obj instanceof byte[])) {
            this.f12034a.put(key, obj);
            return;
        }
        Map map = this.f12034a;
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        AbstractC6118n.m27186d(bArrCopyOf, "copyOf(this, size)");
        map.put(key, bArrCopyOf);
    }

    public String toString() {
        return AbstractC1638q.m6578R(this.f12034a.entrySet(), ",\n", "{\n", "\n}", 0, null, a.f12036a, 24, null);
    }

    public C2921c(Map preferencesMap, boolean z7) {
        AbstractC6118n.m27187e(preferencesMap, "preferencesMap");
        this.f12034a = preferencesMap;
        this.f12035b = new C2920b(z7);
    }
}
