package p180X5;

import kotlin.coroutines.jvm.internal.AbstractC6086a;
import kotlin.coroutines.jvm.internal.AbstractC6089d;
import kotlin.coroutines.jvm.internal.AbstractC6093h;
import kotlin.coroutines.jvm.internal.AbstractC6095j;
import kotlin.jvm.internal.AbstractC6104G;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1437o;
import p173W5.C1880j;
import p173W5.InterfaceC1875e;
import p173W5.InterfaceC1879i;
import p238e6.InterfaceC5371p;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: X5.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2006c {

    /* JADX INFO: renamed from: X5.c$a */
    public static final class a extends AbstractC6095j {

        /* JADX INFO: renamed from: a */
        private int f6671a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC5371p f6672b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Object f6673c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC1875e interfaceC1875e, InterfaceC5371p interfaceC5371p, Object obj) {
            super(interfaceC1875e);
            this.f6672b = interfaceC5371p;
            this.f6673c = obj;
            AbstractC6118n.m27185c(interfaceC1875e, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        protected Object invokeSuspend(Object obj) {
            int i7 = this.f6671a;
            if (i7 == 0) {
                this.f6671a = 1;
                AbstractC1437o.m6082b(obj);
                AbstractC6118n.m27185c(this.f6672b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((InterfaceC5371p) AbstractC6104G.m27161d(this.f6672b, 2)).invoke(this.f6673c, this);
            }
            if (i7 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f6671a = 2;
            AbstractC1437o.m6082b(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: X5.c$b */
    public static final class b extends AbstractC6089d {

        /* JADX INFO: renamed from: a */
        private int f6674a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC5371p f6675b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ Object f6676c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC1875e interfaceC1875e, InterfaceC1879i interfaceC1879i, InterfaceC5371p interfaceC5371p, Object obj) {
            super(interfaceC1875e, interfaceC1879i);
            this.f6675b = interfaceC5371p;
            this.f6676c = obj;
            AbstractC6118n.m27185c(interfaceC1875e, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        protected Object invokeSuspend(Object obj) {
            int i7 = this.f6674a;
            if (i7 == 0) {
                this.f6674a = 1;
                AbstractC1437o.m6082b(obj);
                AbstractC6118n.m27185c(this.f6675b, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((InterfaceC5371p) AbstractC6104G.m27161d(this.f6675b, 2)).invoke(this.f6676c, this);
            }
            if (i7 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f6674a = 2;
            AbstractC1437o.m6082b(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: X5.c$c */
    public static final class c extends AbstractC6095j {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC1875e interfaceC1875e) {
            super(interfaceC1875e);
            AbstractC6118n.m27185c(interfaceC1875e, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        protected Object invokeSuspend(Object obj) {
            AbstractC1437o.m6082b(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: X5.c$d */
    public static final class d extends AbstractC6089d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC1875e interfaceC1875e, InterfaceC1879i interfaceC1879i) {
            super(interfaceC1875e, interfaceC1879i);
            AbstractC6118n.m27185c(interfaceC1875e, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        protected Object invokeSuspend(Object obj) {
            AbstractC1437o.m6082b(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static InterfaceC1875e m8365a(InterfaceC5371p interfaceC5371p, Object obj, InterfaceC1875e completion) {
        AbstractC6118n.m27187e(interfaceC5371p, "<this>");
        AbstractC6118n.m27187e(completion, "completion");
        InterfaceC1875e<?> interfaceC1875eM27133a = AbstractC6093h.m27133a(completion);
        if (interfaceC5371p instanceof AbstractC6086a) {
            return ((AbstractC6086a) interfaceC5371p).create(obj, interfaceC1875eM27133a);
        }
        InterfaceC1879i context = interfaceC1875eM27133a.getContext();
        return context == C1880j.f6044a ? new a(interfaceC1875eM27133a, interfaceC5371p, obj) : new b(interfaceC1875eM27133a, context, interfaceC5371p, obj);
    }

    /* JADX INFO: renamed from: b */
    private static final InterfaceC1875e m8366b(InterfaceC1875e interfaceC1875e) {
        InterfaceC1879i context = interfaceC1875e.getContext();
        return context == C1880j.f6044a ? new c(interfaceC1875e) : new d(interfaceC1875e, context);
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC1875e m8367c(InterfaceC1875e interfaceC1875e) {
        InterfaceC1875e<Object> interfaceC1875eIntercepted;
        AbstractC6118n.m27187e(interfaceC1875e, "<this>");
        AbstractC6089d abstractC6089d = interfaceC1875e instanceof AbstractC6089d ? (AbstractC6089d) interfaceC1875e : null;
        return (abstractC6089d == null || (interfaceC1875eIntercepted = abstractC6089d.intercepted()) == null) ? interfaceC1875e : interfaceC1875eIntercepted;
    }

    /* JADX INFO: renamed from: d */
    public static Object m8368d(InterfaceC5371p interfaceC5371p, Object obj, InterfaceC1875e completion) {
        AbstractC6118n.m27187e(interfaceC5371p, "<this>");
        AbstractC6118n.m27187e(completion, "completion");
        return ((InterfaceC5371p) AbstractC6104G.m27161d(interfaceC5371p, 2)).invoke(obj, m8366b(AbstractC6093h.m27133a(completion)));
    }
}
