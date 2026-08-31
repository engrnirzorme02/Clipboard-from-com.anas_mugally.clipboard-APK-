package p344r6;

import kotlin.coroutines.jvm.internal.AbstractC6089d;
import p145S5.AbstractC1437o;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;
import p336q6.AbstractC6858n;
import p336q6.InterfaceC6853i;
import p336q6.InterfaceC6867w;

/* JADX INFO: renamed from: r6.g */
/* JADX INFO: loaded from: classes.dex */
abstract /* synthetic */ class AbstractC6922g {

    /* JADX INFO: renamed from: r6.g$a */
    static final class a extends AbstractC6089d {

        /* JADX INFO: renamed from: a */
        Object f27788a;

        /* JADX INFO: renamed from: b */
        Object f27789b;

        /* JADX INFO: renamed from: c */
        Object f27790c;

        /* JADX INFO: renamed from: d */
        boolean f27791d;

        /* JADX INFO: renamed from: e */
        /* synthetic */ Object f27792e;

        /* JADX INFO: renamed from: f */
        int f27793f;

        a(InterfaceC1875e interfaceC1875e) {
            super(interfaceC1875e);
        }

        @Override // kotlin.coroutines.jvm.internal.AbstractC6086a
        public final Object invokeSuspend(Object obj) {
            this.f27792e = obj;
            this.f27793f |= Integer.MIN_VALUE;
            return AbstractC6922g.m30375c(null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final Object m30374b(InterfaceC6919d interfaceC6919d, InterfaceC6867w interfaceC6867w, InterfaceC1875e interfaceC1875e) {
        Object objM30375c = m30375c(interfaceC6919d, interfaceC6867w, true, interfaceC1875e);
        return objM30375c == AbstractC2005b.m8369e() ? objM30375c : C1444v.f4971a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Code duplicated, block: B:27:0x0073  */
    /* JADX WARN: Code duplicated, block: B:30:0x007f A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0036, B:24:0x0062, B:28:0x0077, B:30:0x007f, B:20:0x0054, B:23:0x005e), top: B:42:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        if (r2.mo7892d(r9, r0) == r1) goto L32;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0091 -> B:14:0x0039). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m30375c(InterfaceC6919d interfaceC6919d, InterfaceC6867w interfaceC6867w, boolean z7, InterfaceC1875e interfaceC1875e) {
        a aVar;
        InterfaceC6853i it;
        InterfaceC6853i interfaceC6853i;
        InterfaceC6919d interfaceC6919d2;
        Object objMo29993a;
        if (interfaceC1875e instanceof a) {
            aVar = (a) interfaceC1875e;
            int i7 = aVar.f27793f;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                aVar.f27793f = i7 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC1875e);
            }
        } else {
            aVar = new a(interfaceC1875e);
        }
        Object obj = aVar.f27792e;
        Object objE = AbstractC2005b.m8369e();
        int i8 = aVar.f27793f;
        try {
            if (i8 == 0) {
                AbstractC1437o.m6082b(obj);
                AbstractC6920e.m30364j(interfaceC6919d);
                it = interfaceC6867w.iterator();
                aVar.f27788a = interfaceC6919d;
                aVar.f27789b = interfaceC6867w;
                aVar.f27790c = it;
                aVar.f27791d = z7;
                aVar.f27793f = 1;
                objMo29993a = it.mo29993a(aVar);
                if (objMo29993a == objE) {
                    interfaceC6919d2 = interfaceC6919d;
                    interfaceC6853i = it;
                    obj = objMo29993a;
                    if (!((Boolean) obj).booleanValue()) {
                        if (z7) {
                            AbstractC6858n.m30060a(interfaceC6867w, null);
                        }
                        return C1444v.f4971a;
                    }
                    Object next = interfaceC6853i.next();
                    aVar.f27788a = interfaceC6919d2;
                    aVar.f27789b = interfaceC6867w;
                    aVar.f27790c = interfaceC6853i;
                    aVar.f27791d = z7;
                    aVar.f27793f = 2;
                }
                return objE;
            }
            if (i8 == 1) {
                z7 = aVar.f27791d;
                interfaceC6853i = (InterfaceC6853i) aVar.f27790c;
                interfaceC6867w = (InterfaceC6867w) aVar.f27789b;
                interfaceC6919d2 = (InterfaceC6919d) aVar.f27788a;
                AbstractC1437o.m6082b(obj);
                if (!((Boolean) obj).booleanValue()) {
                    if (z7) {
                        AbstractC6858n.m30060a(interfaceC6867w, null);
                    }
                    return C1444v.f4971a;
                }
                Object next2 = interfaceC6853i.next();
                aVar.f27788a = interfaceC6919d2;
                aVar.f27789b = interfaceC6867w;
                aVar.f27790c = interfaceC6853i;
                aVar.f27791d = z7;
                aVar.f27793f = 2;
            } else {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z7 = aVar.f27791d;
                interfaceC6853i = (InterfaceC6853i) aVar.f27790c;
                interfaceC6867w = (InterfaceC6867w) aVar.f27789b;
                interfaceC6919d2 = (InterfaceC6919d) aVar.f27788a;
                AbstractC1437o.m6082b(obj);
            }
            it = interfaceC6853i;
            interfaceC6919d = interfaceC6919d2;
            aVar.f27788a = interfaceC6919d;
            aVar.f27789b = interfaceC6867w;
            aVar.f27790c = it;
            aVar.f27791d = z7;
            aVar.f27793f = 1;
            objMo29993a = it.mo29993a(aVar);
            if (objMo29993a == objE) {
                interfaceC6919d2 = interfaceC6919d;
                interfaceC6853i = it;
                obj = objMo29993a;
                if (!((Boolean) obj).booleanValue()) {
                    if (z7) {
                        AbstractC6858n.m30060a(interfaceC6867w, null);
                    }
                    return C1444v.f4971a;
                }
                Object next3 = interfaceC6853i.next();
                aVar.f27788a = interfaceC6919d2;
                aVar.f27789b = interfaceC6867w;
                aVar.f27790c = interfaceC6853i;
                aVar.f27791d = z7;
                aVar.f27793f = 2;
            }
            return objE;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (z7) {
                    AbstractC6858n.m30060a(interfaceC6867w, th);
                }
                throw th2;
            }
        }
    }
}
