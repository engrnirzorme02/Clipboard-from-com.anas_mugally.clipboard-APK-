package p370v0;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.topics.AbstractC2719u;
import androidx.privacysandbox.ads.adservices.topics.C2700b;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6112h;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p157U3.InterfaceFutureC1673e;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p318o6.AbstractC6626O;
import p318o6.AbstractC6672k;
import p318o6.C6656c0;
import p318o6.InterfaceC6624N;
import p354t0.AbstractC7069b;

/* JADX INFO: renamed from: v0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7199a {

    /* JADX INFO: renamed from: a */
    public static final b f28709a = new b(null);

    /* JADX INFO: renamed from: v0.a$a */
    private static final class a extends AbstractC7199a {

        /* JADX INFO: renamed from: b */
        private final AbstractC2719u f28710b;

        /* JADX INFO: renamed from: v0.a$a$a, reason: collision with other inner class name */
        static final class C7728a extends AbstractC6097l implements InterfaceC5371p {

            /* JADX INFO: renamed from: a */
            int f28711a;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ C2700b f28713c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C7728a(C2700b c2700b, InterfaceC1875e interfaceC1875e) {
                super(2, interfaceC1875e);
                this.f28713c = c2700b;
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
                return a.this.new C7728a(this.f28713c, interfaceC1875e);
            }

            @Override // p238e6.InterfaceC5371p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
                return ((C7728a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
            }

            @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
            public final Object invokeSuspend(Object obj) {
                Object objE = AbstractC2005b.m8369e();
                int i7 = this.f28711a;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1437o.m6082b(obj);
                    return obj;
                }
                AbstractC1437o.m6082b(obj);
                AbstractC2719u abstractC2719u = a.this.f28710b;
                C2700b c2700b = this.f28713c;
                this.f28711a = 1;
                Object objMo12807a = abstractC2719u.mo12807a(c2700b, this);
                return objMo12807a == objE ? objE : objMo12807a;
            }
        }

        public a(AbstractC2719u mTopicsManager) {
            AbstractC6118n.m27187e(mTopicsManager, "mTopicsManager");
            this.f28710b = mTopicsManager;
        }

        @Override // p370v0.AbstractC7199a
        /* JADX INFO: renamed from: b */
        public InterfaceFutureC1673e mo31770b(C2700b request) {
            AbstractC6118n.m27187e(request, "request");
            return AbstractC7069b.m31167c(AbstractC6672k.m28225b(AbstractC6626O.m28098a(C6656c0.m28164c()), null, null, new C7728a(request, null), 3, null), null, 1, null);
        }
    }

    /* JADX INFO: renamed from: v0.a$b */
    public static final class b {
        public /* synthetic */ b(AbstractC6112h abstractC6112h) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC7199a m31773a(Context context) {
            AbstractC6118n.m27187e(context, "context");
            AbstractC2719u abstractC2719uM12835a = AbstractC2719u.f10656a.m12835a(context);
            if (abstractC2719uM12835a != null) {
                return new a(abstractC2719uM12835a);
            }
            return null;
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: a */
    public static final AbstractC7199a m31769a(Context context) {
        return f28709a.m31773a(context);
    }

    /* JADX INFO: renamed from: b */
    public abstract InterfaceFutureC1673e mo31770b(C2700b c2700b);
}
