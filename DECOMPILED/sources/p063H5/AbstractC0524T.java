package p063H5;

import java.util.Map;
import p122P3.AbstractC1203g;

/* JADX INFO: renamed from: H5.T */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0524T extends AbstractC0523S.c {

    /* JADX INFO: renamed from: a */
    private static final AbstractC0536c0.b f1967a = AbstractC0536c0.b.m2386a(new a());

    /* JADX INFO: renamed from: H5.T$a */
    private static final class a {
        a() {
        }

        public String toString() {
            return "service config is unused";
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract String mo2232b();

    /* JADX INFO: renamed from: c */
    public abstract int mo2233c();

    /* JADX INFO: renamed from: d */
    public abstract boolean mo2234d();

    /* JADX INFO: renamed from: e */
    public abstract AbstractC0536c0.b mo2235e(Map map);

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public final String toString() {
        return AbstractC1203g.m5267b(this).m5277d("policy", mo2232b()).m5275b("priority", mo2233c()).m5278e("available", mo2234d()).toString();
    }
}
