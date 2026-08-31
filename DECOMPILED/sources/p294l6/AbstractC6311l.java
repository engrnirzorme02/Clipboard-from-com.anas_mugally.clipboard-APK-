package p294l6;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6118n;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5367l;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: l6.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6311l extends AbstractC6309j {

    /* JADX INFO: renamed from: l6.l$a */
    public static final class a implements InterfaceC6304e {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Iterator f24116a;

        public a(Iterator it) {
            this.f24116a = it;
        }

        @Override // p294l6.InterfaceC6304e
        public Iterator iterator() {
            return this.f24116a;
        }
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC6304e m27239d(Iterator it) {
        AbstractC6118n.m27187e(it, "<this>");
        return m27240e(new a(it));
    }

    /* JADX INFO: renamed from: e */
    public static final InterfaceC6304e m27240e(InterfaceC6304e interfaceC6304e) {
        AbstractC6118n.m27187e(interfaceC6304e, "<this>");
        return interfaceC6304e instanceof C6300a ? interfaceC6304e : new C6300a(interfaceC6304e);
    }

    /* JADX INFO: renamed from: f */
    public static InterfaceC6304e m27241f(final InterfaceC5356a nextFunction) {
        AbstractC6118n.m27187e(nextFunction, "nextFunction");
        return m27240e(new C6303d(nextFunction, new InterfaceC5367l() { // from class: l6.k
            @Override // p238e6.InterfaceC5367l
            public final Object invoke(Object obj) {
                return AbstractC6311l.m27242g(nextFunction, obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final Object m27242g(InterfaceC5356a interfaceC5356a, Object it) {
        AbstractC6118n.m27187e(it, "it");
        return interfaceC5356a.invoke();
    }
}
