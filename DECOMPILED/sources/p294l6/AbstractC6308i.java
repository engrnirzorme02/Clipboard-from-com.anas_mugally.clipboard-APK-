package p294l6;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC6118n;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: l6.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6308i {

    /* JADX INFO: renamed from: l6.i$a */
    public static final class a implements InterfaceC6304e {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC5371p f24114a;

        public a(InterfaceC5371p interfaceC5371p) {
            this.f24114a = interfaceC5371p;
        }

        @Override // p294l6.InterfaceC6304e
        public Iterator iterator() {
            return AbstractC6308i.m27236a(this.f24114a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static Iterator m27236a(InterfaceC5371p block) {
        AbstractC6118n.m27187e(block, "block");
        C6305f c6305f = new C6305f();
        c6305f.m27235k(AbstractC2005b.m8365a(block, c6305f, c6305f));
        return c6305f;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC6304e m27237b(InterfaceC5371p block) {
        AbstractC6118n.m27187e(block, "block");
        return new a(block);
    }
}
