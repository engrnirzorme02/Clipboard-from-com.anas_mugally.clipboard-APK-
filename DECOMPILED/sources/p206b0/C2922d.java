package p206b0;

import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p174X.InterfaceC1905i;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p344r6.InterfaceC6918c;

/* JADX INFO: renamed from: b0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2922d implements InterfaceC1905i {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1905i f12037a;

    /* JADX INFO: renamed from: b0.d$a */
    static final class a extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f12038a;

        /* JADX INFO: renamed from: b */
        /* synthetic */ Object f12039b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC5371p f12040c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC5371p interfaceC5371p, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f12040c = interfaceC5371p;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            a aVar = new a(this.f12040c, interfaceC1875e);
            aVar.f12039b = obj;
            return aVar;
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC2924f abstractC2924f, InterfaceC1875e interfaceC1875e) {
            return ((a) create(abstractC2924f, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f12038a;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                AbstractC2924f abstractC2924f = (AbstractC2924f) this.f12039b;
                InterfaceC5371p interfaceC5371p = this.f12040c;
                this.f12038a = 1;
                obj = interfaceC5371p.invoke(abstractC2924f, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
            }
            AbstractC2924f abstractC2924f2 = (AbstractC2924f) obj;
            AbstractC6118n.m27185c(abstractC2924f2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
            ((C2921c) abstractC2924f2).m14656f();
            return abstractC2924f2;
        }
    }

    public C2922d(InterfaceC1905i delegate) {
        AbstractC6118n.m27187e(delegate, "delegate");
        this.f12037a = delegate;
    }

    @Override // p174X.InterfaceC1905i
    /* JADX INFO: renamed from: a */
    public Object mo7850a(InterfaceC5371p interfaceC5371p, InterfaceC1875e interfaceC1875e) {
        return this.f12037a.mo7850a(new a(interfaceC5371p, null), interfaceC1875e);
    }

    @Override // p174X.InterfaceC1905i
    public InterfaceC6918c getData() {
        return this.f12037a.getData();
    }
}
