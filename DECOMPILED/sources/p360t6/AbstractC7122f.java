package p360t6;

import java.util.Iterator;
import p145S5.AbstractC1423a;
import p173W5.InterfaceC1879i;
import p318o6.AbstractC6622M;
import p318o6.InterfaceC6620L;

/* JADX INFO: renamed from: t6.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7122f {
    /* JADX INFO: renamed from: a */
    public static final void m31448a(InterfaceC1879i interfaceC1879i, Throwable th) {
        Iterator it = AbstractC7121e.m31446a().iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC6620L) it.next()).mo28095n(interfaceC1879i, th);
            } catch (Throwable th2) {
                AbstractC7121e.m31447b(AbstractC6622M.m28097b(th, th2));
            }
        }
        try {
            AbstractC1423a.m6060a(th, new C7123g(interfaceC1879i));
        } catch (Throwable unused) {
        }
        AbstractC7121e.m31447b(th);
    }
}
