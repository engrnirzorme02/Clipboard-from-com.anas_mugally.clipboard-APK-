package p105N0;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;
import p088K6.AbstractC0764a;
import p098M0.InterfaceC0873c;

/* JADX INFO: renamed from: N0.k */
/* JADX INFO: loaded from: classes.dex */
public class C0923k implements InterfaceC0873c {

    /* JADX INFO: renamed from: a */
    private final ScriptHandlerBoundaryInterface f3561a;

    private C0923k(ScriptHandlerBoundaryInterface scriptHandlerBoundaryInterface) {
        this.f3561a = scriptHandlerBoundaryInterface;
    }

    /* JADX INFO: renamed from: a */
    public static C0923k m4155a(InvocationHandler invocationHandler) {
        return new C0923k((ScriptHandlerBoundaryInterface) AbstractC0764a.m3594a(ScriptHandlerBoundaryInterface.class, invocationHandler));
    }
}
