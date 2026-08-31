package p360t6;

import p145S5.AbstractC1423a;
import p173W5.InterfaceC1879i;
import p238e6.InterfaceC5367l;
import p318o6.AbstractC6622M;

/* JADX INFO: renamed from: t6.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7139w {
    /* JADX INFO: renamed from: a */
    public static final void m31515a(InterfaceC5367l interfaceC5367l, Object obj, InterfaceC1879i interfaceC1879i) {
        C7116P c7116pM31516b = m31516b(interfaceC5367l, obj, null);
        if (c7116pM31516b != null) {
            AbstractC6622M.m28096a(interfaceC1879i, c7116pM31516b);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C7116P m31516b(InterfaceC5367l interfaceC5367l, Object obj, C7116P c7116p) {
        try {
            interfaceC5367l.invoke(obj);
            return c7116p;
        } catch (Throwable th) {
            if (c7116p != null && c7116p.getCause() != th) {
                AbstractC1423a.m6060a(c7116p, th);
                return c7116p;
            }
            return new C7116P("Exception in undelivered element handler for " + obj, th);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C7116P m31517c(InterfaceC5367l interfaceC5367l, Object obj, C7116P c7116p, int i7, Object obj2) {
        if ((i7 & 2) != 0) {
            c7116p = null;
        }
        return m31516b(interfaceC5367l, obj, c7116p);
    }
}
