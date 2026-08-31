package p352s6;

import com.google.android.gms.common.api.C3553a;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.AbstractC6097l;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p152T5.AbstractC1638q;
import p173W5.C1880j;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1879i;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p318o6.AbstractC6626O;
import p318o6.AbstractC6633S;
import p318o6.EnumC6628P;
import p318o6.InterfaceC6624N;
import p336q6.AbstractC6864t;
import p336q6.EnumC6845a;
import p336q6.InterfaceC6866v;
import p336q6.InterfaceC6867w;
import p344r6.AbstractC6920e;
import p344r6.InterfaceC6918c;
import p344r6.InterfaceC6919d;

/* JADX INFO: renamed from: s6.e */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7048e implements InterfaceC7054k {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1879i f28186a;

    /* JADX INFO: renamed from: b */
    public final int f28187b;

    /* JADX INFO: renamed from: c */
    public final EnumC6845a f28188c;

    /* JADX INFO: renamed from: s6.e$a */
    static final class a extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f28189a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Object f28190b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC6919d f28191c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ AbstractC7048e f28192d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6919d interfaceC6919d, AbstractC7048e abstractC7048e, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f28191c = interfaceC6919d;
            this.f28192d = abstractC7048e;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            a aVar = new a(this.f28191c, this.f28192d, interfaceC1875e);
            aVar.f28190b = obj;
            return aVar;
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f28189a;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                InterfaceC6624N interfaceC6624N = (InterfaceC6624N) this.f28190b;
                InterfaceC6919d interfaceC6919d = this.f28191c;
                InterfaceC6867w interfaceC6867wM31128j = this.f28192d.m31128j(interfaceC6624N);
                this.f28189a = 1;
                if (AbstractC6920e.m30362h(interfaceC6919d, interfaceC6867wM31128j, this) == objE) {
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

    /* JADX INFO: renamed from: s6.e$b */
    static final class b extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f28193a;

        /* JADX INFO: renamed from: b */
        /* synthetic */ Object f28194b;

        b(InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            b bVar = AbstractC7048e.this.new b(interfaceC1875e);
            bVar.f28194b = obj;
            return bVar;
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6866v interfaceC6866v, InterfaceC1875e interfaceC1875e) {
            return ((b) create(interfaceC6866v, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f28193a;
            if (i7 == 0) {
                AbstractC1437o.m6082b(obj);
                InterfaceC6866v interfaceC6866v = (InterfaceC6866v) this.f28194b;
                AbstractC7048e abstractC7048e = AbstractC7048e.this;
                this.f28193a = 1;
                if (abstractC7048e.mo30353f(interfaceC6866v, this) == objE) {
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

    public AbstractC7048e(InterfaceC1879i interfaceC1879i, int i7, EnumC6845a enumC6845a) {
        this.f28186a = interfaceC1879i;
        this.f28187b = i7;
        this.f28188c = enumC6845a;
    }

    /* JADX INFO: renamed from: e */
    static /* synthetic */ Object m31124e(AbstractC7048e abstractC7048e, InterfaceC6919d interfaceC6919d, InterfaceC1875e interfaceC1875e) {
        Object objM28102e = AbstractC6626O.m28102e(new a(interfaceC6919d, abstractC7048e, null), interfaceC1875e);
        return objM28102e == AbstractC2005b.m8369e() ? objM28102e : C1444v.f4971a;
    }

    @Override // p344r6.InterfaceC6918c
    /* JADX INFO: renamed from: a */
    public Object mo7891a(InterfaceC6919d interfaceC6919d, InterfaceC1875e interfaceC1875e) {
        return m31124e(this, interfaceC6919d, interfaceC1875e);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    @Override // p352s6.InterfaceC7054k
    /* JADX INFO: renamed from: c */
    public InterfaceC6918c mo30397c(InterfaceC1879i interfaceC1879i, int i7, EnumC6845a enumC6845a) {
        InterfaceC1879i interfaceC1879iPlus = interfaceC1879i.plus(this.f28186a);
        if (enumC6845a == EnumC6845a.SUSPEND) {
            int i8 = this.f28187b;
            if (i8 != -3) {
                if (i7 == -3) {
                    i7 = i8;
                } else if (i8 != -2) {
                    if (i7 == -2) {
                        i7 = i8;
                    } else {
                        i7 += i8;
                        if (i7 < 0) {
                            i7 = C3553a.e.API_PRIORITY_OTHER;
                        }
                    }
                }
            }
            enumC6845a = this.f28188c;
        }
        return (AbstractC6118n.m27183a(interfaceC1879iPlus, this.f28186a) && i7 == this.f28187b && enumC6845a == this.f28188c) ? this : mo30354g(interfaceC1879iPlus, i7, enumC6845a);
    }

    /* JADX INFO: renamed from: d */
    protected String m31125d() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    protected abstract Object mo30353f(InterfaceC6866v interfaceC6866v, InterfaceC1875e interfaceC1875e);

    /* JADX INFO: renamed from: g */
    protected abstract AbstractC7048e mo30354g(InterfaceC1879i interfaceC1879i, int i7, EnumC6845a enumC6845a);

    /* JADX INFO: renamed from: h */
    public final InterfaceC5371p m31126h() {
        return new b(null);
    }

    /* JADX INFO: renamed from: i */
    public final int m31127i() {
        int i7 = this.f28187b;
        if (i7 == -3) {
            return -2;
        }
        return i7;
    }

    /* JADX INFO: renamed from: j */
    public InterfaceC6867w m31128j(InterfaceC6624N interfaceC6624N) {
        return AbstractC6864t.m30070c(interfaceC6624N, this.f28186a, m31127i(), this.f28188c, EnumC6628P.ATOMIC, null, m31126h(), 16, null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strM31125d = m31125d();
        if (strM31125d != null) {
            arrayList.add(strM31125d);
        }
        if (this.f28186a != C1880j.f6044a) {
            arrayList.add("context=" + this.f28186a);
        }
        if (this.f28187b != -3) {
            arrayList.add("capacity=" + this.f28187b);
        }
        if (this.f28188c != EnumC6845a.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f28188c);
        }
        return AbstractC6633S.m28108a(this) + '[' + AbstractC1638q.m6578R(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
