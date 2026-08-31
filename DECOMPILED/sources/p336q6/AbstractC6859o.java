package p336q6;

import kotlin.coroutines.jvm.internal.AbstractC6097l;
import p145S5.AbstractC1437o;
import p145S5.C1436n;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p238e6.InterfaceC5371p;
import p318o6.AbstractC6670j;
import p318o6.InterfaceC6624N;

/* JADX INFO: renamed from: q6.o */
/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class AbstractC6859o {

    /* JADX INFO: renamed from: q6.o$a */
    static final class a extends AbstractC6097l implements InterfaceC5371p {

        /* JADX INFO: renamed from: a */
        int f27486a;

        /* JADX INFO: renamed from: b */
        private /* synthetic */ Object f27487b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC6868x f27488c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ Object f27489d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC6868x interfaceC6868x, Object obj, InterfaceC1875e interfaceC1875e) {
            super(2, interfaceC1875e);
            this.f27488c = interfaceC6868x;
            this.f27489d = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final InterfaceC1875e create(Object obj, InterfaceC1875e interfaceC1875e) {
            a aVar = new a(this.f27488c, this.f27489d, interfaceC1875e);
            aVar.f27487b = obj;
            return aVar;
        }

        @Override // p238e6.InterfaceC5371p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC6624N interfaceC6624N, InterfaceC1875e interfaceC1875e) {
            return ((a) create(interfaceC6624N, interfaceC1875e)).invokeSuspend(C1444v.f4971a);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            Object objM6073b;
            Object objE = AbstractC2005b.m8369e();
            int i7 = this.f27486a;
            try {
                if (i7 == 0) {
                    AbstractC1437o.m6082b(obj);
                    InterfaceC6868x interfaceC6868x = this.f27488c;
                    Object obj2 = this.f27489d;
                    C1436n.a aVar = C1436n.f4958b;
                    this.f27486a = 1;
                    if (interfaceC6868x.mo29980i(obj2, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1437o.m6082b(obj);
                }
                objM6073b = C1436n.m6073b(C1444v.f4971a);
            } catch (Throwable th) {
                C1436n.a aVar2 = C1436n.f4958b;
                objM6073b = C1436n.m6073b(AbstractC1437o.m6081a(th));
            }
            return C6855k.m30032b(C1436n.m6078g(objM6073b) ? C6855k.f27480b.m30044c(C1444v.f4971a) : C6855k.f27480b.m30042a(C1436n.m6075d(objM6073b)));
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Object m30062a(InterfaceC6868x interfaceC6868x, Object obj) {
        Object objMo29982k = interfaceC6868x.mo29982k(obj);
        if (objMo29982k instanceof C6855k.c) {
            return ((C6855k) AbstractC6670j.m28200b(null, new a(interfaceC6868x, obj, null), 1, null)).m30041k();
        }
        return C6855k.f27480b.m30044c(C1444v.f4971a);
    }
}
