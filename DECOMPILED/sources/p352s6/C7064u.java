package p352s6;

import kotlin.coroutines.jvm.internal.AbstractC6097l;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1879i;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p344r6.InterfaceC6919d;
import p360t6.AbstractC7111K;

/* JADX INFO: renamed from: s6.u */
/* JADX INFO: loaded from: classes.dex */
final class C7064u implements InterfaceC6919d {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1879i f28218a;

    /* JADX INFO: renamed from: b */
    private final Object f28219b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC5371p f28220c;

    /* JADX INFO: renamed from: s6.u$a */
    static final class a extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f28221a;

        /* JADX INFO: renamed from: b */
        /* synthetic */ Object f28222b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC6919d f28223c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6919d interfaceC6919d, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f28223c = interfaceC6919d;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            a aVar = new a(this.f28223c, interfaceC1875e);
            aVar.f28222b = obj;
            return aVar;
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, InterfaceC1875e interfaceC1875e) {
            return ((a) create(obj, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f28221a;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                Object obj2 = this.f28222b;
                InterfaceC6919d interfaceC6919d = this.f28223c;
                this.f28221a = 1;
                if (interfaceC6919d.mo7892d(obj2, this) == objE) {
                    return objE;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
            }
            return C1444v.f4971a;
        }
    }

    public C7064u(InterfaceC6919d interfaceC6919d, InterfaceC1879i interfaceC1879i) {
        this.f28218a = interfaceC1879i;
        this.f28219b = AbstractC7111K.m31408g(interfaceC1879i);
        this.f28220c = new a(interfaceC6919d, null);
    }

    @Override // p344r6.InterfaceC6919d
    /* JADX INFO: renamed from: d */
    public Object mo7892d(Object obj, InterfaceC1875e interfaceC1875e) {
        Object objM31132b = AbstractC7049f.m31132b(this.f28218a, obj, this.f28219b, this.f28220c, interfaceC1875e);
        return objM31132b == AbstractC2005b.m8369e() ? objM31132b : C1444v.f4971a;
    }
}
