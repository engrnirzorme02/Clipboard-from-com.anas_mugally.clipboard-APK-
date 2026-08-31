package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.TopicsManager;
import androidx.privacysandbox.ads.adservices.measurement.ExecutorC2688k;
import kotlin.coroutines.jvm.internal.AbstractC6089d;
import kotlin.coroutines.jvm.internal.AbstractC6093h;
import kotlin.jvm.internal.AbstractC6118n;
import p081K.AbstractC0722n;
import p145S5.AbstractC1437o;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p318o6.C6682p;

/* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.topics.F */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2698F extends AbstractC2719u {

    /* JADX INFO: renamed from: b */
    private final TopicsManager f10637b;

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.topics.F$a */
    static final class a extends AbstractC6089d {

        /* JADX INFO: renamed from: a */
        Object f10638a;

        /* JADX INFO: renamed from: b */
        /* synthetic */ Object f10639b;

        /* JADX INFO: renamed from: d */
        int f10641d;

        a(InterfaceC1875e interfaceC1875e) {
            super(interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            this.f10639b = obj;
            this.f10641d |= Integer.MIN_VALUE;
            return AbstractC2698F.m12805e(AbstractC2698F.this, null, this);
        }
    }

    public AbstractC2698F(TopicsManager mTopicsManager) {
        AbstractC6118n.m27187e(mTopicsManager, "mTopicsManager");
        this.f10637b = mTopicsManager;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    static /* synthetic */ Object m12805e(AbstractC2698F abstractC2698F, C2700b c2700b, InterfaceC1875e<? super C2706h> interfaceC1875e) {
        a aVar;
        if (interfaceC1875e instanceof a) {
            aVar = (a) interfaceC1875e;
            int i7 = aVar.f10641d;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                aVar.f10641d = i7 - Integer.MIN_VALUE;
            } else {
                aVar = abstractC2698F.new a(interfaceC1875e);
            }
        } else {
            aVar = abstractC2698F.new a(interfaceC1875e);
        }
        Object objM12806f = aVar.f10639b;
        Object objE = AbstractC2005b.m8369e();
        int i8 = aVar.f10641d;
        if (i8 == 0) {
            AbstractC1437o.m6082b(objM12806f);
            GetTopicsRequest getTopicsRequestMo12800c = abstractC2698F.mo12800c(c2700b);
            aVar.f10638a = abstractC2698F;
            aVar.f10641d = 1;
            objM12806f = abstractC2698F.m12806f(getTopicsRequestMo12800c, aVar);
            if (objM12806f == objE) {
                return objE;
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC2698F = (AbstractC2698F) aVar.f10638a;
            AbstractC1437o.m6082b(objM12806f);
        }
        return abstractC2698F.mo12801d(AbstractC2696D.m12802a(objM12806f));
    }

    /* JADX INFO: renamed from: f */
    private final Object m12806f(GetTopicsRequest getTopicsRequest, InterfaceC1875e interfaceC1875e) {
        C6682p c6682p = new C6682p(AbstractC2005b.m8367c(interfaceC1875e), 1);
        c6682p.m28263E();
        this.f10637b.getTopics(getTopicsRequest, new ExecutorC2688k(), AbstractC0722n.m3485a(c6682p));
        Object objM28273y = c6682p.m28273y();
        if (objM28273y == AbstractC2005b.m8369e()) {
            AbstractC6093h.m27135c(interfaceC1875e);
        }
        return objM28273y;
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.AbstractC2719u
    /* JADX INFO: renamed from: a */
    public Object mo12807a(C2700b c2700b, InterfaceC1875e<? super C2706h> interfaceC1875e) {
        return m12805e(this, c2700b, interfaceC1875e);
    }

    /* JADX INFO: renamed from: c */
    public GetTopicsRequest mo12800c(C2700b request) {
        AbstractC6118n.m27187e(request, "request");
        return C2705g.f10649a.m12818b(request);
    }

    /* JADX INFO: renamed from: d */
    public C2706h mo12801d(GetTopicsResponse response) {
        AbstractC6118n.m27187e(response, "response");
        return C2717s.f10652a.m12830a(response);
    }
}
