package p231e;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AbstractC6118n;

/* JADX INFO: renamed from: e.a */
/* JADX INFO: loaded from: classes.dex */
public final class C5248a {

    /* JADX INFO: renamed from: a */
    private final Set f20000a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b */
    private volatile Context f20001b;

    /* JADX INFO: renamed from: a */
    public final void m24244a(InterfaceC5249b listener) {
        AbstractC6118n.m27187e(listener, "listener");
        Context context = this.f20001b;
        if (context != null) {
            listener.mo9134a(context);
        }
        this.f20000a.add(listener);
    }

    /* JADX INFO: renamed from: b */
    public final void m24245b() {
        this.f20001b = null;
    }

    /* JADX INFO: renamed from: c */
    public final void m24246c(Context context) {
        AbstractC6118n.m27187e(context, "context");
        this.f20001b = context;
        Iterator it = this.f20000a.iterator();
        while (it.hasNext()) {
            ((InterfaceC5249b) it.next()).mo9134a(context);
        }
    }
}
