package p344r6;

import kotlin.coroutines.jvm.internal.AbstractC6089d;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p352s6.C7058o;

/* JADX INFO: renamed from: r6.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6916a implements InterfaceC6918c {

    /* JADX INFO: renamed from: r6.a$a */
    static final class a extends AbstractC6089d {

        /* JADX INFO: renamed from: a */
        Object f27783a;

        /* JADX INFO: renamed from: b */
        /* synthetic */ Object f27784b;

        /* JADX INFO: renamed from: d */
        int f27786d;

        a(InterfaceC1875e interfaceC1875e) {
            super(interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            this.f27784b = obj;
            this.f27786d |= Integer.MIN_VALUE;
            return AbstractC6916a.this.mo7891a(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p344r6.InterfaceC6918c
    /* JADX INFO: renamed from: a */
    public final Object mo7891a(InterfaceC6919d interfaceC6919d, InterfaceC1875e interfaceC1875e) throws Throwable {
        a aVar;
        Throwable th;
        C7058o c7058o;
        if (interfaceC1875e instanceof a) {
            aVar = (a) interfaceC1875e;
            int i7 = aVar.f27786d;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                aVar.f27786d = i7 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC1875e);
            }
        } else {
            aVar = new a(interfaceC1875e);
        }
        Object obj = aVar.f27784b;
        Object objE = AbstractC2005b.m8369e();
        int i8 = aVar.f27786d;
        if (i8 != 0) {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7058o = (C7058o) aVar.f27783a;
            try {
                AbstractC1437o.m6082b(obj);
                c7058o.releaseIntercepted();
                return C1444v.f4971a;
            } catch (Throwable th2) {
                th = th2;
                c7058o.releaseIntercepted();
                throw th;
            }
        }
        AbstractC1437o.m6082b(obj);
        C7058o c7058o2 = new C7058o(interfaceC6919d, aVar.getContext());
        try {
            aVar.f27783a = c7058o2;
            aVar.f27786d = 1;
            if (mo30351d(c7058o2, aVar) == objE) {
                return objE;
            }
            c7058o = c7058o2;
            c7058o.releaseIntercepted();
            return C1444v.f4971a;
        } catch (Throwable th3) {
            th = th3;
            c7058o = c7058o2;
            c7058o.releaseIntercepted();
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract Object mo30351d(InterfaceC6919d interfaceC6919d, InterfaceC1875e interfaceC1875e);
}
