package p174X;

import java.io.File;
import java.util.List;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.AbstractC6119o;
import p152T5.AbstractC1638q;
import p181Y.C2008a;
import p181Y.C2009b;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5367l;
import p318o6.InterfaceC6624N;

/* JADX INFO: renamed from: X.y */
/* JADX INFO: loaded from: classes.dex */
public final class C1921y {

    /* JADX INFO: renamed from: a */
    public static final C1921y f6360a = new C1921y();

    /* JADX INFO: renamed from: X.y$a */
    static final class a extends AbstractC6119o implements InterfaceC5367l {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC6624N f6361a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6624N interfaceC6624N) {
            super(1);
            this.f6361a = interfaceC6624N;
        }

        @Override // p238e6.InterfaceC5367l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1916t invoke(File it) {
            AbstractC6118n.m27187e(it, "it");
            return new C1920x(this.f6361a.mo12635Q(), it);
        }
    }

    private C1921y() {
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC1905i m7952a(InterfaceC1885E serializer, C2009b c2009b, List migrations, InterfaceC6624N scope, InterfaceC5356a produceFile) {
        AbstractC6118n.m27187e(serializer, "serializer");
        AbstractC6118n.m27187e(migrations, "migrations");
        AbstractC6118n.m27187e(scope, "scope");
        AbstractC6118n.m27187e(produceFile, "produceFile");
        C1911o c1911o = new C1911o(serializer, new a(scope), produceFile);
        List listD = AbstractC1638q.m6759d(AbstractC1904h.f6107a.m7846b(migrations));
        InterfaceC1901e c2008a = c2009b;
        if (c2009b == null) {
            c2008a = new C2008a();
        }
        return new C1907k(c1911o, listD, c2008a, scope);
    }
}
