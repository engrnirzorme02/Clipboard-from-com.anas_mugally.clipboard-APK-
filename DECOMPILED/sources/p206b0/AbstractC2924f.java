package p206b0;

import java.util.Map;
import kotlin.jvm.internal.AbstractC6118n;
import p152T5.AbstractC1610H;

/* JADX INFO: renamed from: b0.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2924f {

    /* JADX INFO: renamed from: b0.f$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final String f12043a;

        public a(String name) {
            AbstractC6118n.m27187e(name, "name");
            this.f12043a = name;
        }

        /* JADX INFO: renamed from: a */
        public final String m14668a() {
            return this.f12043a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return AbstractC6118n.m27183a(this.f12043a, ((a) obj).f12043a);
            }
            return false;
        }

        public int hashCode() {
            return this.f12043a.hashCode();
        }

        public String toString() {
            return this.f12043a;
        }
    }

    /* JADX INFO: renamed from: b0.f$b */
    public static final class b {
    }

    /* JADX INFO: renamed from: a */
    public abstract Map mo14653a();

    /* JADX INFO: renamed from: b */
    public abstract Object mo14654b(a aVar);

    /* JADX INFO: renamed from: c */
    public final C2921c m14666c() {
        return new C2921c(AbstractC1610H.m6638t(mo14653a()), false);
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC2924f m14667d() {
        return new C2921c(AbstractC1610H.m6638t(mo14653a()), true);
    }
}
