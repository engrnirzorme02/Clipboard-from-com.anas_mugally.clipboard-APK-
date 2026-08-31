package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC6118n;
import p145S5.AbstractC1437o;
import p145S5.C1436n;
import p145S5.C1444v;
import p173W5.InterfaceC1875e;
import p180X5.AbstractC2005b;

/* JADX INFO: renamed from: kotlin.coroutines.jvm.internal.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6086a implements InterfaceC1875e, InterfaceC6090e, Serializable {
    private final InterfaceC1875e<Object> completion;

    public AbstractC6086a(InterfaceC1875e interfaceC1875e) {
        this.completion = interfaceC1875e;
    }

    public InterfaceC1875e<C1444v> create(InterfaceC1875e<?> completion) {
        AbstractC6118n.m27187e(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // kotlin.coroutines.jvm.internal.InterfaceC6090e
    public InterfaceC6090e getCallerFrame() {
        InterfaceC1875e<Object> interfaceC1875e = this.completion;
        if (interfaceC1875e instanceof InterfaceC6090e) {
            return (InterfaceC6090e) interfaceC1875e;
        }
        return null;
    }

    public final InterfaceC1875e<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return AbstractC6092g.m27132d(this);
    }

    protected abstract Object invokeSuspend(Object obj);

    protected void releaseIntercepted() {
    }

    @Override // p173W5.InterfaceC1875e
    public final void resumeWith(Object obj) {
        InterfaceC1875e<Object> interfaceC1875e = this;
        while (true) {
            AbstractC6093h.m27134b(interfaceC1875e);
            AbstractC6086a abstractC6086a = (AbstractC6086a) interfaceC1875e;
            InterfaceC1875e<Object> interfaceC1875e2 = abstractC6086a.completion;
            AbstractC6118n.m27184b(interfaceC1875e2);
            try {
                Object objInvokeSuspend = abstractC6086a.invokeSuspend(obj);
                if (objInvokeSuspend == AbstractC2005b.m8369e()) {
                    return;
                } else {
                    obj = C1436n.m6073b(objInvokeSuspend);
                }
            } catch (Throwable th) {
                C1436n.a aVar = C1436n.f4958b;
                obj = C1436n.m6073b(AbstractC1437o.m6081a(th));
            }
            abstractC6086a.releaseIntercepted();
            if (!(interfaceC1875e2 instanceof AbstractC6086a)) {
                interfaceC1875e2.resumeWith(obj);
                return;
            }
            interfaceC1875e = interfaceC1875e2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public InterfaceC1875e<C1444v> create(Object obj, InterfaceC1875e<?> completion) {
        AbstractC6118n.m27187e(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
