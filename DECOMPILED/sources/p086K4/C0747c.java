package p086K4;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: K4.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0747c {

    /* JADX INFO: renamed from: a */
    private final String f2925a;

    /* JADX INFO: renamed from: b */
    private final Map f2926b;

    /* JADX INFO: renamed from: K4.c$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        private final String f2927a;

        /* JADX INFO: renamed from: b */
        private Map f2928b = null;

        b(String str) {
            this.f2927a = str;
        }

        /* JADX INFO: renamed from: a */
        public C0747c m3512a() {
            return new C0747c(this.f2927a, this.f2928b == null ? Collections.EMPTY_MAP : Collections.unmodifiableMap(new HashMap(this.f2928b)));
        }

        /* JADX INFO: renamed from: b */
        public b m3513b(Annotation annotation) {
            if (this.f2928b == null) {
                this.f2928b = new HashMap();
            }
            this.f2928b.put(annotation.annotationType(), annotation);
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public static b m3508a(String str) {
        return new b(str);
    }

    /* JADX INFO: renamed from: d */
    public static C0747c m3509d(String str) {
        return new C0747c(str, Collections.EMPTY_MAP);
    }

    /* JADX INFO: renamed from: b */
    public String m3510b() {
        return this.f2925a;
    }

    /* JADX INFO: renamed from: c */
    public Annotation m3511c(Class cls) {
        return (Annotation) this.f2926b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0747c)) {
            return false;
        }
        C0747c c0747c = (C0747c) obj;
        return this.f2925a.equals(c0747c.f2925a) && this.f2926b.equals(c0747c.f2926b);
    }

    public int hashCode() {
        return (this.f2925a.hashCode() * 31) + this.f2926b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f2925a + ", properties=" + this.f2926b.values() + "}";
    }

    private C0747c(String str, Map map) {
        this.f2925a = str;
        this.f2926b = map;
    }
}
