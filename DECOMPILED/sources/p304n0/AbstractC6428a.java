package p304n0;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: n0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6428a {

    /* JADX INFO: renamed from: b */
    public static final a f24470b = new a(null);

    /* JADX INFO: renamed from: a */
    private final Map f24471a = new LinkedHashMap();

    /* JADX INFO: renamed from: n0.a$a */
    public static final class a {
        public /* synthetic */ a(AbstractC6112h abstractC6112h) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: n0.a$b */
    public static final class b extends AbstractC6428a {

        /* JADX INFO: renamed from: c */
        public static final b f24472c = new b();

        private b() {
        }

        @Override // p304n0.AbstractC6428a
        /* JADX INFO: renamed from: a */
        public Object mo27640a(c key) {
            AbstractC6118n.m27187e(key, "key");
            return null;
        }
    }

    /* JADX INFO: renamed from: n0.a$c */
    public interface c {
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo27640a(c cVar);

    /* JADX INFO: renamed from: b */
    public final Map m27641b() {
        return this.f24471a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof AbstractC6428a) && AbstractC6118n.m27183a(this.f24471a, ((AbstractC6428a) obj).f24471a);
    }

    public int hashCode() {
        return this.f24471a.hashCode();
    }

    public String toString() {
        return "CreationExtras(extras=" + this.f24471a + ')';
    }
}
