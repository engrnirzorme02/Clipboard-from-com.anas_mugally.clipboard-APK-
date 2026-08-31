package p164V3;

import android.content.Context;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: V3.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1769n {
    /* JADX INFO: renamed from: a */
    public static final C1762g m7418a(C1758c c1758c, String name) {
        AbstractC6118n.m27187e(c1758c, "<this>");
        AbstractC6118n.m27187e(name, "name");
        C1762g c1762gM7395n = C1762g.m7395n(name);
        AbstractC6118n.m27186d(c1762gM7395n, "getInstance(...)");
        return c1762gM7395n;
    }

    /* JADX INFO: renamed from: b */
    public static final C1762g m7419b(C1758c c1758c) {
        AbstractC6118n.m27187e(c1758c, "<this>");
        C1762g c1762gM7394m = C1762g.m7394m();
        AbstractC6118n.m27186d(c1762gM7394m, "getInstance(...)");
        return c1762gM7394m;
    }

    /* JADX INFO: renamed from: c */
    public static final C1762g m7420c(C1758c c1758c, Context context, C1771p options, String name) {
        AbstractC6118n.m27187e(c1758c, "<this>");
        AbstractC6118n.m27187e(context, "context");
        AbstractC6118n.m27187e(options, "options");
        AbstractC6118n.m27187e(name, "name");
        C1762g c1762gM7399u = C1762g.m7399u(context, options, name);
        AbstractC6118n.m27186d(c1762gM7399u, "initializeApp(...)");
        return c1762gM7399u;
    }
}
