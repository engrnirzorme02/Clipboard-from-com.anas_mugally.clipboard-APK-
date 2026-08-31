package p206b0;

import kotlin.coroutines.jvm.internal.AbstractC6097l;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p174X.InterfaceC1905i;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;

/* JADX INFO: renamed from: b0.j */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2928j {

    /* JADX INFO: renamed from: b0.j$a */
    static final class a extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f12046a;

        /* JADX INFO: renamed from: b */
        /* synthetic */ Object f12047b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC5371p f12048c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC5371p interfaceC5371p, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f12048c = interfaceC5371p;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            a aVar = new a(this.f12048c, interfaceC1875e);
            aVar.f12047b = obj;
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
            int i7 = this.f12046a;
            if (i7 != 0) {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C2921c c2921c = (C2921c) this.f12047b;
                AbstractC1437o.m6082b(obj);
                return c2921c;
            }
            AbstractC1437o.m6082b(obj);
            C2921c c2921cM14666c = ((AbstractC2924f) this.f12047b).m14666c();
            InterfaceC5371p interfaceC5371p = this.f12048c;
            this.f12047b = c2921cM14666c;
            this.f12046a = 1;
            return interfaceC5371p.invoke(c2921cM14666c, this) == objE ? objE : c2921cM14666c;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Object m14683a(InterfaceC1905i interfaceC1905i, InterfaceC5371p interfaceC5371p, InterfaceC1875e interfaceC1875e) {
        return interfaceC1905i.mo7850a(new a(interfaceC5371p, null), interfaceC1875e);
    }
}
