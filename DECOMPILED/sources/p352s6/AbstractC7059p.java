package p352s6;

import kotlin.jvm.internal.AbstractC6104G;
import kotlin.jvm.internal.AbstractC6116l;
import kotlin.jvm.internal.AbstractC6118n;
import p173W5.InterfaceC1875e;
import p238e6.InterfaceC5372q;
import p344r6.InterfaceC6919d;

/* JADX INFO: renamed from: s6.p */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7059p {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC5372q f28212a;

    /* JADX INFO: renamed from: s6.p$a */
    /* synthetic */ class a extends AbstractC6116l implements InterfaceC5372q {

        /* JADX INFO: renamed from: a */
        public static final a f28213a = new a();

        a() {
            super(3, InterfaceC6919d.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // p238e6.InterfaceC5372q
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object mo7830j(InterfaceC6919d interfaceC6919d, Object obj, InterfaceC1875e interfaceC1875e) {
            return interfaceC6919d.mo7892d(obj, interfaceC1875e);
        }
    }

    static {
        a aVar = a.f28213a;
        AbstractC6118n.m27185c(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f28212a = (InterfaceC5372q) AbstractC6104G.m27161d(aVar, 3);
    }
}
