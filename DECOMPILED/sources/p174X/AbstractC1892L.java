package p174X;

import kotlin.coroutines.jvm.internal.AbstractC6097l;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5372q;

/* JADX INFO: renamed from: X.L */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1892L {

    /* JADX INFO: renamed from: X.L$a */
    static final class a extends AbstractC6097l implements InterfaceC5372q {

        /* JADX INFO: renamed from: a */
        int f6094a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Object f6095b;

        a(InterfaceC1875e interfaceC1875e) {
            super(3, interfaceC1875e);
        }

        /* JADX INFO: renamed from: g */
        public final Object m7829g(InterfaceC1883C interfaceC1883C, boolean z7, InterfaceC1875e interfaceC1875e) {
            a aVar = new a(interfaceC1875e);
            aVar.f6095b = interfaceC1883C;
            return aVar.invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f6094a;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1437o.m6082b(obj);
                return obj;
            }
            AbstractC1437o.m6082b(obj);
            InterfaceC1883C interfaceC1883C = (InterfaceC1883C) this.f6095b;
            this.f6094a = 1;
            Object objMo7799c = interfaceC1883C.mo7799c(this);
            return objMo7799c == objE ? objE : objMo7799c;
        }

        @Override // p238e6.InterfaceC5372q
        /* JADX INFO: renamed from: j */
        public /* bridge */ /* synthetic */ Object mo7830j(Object obj, Object obj2, Object obj3) {
            return m7829g((InterfaceC1883C) obj, ((Boolean) obj2).booleanValue(), (InterfaceC1875e) obj3);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Object m7828a(InterfaceC1891K interfaceC1891K, InterfaceC1875e interfaceC1875e) {
        return interfaceC1891K.mo7825b(new a(null), interfaceC1875e);
    }
}
