package p196a0;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.AbstractC6119o;
import p152T5.AbstractC1638q;
import p181Y.C2009b;
import p238e6.InterfaceC5367l;
import p254g6.InterfaceC5519a;
import p318o6.AbstractC6626O;
import p318o6.AbstractC6634S0;
import p318o6.C6656c0;
import p318o6.InterfaceC6624N;

/* JADX INFO: renamed from: a0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2173a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: a0.a$a */
    public static final class a extends AbstractC6119o implements InterfaceC5367l {

        /* JADX INFO: renamed from: a */
        public static final a f7034a = new a();

        a() {
            super(1);
        }

        @Override // p238e6.InterfaceC5367l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List invoke(Context it) {
            AbstractC6118n.m27187e(it, "it");
            return AbstractC1638q.m6765j();
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC5519a m8795a(String name, C2009b c2009b, InterfaceC5367l produceMigrations, InterfaceC6624N scope) {
        AbstractC6118n.m27187e(name, "name");
        AbstractC6118n.m27187e(produceMigrations, "produceMigrations");
        AbstractC6118n.m27187e(scope, "scope");
        return new C2175c(name, c2009b, produceMigrations, scope);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC5519a m8796b(String str, C2009b c2009b, InterfaceC5367l interfaceC5367l, InterfaceC6624N interfaceC6624N, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            c2009b = null;
        }
        if ((i7 & 4) != 0) {
            interfaceC5367l = a.f7034a;
        }
        if ((i7 & 8) != 0) {
            interfaceC6624N = AbstractC6626O.m28098a(C6656c0.m28163b().plus(AbstractC6634S0.m28112b(null, 1, null)));
        }
        return m8795a(str, c2009b, interfaceC5367l, interfaceC6624N);
    }
}
