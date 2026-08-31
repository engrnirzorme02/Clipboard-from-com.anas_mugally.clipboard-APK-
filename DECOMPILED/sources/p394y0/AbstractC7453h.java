package p394y0;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6118n;
import p026D0.InterfaceC0180k;

/* JADX INFO: renamed from: y0.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7453h extends AbstractC7468w {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC7453h(AbstractC7462q database) {
        super(database);
        AbstractC6118n.m27187e(database, "database");
    }

    /* JADX INFO: renamed from: i */
    protected abstract void mo14849i(InterfaceC0180k interfaceC0180k, Object obj);

    /* JADX INFO: renamed from: j */
    public final int m33013j(Object obj) {
        InterfaceC0180k interfaceC0180kM33083b = m33083b();
        try {
            mo14849i(interfaceC0180kM33083b, obj);
            return interfaceC0180kM33083b.mo913y();
        } finally {
            m33085h(interfaceC0180kM33083b);
        }
    }

    /* JADX INFO: renamed from: k */
    public final int m33014k(Iterable entities) {
        AbstractC6118n.m27187e(entities, "entities");
        InterfaceC0180k interfaceC0180kM33083b = m33083b();
        try {
            Iterator it = entities.iterator();
            int iMo913y = 0;
            while (it.hasNext()) {
                mo14849i(interfaceC0180kM33083b, it.next());
                iMo913y += interfaceC0180kM33083b.mo913y();
            }
            m33085h(interfaceC0180kM33083b);
            return iMo913y;
        } catch (Throwable th) {
            m33085h(interfaceC0180kM33083b);
            throw th;
        }
    }
}
