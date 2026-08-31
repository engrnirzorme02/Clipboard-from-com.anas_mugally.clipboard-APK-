package p354t0;

import androidx.concurrent.futures.AbstractC2405c;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC6118n;
import kotlin.jvm.internal.AbstractC6119o;
import p145S5.C1444v;
import p157U3.InterfaceFutureC1673e;
import p238e6.InterfaceC5367l;
import p318o6.InterfaceC6639V;

/* JADX INFO: renamed from: t0.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7069b {

    /* JADX INFO: renamed from: t0.b$a */
    static final class a extends AbstractC6119o implements InterfaceC5367l {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ AbstractC2405c.a f28230a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC6639V f28231b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC2405c.a aVar, InterfaceC6639V interfaceC6639V) {
            super(1);
            this.f28230a = aVar;
            this.f28231b = interfaceC6639V;
        }

        /* JADX INFO: renamed from: a */
        public final void m31169a(Throwable th) {
            if (th == null) {
                this.f28230a.m10344c(this.f28231b.getCompleted());
            } else if (th instanceof CancellationException) {
                this.f28230a.m10345d();
            } else {
                this.f28230a.m10346f(th);
            }
        }

        @Override // p238e6.InterfaceC5367l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m31169a((Throwable) obj);
            return C1444v.f4971a;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceFutureC1673e m31166b(final InterfaceC6639V interfaceC6639V, final Object obj) {
        AbstractC6118n.m27187e(interfaceC6639V, "<this>");
        InterfaceFutureC1673e interfaceFutureC1673eM10340a = AbstractC2405c.m10340a(new AbstractC2405c.c() { // from class: t0.a
            @Override // androidx.concurrent.futures.AbstractC2405c.c
            public final Object attachCompleter(AbstractC2405c.a aVar) {
                return AbstractC7069b.m31168d(interfaceC6639V, obj, aVar);
            }
        });
        AbstractC6118n.m27186d(interfaceFutureC1673eM10340a, "getFuture { completer ->…      }\n        tag\n    }");
        return interfaceFutureC1673eM10340a;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceFutureC1673e m31167c(InterfaceC6639V interfaceC6639V, Object obj, int i7, Object obj2) {
        if ((i7 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return m31166b(interfaceC6639V, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final Object m31168d(InterfaceC6639V this_asListenableFuture, Object obj, AbstractC2405c.a completer) {
        AbstractC6118n.m27187e(this_asListenableFuture, "$this_asListenableFuture");
        AbstractC6118n.m27187e(completer, "completer");
        this_asListenableFuture.invokeOnCompletion(new a(completer, this_asListenableFuture));
        return obj;
    }
}
