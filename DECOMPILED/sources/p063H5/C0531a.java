package p063H5;

import java.util.IdentityHashMap;
import java.util.Map;
import p122P3.AbstractC1205i;

/* JADX INFO: renamed from: H5.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0531a {

    /* JADX INFO: renamed from: b */
    private static final IdentityHashMap f1993b;

    /* JADX INFO: renamed from: c */
    public static final C0531a f1994c;

    /* JADX INFO: renamed from: a */
    private final IdentityHashMap f1995a;

    /* JADX INFO: renamed from: H5.a$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private C0531a f1996a;

        /* JADX INFO: renamed from: b */
        private IdentityHashMap f1997b;

        /* JADX INFO: renamed from: b */
        private IdentityHashMap m2315b(int i7) {
            if (this.f1997b == null) {
                this.f1997b = new IdentityHashMap(i7);
            }
            return this.f1997b;
        }

        /* JADX INFO: renamed from: a */
        public C0531a m2316a() {
            if (this.f1997b != null) {
                for (Map.Entry entry : this.f1996a.f1995a.entrySet()) {
                    if (!this.f1997b.containsKey(entry.getKey())) {
                        this.f1997b.put((c) entry.getKey(), entry.getValue());
                    }
                }
                this.f1996a = new C0531a(this.f1997b);
                this.f1997b = null;
            }
            return this.f1996a;
        }

        /* JADX INFO: renamed from: c */
        public b m2317c(c cVar) {
            if (this.f1996a.f1995a.containsKey(cVar)) {
                IdentityHashMap identityHashMap = new IdentityHashMap(this.f1996a.f1995a);
                identityHashMap.remove(cVar);
                this.f1996a = new C0531a(identityHashMap);
            }
            IdentityHashMap identityHashMap2 = this.f1997b;
            if (identityHashMap2 != null) {
                identityHashMap2.remove(cVar);
            }
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m2318d(c cVar, Object obj) {
            m2315b(1).put(cVar, obj);
            return this;
        }

        private b(C0531a c0531a) {
            this.f1996a = c0531a;
        }
    }

    /* JADX INFO: renamed from: H5.a$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        private final String f1998a;

        private c(String str) {
            this.f1998a = str;
        }

        /* JADX INFO: renamed from: a */
        public static c m2319a(String str) {
            return new c(str);
        }

        public String toString() {
            return this.f1998a;
        }
    }

    static {
        IdentityHashMap identityHashMap = new IdentityHashMap();
        f1993b = identityHashMap;
        f1994c = new C0531a(identityHashMap);
    }

    /* JADX INFO: renamed from: c */
    public static b m2312c() {
        return new b();
    }

    /* JADX INFO: renamed from: b */
    public Object m2313b(c cVar) {
        return this.f1995a.get(cVar);
    }

    /* JADX INFO: renamed from: d */
    public b m2314d() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0531a.class != obj.getClass()) {
            return false;
        }
        C0531a c0531a = (C0531a) obj;
        if (this.f1995a.size() != c0531a.f1995a.size()) {
            return false;
        }
        for (Map.Entry entry : this.f1995a.entrySet()) {
            if (!c0531a.f1995a.containsKey(entry.getKey()) || !AbstractC1205i.m5282a(entry.getValue(), c0531a.f1995a.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int iM5283b = 0;
        for (Map.Entry entry : this.f1995a.entrySet()) {
            iM5283b += AbstractC1205i.m5283b(entry.getKey(), entry.getValue());
        }
        return iM5283b;
    }

    public String toString() {
        return this.f1995a.toString();
    }

    private C0531a(IdentityHashMap identityHashMap) {
        this.f1995a = identityHashMap;
    }
}
