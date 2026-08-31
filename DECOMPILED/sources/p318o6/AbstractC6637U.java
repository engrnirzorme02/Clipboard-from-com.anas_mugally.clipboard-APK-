package p318o6;

import p360t6.AbstractC7105E;
import p360t6.AbstractC7136t;

/* JADX INFO: renamed from: o6.U */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6637U {

    /* JADX INFO: renamed from: a */
    private static final boolean f24925a = AbstractC7105E.m31391f("kotlinx.coroutines.main.delay", false);

    /* JADX INFO: renamed from: b */
    private static final InterfaceC6643X f24926b = m28126b();

    /* JADX INFO: renamed from: a */
    public static final InterfaceC6643X m28125a() {
        return f24926b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    private static final InterfaceC6643X m28126b() {
        if (!f24925a) {
            return RunnableC6635T.f24923t;
        }
        AbstractC6615I0 abstractC6615I0M28164c = C6656c0.m28164c();
        return (AbstractC7136t.m31512c(abstractC6615I0M28164c) || !(abstractC6615I0M28164c instanceof InterfaceC6643X)) ? RunnableC6635T.f24923t : (InterfaceC6643X) abstractC6615I0M28164c;
    }
}
