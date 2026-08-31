package p394y0;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6118n;
import p026D0.InterfaceC0180k;

/* JADX INFO: renamed from: y0.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7454i extends AbstractC7468w {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7454i(AbstractC7462q database) {
        super(database);
        AbstractC6118n.m27187e(database, "database");
    }

    /* JADX INFO: renamed from: i */
    protected abstract void mo7515i(InterfaceC0180k interfaceC0180k, Object obj);

    /* JADX INFO: renamed from: j */
    public final void m33015j(Iterable entities) {
        AbstractC6118n.m27187e(entities, "entities");
        InterfaceC0180k interfaceC0180kM33083b = m33083b();
        try {
            Iterator it = entities.iterator();
            while (it.hasNext()) {
                mo7515i(interfaceC0180kM33083b, it.next());
                interfaceC0180kM33083b.mo912J0();
            }
            m33085h(interfaceC0180kM33083b);
        } catch (Throwable th) {
            m33085h(interfaceC0180kM33083b);
            throw th;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m33016k(Object obj) {
        InterfaceC0180k interfaceC0180kM33083b = m33083b();
        try {
            mo7515i(interfaceC0180kM33083b, obj);
            interfaceC0180kM33083b.mo912J0();
        } finally {
            m33085h(interfaceC0180kM33083b);
        }
    }
}
