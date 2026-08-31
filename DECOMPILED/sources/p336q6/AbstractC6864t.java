package p336q6;

import kotlin.coroutines.jvm.internal.AbstractC6089d;
import kotlin.coroutines.jvm.internal.AbstractC6093h;
import p145S5.AbstractC1437o;
import p145S5.C1436n;
import p145S5.C1444v;
import p173W5.C1880j;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1879i;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5356a;
import p238e6.InterfaceC5367l;
import p238e6.InterfaceC5371p;
import p318o6.AbstractC6614I;
import p318o6.C6682p;
import p318o6.EnumC6628P;
import p318o6.InterfaceC6624N;
import p318o6.InterfaceC6678n;
import p318o6.InterfaceC6701y0;

/* JADX INFO: renamed from: q6.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6864t {

    /* JADX INFO: renamed from: q6.t$a */
    static final class a extends AbstractC6089d {

        /* JADX INFO: renamed from: a */
        Object f27492a;

        /* JADX INFO: renamed from: b */
        Object f27493b;

        /* JADX INFO: renamed from: c */
        /* synthetic */ Object f27494c;

        /* JADX INFO: renamed from: d */
        int f27495d;

        a(InterfaceC1875e interfaceC1875e) {
            super(interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            this.f27494c = obj;
            this.f27495d |= Integer.MIN_VALUE;
            return AbstractC6864t.m30068a(null, null, this);
        }
    }

    /* JADX INFO: renamed from: q6.t$b */
    static final class b implements InterfaceC5367l {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InterfaceC6678n f27496a;

        b(InterfaceC6678n interfaceC6678n) {
            this.f27496a = interfaceC6678n;
        }

        /* JADX INFO: renamed from: a */
        public final void m30071a(Throwable th) {
            InterfaceC6678n interfaceC6678n = this.f27496a;
            C1436n.a aVar = C1436n.f4958b;
            interfaceC6678n.resumeWith(C1436n.m6073b(C1444v.f4971a));
        }

        @Override // p238e6.InterfaceC5367l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m30071a((Throwable) obj);
            return C1444v.f4971a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m30068a(InterfaceC6866v interfaceC6866v, InterfaceC5356a interfaceC5356a, InterfaceC1875e interfaceC1875e) {
        a aVar;
        if (interfaceC1875e instanceof a) {
            aVar = (a) interfaceC1875e;
            int i7 = aVar.f27495d;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                aVar.f27495d = i7 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC1875e);
            }
        } else {
            aVar = new a(interfaceC1875e);
        }
        Object obj = aVar.f27494c;
        Object objE = AbstractC2005b.m8369e();
        int i8 = aVar.f27495d;
        try {
            if (i8 == 0) {
                AbstractC1437o.m6082b(obj);
                if (aVar.getContext().get(InterfaceC6701y0.f24999p) != interfaceC6866v) {
                    throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                }
                aVar.f27492a = interfaceC6866v;
                aVar.f27493b = interfaceC5356a;
                aVar.f27495d = 1;
                C6682p c6682p = new C6682p(AbstractC2005b.m8367c(aVar), 1);
                c6682p.m28263E();
                interfaceC6866v.mo29981j(new b(c6682p));
                Object objM28273y = c6682p.m28273y();
                if (objM28273y == AbstractC2005b.m8369e()) {
                    AbstractC6093h.m27135c(aVar);
                }
                if (objM28273y == objE) {
                    return objE;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC5356a = (InterfaceC5356a) aVar.f27493b;
                AbstractC1437o.m6082b(obj);
            }
            interfaceC5356a.invoke();
            return C1444v.f4971a;
        } catch (Throwable th) {
            interfaceC5356a.invoke();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC6867w m30069b(InterfaceC6624N interfaceC6624N, InterfaceC1879i interfaceC1879i, int i7, EnumC6845a enumC6845a, EnumC6628P enumC6628P, InterfaceC5367l interfaceC5367l, InterfaceC5371p interfaceC5371p) {
        C6865u c6865u = new C6865u(AbstractC6614I.m28083k(interfaceC6624N, interfaceC1879i), AbstractC6854j.m30030b(i7, enumC6845a, null, 4, null));
        if (interfaceC5367l != null) {
            c6865u.invokeOnCompletion(interfaceC5367l);
        }
        c6865u.m28148M0(enumC6628P, c6865u, interfaceC5371p);
        return c6865u;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceC6867w m30070c(InterfaceC6624N interfaceC6624N, InterfaceC1879i interfaceC1879i, int i7, EnumC6845a enumC6845a, EnumC6628P enumC6628P, InterfaceC5367l interfaceC5367l, InterfaceC5371p interfaceC5371p, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            interfaceC1879i = C1880j.f6044a;
        }
        if ((i8 & 2) != 0) {
            i7 = 0;
        }
        if ((i8 & 4) != 0) {
            enumC6845a = EnumC6845a.SUSPEND;
        }
        if ((i8 & 8) != 0) {
            enumC6628P = EnumC6628P.DEFAULT;
        }
        if ((i8 & 16) != 0) {
            interfaceC5367l = null;
        }
        InterfaceC5367l interfaceC5367l2 = interfaceC5367l;
        return m30069b(interfaceC6624N, interfaceC1879i, i7, enumC6845a, enumC6628P, interfaceC5367l2, interfaceC5371p);
    }
}
