package p048F6;

import kotlin.jvm.internal.AbstractC6118n;
import p040E6.AbstractC0393b;

/* JADX INFO: renamed from: F6.A */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0435A {
    /* JADX INFO: renamed from: a */
    public static final C0465z m1871a(AbstractC0393b json, String source) {
        AbstractC6118n.m27187e(json, "json");
        AbstractC6118n.m27187e(source, "source");
        return !json.m1673c().m1676a() ? new C0465z(source) : new C0436B(source);
    }
}
